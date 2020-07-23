package BiteDance;

import java.util.ArrayList;
import java.util.Arrays;

/*
*
* 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位
于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
* */
public class reOrderArray {

    public static ArrayList<Integer> solution(ArrayList<Integer> arrayList){

        if(arrayList==null || arrayList.size()==0){
            return null;
        }
        int left=0;
        int right=arrayList.size()-1;
        while(left<right){
            while(left<right && (arrayList.get(left)%2==1) ){
                left++;
            }
            while(left<right && (arrayList.get(right)%2==0)){
                right--;
            }
            if(left<right){
                int temp=arrayList.get(left);
                arrayList.set(left,arrayList.get(right));
                arrayList.set(right,temp);
            }
        }
        return arrayList;
    }

    public static void reOrderArrays(int[] array){
        if(array==null||array.length==0){
            return;
        }
        int k=0;
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1){//奇数
                int temp=array[i];//把这个奇数保留下来
                int j=i;
                while(k<j){ //1245--1244--1224
                    array[j]=array[j-1];
                    j--;
                }
                array[k++]=temp;//1224--1524
            }

        }

    }

    public static String replaceSpace1(StringBuffer str){
        if(str==null||str.length()==0){
            return null;
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        int new_Length=str.length()+2*count;
        int oldLength=str.length()-1;
        int newLength=str.length()+2*count-1;
        str.setLength(new_Length);

        while(oldLength>=0&&newLength>=0){
            if(str.charAt(oldLength)!=' '){
                str.setCharAt(newLength--,str.charAt(oldLength));
                oldLength--;
            }else{
                str.setCharAt(newLength--,'0');
                str.setCharAt(newLength--,'2');
                str.setCharAt(newLength--,'%');
                oldLength--;
            }
        }
        return str.toString();

    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        ArrayList result=new ArrayList();
        result =  reOrderArray.solution(list);
        System.out.println(list);

        int[] array=new int[]{1,2,4,5};
        System.out.println(Arrays.toString(array));
        reOrderArray.reOrderArrays(array);
        System.out.println(Arrays.toString(array));

        StringBuffer stringBuffer=new StringBuffer("we are happy");
        System.out.println(stringBuffer);
        String str=reOrderArray.replaceSpace1(stringBuffer);
        System.out.println(str);
    }
}
