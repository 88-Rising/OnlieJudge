package BiteDance;
/*
* 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
* */
import java.util.Stack;

public class IsPopOrder {
    public boolean isPopOrder(int [] pushA,int [] popA) {
        if(popA==null||pushA==null||popA.length!=pushA.length){
            return false;
        }

        Stack<Integer> stack =new Stack<>();
        int j=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);   //先入栈

            while(!stack.empty()&&stack.peek()==popA[j]){//碰到popA的 第一个元素然后开始弹栈
                stack.pop();
                j++;
            }

        }
        return stack.empty();
    }
}
