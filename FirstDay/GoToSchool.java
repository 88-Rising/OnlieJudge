package FirstDay;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.Callable;

class timing{
    int hour;
    int min;
    public timing(int hour,int min){
        this.hour=hour;
        this.min=min;
    }

}

public class GoToSchool {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        ArrayList<timing> result=new ArrayList<>();
        for(int i=0;i<nums;i++){
            result.add(new timing(sc.nextInt(),sc.nextInt()));
        }
        int needTime=sc.nextInt();
        int[] schoolTime=new int[2];
        schoolTime[0]=sc.nextInt();
        schoolTime[1]=sc.nextInt();
        ArrayList<timing> result1=new ArrayList<>();
        for(int i=0;i<result.size();i++){
            if(result.get(i).hour<=schoolTime[0]&&result.get(i).min+needTime<=schoolTime[1]){
                result1.add(result.get(i));
            }

        }
        int temp=result1.get(0).hour;
        int temp1=result1.get(0).min;
        int key=0;
        for(int j=0;j<result1.size();j++){
//            System.out.print(result1.get(j).hour);
//            System.out.print(" ");
//            System.out.println(result1.get(j).min);
            if(result1.get(j).hour>=temp){
                temp=result1.get(j).hour;
                if(result1.get(j).min>=temp1) {
                    temp1=result1.get(j).min;
                    key = j;
                }
            }
        }
        System.out.print(result.get(key).hour);
        System.out.print(" ");
        System.out.println(result.get(key).min);


    }


}

