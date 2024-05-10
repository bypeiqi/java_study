package leecode.java_stack;

import java.util.Stack;
public class Q_20 {
    String s="()";
    public static boolean isValid(String s) {
        // 创建一个栈来存储左括号
        Stack<Character> stack = new Stack<>();

        // 遍历字符串中的每个字符
        for (char c : s.toCharArray()) {
            // 如果是左括号，则推入栈中
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // 如果是右括号且栈为空，则无法匹配，直接返回false
                if (stack.isEmpty()) {
                    return false;
                }
                // 弹出栈顶元素，检查是否与当前的右括号匹配
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // 如果栈为空，则所有左括号都找到了匹配的右括号
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Q_20 q_20=new Q_20();
        System.out.println(isValid("()"));
        
    }
}