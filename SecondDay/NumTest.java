package SecondDay;
import java.util.Scanner;
//守形数是这样一种整数，它的平方的低位部分等于它本身。 比如25的平方是625，低位部分是25，因此25是一个守形数。
// 编一个程序，判断N是否为守形数。
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
