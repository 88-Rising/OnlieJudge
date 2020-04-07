package FirstDay;

import java.util.*;


public class GoToSchool1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int []total=new int[N];
        for (int i = 0; i < N; i++) {
            // alarms.add(new Alarm(scan.nextInt(), scan.nextInt()));
            total[i]=scan.nextInt()*60+ scan.nextInt();
        }
        int X = scan.nextInt();
        int A = scan.nextInt(), B = scan.nextInt();
        int time = (A * 60 + B) - X;
        int max=0;
        for (int i = 0; i < N; i++) {

            if (total[i]<=time&&total[i]>max){
                max=total[i];
            }
        }

        System.out.println(max/60 + " " + max%60);

    }


}
