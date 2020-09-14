package IQIYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class JudgeIsReverse {

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] strings=bf.readLine().split(" ");
        String s1=strings[0];
        String s2=strings[1];
        System.out.println(judgeIsReverse(s1,s2));
    }

    private static boolean judgeIsReverse(String s1, String s2) {
        if(s1==null||s2==null){
            return false;
        }else if(s1.length()!=s2.length()){
            return false;
        }else{
            String str=s1+s1;
            return str.contains(s2);
        }

    }
}
