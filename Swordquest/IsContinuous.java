package Swordquest;
//扑克牌顺子
import java.util.Arrays;

public class IsContinuous {

    public Boolean isContinuous(int[] numbers){
        if(numbers==null||numbers.length<4){
            return false;
        }
        Arrays.sort(numbers);
        int countKing=0;
        int totalGap=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                countKing++;
                continue;
            }
            if(i<numbers.length-1){
                int temp=numbers[i+1]-numbers[i]-1;
                if(temp<0){
                    return false;
                }
                totalGap+=temp;
            }
        }
        if(totalGap>countKing){
            return false;
        }
        return true;
    }
}
