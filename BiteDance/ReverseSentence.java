package BiteDance;

import java.util.ArrayList;
/*
*汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令
的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”
abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
*
*  */
public class ReverseSentence {
    public String reverseSentence(String str){
        if(str.length()==0||str==null||str.trim().equals(" ")){
            return null;
        }
        StringBuffer stringBuffer=new StringBuffer();
        String[] a=str.split(" ");

        for(int i=a.length-1;i>=0;i--){
            stringBuffer.append(a[i]);
            if(i>0) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }
    public String reverseSentence1(String str){
        if(str==null||str.length()==0){
            return str;
        }

        ArrayList<String> result=new ArrayList<>();
        return new String();
    }
}




















