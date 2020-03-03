package Daily;



public class Count2 {
    public int countNumberOf2s(int n) {
        int k =0;

        if(n<2){
            return 0;
        }else if(n<=10){
            return 1;
        }
        int count=1;
        for(int i = 10; i<=n; i++){
            k=i;
         while(k>0){
             k=k%10;
             if(k==2){
                 count++;
             }
             k=k/10;
         }
        }

        return count;
    }

    public static void main(String[] args) {
        Count2 c2=new Count2();
        System.out.println(c2.countNumberOf2s(222));
    }
}