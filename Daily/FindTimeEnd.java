package Daily;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
/*
* 查询满足区间的记录
* */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Record{
    int number;
    int begin;
    int end;
    public Record(int number,int begin,int end){
        this.number=number;
        this.begin=begin;
        this.end=end;
    }

}
public class FindTimeEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int target=sc.nextInt();
        ArrayList<Record> list=new ArrayList<Record>();
        for(int i=0;i<num;i++){
            list.add(new Record(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int j=0;j<num;j++){
            if(target>=list.get(j).begin && target<=list.get(j).end){
                result.add(list.get(j).number);
            }

        }
        if(result.isEmpty()){
            System.out.println("null");
        }else{
            Collections.sort(result);
            for(Integer re:result){
                System.out.println(re);
            }
        }
    }

}























