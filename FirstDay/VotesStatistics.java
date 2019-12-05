package FirstDay;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

/*
* 记票统计
*
* 输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。
* */
public class VotesStatistics {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            int n=sca.nextInt();//获得人数

            LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
            sca.nextLine();//扫描整行输入的信息
            String str=sca.nextLine();//获得候选人姓名
            String[] array=str.split(" ");//字符串分割
            for(int i=0;i<array.length;i++){
                map.put(array[i],0);
            }
            map.put("Invalid",0);
            //投票计数
            int m=sca.nextInt();
            sca.nextLine();
            String strr=sca.nextLine();
            String[] arrays=strr.split(" ");
            for(String s:arrays){
                if(map.containsKey(s)){
                    map.put(s,map.get(s)+1);

                }else{
                    map.put("Invalid",map.get("Invalid")+1);
                }
            }
            Set<String> set = map.keySet();
            for(String s :set){
                System.out.println(s+" : "+map.get(s));
            }
        }
    }
}
