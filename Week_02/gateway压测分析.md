gateway压测分析
===========================
启动8088端口进行压测：

		D:\>sb -u http://localhost:8088/api/hello -c 40 -N 30
		Starting at 2021/1/21 0:15:36
		[Press C to stop the test]
		125700  (RPS: 3731.1)
		---------------Finished!----------------
		Finished at 2021/1/21 0:16:10 (took 00:00:33.8676010)
		Status 200:    125703

		RPS: 4032.4 (requests/second)
		Max: 99ms
		Min: 0ms
		Avg: 0.9ms

		  50%   below 0ms
		  60%   below 0ms
		  70%   below 0ms
		  80%   below 0ms
		  90%   below 3ms
		  95%   below 6ms
		  98%   below 11ms
		  99%   below 16ms
		99.9%   below 33ms


从控制台可以看出，30秒内，使用40并发量对应用进行请求，共发出请求125703个，状态为200的请求有125703个。
RPS在4032.4的水平，平均响应时间0.9ms。简单使用jmap命令查看一下堆内存的使用情况，如下图：

		D:\>jmap -heap 13320
		Attaching to process ID 13320, please wait...
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
		   capacity = 673710080 (642.5MB)
		   used     = 359242008 (342.5998764038086MB)
		   free     = 314468072 (299.9001235961914MB)
		   53.32293796168227% used
		From Space:
		   capacity = 7340032 (7.0MB)
		   used     = 294912 (0.28125MB)
		   free     = 7045120 (6.71875MB)
		   4.017857142857143% used
		To Space:
		   capacity = 11010048 (10.5MB)
		   used     = 0 (0.0MB)
		   free     = 11010048 (10.5MB)
		   0.0% used
		PS Old Generation
		   capacity = 153616384 (146.5MB)
		   used     = 23372208 (22.289474487304688MB)
		   free     = 130244176 (124.21052551269531MB)
		   15.214658353109002% used

		17776 interned Strings occupying 2293800 bytes.

年轻代使用了342M，老年代使用了22M的内存。