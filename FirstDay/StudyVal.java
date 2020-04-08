package FirstDay;

import java.util.Scanner;

public class StudyVal {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] val = new int[n];
        int[] state = new int[n];
        //保存瞌睡时的累计评分
        int sleep = 0;
        int[] sleepval = new int[n];
        for(int i=0;i<n;i++){
            val[i] = scan.nextInt();
        }

        for(int i=0;i<n;i++){
            state[i]=scan.nextInt();
            if(state[i]==0){
                sleep+=val[i];
            }
           sleepval[i]=sleep;

        }
//        for(int i=0;i<n;i++){
//            state[i] = scan.nextInt();
//            if(state[i]==0){
//                sleep += val[i];
//            }
//            sleepval[i] = sleep;
//        }
        StudyVal ma = new StudyVal();
        int res = ma.getMaxVal(val,state,n,k,sleepval);
        System.out.println(res);
    }
    public int getMaxVal(int[] val,int[] state,int n,int k,int[] sleepval){
        int res = 0;
        int addval = 0;
        for(int i=0;i<n;i++){
            if(state[i]==1) res += val[i];
            else{
                int wakeval = 0;
                if(i+k-1>=n){//判断醒后的k分钟是否数组越界
                    wakeval =(i>0)?(sleepval[n-1]-sleepval[i-1]):sleepval[n-1];

                }else{
                    wakeval = (i>0)?(sleepval[i+k-1]-sleepval[i-1]):sleepval[i+k-1];

                }
                addval = addval>=wakeval?addval:wakeval;
            }
        }
        return res+addval;
    }
}
