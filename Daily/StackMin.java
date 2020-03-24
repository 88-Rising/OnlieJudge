package Daily;
import java.util.Stack;
public class StackMin {

/*
* 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
* */
        Stack<Integer> myStack1 = new Stack<>();
        Stack<Integer> myStack2 = new Stack<>();
        public void push(int node) {
            myStack1.push(node);
        }

        public void pop() {
            myStack1.pop();
        }

        public int top() {
            return myStack1.peek();
        }

        public int min() {
            int min = Integer.MAX_VALUE;
            while(!myStack1.empty()){
                int node=myStack1.pop();
                if(node<min){
                    min=node;
                }
                myStack2.push(node);
            }
            while(!myStack2.isEmpty()){
                myStack1.push(myStack2.pop());
            }
            return min;

        }

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int j = 0;
        for (int i = 0; i < popA.length; i++) {
            stack.push(pushA[i]);
            while (j < popA.length && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }

        }
        return stack.empty() ? true : false;

    }

}
