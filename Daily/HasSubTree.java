package Daily;

class TreeNode {
   int val = 0;
   TreeNode left = null;
   TreeNode right = null;

   public TreeNode(int val) {
        this.val = val;

   }
}

public class HasSubTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null&&root1==null){
            return false;
        }
        boolean flag=false;

        if(root1!=null&&root2!=null) {
            if(root1.val==root2.val) {
                flag = AckSame(root1, root2);
            }

            if (!flag) {
                flag = HasSubtree(root1.left,root2);
            }

            if (!flag) {
                flag = HasSubtree(root1.right,root2);
            }
        }
        return flag;

    }
    public boolean AckSame(TreeNode node1,TreeNode node2){
        if(node2==null){
            return true;
        }
        if(node1==null){
            return false;
        }
        if(node1.val != node2.val){
            return  false;
        }
        return AckSame(node1.left,node2.left)&&AckSame(node1.right,node2.right);


    }
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        TreeNode nodeleft=root.right;
        TreeNode noderight=root.left;
        root.left=nodeleft;
        root.right=noderight;
        if(root.left!=null){
            Mirror(root.left);
        }
        if(root.right!=null){
            Mirror(root.right);
        }

    }


}










