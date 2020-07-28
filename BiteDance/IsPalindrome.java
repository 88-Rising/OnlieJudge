package BiteDance;

import java.util.Scanner;
/*
* 给定一个仅由小写字母组成的字符串。现在请找出一个位置，删掉那个字母之后，字符串变成回文。请放心总会有一
个合法的解。如果给定的字符串已经是一个回文串，那么输出-1。
* */
public class IsPalindrome {
    public static boolean isPalindrome(StringBuffer sb,int[] left,int[] right){
        int i=0;
        int j=sb.length()-1;
        boolean result=true;
        while(i<=j){
            if(sb.charAt(i)!=sb.charAt(j)){//判断左右两边字符是否符合回文字符串规则
                result=false;
                break;
            }
            i++;
            j--;
        }
        if(left!=null){
            left[0]=i; //记录左下标
        }
        if(right!=null){
            right[0]=j;//记录右下标
        }
        return result;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        while(num>0){
            StringBuffer sb=new StringBuffer(sc.next());
            int[] left=new int[1]; //用来放置左右对应字符不相等时的左下标
            int[] right=new int[1];//用来放置左右对应字符不相等时的右下标
            if(isPalindrome(sb,left,right)){
                System.out.println(-1);
            }else{
                sb.deleteCharAt(left[0]);//删除左边不相等的
                if(isPalindrome(sb,null,null)){
                    System.out.println(left[0]);
                }else{ //如果还不是回文字符串则直接打印右边下标
                    System.out.println(right[0]);
                }

            }
            num--;
        }
    }
}
