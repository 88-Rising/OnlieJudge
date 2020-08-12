package JavaOnlineJudge;
import java.util.*;
import java.io.*;
/*
* 给定一个N \times MN×M的整形矩阵matrix和一个整数K, matrix的每一行和每一列都是排好序的。
实现一个函数，判断K是否在matrix中
[要求]
时间复杂度为O(N+M)O(N+M)，额外空间复杂度为O(1)O(1)。
* */
public class FindTargetInArray{

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[] lineFirst=bufferedReader.readLine().split(" ");
        int n=Integer.parseInt(lineFirst[0]);
        int m=Integer.parseInt(lineFirst[1]);
        int target=Integer.parseInt(lineFirst[2]);
        int[][] array=new int[n][m];
        int k=0;
        while(n>0){
            String[] temp=bufferedReader.readLine().split(" ");
            for(int i=0;i<m;i++){
                array[k][i]=Integer.parseInt(temp[i]);
            }
            k++;
            n--;
        }
        if(array==null){
            System.out.println("No");
        }
        int i=0;
        int j=array[0].length-1;
        boolean result=false;
        while(i<array.length&&j>=0){
            if(target<array[i][j]){
                j--;
            }else if(target>array[i][j]){
                i++;
            }else{
                result=true;
                break;
            }
        }
        if(result==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}