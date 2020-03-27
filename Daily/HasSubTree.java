package Daily;

import org.omg.PortableInterceptor.INACTIVE;
import sun.reflect.generics.tree.Tree;

import java.util.*;

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
    public void Mirror2(TreeNode root) {
        if(root==null){
            return;
        }
        Stack<TreeNode> myStack=new Stack<>();
        myStack.push(root);
        while(!myStack.isEmpty()){
            TreeNode TreeRoot= myStack.pop();
            if(TreeRoot.left!=null||TreeRoot.right!=null){
                TreeNode nodeLeft=TreeRoot.right;
                TreeNode nodeRight=TreeRoot.left;
                TreeRoot.left=nodeLeft;
                TreeRoot.right=nodeRight;

            }
            if(TreeRoot.left!=null){
                myStack.push(TreeRoot.left);
            }
            if(TreeRoot.right!=null){
                myStack.push(TreeRoot.right);
            }

        }


    }
    public ArrayList<Integer> printMatrix(int [][] matrix) {

        int row= matrix.length;
        int cal=matrix[0].length;
        ArrayList<Integer> result=new ArrayList<>();
        if(row==0||cal==0){
            return result;
        }
        int left=0,top=0,bottom=row-1,right=cal-1;
        while(left<=bottom&&top<=right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            for(int j=top+1;j<=bottom;j++){
                result.add(matrix[j][right]);
            }
            if (top != bottom)
                for(int t = right-1;t>=left;t--){
                    result.add(matrix[bottom][t]);
                }
            if(left != right)
                for(int k = bottom-1;k>top;k--){
                    result.add(matrix[k][left]);
                }
            top++;left++;right--;bottom--;

        }

        return result;
    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Deque<TreeNode> deque=new LinkedList<>();
        deque.add(root);
        while(!deque.isEmpty()){
            TreeNode node=deque.pop();
            list.add(node.val);
            if(node.left!=null){
                deque.add(node.left);
            }
            if(node.right!=null){
                deque.add(node.right);
            }

        }
        return list;


    }

    ArrayList<ArrayList<Integer>> resultsList = new ArrayList<ArrayList<Integer>>();

    /**
     * 建立额外一个函数，用来实现递归求解
     * @param root
     * @param target
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<Integer> pathList = new ArrayList<Integer>();
        if (root == null) {
            return resultsList;
        }

        int curSum = 0;
        int index = 0;
        int []path = new int[1000];
        this.isTargetPath(root, target, curSum, path, index);

        return this.resultsList;
    }


    public void isTargetPath(TreeNode eleNode, int target, int curSum, int []path, int index) {
        if (eleNode == null) {
            return;
        }

        curSum += eleNode.val;
        // 把该节点包含进去
        path[index] = eleNode.val;
        index ++;

        // 当前已经是处于叶子节点，并且累计的和与target相等
        if (curSum == target && eleNode.left == null && eleNode.right == null) {
            // 将得到的结果放在外层结构中
            ArrayList<Integer> pathList = new ArrayList<Integer>();
            for (int i = 0; i < index; i++) {
                pathList.add(path[i]);
            }
            resultsList.add(pathList);
            return;
        }

        // 该节点有左子节点，前提还是要curSum 小于 target，否则递归就没有意义了
        if (curSum < target && eleNode.left != null) {
            this.isTargetPath(eleNode.left, target, curSum, path, index);
        }

        // 右子节点
        if (curSum < target && eleNode.right != null) {
            this.isTargetPath(eleNode.right, target, curSum, path, index);
        }
    }



}










