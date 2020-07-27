package BiteDance;

import sun.reflect.generics.tree.Tree;
/*
*
从上往下打印出二叉树的每个节点，同层节点从左至右打印
* */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class printFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        if(root==null){
            return new ArrayList<Integer>();
        }

        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> result=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode father=queue.poll();
            result.add(father.val);
            if(father.left!=null){
                queue.add(father.left);
            }
            if(father.right!=null){
                queue.add(father.right);
            }

        }
        return result;
    }
}
