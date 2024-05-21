package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
