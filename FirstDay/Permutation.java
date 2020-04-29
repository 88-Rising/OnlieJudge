package FirstDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/*
* 给定一个由不同的小写字母组成的字符串，输出这个字符串的所有全排列。 我们假设对于小写字母有'a' < 'b' < ... < 'y' < 'z'，而且给定的字符串中的字母已经按照从小到大的顺序排列。
* */
public class Permutation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String scan=sc.nextLine();
        char[] chars=scan.toCharArray();
        Arrays.sort(chars);
        ArrayList<String> result=new ArrayList<>();
        permutation(0,chars,result);
        Collections.sort(result);
        for(int k=0;k<result.size();k++){
            System.out.println(result.get(k));
        }
    }

    private static void permutation(int i, char[] chars, ArrayList result) {
        if(i==chars.length-1){
            String val=String.valueOf(chars);
            if(!result.contains(val)){
                result.add(val);
            }
        }else{
            for(int j=i;j<chars.length;j++){
                swap(i,j,chars);//首先固定一个数
                permutation(i+1,chars,result);//其余的数进行全排列
                swap(i,j,chars);//回溯，变回之前没有交换的字符串

            }
        }

    }
    public static void swap(int i,int j,char[] chars){
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;

    }


}
