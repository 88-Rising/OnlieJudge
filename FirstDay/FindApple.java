package FirstDay;

import java.util.Scanner;

public class FindApple {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int[] appleHeap=new int[nums];
        for(int i=0;i<nums;i++){
            appleHeap[i]=sc.nextInt();
        }
        int Qnums=sc.nextInt();
        int[] findApple=new int[Qnums];
        for(int j= 0;j<Qnums;j++){
            findApple[j]=sc.nextInt();
            int k=0;
            while(findApple[j]-appleHeap[k]>0){
                findApple[j]=findApple[j]-appleHeap[k];
                k++;
            }
            System.out.println(k+1);
        }


    }
}
