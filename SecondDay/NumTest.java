package SecondDay;
import java.util.Scanner;
public class NumTest{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                int n=sc.nextInt();
                int b=n*n;
                int temp=0;
                int num=0;
                int j=0;
                int i=0;
                if(n>=2&&n<100) {
                    while (b > 9) {
                        temp = b % 10;
                        b = b / 10;
                        i=j;
                        if(i==0){
                            num=temp;
                        }
                       while(i>0){
                           num+=temp*10;
                           i--;
                       }
                        j++;
                    }
                }
                if(num==n){
                    System.out.println("Yes!");

                }else{
                    System.out.println("No!");
                }
            }
        }
}
