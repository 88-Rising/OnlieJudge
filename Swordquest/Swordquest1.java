package Swordquest;
/*
* 剑指offer1:
* 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
* 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
* */
public class Swordquest1 {
    public boolean Find(int target, int [][] array) {
        boolean found=false;
        int lie = array[0].length;//行的长度
        int hang = array.length;//列的长度
        int row1 = 0;
        int row2 = lie-1;
        while(row1<hang && row2>=0){
            int value = array[row1][row2];
            if(target<value){  //目标值小于当前值 则列自减（矩阵逐列从小变大）
                row2--;
            }else if(target>value){ //目标值大于当前值 则行自加（矩阵逐行从小变大）
                row1++;
            }else{
                found=true;
                break;
            }

        }
        return found;
    }
}
