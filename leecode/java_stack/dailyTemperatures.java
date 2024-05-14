package leecode.java_stack;
import java.util.Arrays;
import java.util.Stack;

public class dailyTemperatures {
    private Stack<Integer> stack=new Stack<>();
    public int[] DailyTemperatures(int[] temperatures){
        for(int num=0;num<temperatures.length;num++){
            int b=num;
            if(num!=temperatures.length-1){
            int a=1;
            while(b+1<temperatures.length&&temperatures[num]>temperatures[b+1]){
                if (b + 1 == temperatures.length - 1 && temperatures[num] >= temperatures[b + 1]) {
                    a = 0;
                    break;
                }
                b++;
                a++;
            }
            stack.push(a);
            }else {
                stack.push(0);
            }
          
        } 
        int[] array=new int[temperatures.length];
        for(int num =temperatures.length-1;num>=0;num--){
            array[num]=stack.pop();
        }
        return array;
    }
    public static void main(String[] args) {
        dailyTemperatures dailyTemperatures=new dailyTemperatures();
        int[] temperatures={73,74,75,71,69,72,76,73};
        int [] result=dailyTemperatures.DailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }
}
