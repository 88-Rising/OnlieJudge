package BiteDance;

import java.util.ArrayList;

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




















