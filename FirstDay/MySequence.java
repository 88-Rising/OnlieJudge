package FirstDay;

import java.math.BigInteger;
import java.util.*;
import java.util.function.LongToIntFunction;

public class MySequence {
       /* public static void swap(int p,int q){
            int temp=0;
            temp=p;
            p=q;
            q=temp;


        }*/

      /*  public static void sequence(List sa){
            for(int i=0;i<sa.length;i++){
                for(int j=i+1;j<sa.length;j++){
                    if(sa[i]>sa[j]){
                        int temp=0;
                        temp=sa[i];
                        sa[i]=sa[j];
                        sa[j]=temp;
                    }
                }
            }

            for(int k=0;k<sa.length;k++){

                System.out.println(sa[k]);
            }
        }*/

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()) {
                int n = sc.nextInt();
                List<BigInteger> array=new ArrayList<>();
                for (int j = 0; j < n; j++) {
                  BigInteger num=sc.nextBigInteger();
                  array.add(num);
                }
         Collections.sort(array);
                for(int i=0;i<array.size();i++){

                    System.out.println(array.get(i));
                }

            }



        }



}
