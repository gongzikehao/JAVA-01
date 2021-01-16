NIO练习
===========================
1、单线程方式处理HTTP请求
---------------------------
启动8801端口进行压测：

    D:\>sb -u http://localhost:8801 -c 40 -N 30
    Starting at 2021/1/16 14:52:39
    [Press C to stop the test]
    1446    (RPS: 43)
    1447    (RPS: 43)                       ---------------Finished!----------------
    Finished at 2021/1/16 14:53:13 (took 00:00:33.6784366)
    1483    (RPS: 44.1)                     Status 200:    1483

    RPS: 47.7 (requests/second)
    Max: 881ms
    Min: 77ms
    Avg: 819.3ms

      50%   below 828ms
      60%   below 829ms
      70%   below 830ms
      80%   below 830ms
      90%   below 832ms
      95%   below 838ms
      98%   below 849ms
      99%   below 849ms
    99.9%   below 857ms
从控制台可以看出，30秒内，使用40并发量对应用进行请求，共发出请求1483个，状态为200的请求有1483个。
RPS在47.7的水平，平均响应时间819.3ms。简单使用jmap命令查看一下堆内存的使用情况，如下图：

    D:\>jmap -heap 15000
    Attaching to process ID 15000, please wait...
    Debugger attached successfully.
    Server compiler detected.
    JVM version is 25.131-b11

    using thread-local object allocation.
    Parallel GC with 8 thread(s)

    Heap Configuration:
       MinHeapFreeRatio         = 0
       MaxHeapFreeRatio         = 100
       MaxHeapSize              = 536870912 (512.0MB)
       NewSize                  = 88604672 (84.5MB)
       MaxNewSize               = 178782208 (170.5MB)
       OldSize                  = 177733632 (169.5MB)
       NewRatio                 = 2
       SurvivorRatio            = 8
       MetaspaceSize            = 21807104 (20.796875MB)
       CompressedClassSpaceSize = 1073741824 (1024.0MB)
       MaxMetaspaceSize         = 17592186044415 MB
       G1HeapRegionSize         = 0 (0.0MB)

    Heap Usage:
    PS Young Generation
    Eden Space:
       capacity = 66584576 (63.5MB)
       used     = 45365272 (43.263694763183594MB)
       free     = 21219304 (20.236305236816406MB)
       68.13180277666707% used
    From Space:
       capacity = 11010048 (10.5MB)
       used     = 0 (0.0MB)
       free     = 11010048 (10.5MB)
       0.0% used
    To Space:
       capacity = 11010048 (10.5MB)
       used     = 0 (0.0MB)
       free     = 11010048 (10.5MB)
       0.0% used
    PS Old Generation
       capacity = 177733632 (169.5MB)
       used     = 0 (0.0MB)
       free     = 177733632 (169.5MB)
       0.0% used

    3217 interned Strings occupying 263752 bytes.
其中年轻代使用量为43M左右，老年代的使用量为0。

2、循环new Thread方式处理HTTP请求
------------------------------------
启动8802端口进行压测：

    D:\>sb -u http://localhost:8802 -c 40 -N 30
    Starting at 2021/1/16 14:56:26
    [Press C to stop the test]
    42914   (RPS: 1275.9)
    ---------------Finished!----------------
    Finished at 2021/1/16 14:57:00 (took 00:00:33.7451036)
    Status 200:    41388
    Status 303:    1528

    RPS: 1378.9 (requests/second)
    Max: 143ms
    Min: 20ms
    Avg: 24.8ms

      50%   below 22ms
      60%   below 23ms
      70%   below 25ms
      80%   below 28ms
      90%   below 32ms
      95%   below 35ms
      98%   below 41ms
      99%   below 45ms
    99.9%   below 70ms
从控制台可以看出，30秒内，使用40并发量对应用进行请求，共发出请求42916个，状态为200的请求有41388个。
RPS在1378.9的水平，平均响应时间24.8ms。处理请求的能力明显提升，其中的原因应该在于主线程new完Thread后，
无需等待service方法的响应结果，进入下一次循环阻塞在accept方法那里，等待下一次请求的到来，这就节省了在
service方法中的执行时间（比如处理业务所等待的20ms），处理请求能力自然就提升了。不过通过jmap命令查看堆
内存的使用情况来看，由于不断地创建线程，内存占用也明显高于第一种单线程的模式。如下图:

    D:\>jmap -heap 14884
    Attaching to process ID 14884, please wait...
    Debugger attached successfully.
    Server compiler detected.
    JVM version is 25.131-b11

    using thread-local object allocation.
    Parallel GC with 8 thread(s)

    Heap Configuration:
       MinHeapFreeRatio         = 0
       MaxHeapFreeRatio         = 100
       MaxHeapSize              = 536870912 (512.0MB)
       NewSize                  = 88604672 (84.5MB)
       MaxNewSize               = 178782208 (170.5MB)
       OldSize                  = 177733632 (169.5MB)
       NewRatio                 = 2
       SurvivorRatio            = 8
       MetaspaceSize            = 21807104 (20.796875MB)
       CompressedClassSpaceSize = 1073741824 (1024.0MB)
       MaxMetaspaceSize         = 17592186044415 MB
       G1HeapRegionSize         = 0 (0.0MB)

    Heap Usage:
    PS Young Generation
    Eden Space:
       capacity = 165675008 (158.0MB)
       used     = 126038872 (120.20003509521484MB)
       free     = 39636136 (37.799964904785156MB)
       76.0759715792499% used
    From Space:
       capacity = 524288 (0.5MB)
       used     = 425984 (0.40625MB)
       free     = 98304 (0.09375MB)
       81.25% used
    To Space:
       capacity = 524288 (0.5MB)
       used     = 0 (0.0MB)
       free     = 524288 (0.5MB)
       0.0% used
    PS Old Generation
       capacity = 177733632 (169.5MB)
       used     = 19599504 (18.691543579101562MB)
       free     = 158134128 (150.80845642089844MB)
       11.027459338702986% used

    3677 interned Strings occupying 300584 bytes.
与第一种单线程模式相比，年轻代使用量为120M左右，翻了3倍，老年代也使用了18M，可想而知，
循环创建线程对象的方式可以提高系统的处理能力，但同时也消耗了大量的内存。

3、使用固定数量的线程池方式处理HTTP请求
----------------------------------------
启动8803端口进行压测：

    D:\>sb -u http://localhost:8803 -c 40 -N 30
    Starting at 2021/1/16 15:08:17
    [Press C to stop the test]
    49188   (RPS: 1463.7)
    ---------------Finished!----------------
    Finished at 2021/1/16 15:08:50 (took 00:00:33.7139390)
    Status 200:    47364
    Status 303:    1827

    RPS: 1580.6 (requests/second)
    Max: 156ms
    Min: 19ms
    Avg: 22.4ms

      50%   below 21ms
      60%   below 21ms
      70%   below 22ms
      80%   below 23ms
      90%   below 25ms
      95%   below 29ms
      98%   below 34ms
      99%   below 38ms
    99.9%   below 78ms
从控制台可以看出，30秒内，使用40并发量对应用进行请求，共发出请求49191个，状态为200的请求有47364个。
RPS在1580.6的水平，平均响应时间22.4ms。处理请求的能力相较第二种方式，提升不大，不过通过jmap命令查看堆
内存的使用情况来看，由于使用了线程池来实现线程的创建、使用、回收、重复使用，所以内存消耗就少了很多，如下图:

    D:\>jmap -heap 9024
    Attaching to process ID 9024, please wait...
    Debugger attached successfully.
    Server compiler detected.
    JVM version is 25.131-b11

    using thread-local object allocation.
    Parallel GC with 8 thread(s)

    Heap Configuration:
       MinHeapFreeRatio         = 0
       MaxHeapFreeRatio         = 100
       MaxHeapSize              = 536870912 (512.0MB)
       NewSize                  = 88604672 (84.5MB)
       MaxNewSize               = 178782208 (170.5MB)
       OldSize                  = 177733632 (169.5MB)
       NewRatio                 = 2
       SurvivorRatio            = 8
       MetaspaceSize            = 21807104 (20.796875MB)
       CompressedClassSpaceSize = 1073741824 (1024.0MB)
       MaxMetaspaceSize         = 17592186044415 MB
       G1HeapRegionSize         = 0 (0.0MB)

    Heap Usage:
    PS Young Generation
    Eden Space:
       capacity = 47710208 (45.5MB)
       used     = 46887568 (44.71546936035156MB)
       free     = 822640 (0.7845306396484375MB)
       98.2757568359375% used
    From Space:
       capacity = 3145728 (3.0MB)
       used     = 1540096 (1.46875MB)
       free     = 1605632 (1.53125MB)
       48.958333333333336% used
    To Space:
       capacity = 3670016 (3.5MB)
       used     = 0 (0.0MB)
       free     = 3670016 (3.5MB)
       0.0% used
    PS Old Generation
       capacity = 177733632 (169.5MB)
       used     = 1995744 (1.903289794921875MB)
       free     = 175737888 (167.59671020507812MB)
       1.122884834762168% used

    3721 interned Strings occupying 303384 bytes.
年轻代使用量为44.7M左右，老年代的使用量为1.9M左右，明显优于第二种模式的处理。
