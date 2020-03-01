package Swordquest;

/*
* 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
* 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
* */

import java.util.Arrays;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }

}

public class Swordquest4 {
    public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
        if(pre.length==0){
            return null;
        }
        int rootVal = pre[0];
        if(pre.length==1){
            return new TreeNode(rootVal);
        }

        TreeNode root = new TreeNode(rootVal);//先放入根节点
        int rootIndex = 0;
        //前序遍历：根左右
        //中序遍历：左根右
        //利用二叉树的性质 找到根节点即利用前序的第一个结点（根节点）找到中序遍历数组中根节点的位置 区分开来左子树和右子树
        for(int i = 0;i<in.length;i++){
            if(rootVal == in[i]){
                rootIndex = i ;
                break;
            }
        }
        //copyOfRange(int[] original,int fron ,int to)  把一个原始数组original 从from复制到to（区间为左闭右开）到一个新数组中
        //进行递归
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1),Arrays.copyOfRange(in,0,rootIndex));//左子树
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),Arrays.copyOfRange(in,rootIndex+1,in.length));//右子树
        return root;
    }
}
