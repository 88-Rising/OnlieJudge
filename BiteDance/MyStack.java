package BiteDance;
/*
* 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
* */
import java.util.Stack;

public class MyStack {
    private Stack<Integer> dataStack=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();

    public void push(int node){
        dataStack.push(node);
        if(minStack.empty()||minStack.peek()>node){//如果辅助栈为空或者新元素比栈顶元素小 那么就入栈
            minStack.push(node);
        }else{
            minStack.push(minStack.peek()); //如果新元素比栈顶元素大 就重复压入栈顶元素
        }
    }

    public void pop(){
        dataStack.pop();
        minStack.pop(); //保证实时拿到的元素 是数据栈中最小的
    }

    public int top(){
        return dataStack.peek();
    }

    public int min(){
        return minStack.peek();
    }
}
