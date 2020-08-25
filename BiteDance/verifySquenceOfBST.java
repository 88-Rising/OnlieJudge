package BiteDance;
/*
*
*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
* */
public class verifySquenceOfBST {

    public boolean  VerifySquenceOfBSTCore(int[] seqence,int start,int end){
//        if(start>=end){
//            return true;
//        }
//        int root=seqence[end];//记录根节点
//        int i=0;
//        while(seqence[i]<root&&i<end){//得出左子树
//            i++;
//        }
//
//        for(int j=i;j<end;j++){//遍历右子树判断是否符合BST规定
//            if(seqence[j]<root){
//                return false;
//            }
//
//        }
//        return VerifySquenceOfBSTCore(seqence,0,i-1)&&VerifySquenceOfBSTCore(seqence,i,end-1);


        if(start<=end){
            return true;
        }

        int root = seqence[end];
        int i=0;
        while(seqence[i]<root&&i<end){
            i++;
        }
        for(int j=i;j<end;j++){
            if(seqence[j]<root){
                return false;
            }
        }
        return VerifySquenceOfBSTCore(seqence,0,i-1)&&VerifySquenceOfBSTCore(seqence,i,end-1);

    }

    public boolean VerifySquenceOfBST(int[] sequence){
        if(sequence.length==0){
            return false;
        }
        return VerifySquenceOfBSTCore(sequence,0,sequence.length-1);
    }


}
