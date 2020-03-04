package Daily;
public class GoUpStairs {
    public int countWays(int n) {
        // write code here
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }

        int key=0;
        int f1=1;
        int f2=2;
        int f3=4;
        for(int i= 4;i<=n;i++){
            key=(f1+(f2+f3)%1000000007)%1000000007;
            f1=f2;
            f2=f3;
            f3=key;
        }

        return key;
    }

    public static void main(String[] args) {
        GoUpStairs gp=new GoUpStairs();
        System.out.println(gp.countWays(1000));
    }
}