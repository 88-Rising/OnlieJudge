package IQIYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* 牛牛有羊羊有了属于他们自己的飞机。于是他们进行几次连续的飞行。f[i]表示第i次飞行所需的燃油的升数。飞行只能按照f数组所描述的顺序进行。
起初飞机里有s升燃油,为了正常飞行,每次飞行前飞机内燃油量应大于等于此处飞行所需要的燃油量。请帮助他们计算在不进行加油的情况下他们能进行的飞行次数。
*
* */
public class FlyTime {

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] strings=bf.readLine().split(" ");
        String[] times=bf.readLine().split(" ");
        int[] time=new int[times.length];
        int oil=Integer.parseInt(strings[1]);
        int k=0;
        int i;
        for( i=0;i<times.length;i++){
            time[i]=Integer.parseInt(times[i]);
            if(oil>=time[i]){
                oil-=time[i];
                k++;
            }else{
                System.out.println(k);
                break;
            }
        }
        if(oil>=0&&i==times.length){
            System.out.println(k);
        }
    }
}
