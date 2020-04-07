package FirstDay;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTwoNums {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] temp = str.trim().split(" ");
            Solution(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]));
        }
    }

    private static void Solution(int zuidashu , int zuixiaoyushu) {
//        但是牛牛记得老师告诉过他x和y均不大于n, 并且x除以y的余数大于等于k。



        long count = 0;

        //这种是特殊情况
        if (zuixiaoyushu==0){
            count=zuidashu;
            System.out.println(count*count);
            return;
        }

        for (int chushu =zuixiaoyushu+1;chushu<=zuidashu;chushu++){
            int i =chushu-zuixiaoyushu;
            int hang =(zuidashu+1)/chushu;
            count+=i*hang;
            int rest =(zuidashu+1)%chushu;
            if (rest>0){
                if (rest>chushu-i){
                    count+=rest-(chushu-i);
                }
            }
        }




        System.out.println(count);

    }


}