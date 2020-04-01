package FirstDay;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*
* 安置路灯
* */
public class LampSum {
    public static int lampSum(String len,int changdu){
        int sum=0;
        for(int i=0;i < changdu;i++){
            if(len.charAt(i)=='.'){
                sum++;
                i+=2;
            }
        }
        return sum;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String sa=bf.readLine();
        int ca=Integer.valueOf(sa);


        for(int i = 0; i < ca;i++){
            String changdu=bf.readLine();
            int chang=Integer.valueOf(changdu);
            String len=bf.readLine();
            System.out.println(lampSum(len,chang));

        }

    }
}
