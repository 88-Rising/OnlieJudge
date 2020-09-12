package IQIYI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
/*
* 牛牛有一个由小写字母组成的字符串s,在s中可能有一些字母重复出现。比如在"banana"中,字母'a'和字母'n'分别出现了三次和两次。
但是牛牛不喜欢重复。对于同一个字母,他只想保留第一次出现并删除掉后面出现的字母。请帮助牛牛完成对s的操作。
* */
public class DeleteSameChar {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String stirngs=sc.nextLine();
        StringBuilder stringBuilder=new StringBuilder();
        HashMap<Integer,Character> map=new HashMap<>();
        int j=0;
        for(int i=0;i<stirngs.length();i++){
            if(!map.containsValue(stirngs.charAt(i))){
                map.put(j,stirngs.charAt(i));
                j++;
            }
        }
        for(int k=0;k<j;k++){
            stringBuilder.append(map.get(k));
        }
        System.out.println(stringBuilder.toString());

    }
}
