package BiteDance;
/*
* 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重
复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*
* 重构二叉树的核心；
* 1.如何划分前序（根节点，左子树前序，右子树前序）
* 2.如何划分中序(根据根节点，左中序，右中序)
* */
public class reConstructBinaryTreeCore {

    public TreeNode solution(int[] pre,int preStart,int preEnd,int [] in, int inStart, int inEnd){
        if(preStart>preEnd||inStart>inEnd){
            return null;
        }

        TreeNode root =new TreeNode(pre[preStart]);
        for(int i=inStart;i<=inEnd;i++){
            if(in[i]==pre[preStart]){
                root.left=solution(pre,preStart+1,i-inStart+preStart,in,inStart,i-1);
                root.right=solution(pre,i-inStart+preStart+1,preEnd,in,i+1,inEnd);
            }

        }
        return root;

    }
    public TreeNode reConstructBinaryTree(int [] pre,int[] in){
        if(pre.length==0||in.length==0){
            return null;
        }

        return solution(pre,0,pre.length-1,in,0,in.length-1);

    }
}
