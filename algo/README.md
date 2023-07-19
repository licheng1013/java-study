# 算法
## 介绍
- 算法的性能排序
- O(1)<O(logN)<O(N)<O(NlogN)<O(N^2)<O(2^N)<O(N!)

### O(1)
- 代表1次操作即可完成任务，无论数据量大小，都是如此。如：哈希表的增、删、改、查操作

### O(logN)
- 代表数据量每增加一倍，操作次数会增加一次。如：二分查找
- 每次查找都会将数据量减半，直到查找到目标数据，或者数据量小于1

### O(N)
- 代表数据量每增加一倍，操作次数也会增加一倍。如：简单查找
- 假设有一个长度为N的数组，查找其中的某个元素，最坏的情况是需要查找N次

### O(NlogN)
- 代表数据量每增加一倍，操作次数会增加N倍。如：快速排序
- 快速排序的时间复杂度为O(NlogN)，是一种高效的排序算法

### O(N^2)
- 代表数据量每增加一倍，操作次数会增加N 2 倍。如：冒泡排序

### O(2^N)
- 代表数据量每增加一倍，操作次数会增加2倍。如：斐波那契数列

### O(N!)
- 代表数据量每增加一倍，操作次数会增加N!倍。如：旅行商问题
- 旅行商问题：有5个城市，任意两个城市之间的距离都不同，现在要从其中某个城市出发，
- 遍历所有城市，最后回到出发的城市，问：如何计算出最短的路径？
- 5个城市，有5*4*3*2*1=120种排列方式，即需要120次操作
