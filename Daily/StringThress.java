package Daily;

import java.util.*;
/*
* 小Q得到一个神奇的数列: 1, 12, 123,...12345678910,1234567891011...。

并且小Q对于能否被3整除这个性质很感兴趣。

小Q现在希望你能帮他计算一下从数列的第l个到第r个(包含端点)有多少个数可以被3整除。
* */
public class StringThress{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        StringBuilder s=new StringBuilder();
        StringBuilder s1=new StringBuilder();
        int count=0;
        for(int i=1;i<=r;i++){
            if(i<l){
                s.append(i);
            }
            if(i>=l){
                s1=s;
                s1.append(i);
                int intx=Integer.parseInt(s1.toString());
                if(intx%3==0){
                    count++;
                }
            }


        }
//        Collections.sort(result);


        System.out.println(count);

        }

}
