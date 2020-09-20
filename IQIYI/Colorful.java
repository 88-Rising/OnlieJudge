package IQIYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Colorful {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        String haveColor=bufferedReader.readLine();
        String needColor=bufferedReader.readLine();
        HashMap<Character,Integer> Hcolor=new HashMap<>();
        for(int i=0;i<haveColor.length();i++){
            if(Hcolor.containsKey(haveColor.charAt(i))){
                int value=Hcolor.get(haveColor.charAt(i))+1;
                Hcolor.put(haveColor.charAt(i),value);
            }else{
                Hcolor.put(haveColor.charAt(i),1);
            }
        }
        int result=0;
        for(int j=0;j<needColor.length();j++){
            if(Hcolor.containsKey(needColor.charAt(j))&&Hcolor.get(needColor.charAt(j))>0){
                result++;
                int val=Hcolor.get(needColor.charAt(j))-1;
                Hcolor.put(needColor.charAt(j),val);
            }
        }
        System.out.println(result);
    }
}
