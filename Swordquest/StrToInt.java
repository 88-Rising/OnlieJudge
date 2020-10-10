package Swordquest;
//把字符串转换成整数
public class StrToInt {

    public int strToInt(String str) {
        if(str==null||str.trim().equals("")){
            return 0;
        }
        int symbol=1;
        int index=0;
        char[] chars=str.toCharArray();
        if(chars[0]=='+'){
            index++;
        }else if(chars[0]=='-'){
            index++;
            symbol=-1;
        }
        int result=0;
        for(int i=index;i<chars.length;i++){
            if(chars[i]>='0'&&chars[i]<='9'){
                result=result*10+chars[i]-'0';
                if((symbol==1&&result>Integer.MAX_VALUE)||(symbol==-1&&result<Integer.MIN_VALUE)){
                    return 0;
                }
            }else{
                return 0;
            }
        }
        return result*symbol;
    }
}
