# JAVA学习

write once  run anywhere

## JDK JRE JVM

JDK:Java Development Kit

JRE:Java Runtime Environment

JVM:JAVA Virtual Machine java虚拟机

![image-20240422182304564](C:\Users\WanGXU\AppData\Roaming\Typora\typora-user-images\image-20240422182304564.png)

## Hello world

```java
public class Hello{

  public static void main(String[] args){

     System.out.print("Hello,world");

  }

}
```

## IO流

### 什么是流

一个流被定义为一个数据序列。输入流用于从源读取数据，输出流用于向目标写数据。

#### 字节流（Byte Streams）

字节流以字节为单位进行操作，用于处理二进制数据，如图像、音频、视频等。在 Java 中，字节流主要由 `InputStream` 和 `OutputStream` 类及其子类组成。

- **InputStream：** 用于从输入流中读取字节数据。
- **OutputStream：** 用于将字节数据写入输出流中。

例如，常见的字节流类包括 `FileInputStream`、`FileOutputStream`、`BufferedInputStream`、`BufferedOutputStream` 等。

##### FileInputStream

用于从文件读取数据

```java
InputStream f=new FileInputStream("C:/java/hello")
```



 ##### FileOutputStream



#### 字符流（Character Streams）

字符流以字符为单位进行操作，用于处理文本数据，如文本文件。在 Java 中，字符流主要由 `Reader` 和 `Writer` 类及其子类组成。

- **Reader：** 用于从输入流中读取字符数据。
- **Writer：** 用于将字符数据写入输出流中。

例如，常见的字符流类包括 `FileReader`、`FileWriter`、`BufferedReader`、`BufferedWriter` 等。

![img](assets/iostream2xx.png)

##### 创建BufferedReader以及读取

`BufferedReader` 是 Java 中的一个类，用于从字符输入流读取文本

`read()`: 读取单个字符。

`read(char[] cbuf, int off, int len)`: 将字符读入数组的一部分。

`readLine()`: 读取一行文本。返回一个包含行内容的字符串，不包括任何行终止符，如果流的结尾已到达，则返回 `null`。

`ready()`: 检查流是否准备好进行读取。

`close()`: 关闭流并释放相关资源。

``` java
package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import operatpr.dowhile;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        //使用System.in 创建BufferedReader
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符，按下q结束输入");
        do {
            c=(char)br.read();
            System.out.println(c);
        } while (c!='q');
    }
}

```











 

