[toc]
#目录

## 命令模式

- 对同一套参数进行，不同命令的构造。

### 命令获取到相应的参数就去执行他

### 角色

- Stock 命令方法
- Order
  - BuyStock 实现Order并通过传入Stock在实现的方法执行Stock目标方法
  - SellStock 实现Order并通过传入Stock在实现的方法执行Stock目标方法
- Broker

