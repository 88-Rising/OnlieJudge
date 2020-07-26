package BiteDance;

/*
* 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
* */
public class IsSameFromBegin {

    public boolean HasSubTree(TreeNode root1,TreeNode root2){
        if(root1==null||root2==null){
            return false;
        }

        Boolean result=false;
        if(root1.val==root2.val){

            result = isSameFromBegin(root1,root2);
        }

        if(result!=true){

            result = isSameFromBegin(root1.left,root2);
        }

        if(result!=true){
            result = isSameFromBegin(root1.right,root2);
        }

        return result;
    }

    private Boolean isSameFromBegin(TreeNode root1, TreeNode root2) {

        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }

        return isSameFromBegin(root1.left,root2.left)&&isSameFromBegin(root1.right,root2.right);
    }
}
