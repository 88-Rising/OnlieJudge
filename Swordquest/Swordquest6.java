package Swordquest;
/*
* 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
* */
public class Swordquest6 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        int key=array[1];
        for(int i= array.length-1;i>0;i--){
            if(array[i]<array[i-1]){
                 key=array[i];
                break;
            }
        }
        return key;
    }
    public int minNumberInRotateArray1(int [] array) {
        if(array.length==0){
            return 0;
        }
        int left=0;
        int right=array.length-1;
        int mid=-1;
        while(array[left]>=array[right]){
              if(right-left==1){
                  mid=right;
                  break;
              }
              mid=left+(right-left)/2;
              if(array[left]<=array[mid]){
                  left=mid;
              }
              if(array[right]>=array[mid]){
                  right=mid;
              }
        }
        return array[mid];

    }
}
