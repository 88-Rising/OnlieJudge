package JavaOnlineJudge;
import java.io.*;
public class attack{

    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] scan=bf.readLine().split(" ");
        int[] timing = new int[scan.length];
        for(int i=0;i<timing.length;i++){
            timing[i]=Integer.parseInt(scan[i]);
        }
        int r=timing[0]*timing[0];
        int result=0;
        for(int i=1;i<timing.length-2;i+=2){
            int num0=timing[7]-timing[i];
            int num1=timing[8]-timing[i+1];
            int realR=num0*num0+num1*num1;
            if(realR<=r){
                result++;
            }
        }

        System.out.println(result+"x");

    }

}
