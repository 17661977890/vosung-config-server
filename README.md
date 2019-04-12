# vosung-config-server

config-server：
配置中心服务端，启动主程序，浏览器访问：(获取git仓库配置文件conffig-file项目下didispace-dev.propertites文件得配置信息)
http://localhost:7001/didspace/dev/master

{application}/{profile}/git分支名称

控制台输出信息:
o.s.c.c.s.e.NativeEnvironmentRepository  : Adding property source: file:/C:/Users/彬/AppData/Local/Temp/config-repo-3629415525264078477/configfile/config-repo/didispace-test.properties
配置服务器会从git中获取配置信息后，会存储一份在config-server的文件系统中，实际上就是通过git clone
命令将配置内容复制一份在本地存储，然后读取这些内容返回给微服务应用。类似于缓存一样，如果git仓库出现问题，
可以加在本地的缓存的配置信息。



增加eureka，实现微服务注册的配置中心