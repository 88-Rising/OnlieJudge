package FirstDay;

import java.util.Scanner;
/*
* 迷路的牛牛
*
* */
public class CowLost {
    public static char toward(char temp,char x) {
        if(temp=='N'){
            if(x=='L'){
                return 'W';
            }else{
                return 'E';
            }
        }
        if(temp=='S'){
            if(x=='L'){
                return 'E';
            }else{
                return 'W';
            }
        }
        if(temp=='E'){
            if(x=='L'){
                return 'N';
            }else{
                return 'S';
            }
        }
        if(temp=='W') {
          if(x=='L'){
              return 'S';
          }
        }
        return 'N';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        sc.nextLine();
        String scan=sc.nextLine();
        char[] load=scan.toCharArray();
        char temp='N';
        for(int i=0;i<nums;i++){
                temp=toward(temp,load[i]);

        }
        System.out.println(temp);
    }

}
