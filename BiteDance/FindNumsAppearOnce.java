package BiteDance;

import java.util.ArrayList;
/*
* 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
* */
public class FindNumsAppearOnce {

    public void findNumsAppearOnce(int [] array,int num1[] , int num2[]){
        if(array==null){
            return;
        }

        ArrayList<Integer> list=new ArrayList<>();
/*
* list的remove()方法，该方法有两个，一个是remove(Object obj)，另一个是remove(int index)。
* 根据参数很容易理解，而这里要说的是remove(obj)会删除list中的第一个该元素，remove(index)会删除该下标的元素。
* */
        for(int i=0;i<array.length;i++){
            if(list.contains(array[i])){
                list.remove(new Integer(array[i]));
            }else{
                list.add(array[i]);
            }

        }
        if(list.size()>1){
        num1[0]=list.get(0);
        num2[0]=list.get(1);
        }

    }
}
