package BiteDance;

import java.util.ArrayList;
/*
*公司最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish
写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来
才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻
转这些单词顺序可不在行，你能帮助他么？
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




















