package Daily;

public class BinarySearch {

    public static int binarySearch(int[] arry,int key){

        int low=0;
        int high=arry.length-1;
        int mid;
        while(low<=high){
            mid=(high+low)/2;
            if(arry[mid]==key){
                return mid;
            }else if(arry[mid]<key){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array=new int[]{1,6,8,9,13,19,56};
        int index=binarySearch(array,56);
        System.out.println(index);
    }
}
