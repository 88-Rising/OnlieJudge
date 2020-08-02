package BiteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/*
* 寻找数组中出现次数超过长度一半的数字
* */
public class FindOverLengthNum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int result=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num;i++){
            int temp=sc.nextInt();
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
                if(map.get(temp)>=num/2){
                     result=temp;
                }
            }else{
                map.put(temp,1);
            }
        }
        if(result>-1){
            System.out.println(result);
        }else{
            System.out.println(-1);
        }
    }
}
/*
import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            String scan=sc.next();
            if(scan.length()==0||scan==null||scan.trim().equals("")){
                System.out.println(-1);
            }
            ArrayList<Character> strings=new ArrayList<>();
            for(int i=0;i<scan.length();i++){
                if(strings.contains(scan.charAt(i))){
                    strings.remove(new Character(scan.charAt(i)));
                }else{
                    strings.add(scan.charAt(i));
                }
            }
            if(strings.size()>1){
                System.out.println(strings.get(0));
            }else{
                System.out.println(-1);
            }
        }
    }
}*/
