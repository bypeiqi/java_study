package operatpr;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("请输入");

    
    if(s.hasNext()){
        String str=s.nextLine();
        System.out.println(str);
    }
    s.close();
}   
}