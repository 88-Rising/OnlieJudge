package IQIYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
/*
* 对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
*
* */
public class NumEquals {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] strings=bf.readLine().split(" ");
        BigInteger[] nums=new BigInteger[strings.length];
        int j=0;
        for(int i=0;i<strings.length;i+=2){
            StringBuilder str=new StringBuilder(strings[i]);
            int key=Integer.parseInt(strings[i+1]);
            while(key>1){
                str=str.append(strings[i]);
                key--;
            }
            String res=new String(str);
            nums[j]=new BigInteger(res);
            j++;
        }
        if(nums[0].compareTo(nums[1])<0){
            System.out.println("Less");
        }else if(nums[0].compareTo(nums[1])>0){
            System.out.println("Greater");
        }else{
            System.out.println("Equal");
        }

    }
}
