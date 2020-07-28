package BiteDance;

public class BinarySearch {
    public static int binarySearch(int[] array,int target){
        int left=0;
        int right=array.length-1;
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(array[mid]==target){
                return mid;
            }else if(target<array[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array=new int[] {1,2,3,4,5,6,7};
        int needValue=BinarySearch.binarySearch(array,4);
        System.out.println("4所在的下标是"+needValue);
    }
}
