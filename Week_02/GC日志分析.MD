1、使用串行GC垃圾收集器运行GCLogAnalysis并生成GC日志如下：

    Java HotSpot(TM) 64-Bit Server VM (25.131-b11) for windows-amd64 JRE (1.8.0_131-b11), built on Mar 15 2017 01:23:53 by "java_re" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16610360k(9995836k free), swap 38643768k(30152724k free)
    CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC 
    0.137: [GC (Allocation Failure) 0.137: [DefNew: 139776K->17471K(157248K), 0.0197608 secs] 139776K->45592K(506816K), 0.0198633 secs] [Times: user=0.02 sys=0.03, real=0.02 secs] 
    0.178: [GC (Allocation Failure) 0.178: [DefNew: 156550K->17469K(157248K), 0.0249835 secs] 184670K->88091K(506816K), 0.0250282 secs] [Times: user=0.00 sys=0.03, real=0.03 secs] 
    0.216: [GC (Allocation Failure) 0.216: [DefNew: 157245K->17470K(157248K), 0.0217982 secs] 227867K->136684K(506816K), 0.0218451 secs] [Times: user=0.02 sys=0.02, real=0.02 secs] 
    0.253: [GC (Allocation Failure) 0.253: [DefNew: 157102K->17467K(157248K), 0.0190721 secs] 276316K->178131K(506816K), 0.0191180 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
    0.285: [GC (Allocation Failure) 0.285: [DefNew: 157243K->17471K(157248K), 0.0196796 secs] 317907K->221433K(506816K), 0.0197257 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
    0.318: [GC (Allocation Failure) 0.318: [DefNew: 157247K->17470K(157248K), 0.0194210 secs] 361209K->263840K(506816K), 0.0194644 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
    0.351: [GC (Allocation Failure) 0.351: [DefNew: 157246K->17471K(157248K), 0.0170582 secs] 403616K->300115K(506816K), 0.0171003 secs] [Times: user=0.00 sys=0.01, real=0.02 secs] 
    0.382: [GC (Allocation Failure) 0.382: [DefNew: 156956K->17470K(157248K), 0.0221893 secs] 439599K->349155K(506816K), 0.0222336 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
    0.417: [GC (Allocation Failure) 0.417: [DefNew: 157246K->157246K(157248K), 0.0000118 secs]0.417: [Tenured: 331684K->281631K(349568K), 0.0286444 secs] 488931K->281631K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0287207 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
    0.458: [GC (Allocation Failure) 0.458: [DefNew: 139776K->17471K(157248K), 0.0062378 secs] 421407K->336972K(506816K), 0.0062814 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.478: [GC (Allocation Failure) 0.478: [DefNew: 156627K->156627K(157248K), 0.0000106 secs]0.478: [Tenured: 319500K->316258K(349568K), 0.0324158 secs] 476128K->316258K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0324790 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
    0.524: [GC (Allocation Failure) 0.524: [DefNew: 139776K->139776K(157248K), 0.0000102 secs]0.524: [Tenured: 316258K->319554K(349568K), 0.0309447 secs] 456034K->319554K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0310059 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
    0.568: [GC (Allocation Failure) 0.568: [DefNew: 139651K->139651K(157248K), 0.0000103 secs]0.568: [Tenured: 319554K->308294K(349568K), 0.0335786 secs] 459205K->308294K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0336399 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
    0.614: [GC (Allocation Failure) 0.614: [DefNew: 139776K->17470K(157248K), 0.0063290 secs] 448070K->352946K(506816K), 0.0063675 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.633: [GC (Allocation Failure) 0.633: [DefNew: 157246K->157246K(157248K), 0.0000118 secs]0.633: [Tenured: 335475K->343856K(349568K), 0.0312966 secs] 492722K->343856K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0313586 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
    0.678: [GC (Allocation Failure) 0.678: [DefNew: 139776K->139776K(157248K), 0.0000111 secs]0.678: [Tenured: 343856K->349082K(349568K), 0.0344063 secs] 483632K->351886K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0344706 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
    0.729: [Full GC (Allocation Failure) 0.729: [Tenured: 349509K->348994K(349568K), 0.0342956 secs] 506753K->351712K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0343430 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
    0.778: [Full GC (Allocation Failure) 0.778: [Tenured: 349502K->340612K(349568K), 0.0367769 secs] 506597K->340612K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0368266 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
    0.827: [GC (Allocation Failure) 0.827: [DefNew: 139776K->139776K(157248K), 0.0000102 secs]0.827: [Tenured: 340612K->349530K(349568K), 0.0253179 secs] 480388K->368849K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0253800 secs] [Times: user=0.02 sys=0.00, real=0.03 secs] 
    0.866: [Full GC (Allocation Failure) 0.866: [Tenured: 349530K->349555K(349568K), 0.0316222 secs] 506719K->367772K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0316688 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
    0.912: [Full GC (Allocation Failure) 0.912: [Tenured: 349555K->349495K(349568K), 0.0353361 secs] 506624K->373413K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0353810 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
    0.960: [Full GC (Allocation Failure) 0.960: [Tenured: 349495K->349172K(349568K), 0.0389814 secs] 506278K->359738K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0390308 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
    1.015: [Full GC (Allocation Failure) 1.015: [Tenured: 349565K->349434K(349568K), 0.0267979 secs] 506803K->376090K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0268566 secs] [Times: user=0.02 sys=0.00, real=0.03 secs] 
    1.056: [Full GC (Allocation Failure) 1.056: [Tenured: 349434K->349358K(349568K), 0.0345964 secs] 506553K->374996K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0346430 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
    Heap
     def new generation   total 157248K, used 31419K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
      eden space 139776K,  22% used [0x00000000e0000000, 0x00000000e1eaef80, 0x00000000e8880000)
      from space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
      to   space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
     tenured generation   total 349568K, used 349358K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
       the space 349568K,  99% used [0x00000000eaaa0000, 0x00000000fffcbbb0, 0x00000000fffcbc00, 0x0000000100000000)
     Metaspace       used 2639K, capacity 4486K, committed 4864K, reserved 1056768K
      class space    used 294K, capacity 386K, committed 512K, reserved 1048576K
      
从图中可以看出，在JVM启动0.417秒之前，都是发生的YoungGC，虽然没有发生OldGC，但是老年代的内存也是在不断累积增长的。
到了0.417秒时，老年代的内存达到了约331M，很接近其容量约349M了，于是发生了OldGC，堆内存整体有了明显的下降。
而后的几次GC操作，由于老年代中内存使用始终接近容量，于是接连发生了几次OldGC。
再接着，由于年轻代和老年代都接近打到容量，无法分配新的内存，导致频繁发生FullGC。
最终以FullGC结束。

2、使用并行垃圾收集器运行GCLogAnalysis并生成GC日志如下：

    Java HotSpot(TM) 64-Bit Server VM (25.131-b11) for windows-amd64 JRE (1.8.0_131-b11), built on Mar 15 2017 01:23:53 by "java_re" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16610360k(10008728k free), swap 38643768k(30185256k free)
    CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers
              -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC 
    0.129: [GC (Allocation Failure) [PSYoungGen: 131226K->21501K(153088K)] 131226K->39529K(502784K), 0.0063682 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.154: [GC (Allocation Failure) [PSYoungGen: 153085K->21497K(153088K)] 171113K->82942K(502784K), 0.0087920 secs] [Times: user=0.02 sys=0.11, real=0.01 secs] 
    0.176: [GC (Allocation Failure) [PSYoungGen: 153081K->21496K(153088K)] 214526K->123598K(502784K), 0.0079131 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.197: [GC (Allocation Failure) [PSYoungGen: 153080K->21487K(153088K)] 255182K->163330K(502784K), 0.0079899 secs] [Times: user=0.00 sys=0.13, real=0.01 secs] 
    0.217: [GC (Allocation Failure) [PSYoungGen: 153071K->21501K(153088K)] 294914K->204147K(502784K), 0.0085017 secs] [Times: user=0.08 sys=0.05, real=0.01 secs] 
    0.238: [GC (Allocation Failure) [PSYoungGen: 153085K->21503K(80384K)] 335731K->244705K(430080K), 0.0079363 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.252: [GC (Allocation Failure) [PSYoungGen: 80383K->33780K(116736K)] 303585K->260803K(466432K), 0.0043821 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.262: [GC (Allocation Failure) [PSYoungGen: 91963K->45994K(116736K)] 318987K->279623K(466432K), 0.0061530 secs] [Times: user=0.08 sys=0.05, real=0.01 secs] 
    0.274: [GC (Allocation Failure) [PSYoungGen: 104620K->56022K(116736K)] 338250K->298025K(466432K), 0.0069267 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.286: [GC (Allocation Failure) [PSYoungGen: 114902K->42486K(116736K)] 356905K->318595K(466432K), 0.0085639 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.300: [GC (Allocation Failure) [PSYoungGen: 101366K->24774K(116736K)] 377475K->342205K(466432K), 0.0074955 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.307: [Full GC (Ergonomics) [PSYoungGen: 24774K->0K(116736K)] [ParOldGen: 317430K->245981K(349696K)] 342205K->245981K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0302274 secs] [Times: user=0.23 sys=0.00, real=0.03 secs] 
    0.345: [GC (Allocation Failure) [PSYoungGen: 58880K->18872K(116736K)] 304861K->264854K(466432K), 0.0023419 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.354: [GC (Allocation Failure) [PSYoungGen: 77731K->21399K(116736K)] 323712K->285247K(466432K), 0.0044091 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.364: [GC (Allocation Failure) [PSYoungGen: 79987K->19183K(116736K)] 343835K->303364K(466432K), 0.0043371 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.375: [GC (Allocation Failure) [PSYoungGen: 78063K->17505K(116736K)] 362244K->319065K(466432K), 0.0039403 secs] [Times: user=0.13 sys=0.00, real=0.00 secs] 
    0.379: [Full GC (Ergonomics) [PSYoungGen: 17505K->0K(116736K)] [ParOldGen: 301560K->264824K(349696K)] 319065K->264824K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0276669 secs] [Times: user=0.11 sys=0.00, real=0.03 secs] 
    0.413: [GC (Allocation Failure) [PSYoungGen: 58853K->23085K(116736K)] 323677K->287909K(466432K), 0.0027848 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.422: [GC (Allocation Failure) [PSYoungGen: 81965K->23955K(116736K)] 346789K->310598K(466432K), 0.0049843 secs] [Times: user=0.13 sys=0.00, real=0.00 secs] 
    0.433: [GC (Allocation Failure) [PSYoungGen: 82638K->17234K(116736K)] 369282K->325658K(466432K), 0.0042884 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.438: [Full GC (Ergonomics) [PSYoungGen: 17234K->0K(116736K)] [ParOldGen: 308424K->287698K(349696K)] 325658K->287698K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0298457 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
    0.475: [GC (Allocation Failure) [PSYoungGen: 58880K->19121K(116736K)] 346578K->306819K(466432K), 0.0023757 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.484: [GC (Allocation Failure) [PSYoungGen: 78001K->20943K(116736K)] 365699K->326616K(466432K), 0.0043292 secs] [Times: user=0.13 sys=0.00, real=0.00 secs] 
    0.494: [GC (Allocation Failure) [PSYoungGen: 79823K->21732K(116736K)] 385496K->347414K(466432K), 0.0048856 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.499: [Full GC (Ergonomics) [PSYoungGen: 21732K->0K(116736K)] [ParOldGen: 325681K->301509K(349696K)] 347414K->301509K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0315200 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
    0.538: [GC (Allocation Failure) [PSYoungGen: 58880K->17852K(116736K)] 360389K->319362K(466432K), 0.0024749 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.546: [GC (Allocation Failure) [PSYoungGen: 76732K->24304K(116736K)] 378242K->342006K(466432K), 0.0044972 secs] [Times: user=0.13 sys=0.00, real=0.00 secs] 
    0.551: [Full GC (Ergonomics) [PSYoungGen: 24304K->0K(116736K)] [ParOldGen: 317701K->313269K(349696K)] 342006K->313269K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0316303 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
    0.590: [GC (Allocation Failure) [PSYoungGen: 58870K->21201K(116736K)] 372140K->334470K(466432K), 0.0026577 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.599: [GC (Allocation Failure) [PSYoungGen: 79884K->19490K(116736K)] 393154K->352895K(466432K), 0.0046037 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.604: [Full GC (Ergonomics) [PSYoungGen: 19490K->0K(116736K)] [ParOldGen: 333405K->317166K(349696K)] 352895K->317166K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0316051 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
    0.641: [Full GC (Ergonomics) [PSYoungGen: 58659K->0K(116736K)] [ParOldGen: 317166K->325250K(349696K)] 375826K->325250K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0335916 secs] [Times: user=0.34 sys=0.00, real=0.03 secs] 
    0.682: [Full GC (Ergonomics) [PSYoungGen: 58777K->0K(116736K)] [ParOldGen: 325250K->325859K(349696K)] 384027K->325859K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0335098 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
    0.723: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 325859K->328347K(349696K)] 384739K->328347K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0343752 secs] [Times: user=0.24 sys=0.00, real=0.04 secs] 
    0.764: [Full GC (Ergonomics) [PSYoungGen: 58805K->0K(116736K)] [ParOldGen: 328347K->332271K(349696K)] 387153K->332271K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0332827 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
    0.805: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 332271K->334086K(349696K)] 391151K->334086K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0342450 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
    0.846: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 334086K->334105K(349696K)] 392966K->334105K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0369265 secs] [Times: user=0.23 sys=0.00, real=0.04 secs] 
    0.890: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 334105K->338785K(349696K)] 392985K->338785K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0353748 secs] [Times: user=0.22 sys=0.09, real=0.03 secs] 
    0.934: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 338785K->336335K(349696K)] 397665K->336335K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0352754 secs] [Times: user=0.25 sys=0.00, real=0.04 secs] 
    0.976: [Full GC (Ergonomics) [PSYoungGen: 58778K->0K(116736K)] [ParOldGen: 336335K->336590K(349696K)] 395114K->336590K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0352696 secs] [Times: user=0.23 sys=0.00, real=0.04 secs] 
    1.019: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 336590K->342241K(349696K)] 395470K->342241K(466432K), [Metaspace: 2633K->2633K(1056768K)], 0.0372186 secs] [Times: user=0.25 sys=0.00, real=0.04 secs] 
    Heap
     PSYoungGen      total 116736K, used 49440K [0x00000000f5580000, 0x0000000100000000, 0x0000000100000000)
      eden space 58880K, 83% used [0x00000000f5580000,0x00000000f85c8140,0x00000000f8f00000)
      from space 57856K, 0% used [0x00000000f8f00000,0x00000000f8f00000,0x00000000fc780000)
      to   space 57856K, 0% used [0x00000000fc780000,0x00000000fc780000,0x0000000100000000)
     ParOldGen       total 349696K, used 342241K [0x00000000e0000000, 0x00000000f5580000, 0x00000000f5580000)
      object space 349696K, 97% used [0x00000000e0000000,0x00000000f4e38730,0x00000000f5580000)
     Metaspace       used 2639K, capacity 4486K, committed 4864K, reserved 1056768K
      class space    used 294K, capacity 386K, committed 512K, reserved 1048576K

从图中可以看出，并行垃圾收集器，每次YoungGC时间都非常短，这正是因为它是多个线程并行执行垃圾收集，效率较高。
也正是因为每次GC时间段，所以时间更多用来处理业务，单位时间也就能处理更多的请求或者事务，因此表现为吞吐量比较大。
由于每次清理时间短，清理的垃圾数量比较少，导致老年代垃圾越来越多，以至于后面频繁的进行FullGc。

3、使用CMS垃圾收集器运行GCLogAnalysis并生成GC日志如下：

    Java HotSpot(TM) 64-Bit Server VM (25.131-b11) for windows-amd64 JRE (1.8.0_131-b11), built on Mar 15 2017 01:23:53 by "java_re" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16610360k(10033732k free), swap 38643768k(30206220k free)
    CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:MaxNewSize=178958336 -XX:MaxTenuringThreshold=6 -XX:NewSize=178958336 -XX:OldPLABSize=16 -XX:OldSize=357912576 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC 
    0.131: [GC (Allocation Failure) 0.131: [ParNew: 139776K->17470K(157248K), 0.0074015 secs] 139776K->41811K(506816K), 0.0075472 secs] [Times: user=0.00 sys=0.11, real=0.01 secs] 
    0.162: [GC (Allocation Failure) 0.162: [ParNew: 157246K->17472K(157248K), 0.0109014 secs] 181587K->89236K(506816K), 0.0109539 secs] [Times: user=0.03 sys=0.09, real=0.01 secs] 
    0.187: [GC (Allocation Failure) 0.187: [ParNew: 157248K->17471K(157248K), 0.0225619 secs] 229012K->129329K(506816K), 0.0226105 secs] [Times: user=0.09 sys=0.02, real=0.02 secs] 
    0.225: [GC (Allocation Failure) 0.225: [ParNew: 157247K->17472K(157248K), 0.0217779 secs] 269105K->172399K(506816K), 0.0218256 secs] [Times: user=0.22 sys=0.03, real=0.02 secs] 
    0.261: [GC (Allocation Failure) 0.261: [ParNew: 157248K->17470K(157248K), 0.0226083 secs] 312175K->217275K(506816K), 0.0226515 secs] [Times: user=0.11 sys=0.01, real=0.02 secs] 
    0.284: [GC (CMS Initial Mark) [1 CMS-initial-mark: 199804K(349568K)] 220336K(506816K), 0.0002085 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.284: [CMS-concurrent-mark-start]
    0.286: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.286: [CMS-concurrent-preclean-start]
    0.286: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.286: [CMS-concurrent-abortable-preclean-start]
    0.299: [GC (Allocation Failure) 0.299: [ParNew: 157246K->17471K(157248K), 0.0219045 secs] 357051K->258620K(506816K), 0.0219499 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
    0.334: [GC (Allocation Failure) 0.334: [ParNew: 157247K->17471K(157248K), 0.0215532 secs] 398396K->301960K(506816K), 0.0215998 secs] [Times: user=0.25 sys=0.00, real=0.02 secs] 
    0.369: [GC (Allocation Failure) 0.369: [ParNew: 157247K->17471K(157248K), 0.0228086 secs] 441736K->345705K(506816K), 0.0228543 secs] [Times: user=0.11 sys=0.02, real=0.02 secs] 
    0.392: [CMS-concurrent-abortable-preclean: 0.003/0.106 secs] [Times: user=0.55 sys=0.02, real=0.11 secs] 
    0.392: [GC (CMS Final Remark) [YG occupancy: 25044 K (157248 K)]0.392: [Rescan (parallel) , 0.0002139 secs]0.393: [weak refs processing, 0.0000080 secs]0.393: [class unloading, 0.0001769 secs]0.393: [scrub symbol table, 0.0002568 secs]0.393: [scrub string table, 0.0000775 secs][1 CMS-remark: 328234K(349568K)] 353278K(506816K), 0.0007837 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.393: [CMS-concurrent-sweep-start]
    0.394: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.394: [CMS-concurrent-reset-start]
    0.394: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.406: [GC (Allocation Failure) 0.406: [ParNew: 157247K->17471K(157248K), 0.0108580 secs] 444406K->347759K(506816K), 0.0109045 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
    0.417: [GC (CMS Initial Mark) [1 CMS-initial-mark: 330288K(349568K)] 347831K(506816K), 0.0001035 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.417: [CMS-concurrent-mark-start]
    0.418: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.418: [CMS-concurrent-preclean-start]
    0.418: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.418: [CMS-concurrent-abortable-preclean-start]
    0.418: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.418: [GC (CMS Final Remark) [YG occupancy: 33078 K (157248 K)]0.418: [Rescan (parallel) , 0.0003056 secs]0.419: [weak refs processing, 0.0000076 secs]0.419: [class unloading, 0.0002065 secs]0.419: [scrub symbol table, 0.0002720 secs]0.419: [scrub string table, 0.0000783 secs][1 CMS-remark: 330288K(349568K)] 363366K(506816K), 0.0009182 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.419: [CMS-concurrent-sweep-start]
    0.420: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.420: [CMS-concurrent-reset-start]
    0.420: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.431: [GC (Allocation Failure) 0.431: [ParNew: 157247K->17471K(157248K), 0.0077867 secs] 401385K->302290K(506816K), 0.0078340 secs] [Times: user=0.11 sys=0.02, real=0.01 secs] 
    0.439: [GC (CMS Initial Mark) [1 CMS-initial-mark: 284818K(349568K)] 302717K(506816K), 0.0000962 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.439: [CMS-concurrent-mark-start]
    0.440: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.440: [CMS-concurrent-preclean-start]
    0.440: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.440: [CMS-concurrent-abortable-preclean-start]
    0.452: [GC (Allocation Failure) 0.452: [ParNew: 157247K->17468K(157248K), 0.0081358 secs] 442066K->346923K(506816K), 0.0081818 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.460: [CMS-concurrent-abortable-preclean: 0.001/0.020 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
    0.461: [GC (CMS Final Remark) [YG occupancy: 27055 K (157248 K)]0.461: [Rescan (parallel) , 0.0002160 secs]0.461: [weak refs processing, 0.0000067 secs]0.461: [class unloading, 0.0001601 secs]0.461: [scrub symbol table, 0.0002625 secs]0.461: [scrub string table, 0.0000842 secs][1 CMS-remark: 329455K(349568K)] 356510K(506816K), 0.0007729 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.461: [CMS-concurrent-sweep-start]
    0.462: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.462: [CMS-concurrent-reset-start]
    0.462: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.03 sys=0.00, real=0.00 secs] 
    0.473: [GC (Allocation Failure) 0.473: [ParNew (promotion failed): 157244K->157246K(157248K), 0.0132754 secs]0.487: [CMS: 344314K->295246K(349568K), 0.0326652 secs] 458793K->295246K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0460136 secs] [Times: user=0.16 sys=0.00, real=0.05 secs] 
    0.520: [GC (CMS Initial Mark) [1 CMS-initial-mark: 295246K(349568K)] 295528K(506816K), 0.0001099 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.520: [CMS-concurrent-mark-start]
    0.521: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.521: [CMS-concurrent-preclean-start]
    0.521: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.521: [CMS-concurrent-abortable-preclean-start]
    0.533: [GC (Allocation Failure) 0.533: [ParNew: 139776K->17470K(157248K), 0.0059520 secs] 435022K->339733K(506816K), 0.0059984 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
    0.552: [GC (Allocation Failure) 0.552: [ParNew: 157246K->157246K(157248K), 0.0000132 secs]0.552: [CMS0.552: [CMS-concurrent-abortable-preclean: 0.001/0.031 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
     (concurrent mode failure): 322262K->320785K(349568K), 0.0360680 secs] 479509K->320785K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0361390 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
    0.600: [GC (Allocation Failure) 0.600: [ParNew: 139708K->139708K(157248K), 0.0000135 secs]0.600: [CMS: 320785K->333057K(349568K), 0.0360984 secs] 460494K->333057K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0361717 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
    0.636: [GC (CMS Initial Mark) [1 CMS-initial-mark: 333057K(349568K)] 336149K(506816K), 0.0003264 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.637: [CMS-concurrent-mark-start]
    0.638: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.638: [CMS-concurrent-preclean-start]
    0.638: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.638: [CMS-concurrent-abortable-preclean-start]
    0.651: [GC (Allocation Failure) 0.651: [ParNew: 139776K->139776K(157248K), 0.0000134 secs]0.651: [CMS0.651: [CMS-concurrent-abortable-preclean: 0.000/0.013 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
     (concurrent mode failure): 333057K->333816K(349568K), 0.0358964 secs] 472833K->333816K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0359675 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
    0.700: [GC (Allocation Failure) 0.700: [ParNew: 139776K->139776K(157248K), 0.0000144 secs]0.700: [CMS: 333816K->340761K(349568K), 0.0369625 secs] 473592K->340761K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0370297 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
    0.737: [GC (CMS Initial Mark) [1 CMS-initial-mark: 340761K(349568K)] 344025K(506816K), 0.0003322 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.738: [CMS-concurrent-mark-start]
    0.739: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.739: [CMS-concurrent-preclean-start]
    0.739: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.739: [CMS-concurrent-abortable-preclean-start]
    0.739: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.739: [GC (CMS Final Remark) [YG occupancy: 17174 K (157248 K)]0.739: [Rescan (parallel) , 0.0004992 secs]0.740: [weak refs processing, 0.0000074 secs]0.740: [class unloading, 0.0001761 secs]0.740: [scrub symbol table, 0.0002721 secs]0.740: [scrub string table, 0.0000864 secs][1 CMS-remark: 340761K(349568K)] 357935K(506816K), 0.0010863 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.740: [CMS-concurrent-sweep-start]
    0.741: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.741: [CMS-concurrent-reset-start]
    0.741: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.752: [GC (Allocation Failure) 0.752: [ParNew: 139776K->139776K(157248K), 0.0000135 secs]0.752: [CMS: 340201K->341541K(349568K), 0.0372256 secs] 479977K->341541K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0372962 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
    0.790: [GC (CMS Initial Mark) [1 CMS-initial-mark: 341541K(349568K)] 341913K(506816K), 0.0007283 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.790: [CMS-concurrent-mark-start]
    0.791: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.03 sys=0.02, real=0.00 secs] 
    0.791: [CMS-concurrent-preclean-start]
    0.792: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.792: [CMS-concurrent-abortable-preclean-start]
    0.792: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.792: [GC (CMS Final Remark) [YG occupancy: 22987 K (157248 K)]0.792: [Rescan (parallel) , 0.0005522 secs]0.793: [weak refs processing, 0.0000077 secs]0.793: [class unloading, 0.0001759 secs]0.793: [scrub symbol table, 0.0002671 secs]0.793: [scrub string table, 0.0000866 secs][1 CMS-remark: 341541K(349568K)] 364529K(506816K), 0.0011344 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.793: [CMS-concurrent-sweep-start]
    0.794: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.794: [CMS-concurrent-reset-start]
    0.794: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.804: [GC (Allocation Failure) 0.804: [ParNew: 139699K->139699K(157248K), 0.0000134 secs]0.804: [CMS: 340688K->349520K(349568K), 0.0379995 secs] 480387K->350500K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0380703 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
    0.842: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349520K(349568K)] 353600K(506816K), 0.0003803 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.843: [CMS-concurrent-mark-start]
    0.844: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.844: [CMS-concurrent-preclean-start]
    0.845: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.845: [CMS-concurrent-abortable-preclean-start]
    0.845: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.845: [GC (CMS Final Remark) [YG occupancy: 32331 K (157248 K)]0.845: [Rescan (parallel) , 0.0005295 secs]0.846: [weak refs processing, 0.0000073 secs]0.846: [class unloading, 0.0001767 secs]0.846: [scrub symbol table, 0.0002735 secs]0.846: [scrub string table, 0.0000860 secs][1 CMS-remark: 349520K(349568K)] 381851K(506816K), 0.0011191 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.847: [CMS-concurrent-sweep-start]
    0.847: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.847: [CMS-concurrent-reset-start]
    0.847: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.859: [GC (Allocation Failure) 0.859: [ParNew: 157028K->157028K(157248K), 0.0000131 secs]0.859: [CMS: 346871K->349488K(349568K), 0.0380390 secs] 503900K->349632K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0381095 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
    0.897: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349488K(349568K)] 352692K(506816K), 0.0005015 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.898: [CMS-concurrent-mark-start]
    0.899: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.899: [CMS-concurrent-preclean-start]
    0.900: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.900: [CMS-concurrent-abortable-preclean-start]
    0.900: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.900: [GC (CMS Final Remark) [YG occupancy: 24229 K (157248 K)]0.900: [Rescan (parallel) , 0.0005479 secs]0.901: [weak refs processing, 0.0000072 secs]0.901: [class unloading, 0.0001600 secs]0.901: [scrub symbol table, 0.0002778 secs]0.901: [scrub string table, 0.0000798 secs][1 CMS-remark: 349488K(349568K)] 373717K(506816K), 0.0011224 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
    0.901: [CMS-concurrent-sweep-start]
    0.902: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.902: [CMS-concurrent-reset-start]
    0.902: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.914: [GC (Allocation Failure) 0.914: [ParNew: 157202K->157202K(157248K), 0.0000138 secs]0.914: [CMS: 348338K->349450K(349568K), 0.0382967 secs] 505540K->351253K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0383649 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
    0.952: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349450K(349568K)] 354105K(506816K), 0.0003441 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.953: [CMS-concurrent-mark-start]
    0.954: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.954: [CMS-concurrent-preclean-start]
    0.955: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.955: [CMS-concurrent-abortable-preclean-start]
    0.955: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.955: [GC (CMS Final Remark) [YG occupancy: 22878 K (157248 K)]0.955: [Rescan (parallel) , 0.0005780 secs]0.955: [weak refs processing, 0.0000069 secs]0.956: [class unloading, 0.0001610 secs]0.956: [scrub symbol table, 0.0002446 secs]0.956: [scrub string table, 0.0000803 secs][1 CMS-remark: 349450K(349568K)] 372329K(506816K), 0.0011162 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.956: [CMS-concurrent-sweep-start]
    0.956: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.956: [CMS-concurrent-reset-start]
    0.957: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.969: [GC (Allocation Failure) 0.969: [ParNew: 157025K->157025K(157248K), 0.0000131 secs]0.969: [CMS: 348796K->349348K(349568K), 0.0386264 secs] 505821K->350573K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0386918 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
    1.008: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349348K(349568K)] 353657K(506816K), 0.0002394 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    1.009: [CMS-concurrent-mark-start]
    1.010: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.05 sys=0.00, real=0.00 secs] 
    1.010: [CMS-concurrent-preclean-start]
    1.011: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    1.011: [CMS-concurrent-abortable-preclean-start]
    1.011: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    1.011: [GC (CMS Final Remark) [YG occupancy: 27826 K (157248 K)]1.011: [Rescan (parallel) , 0.0002496 secs]1.011: [weak refs processing, 0.0000104 secs]1.011: [class unloading, 0.0002453 secs]1.012: [scrub symbol table, 0.0002788 secs]1.012: [scrub string table, 0.0000771 secs][1 CMS-remark: 349348K(349568K)] 377174K(506816K), 0.0009234 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    1.012: [CMS-concurrent-sweep-start]
    1.013: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    1.013: [CMS-concurrent-reset-start]
    1.013: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    1.025: [GC (Allocation Failure) 1.025: [ParNew: 156877K->156877K(157248K), 0.0000145 secs]1.025: [CMS: 349031K->349504K(349568K), 0.0386598 secs] 505909K->354579K(506816K), [Metaspace: 2633K->2633K(1056768K)], 0.0387327 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
    1.064: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349504K(349568K)] 357855K(506816K), 0.0006491 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
    1.065: [CMS-concurrent-mark-start]
    Heap
     par new generation   total 157248K, used 11147K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
      eden space 139776K,   7% used [0x00000000e0000000, 0x00000000e0ae2ed0, 0x00000000e8880000)
      from space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
      to   space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
     concurrent mark-sweep generation total 349568K, used 349504K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
     Metaspace       used 2639K, capacity 4486K, committed 4864K, reserved 1056768K
      class space    used 294K, capacity 386K, committed 512K, reserved 1048576K

从上图可以看出，CMS垃圾收集器各个阶段都清晰的打印在日志里了，有初始预标记阶段、有并发标记阶段，有并发预清理阶段，有最终标记阶段，
有并发清除阶段，有并发重置阶段。而同时，我们也能看到，所有的并发操作都是没有暂停时间的，因为并发操作不会触发STW事件，业务线程还在
正常工作，因此并没有暂停时间。

4、使用G1垃圾收集器运行GCLogAnalysis并生成GC日志如下：

    Java HotSpot(TM) 64-Bit Server VM (25.131-b11) for windows-amd64 JRE (1.8.0_131-b11), built on Mar 15 2017 01:23:53 by "java_re" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16610360k(10042188k free), swap 38643768k(30212112k free)
    CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseG1GC -XX:-UseLargePagesIndividualAllocation 
    0.096: [GC pause (G1 Evacuation Pause) (young), 0.0031297 secs]
       [Parallel Time: 1.5 ms, GC Workers: 8]
          [GC Worker Start (ms): Min: 96.0, Avg: 96.0, Max: 96.1, Diff: 0.1]
          [Ext Root Scanning (ms): Min: 0.1, Avg: 0.1, Max: 0.2, Diff: 0.1, Sum: 1.0]
          [Update RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
             [Processed Buffers: Min: 0, Avg: 0.0, Max: 0, Diff: 0, Sum: 0]
          [Scan RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [Code Root Scanning (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [Object Copy (ms): Min: 1.1, Avg: 1.1, Max: 1.2, Diff: 0.1, Sum: 9.2]
          [Termination (ms): Min: 0.0, Avg: 0.1, Max: 0.1, Diff: 0.1, Sum: 0.4]
             [Termination Attempts: Min: 1, Avg: 1.0, Max: 1, Diff: 0, Sum: 8]
          [GC Worker Other (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.2]
          [GC Worker Total (ms): Min: 1.3, Avg: 1.4, Max: 1.4, Diff: 0.1, Sum: 10.8]
          [GC Worker End (ms): Min: 97.4, Avg: 97.4, Max: 97.4, Diff: 0.0]
       [Code Root Fixup: 0.0 ms]
       [Code Root Purge: 0.0 ms]
       [Clear CT: 0.7 ms]
       [Other: 0.9 ms]
          [Choose CSet: 0.0 ms]
          [Ref Proc: 0.5 ms]
          [Ref Enq: 0.0 ms]
          [Redirty Cards: 0.2 ms]
          [Humongous Register: 0.0 ms]
          [Humongous Reclaim: 0.0 ms]
          [Free CSet: 0.0 ms]
       [Eden: 25.0M(25.0M)->0.0B(21.0M) Survivors: 0.0B->4096.0K Heap: 36.5M(512.0M)->14.3M(512.0M)]
     [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.103: [GC pause (G1 Evacuation Pause) (young), 0.0033654 secs]
       [Parallel Time: 1.9 ms, GC Workers: 8]
          [GC Worker Start (ms): Min: 102.6, Avg: 102.7, Max: 102.8, Diff: 0.2]
          [Ext Root Scanning (ms): Min: 0.0, Avg: 0.1, Max: 0.2, Diff: 0.2, Sum: 0.7]
          [Update RS (ms): Min: 0.0, Avg: 0.0, Max: 0.2, Diff: 0.2, Sum: 0.2]
             [Processed Buffers: Min: 0, Avg: 0.4, Max: 1, Diff: 1, Sum: 3]
          [Scan RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [Code Root Scanning (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [Object Copy (ms): Min: 1.1, Avg: 1.3, Max: 1.4, Diff: 0.3, Sum: 10.7]
          [Termination (ms): Min: 0.0, Avg: 0.1, Max: 0.2, Diff: 0.2, Sum: 0.5]
             [Termination Attempts: Min: 1, Avg: 1.0, Max: 1, Diff: 0, Sum: 8]
          [GC Worker Other (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [GC Worker Total (ms): Min: 1.5, Avg: 1.5, Max: 1.6, Diff: 0.1, Sum: 12.1]
          [GC Worker End (ms): Min: 104.2, Avg: 104.2, Max: 104.2, Diff: 0.0]
       [Code Root Fixup: 0.0 ms]
       [Code Root Purge: 0.0 ms]
       [Clear CT: 0.6 ms]
       [Other: 0.9 ms]
          [Choose CSet: 0.0 ms]
          [Ref Proc: 0.4 ms]
          [Ref Enq: 0.0 ms]
          [Redirty Cards: 0.4 ms]
          [Humongous Register: 0.0 ms]
          [Humongous Reclaim: 0.0 ms]
          [Free CSet: 0.0 ms]
       [Eden: 21.0M(21.0M)->0.0B(34.0M) Survivors: 4096.0K->4096.0K Heap: 38.6M(512.0M)->23.9M(512.0M)]
     [Times: user=0.00 sys=0.00, real=0.00 secs] 
    0.119: [GC pause (G1 Evacuation Pause) (young), 0.0035948 secs]
       [Parallel Time: 2.0 ms, GC Workers: 8]
          [GC Worker Start (ms): Min: 119.4, Avg: 119.5, Max: 119.6, Diff: 0.2]
          [Ext Root Scanning (ms): Min: 0.0, Avg: 0.1, Max: 0.2, Diff: 0.2, Sum: 0.5]
          [Update RS (ms): Min: 0.0, Avg: 0.1, Max: 0.5, Diff: 0.5, Sum: 0.8]
             [Processed Buffers: Min: 1, Avg: 1.1, Max: 2, Diff: 1, Sum: 9]
          [Scan RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [Code Root Scanning (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [Object Copy (ms): Min: 1.2, Avg: 1.6, Max: 1.7, Diff: 0.4, Sum: 12.5]
          [Termination (ms): Min: 0.0, Avg: 0.1, Max: 0.2, Diff: 0.2, Sum: 0.7]
             [Termination Attempts: Min: 1, Avg: 1.0, Max: 1, Diff: 0, Sum: 8]
          [GC Worker Other (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [GC Worker Total (ms): Min: 1.8, Avg: 1.8, Max: 1.9, Diff: 0.2, Sum: 14.5]
          [GC Worker End (ms): Min: 121.4, Avg: 121.4, Max: 121.4, Diff: 0.0]
       [Code Root Fixup: 0.0 ms]
       [Code Root Purge: 0.0 ms]
       [Clear CT: 0.5 ms]
       [Other: 1.1 ms]
          [Choose CSet: 0.0 ms]
          [Ref Proc: 0.4 ms]
          [Ref Enq: 0.0 ms]
          [Redirty Cards: 0.6 ms]
          [Humongous Register: 0.0 ms]
          [Humongous Reclaim: 0.0 ms]
          [Free CSet: 0.0 ms]
       [Eden: 34.0M(34.0M)->0.0B(51.0M) Survivors: 4096.0K->5120.0K Heap: 65.0M(512.0M)->36.0M(512.0M)]
     [Times: user=0.00 sys=0.00, real=0.00 secs] 
    .
    .
    .
    1.073: [GC pause (G1 Evacuation Pause) (young), 0.0006720 secs]
       [Parallel Time: 0.3 ms, GC Workers: 8]
          [GC Worker Start (ms): Min: 1073.5, Avg: 1073.5, Max: 1073.5, Diff: 0.0]
          [Ext Root Scanning (ms): Min: 0.1, Avg: 0.1, Max: 0.1, Diff: 0.0, Sum: 0.6]
          [Update RS (ms): Min: 0.0, Avg: 0.0, Max: 0.2, Diff: 0.2, Sum: 0.2]
             [Processed Buffers: Min: 0, Avg: 0.3, Max: 1, Diff: 1, Sum: 2]
          [Scan RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [Code Root Scanning (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [Object Copy (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [Termination (ms): Min: 0.0, Avg: 0.1, Max: 0.2, Diff: 0.2, Sum: 1.1]
             [Termination Attempts: Min: 1, Avg: 1.0, Max: 1, Diff: 0, Sum: 8]
          [GC Worker Other (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
          [GC Worker Total (ms): Min: 0.2, Avg: 0.2, Max: 0.3, Diff: 0.0, Sum: 1.9]
          [GC Worker End (ms): Min: 1073.7, Avg: 1073.7, Max: 1073.7, Diff: 0.0]
       [Code Root Fixup: 0.0 ms]
       [Code Root Purge: 0.0 ms]
       [Clear CT: 0.1 ms]
       [Other: 0.3 ms]
          [Choose CSet: 0.0 ms]
          [Ref Proc: 0.1 ms]
          [Ref Enq: 0.0 ms]
          [Redirty Cards: 0.1 ms]
          [Humongous Register: 0.0 ms]
          [Humongous Reclaim: 0.0 ms]
          [Free CSet: 0.0 ms]
       [Eden: 0.0B(25.0M)->0.0B(25.0M) Survivors: 0.0B->0.0B Heap: 414.6M(512.0M)->414.6M(512.0M)]
     [Times: user=0.00 sys=0.00, real=0.00 secs] 
    1.074: [Full GC (Allocation Failure)  414M->360M(512M), 0.0292558 secs]
       [Eden: 0.0B(25.0M)->0.0B(25.0M) Survivors: 0.0B->0.0B Heap: 414.6M(512.0M)->360.2M(512.0M)], [Metaspace: 2633K->2633K(1056768K)]
     [Times: user=0.03 sys=0.00, real=0.03 secs] 
    1.104: [GC concurrent-mark-abort]
    Heap
     garbage-first heap   total 524288K, used 368802K [0x00000000e0000000, 0x00000000e0101000, 0x0000000100000000)
      region size 1024K, 1 young (1024K), 0 survivors (0K)
     Metaspace       used 2639K, capacity 4486K, committed 4864K, reserved 1056768K
      class space    used 294K, capacity 386K, committed 512K, reserved 1048576K

从图中可以看出，G1GC类似于CMSGC，也是有STW的标记阶段和并发清理清除的阶段。
由于G1GC是分区域收集，每次并不会把所有垃圾都回收，会留一部分垃圾给下次收集，所以，每次垃圾收集都在0.1ms的级别。
延迟会很低。




