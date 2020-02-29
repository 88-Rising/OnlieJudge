package Swordquest;
/*
剑指offer2
* 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
* 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
* */
public class Swordquest2 {
    public String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                str1.append("%");
                str1.append("2");
                str1.append("0");
            }else{
                str1.append(str.charAt(i));
            }
        }
        return str1.toString();


    }
}
