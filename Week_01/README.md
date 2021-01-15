本地启动：gateway-server-0.0.1-SNAPSHOT.jar，使用G1GC垃圾收集器，分析内存使用情况。

1、使用jstat -gcutil命令查看该进程内存使用情况

    d:\>jstat -gcutil 24124 1000 10
      S0     S1     E      O      M     CCS    YGC     YGCT    FGC    FGCT     GCT
      0.00 100.00  87.94   2.07  95.34  93.94      6    0.040     0    0.000    0.040
      0.00 100.00  87.94   2.07  95.34  93.94      6    0.040     0    0.000    0.040
      0.00 100.00  87.94   2.07  95.34  93.94      6    0.040     0    0.000    0.040
      0.00 100.00  87.94   2.07  95.34  93.94      6    0.040     0    0.000    0.040
      0.00 100.00  87.94   2.07  95.34  93.94      6    0.040     0    0.000    0.040
      0.00 100.00  87.94   2.07  95.34  93.94      6    0.040     0    0.000    0.040
      0.00 100.00  87.94   2.07  95.34  93.94      6    0.040     0    0.000    0.040
      0.00 100.00  87.94   2.07  95.34  93.94      6    0.040     0    0.000    0.040
      0.00 100.00  87.94   2.07  95.34  93.94      6    0.040     0    0.000    0.040
      0.00 100.00  87.94   2.07  95.34  93.94      6    0.040     0    0.000    0.040

      存活区S0为空，存活区S1使用率为100%，Eden区使用率为87.94%，Old区使用率为2.07，元数据区使用率为95.34，压缩Class空间使用率为93.94。
      期间YoungGC发生了6次，年轻代GC消耗总时间为0.04秒，未发生FullGC，所有GC总耗时0.04秒，占总运行时间的4%。
  
  2、使用jstat -gc命令查看该进程内存使用情况
  
      d:\>jstat -gc 24124 1000 10
     S0C    S1C    S0U    S1U      EC       EU        OC         OU       MC     MU    CCSC   CCSU   YGC     YGCT    FGC    FGCT     GCT
     0.0   19456.0  0.0   19456.0 144384.0 126976.0  96256.0     1988.0   33024.0 31483.7 4352.0 4088.3      6    0.040   0      0.000    0.040
     0.0   19456.0  0.0   19456.0 144384.0 126976.0  96256.0     1988.0   33024.0 31483.7 4352.0 4088.3      6    0.040   0      0.000    0.040
     0.0   19456.0  0.0   19456.0 144384.0 126976.0  96256.0     1988.0   33024.0 31483.7 4352.0 4088.3      6    0.040   0      0.000    0.040
     0.0   19456.0  0.0   19456.0 144384.0 126976.0  96256.0     1988.0   33024.0 31483.7 4352.0 4088.3      6    0.040   0      0.000    0.040
     0.0   19456.0  0.0   19456.0 144384.0 126976.0  96256.0     1988.0   33024.0 31483.7 4352.0 4088.3      6    0.040   0      0.000    0.040
     0.0   19456.0  0.0   19456.0 144384.0 126976.0  96256.0     1988.0   33024.0 31483.7 4352.0 4088.3      6    0.040   0      0.000    0.040
     0.0   19456.0  0.0   19456.0 144384.0 126976.0  96256.0     1988.0   33024.0 31483.7 4352.0 4088.3      6    0.040   0      0.000    0.040
     0.0   19456.0  0.0   19456.0 144384.0 126976.0  96256.0     1988.0   33024.0 31483.7 4352.0 4088.3      6    0.040   0      0.000    0.040
     0.0   19456.0  0.0   19456.0 144384.0 126976.0  96256.0     1988.0   33024.0 31483.7 4352.0 4088.3      6    0.040   0      0.000    0.040
     0.0   19456.0  0.0   19456.0 144384.0 126976.0  96256.0     1988.0   33024.0 31483.7 4352.0 4088.3      6    0.040   0      0.000    0.040

     存活区S0容量为0，使用为0，存活区S1容量约为19M，使用约为19M，Eden区容量约为144M，使用约为127M，Old区容量约为96M，使用约为2M，元数据区容量约为33M，使用约为31M，
     压缩Class空间容量约为4.3M，使用约为4.0M。期间YoungGC发生了6次，年轻代GC消耗总时间为0.04秒，未发生FullGC，所有GC总耗时0.04秒，占总运行时间的4%。
 
 3、使用jmap -heap命令查看堆内存使用情况
 
     d:\>jmap -heap 22620
    Attaching to process ID 22620, please wait...
    Debugger attached successfully.
    Server compiler detected.
    JVM version is 25.131-b11

    using thread-local object allocation.
    Parallel GC with 8 thread(s)

    Heap Configuration:
       MinHeapFreeRatio         = 0
       MaxHeapFreeRatio         = 100
       MaxHeapSize              = 4253024256 (4056.0MB)
       NewSize                  = 88604672 (84.5MB)
       MaxNewSize               = 1417674752 (1352.0MB)
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
       capacity = 203423744 (194.0MB)
       used     = 164380672 (156.765625MB)
       free     = 39043072 (37.234375MB)
       80.80702319587628% used
    From Space:
       capacity = 9437184 (9.0MB)
       used     = 9429792 (8.992950439453125MB)
       free     = 7392 (0.007049560546875MB)
       99.92167154947917% used
    To Space:
       capacity = 13107200 (12.5MB)
       used     = 0 (0.0MB)
       free     = 13107200 (12.5MB)
       0.0% used
    PS Old Generation
       capacity = 100663296 (96.0MB)
       used     = 12202992 (11.637680053710938MB)
       free     = 88460304 (84.36231994628906MB)
       12.122583389282227% used

    15963 interned Strings occupying 2150912 bytes.

     可以看到，JDK8默认使用的是Parallel GC机制，然后是堆的配置信息，由于我没有指定参数启动，所以都是默认的值。
     接下来是堆的使用情况，Young区所包含的Eden区，两个存活区，以及一个老年区，它们各自的容量、使用量、空闲量、使用比例等信息。
 
 4、使用jmap -histo命令查看类的空间占用直方图，从大到小排列。
 
     d:\>jmap -histo 22620

     num     #instances         #bytes  class name
    ----------------------------------------------
       1:        525394      122382176  [C
       2:         15651       12262392  [B
       3:         32764       10815736  [I
       4:        305749        7337976  java.lang.String
       5:         39262        3455056  java.lang.reflect.Method
       6:         40693        2604352  java.net.URL
       7:         36988        2572896  [Ljava.lang.Object;
       8:         76717        2454944  org.springframework.boot.loader.jar.StringSequence
       9:        105712        2148880  [Ljava.lang.Class;
      10:         18573        1482600  [S
      11:         12378        1159872  [Ljava.util.HashMap$Node;
      12:         31367        1003744  java.util.HashMap$Node
      13:         37089         890136  org.springframework.boot.loader.jar.JarURLConnection$JarEntryName
      14:          7121         790568  java.lang.Class
      15:         22484         719488  java.util.concurrent.ConcurrentHashMap$Node
      16:         10907         510320  [Ljava.lang.reflect.Method;
      17:          7656         489984  org.springframework.asm.Label
      18:         11952         478080  java.util.LinkedHashMap$Entry
      19:          9917         476016  java.util.HashMap
      20:         19707         472968  java.lang.StringBuilder
      21:         12726         407232  java.lang.ref.WeakReference
      22:         17740         382088  [Ljava.lang.reflect.Type;
      23:          6527         365512  org.springframework.asm.Item
      24:          6967         334416  org.springframework.asm.Frame
      25:          5620         314720  java.util.LinkedHashMap
      26:         11390         273360  java.util.ArrayList
      27:         17065         273040  java.lang.Object
      28:          5656         271488  org.springframework.core.ResolvableType
      29:          8107         259424  java.util.ArrayList$Itr
      30:           215         249328  [Ljava.util.concurrent.ConcurrentHashMap$Node;
     .
     .
     .
    3180:             1             16  sun.util.locale.provider.TimeZoneNameUtility$TimeZoneNameGetter
    3181:             1             16  sun.util.resources.LocaleData
    3182:             1             16  sun.util.resources.LocaleData$LocaleDataResourceBundleControl
    Total       1752306      187036224

    其中，char数组的实例所占空间最多，约122M，实例数约52.5万个，紧随其后的是byte数组和int数组，最终有个合计，
    共1752306个实例，所占空间约为187M。

5、使用jstack -l命令查看所有线程的信息

    d:\>jstack -l 22620
    2021-01-15 23:06:51
    Full thread dump Java HotSpot(TM) 64-Bit Server VM (25.131-b11 mixed mode):

    "DestroyJavaVM" #34 prio=5 os_prio=0 tid=0x0000000024aa8800 nid=0x424c waiting on condition [0x0000000000000000]
       java.lang.Thread.State: RUNNABLE

       Locked ownable synchronizers:
            - None

    "http-nio-8088-AsyncTimeout" #32 daemon prio=5 os_prio=0 tid=0x0000000024aae800 nid=0x4db0 waiting on condition [0x00000000277cf000]
       java.lang.Thread.State: TIMED_WAITING (sleeping)
            at java.lang.Thread.sleep(Native Method)
            at org.apache.coyote.AbstractProtocol$AsyncTimeout.run(AbstractProtocol.java:1143)
            at java.lang.Thread.run(Unknown Source)

       Locked ownable synchronizers:
            - None
    .
    .
    .
    "Signal Dispatcher" #4 daemon prio=9 os_prio=2 tid=0x000000001e537000 nid=0x375c runnable [0x0000000000000000]
       java.lang.Thread.State: RUNNABLE

       Locked ownable synchronizers:
            - None

    "Finalizer" #3 daemon prio=8 os_prio=1 tid=0x000000001e4d0800 nid=0x5c68 in Object.wait() [0x000000001e9af000]
       java.lang.Thread.State: WAITING (on object monitor)
            at java.lang.Object.wait(Native Method)
            - waiting on <0x00000006c281ac88> (a java.lang.ref.ReferenceQueue$Lock)
            at java.lang.ref.ReferenceQueue.remove(Unknown Source)
            - locked <0x00000006c281ac88> (a java.lang.ref.ReferenceQueue$Lock)
            at java.lang.ref.ReferenceQueue.remove(Unknown Source)
            at java.lang.ref.Finalizer$FinalizerThread.run(Unknown Source)

       Locked ownable synchronizers:
            - None

    "Reference Handler" #2 daemon prio=10 os_prio=2 tid=0x0000000002c26000 nid=0x4374 in Object.wait() [0x000000001e4af000]
       java.lang.Thread.State: WAITING (on object monitor)
            at java.lang.Object.wait(Native Method)
            - waiting on <0x00000006c281ace0> (a java.lang.ref.Reference$Lock)
            at java.lang.Object.wait(Unknown Source)
            at java.lang.ref.Reference.tryHandlePending(Unknown Source)
            - locked <0x00000006c281ace0> (a java.lang.ref.Reference$Lock)
            at java.lang.ref.Reference$ReferenceHandler.run(Unknown Source)

       Locked ownable synchronizers:
            - None

    "VM Thread" os_prio=2 tid=0x000000001c5c8000 nid=0x5d54 runnable

    "GC task thread#0 (ParallelGC)" os_prio=0 tid=0x0000000002b46000 nid=0x6a40 runnable

    "GC task thread#1 (ParallelGC)" os_prio=0 tid=0x0000000002b47800 nid=0x51e8 runnable

    "GC task thread#2 (ParallelGC)" os_prio=0 tid=0x0000000002b49000 nid=0x67d8 runnable

    "GC task thread#3 (ParallelGC)" os_prio=0 tid=0x0000000002b4a800 nid=0x4c38 runnable

    "GC task thread#4 (ParallelGC)" os_prio=0 tid=0x0000000002b4d000 nid=0x26bc runnable

    "GC task thread#5 (ParallelGC)" os_prio=0 tid=0x0000000002b4f000 nid=0x2dec runnable

    "GC task thread#6 (ParallelGC)" os_prio=0 tid=0x0000000002b52000 nid=0x4ba0 runnable

    "GC task thread#7 (ParallelGC)" os_prio=0 tid=0x0000000002b53800 nid=0x3364 runnable

    "VM Periodic Task Thread" os_prio=2 tid=0x000000001e5df800 nid=0x2f90 waiting on condition

    JNI global references: 970

    可以看到各个线程的名称、状态、等待的锁的持有者等信息。

