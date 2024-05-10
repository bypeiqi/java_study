package operatpr;

import java.util.Scanner;

public class scanner3 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    double sum=0;
    int i=0;
    while(scanner.hasNextDouble()){
        double x=scanner.nextDouble();
        i++;
        sum=sum+x;
        System.out.println("你输入了第"+i+"个数据,当前结果是"+sum);
    }
    System.out.println("总和为:"+sum);
    System.out.println("平均值为:"+(sum/i));
    }
    
}
