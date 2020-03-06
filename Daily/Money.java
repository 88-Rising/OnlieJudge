package Daily;
/*
* 百万富翁问题
* */
public class Money {
    public static void main(String[] args) {
        int reach=0;
        int poor=0;
        int j=0;
        for(int i=1;i<31;i++){
            reach=reach+10;
            poor=poor+j;
            j*=2;
        }
        System.out.print(reach+" "+poor);
    }

}
