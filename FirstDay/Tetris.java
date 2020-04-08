package FirstDay;

import java.util.Arrays;
import java.util.Scanner;

public class Tetris {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int nums=sc.nextInt();
        int intLength=sc.nextInt();

        int[] num=new int[nums];
        int count=0;
        for(int i=0;i<intLength;i++){
            num[sc.nextInt()-1]++;
        }
        Arrays.sort(num);
        System.out.println(num[0]);

    }


}
