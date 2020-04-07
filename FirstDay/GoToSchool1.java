package FirstDay;

import java.util.*;


public class GoToSchool1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nums = scan.nextInt();
        int[] timing=new int[nums];
        for(int i=0;i<nums;i++){
            timing[i]= scan.nextInt()*60+scan.nextInt();
        }
        int arriveTime=scan.nextInt();
        int openTime=scan.nextInt()*60+scan.nextInt();
        int needtime = openTime-arriveTime;
        int lastTime=0;
        for(int j=0;j<nums;j++){
            if(timing[j]<=needtime&&timing[j]>lastTime){
                lastTime=timing[j];
            }

        }
        System.out.println(lastTime/60+" "+lastTime%60);

    }


}
