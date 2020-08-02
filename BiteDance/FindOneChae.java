package BiteDance;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/*
*寻找字符串中只出现一次的字符（如果有多个只打印第一个）
* */
public class FindOneChae {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            String scan=sc.next();
            if(scan.length()==0||scan==null||scan.trim().equals("")){
                System.out.println(0);
            }
            HashMap<Character,Integer> map=new HashMap<>();

            for(int i=0;i<scan.length();i++){
                if(map.containsKey(scan.charAt(i))){
                    map.put(scan.charAt(i),map.get(scan.charAt(i))+1);
                }else{
                    map.put(scan.charAt(i),1);
                }
            }
            char result=' ';
            for(int i=0;i<scan.length();i++){
                if(map.get(scan.charAt(i))==1){
                    result=scan.charAt(i);
                }
            }
            if(result==' '){
                System.out.println(-1);
            }else{
                System.out.println(result);
            }
        }
    }
}
