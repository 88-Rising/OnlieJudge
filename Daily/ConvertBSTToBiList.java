package Daily;

import com.sun.deploy.panel.TreeRenderers;

import java.util.Stack;

public class ConvertBSTToBiList {

    public static TreeNode convertBSTToBilist(TreeNode pRootOfTree){
        if(pRootOfTree==null){
            return null;
        }
        TreeNode pre=null;
        TreeNode p=pRootOfTree;
        boolean isFirst=true;
        Stack<TreeNode> stack =new Stack<>();
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p=p.left;
            }
            p=stack.pop();
            if(isFirst){
                pRootOfTree=p;
                pre=pRootOfTree;
                isFirst=false;
            }else{
                pre.right=p;
                p.left=pre;
                pre=p;
            }
            p=p.right;

        }

        return pRootOfTree;
    }
}
