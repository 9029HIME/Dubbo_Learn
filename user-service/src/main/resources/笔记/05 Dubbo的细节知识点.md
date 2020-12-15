# 版本

可以通过@Service(version)、ServiceConfig::SetVersion()的方式这是接口版本号

可以通过@Reference(version)的方式引用特定版本号的接口



# CAP中的A

1.注册中心宕机后，Consumer可以通过本地缓存寻找到Provider进行通信

2.Dubbo-Admin宕机后，只会导致记录数据的丢失， 不影响正常使用

3.也可以通过Dubbo直连来调用Provider的接口，具体方式：@Reference(url="ip:port")。**注意，这里的port是提供者服务的端口，而为java进程端口**