[toc]

# 目录
## 介绍
- 2022/5/29
### Hash
- Java中的HashMap，利用对象的hashcode进行计算取模，得除数组得下标进行存储
- 生活中，一排储物柜根据物品的编号快速找到对应的柜子

### 优点
- 访问速度快

### 缺点
- 如果Hash冲突就会造成节点链接，影响效率 


### Hash执行
- 默认的大小，16，默认的负载因子0.75f,
- 链表大于8 and HashMap的大小超过64，就变成树。
- 无参构造->创建对象
  - 在调用put方法时，判断node数组是否已经创建，否则进行初始化
  - 然后当K,V数据进来计算然后判断，如果没有则直接插入，
  - 如果有判断是否已经变成了树，则在树中进行插入，否则进行链表连接。在返回回去