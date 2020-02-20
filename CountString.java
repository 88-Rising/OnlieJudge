import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;
//给定一个字符串str，返回str的统计字符串。例如“aaabbbbcccd”的统计字符串为“a_3_b_4_c_3_d_1”。

public class CountString {
    public static String conutString(String str){
        if(str==null&&str.equals(" ")){
            return null;
        }
        char[] chars=str.toCharArray();
        StringBuffer sb=new StringBuffer();
        sb.append(chars[0]);
        int nums=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]!=chars[i-1]){
                sb.append("_"+nums+"_"+String.valueOf(chars[i]));
                nums=1;
            }else{
                nums++;
            }

        }
        return sb.append("_"+String.valueOf(nums)).toString();

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(conutString(str));
    }

}
