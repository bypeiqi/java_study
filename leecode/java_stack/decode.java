package leecode.java_stack;

import java.util.Stack;

public class decode {
    private String str;
    private String pre_str;
    private Stack<Object> stack;
    private int a;
    private String result;

    public decode(){
        str="";
        pre_str="";
        a=0;
        stack=new Stack<>();
    }
    public String decodeString(String s){
        StringBuilder sb = new StringBuilder();
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
                pre_str=(String) stack.pop();
                a=(int) stack.pop();
                
                for(int b=0;b<a;b++){
                  sb.append(str);
                }
                result=sb.toString();
                }
                
        }
        return result;
    }
    public static void main(String[] args) {
        decode decode=new decode();
        System.out.println(decode.decodeString("2[abc]3[cd]ef"));
    }
    
}
