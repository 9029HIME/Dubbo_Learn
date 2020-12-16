# 服务暴露

![image-20201216213105785](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201216213105785.png)



## 服务引用

![image-20201216213025682](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201216213025682.png)





服务调用

![image-20201216213141761](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201216213141761.png)

Cluster封装多个Invoker,如果有多个Invoker，还能选择其中一种LoadBalance机制。最终是用DubboInvoker进行调用，底层通过Netty调用。