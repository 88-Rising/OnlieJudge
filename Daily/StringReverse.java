package Daily;

import java.util.Scanner;

/*
* 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
* */
public class StringReverse {
    public void reverse(String scan){
        for(int i=scan.length()-1;i>=0;i--){
            System.out.print(scan.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String scan=sc.nextLine();
            StringReverse sr=new StringReverse();
            sr.reverse(scan);
        }
    }
}
