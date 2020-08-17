package JavaOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
* 牛牛有一个数组，里面的数可能不相等，现在他想把数组变为：所有的数都相等。问是否可行。
牛牛可以进行的操作是：将数组中的任意一个数改为这个数的两倍。
这个操作的使用次数不限，也可以不使用，并且可以对同一个位置使用多次。
*
* */
public class SameNumList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(bufferedReader.readLine());
        String[] nums=bufferedReader.readLine().split(" ");
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=Integer.parseInt(nums[i]);
        }
        Arrays.sort(array);
        int max=array[size-1];
        boolean result=false;
        for(int i=0;i<array.length-1;i++){
            while(array[i]<max){
                array[i]*=2;
                if(array[i]==max){
                    break;
                }
            }
            if(array[i]==max){
                result=true;
            }else{
                result=false;
                break;
            }
        }
        if(result==true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
