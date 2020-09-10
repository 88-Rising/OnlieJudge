package MyTree;

import java.util.ArrayList;
//实现二叉树的先序遍历中序遍历和后续遍历
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 }
public class ThreeOrders {
    ArrayList<Integer> pre=new ArrayList<>();
    ArrayList<Integer> in=new ArrayList<>();
    ArrayList<Integer> post=new ArrayList<>();

    public int[][] threeOrders (TreeNode root) {
        if(root==null){
            return new int[][]{{}};
        }
        preOrder(root); //先序遍历
        inOrder(root);  //中序遍历
        postOrder(root); //后序遍历
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ans.add(pre);
        ans.add(in);
        ans.add(post);
        int[][] result=new int[ans.size()][ans.get(0).size()];
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size();j++){
                result[i][j]=ans.get(i).get(j);
            }

        }
        return result;
    }

    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        pre.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        in.add(root.val);
        inOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        post.add(root.val);
    }

}
