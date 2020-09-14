package IQIYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//输入一个整数数组，使用所有的数通过拼接成一个最小数
public class PrintMinNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] strings=bf.readLine().split(" ");
        int[] res=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            res[i]=Integer.parseInt(strings[i]);
        }
        for(int i=0;i<res.length-1;i++){

            for(int j=i+1;j<res.length;j++){
                int a=Integer.parseInt(""+res[i]+res[j]);
                int b=Integer.parseInt(""+res[j]+res[i]);
                if(a>b){
                    int temp=res[j];
                    res[j]=res[i];
                    res[i]=temp;
                }

            }
        }
        String str=new String("");
        for(int i=0;i<res.length;i++){
            str+=res[i];
        }
        System.out.println(str);
    }
}
