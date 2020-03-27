package Daily;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result=new ArrayList<>();
        if(str.length()==0||str==null){
            return result;
        }
        char[] cha=str.toCharArray();
        Help(0,cha,result);
        Collections.sort(result);
        return result;

    }
    public static void Help(int i,char[] cha,ArrayList<String> result){
            if(i==cha.length-1){
                String val=String.valueOf(cha);
                if(!result.contains(val)) {
                    result.add(val);
                }

            }else{
                for(int j=i;j<cha.length;j++){
                    swap(cha,i,j);
                    Help(i+1,cha,result);
                    swap(cha,i,j);

                }

            }
    }
    public static void swap(char[] cha,int i,int j){
        char temp=cha[i];
        cha[i]=cha[j];
        cha[j]=temp;

    }

}
