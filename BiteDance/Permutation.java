package BiteDance;

import java.util.ArrayList;
import java.util.Collections;
/*
*
* 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
* */
public class Permutation {
    public void swap(char[] chars,int i,int j){
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;

    }

    public void helpPermutation(ArrayList<String> result,char[] chars,int start,int end){
        if(start==end){
            String val=String.valueOf(chars);
            if (!result.contains(val)) {
                result.add(val);
            }
            return;
        }

        for(int i=start;i<=end;i++){
            swap(chars,i,start);
            helpPermutation(result,chars,start+1,end);
            swap(chars,i,start);

        }

    }

    public ArrayList<String> permutation(String str){
        if(str==null){
            return new ArrayList<String>();
        }
        char[] chars=str.toCharArray();
        ArrayList<String> result=new ArrayList<>();

        helpPermutation(result,chars,0,chars.length-1);
        Collections.sort(result);
        return result;

    }


}
