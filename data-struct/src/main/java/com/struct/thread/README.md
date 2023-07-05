[toc]
#目录
### 线程池解读
- ThreadPoolExecutor
- ThreadPoolExecutor将根据 corePoolSize 和 maximumPoolSize 当在方法execute(Runnable)中提交了一个新任务，
- 并且运行的线程少于 corePoolSize 时，即使其他工作线程处于空闲状态，也会创建一个新线程来处理该请求。
- 如果运行的线程数多于 corePoolSize 但少于 maximumPoolSize，则仅当队列已满时才会创建新线程。

#### 重点
- 核心线程数 < 工作任务 < 最大线程数 && 工作队列已满  =  则创建新线程
- 人话： 


### 使用线程池去执行异步任务
