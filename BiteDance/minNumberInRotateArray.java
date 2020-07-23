package BiteDance;
/*
* 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋
转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
* */
public class minNumberInRotateArray {

    public int solution(int[] array){
        if(array==null || array.length==0){
            return 0;
        }
        int left=0;
        int right=array.length-1;
        int mid=0;
        while(array[left]>=array[right]){
            if(right-left==1){
                mid=right;
                break;
            }
            mid=left+(right-left)>>1;
            if(array[mid]>=array[left]){
                left=mid;
            }else{
                right=mid;
            }

        }
        return array[mid];
    }
}
