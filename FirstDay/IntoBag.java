package FirstDay;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Map;
import java.util.Scanner;

public class IntoBag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int nums=sc.nextInt();
        long cap=sc.nextInt();
        long[] cookie=new long[nums];
        long sum=0;
        for(int i=0;i< nums;i++){
            cookie[i]=sc.nextInt();
            sum+=cookie[i];
        }
        if(sum<=cap){
            System.out.println((int)Math.pow(2,nums));
            return;
        }else{
            System.out.println((int)loop(cookie,nums-1,cap));

        }

    }
    public static int loop(long[] arr,long  i, long w) {
        if(i == 0) {
            if(w >= arr[0]) {
                return 2;
            }else {
                return 1;
            }
        }
        if(w == 0) {
            return 1;
        }
        if(w - arr[(int)i] >= 0) {
            return loop(arr, i - 1, w - arr[(int)i]) + loop(arr, i - 1, w);
        }else {
            return loop(arr, i - 1, w);
        }
    }

}
