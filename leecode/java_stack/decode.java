package leecode.java_stack;

import java.util.Stack;

public class decode {
    private String str;
    private Stack<Object> stack;
    private int a;
    private String result;

    public decode(){
        str="";
        a=0;
        stack=new Stack<>();
    }
    public String decodeString(String s){
        String result="";
        char[] charArray=s.toCharArray();
        for(char c:charArray){
            if (Character.isDigit(c)) {

                a=a*10+(c-'0');
            }
            else if (Character.isLetter(c)) {
                str=str+c;
            }
            else if (c=='[') {
                stack.push(a);
                stack.push(str);
                a=0;
                str="";
            }
            else{
                String pre_str=(String) stack.pop();
                int size=(int) stack.pop();
                
                for(int b=0;b<size;b++){
                  result+=str;
                }
                str=pre_str+result;
                result="";
                }
                
        }
        return str;
    }
    public static void main(String[] args) {
        decode decode=new decode();
        System.out.println(decode.decodeString("2[abc]3[cd]ef"));
    }
    
}
