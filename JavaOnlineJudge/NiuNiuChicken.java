package JavaOnlineJudge;

import java.util.HashSet;
import java.util.Scanner;

public class NiuNiuChicken {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        while(sc.hasNext()){
            String scan=sc.nextLine();
            String[] readLine=scan.split(" ");

            for(int i=0;i<readLine.length;i++){
                set.add(readLine[i]);
            }
        }
        System.out.println(set.size());
        set.clear();

    }

}
