package leecode.java_stack;
import java.util.Stack;
public class Minstack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public Minstack(){
        stack=new Stack<>();
        minStack=new Stack<>();
       
    }
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()||minStack.peek()>=val){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            int val=stack.pop();
            if(val==minStack.peek()){
                minStack.pop();
            }
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        Minstack minstack = new Minstack();
        minstack.push(-2);
        minstack.push(0);
        minstack.push(-3);
        System.out.println("Min: " + minstack.getMin());  // Output: -3
        minstack.pop();
        System.out.println("Top: " + minstack.top());      // Output: 0
        System.out.println("Min: " + minstack.getMin());
    }
}