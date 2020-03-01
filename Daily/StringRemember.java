package Daily;

import java.util.HashMap;
import java.util.Scanner;

public class StringRemember {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        while(sc.hasNext()){
            String str= sc.next();
            int num=sc.nextInt();
            String[] scan=str.split("\\\\");
            String s=scan[scan.length-1];
            if(s.length()>16){
                s=s.substring(s.length()-16);
            }
            String key=s+" "+num;
            int val=1;
            if(map.containsKey(key)){

                map.put(key,map.get(key)+1);

            }else{
                map.put(key,val);
            }
        }
        int count=0;
        for(String string:map.keySet()){
            count++;

            if(count>(map.keySet().size()-8)) //输出最后八个记录
                System.out.println(string+" "+map.get(string));
        }

    }
}
