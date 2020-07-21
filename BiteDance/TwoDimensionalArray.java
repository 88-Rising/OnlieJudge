package BiteDance;

/*
在二维数组中判断有没有某个数 每行和每列都是递增的二维数组
* 1.查找的过程本质是一个排除的过程
* 2.一次排除一行或者一列
3.临界条件
* */
public class TwoDimensionalArray {
    public boolean Find(int target,int [][]array){
        if(array==null){
            return false;
        }
        int i=0;
        int j=array[0].length-1;
        while(i<array.length&&j>=0){
            if(target<array[i][j]){
                j--;
            }else if(target>array[i][j]){
                i++;
            }
            else{
                return true;
            }

        }
        return false;
    }

}
