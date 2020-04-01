package Daily;

import sun.awt.SunHints;

import java.util.*;
/*
* 牛牛找工作
* */
class Record1{
    Long Di;
    Long Pi;

    public Record1(Long Di,Long Pi){
        this.Di=Di;
        this.Pi=Pi;
    }
}
public class FindJob{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int jobNums=sc.nextInt();
        int personNums=sc.nextInt();
        ArrayList<Record1> jobList=new ArrayList<Record1>();
        ArrayList<Long> peopleList=new ArrayList<Long>();
        ArrayList<Long> result=new ArrayList<Long>();
        for(int i=0;i<jobNums;i++){
            jobList.add(new Record1(sc.nextLong(),sc.nextLong()));
        }
        for(int i=0;i<personNums;i++){
            peopleList.add(sc.nextLong());
            Long temp= Long.valueOf(0);
            for(int j=0;j<jobNums;j++){
                if(peopleList.get(i)>=jobList.get(j).Di){
                    if(jobList.get(j).Pi>temp) {
                        temp = jobList.get(j).Pi;
                    }
                }
            }
            result.add(temp);
        }

        for(Long re:result){
            System.out.println(re);
        }

    }

}