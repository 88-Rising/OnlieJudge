package IQIYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class TheLargestStrings {

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] input=bf.readLine().split(" ");
        String str=input[0];
        int max=0;

        for(int i=0;i<str.length();i++){
            HashSet<Character> set=new HashSet<>();
            int temp=0;
            for(int j=i;j<str.length();j++){
                if(set.contains(str.charAt(j))){

                    break;
                }else{
                    temp++;
                    set.add(str.charAt(j));
                }
            }
            if(max<temp){
                max=temp;
            }

        }
        System.out.println(max);
    }
}
