package BiteDance;

import java.util.ArrayList;

/*
* 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
* */
public class findPath {

    public void findPathDFS(TreeNode root,int target,ArrayList<ArrayList<Integer>> result,ArrayList<Integer> path){
        if(root==null){
            return;
        }

        target-=root.val;
        path.add(root.val);

        if(root.left==null&&root.right==null&&target==0){
            result.add(new ArrayList<Integer>(path));
        }

        findPathDFS(root.left,target,result,path);
        findPathDFS(root.right,target,result,path);

        path.remove(path.size()-1);

    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path=new ArrayList<>();
        findPathDFS( root, target,result,path);
        return result;

    }
}
