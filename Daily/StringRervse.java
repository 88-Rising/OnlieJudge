package Daily;

import java.util.Scanner;
/*
*题目链接：
* https://exam.nowcoder.com/cts/17063546/summary?id=F75E1DD7031794D3#4/{%22uid%22%3A%22F75E1DD7031794D3%22%2C%22type%22%3A%224%22%2C%22index%22%3A0}
*
* */

public class StringRervse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String scan=sc.nextLine();
            String[] scan1=scan.split(" ");
            for(int i =scan1.length-1; i>=0;i--){
                System.out.print(scan1[i]);
                System.out.print(" ");
            }
        }

    }
}
