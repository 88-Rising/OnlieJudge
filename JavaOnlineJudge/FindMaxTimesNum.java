package JavaOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
/*
* 一个数量为N的整数数组，其中有很多重复，其中一个数字出现次数超过N/2，请将该数字找出来。
*
* */
public class FindMaxTimesNum {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String num=bufferedReader.readLine();
        String[] arrayList=bufferedReader.readLine().split(" ");
        int[] array=new int[arrayList.length];
        for(int i=0;i<arrayList.length;i++){
            array[i]=Integer.parseInt(arrayList[i]);
        }
        Arrays.sort(array);
        System.out.println(array[array.length/2]);

    }
}
