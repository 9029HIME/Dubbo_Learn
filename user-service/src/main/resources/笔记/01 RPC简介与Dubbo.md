# RPC是什么？

RPC即远程过程调用，他是一种思想并非技术实现。RPC框架有很多如Dubbo、gRPC、Thrift、HSF

![image-20201202222013520](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201202222013520.png)

RPC框架的好坏，取决于

1.能否快速建立服务间的连接？（基于什么网络协议？）

2.序列化与反序列化的速度是否足够快？（基于什么序列化方式？）



# Dubbo是什么？

​	一款高性能的Java RPC框架，广泛应用于分布式系统。**和SpringCloud相比，Dubbo1是一款RPC通信框架，而SpringCloud是一个分布式项目的生态，且SpringCloud是基于Rest进行服务调用**。

## 	1.Dubbo架构

​	![dubbo-architucture](http://dubbo.apache.org/imgs/user/dubbo-architecture.jpg)

| `Provider`  | 暴露服务的服务提供方                    |
| ----------- | --------------------------------------- |
| `Consumer`  | 调用远程服务的服务消费方                |
| `Registry`  | 服务注册与发现的注册中心                |
| `Monitor`   | 统计服务的调用次数和调用时间的监控中心  |
| `Container` | 服务运行容器，**Provider跑在Container** |