package JavaOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
* 给出一个含有n个数字的序列a1,a2,a3,...an，可以进行以下操作：
一次操作定义为对这个序列的每个数字进行以下两种改变之一：
1.ai ÷ 2
2.ai × 3
每一次的操作中，必须保证至少有一个数字是第1种改变；并且经过每次操作后，每一个数字都必须是整数。
牛牛得知，每进行一次操作，他就可以得到一颗西瓜糖，但是由于孱弱的数学功底，
* 他不知道何时该对某一个数字进行第一种还是第二种改变，这使得他十分纠结，于是他找来了睿智的你，希望你帮他计算出，他最多可以得到多少颗西瓜糖。
* */
public class Chosen {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(bufferedReader.readLine());
        String[] nums=bufferedReader.readLine().split(" ");
        int[] array=new int[size];

        int count=0;
        for(int i=0;i<size;i++){
            array[i]=Integer.parseInt(nums[i]);
            while(array[i]%2==0){
                count++;
                array[i]/=2;
            }
        }
        System.out.println(count);
    }
}
