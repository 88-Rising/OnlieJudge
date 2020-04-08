package FirstDay;
import java.util.*;
public class FindMinNums {


    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> origin=new ArrayList<>();
        if(input==null||input.length==0){
            return origin;
        }
        if(k>input.length){
            return origin;
        }
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            origin.add(input[i]);
        }

        return origin;
    }

}
