package BiteDance;
/*
*
* 输入一棵二叉树，求该树的深度。
* 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
* */
public class TreeDepth {
    public void treeDepthHelper(TreeNode root,int[] result,int cur){
        if(root==null){
            return;
        }else{
            if(result[0]<cur){
                result[0]=cur;
            }
        }
        if(root.left!=null){
            treeDepthHelper(root.left,result,cur+1);
        }
        if(root.right!=null){
            treeDepthHelper(root.right,result,cur+1);
        }

    }
    public int treeDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int[] result=new int[1];
        int cur=0;
        treeDepthHelper(root,result,cur+1);

        return result[0];
    }
}
