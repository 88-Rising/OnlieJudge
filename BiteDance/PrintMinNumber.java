package BiteDance;
/*
* 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
* */
public class PrintMinNumber {
    public String printMinNumber(int[] numbers){
        if(numbers==null){
            return new String();
        }
        //例如{9，10}
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int num1=Integer.valueOf(numbers[i]+""+numbers[j]);//910
                int num2=Integer.valueOf(numbers[j]+""+numbers[i]);//109
                if(num1>num2){//明显109<910 则把9和10的位置进行替换
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        String result=new String();
        for(int k=0;k<numbers.length;k++){
            result=result+numbers[k];
        }
        return result;
    }
}
