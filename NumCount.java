import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.HashMap;
import java.util.HashSet;

public class NumCount {
    public int MoreThanHalfNum_Solution(int [] array) {

        int result=0;
        int findNum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<array.length;i++){
            if(!set.contains(array[i])){
                set.add(array[i]);
                int key=array[i];
                int count=0;
                for(int j=0;j<array.length;j++){
                    if(array[j]==key){
                        count++;
                        if(count>array.length/2){
                            result=1;
                            findNum=key;
                        }
                    }
                }
            }

        }
        if(result==1){
            return findNum;
        }
        return result;

    }
}
