package BiteDance;
/*
请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过
替换之后的字符串为We%20Are%20Happy。
*/

public class CharChange {//核心：临界条件处理
    public String replaceSpace(StringBuffer str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        int new_length=str.length()+2*count;
        int old_end=str.length()-1;
        int new_end=new_length-1;
        str.setLength(new_length);
        while(old_end>=0&&new_end>=0){
            if(str.charAt(old_end)==' '){
                str.setCharAt(new_end--,'0');
                str.setCharAt(new_end--,'2');
                str.setCharAt(new_end--,'%');
                old_end--;
            }else{
                str.setCharAt(new_end--,str.charAt(old_end));
                old_end--;
            }
        }
        return str.toString();
    }

}
