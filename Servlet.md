# Servlet

## ServletContext

@deprecated 已过时的

web容器在启动的时候，他会为每个web应用创建ServletContext对象

### 共享数据

我在这个servlet中保存的数据，可以在另一servlet中拿到

### 读取资源文件

- 在java目录下新建properties
- 在resources目录下新建properties

发现都被打包到了**classes**路径下 这个路径称为类路径

### 请求和转发

![image-20240521125029364](../../AppData/Roaming/Typora/typora-user-images/image-20240521125029364.png)

### 获取初始化参数

## HttpServletResponse

web服务器接收到客户端的http请求，针对这个请求分别创建一个HttpServletResponse和一个HttpServletRequest

- HttpServletResponse：给客户端响应
- HttpServletRequest：获取客户端请求的参数

## HttpServletRequest