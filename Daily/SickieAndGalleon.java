package Daily;

import java.util.Scanner;

public class SickieAndGalleon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder StrKey=new StringBuilder();
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] str1=str.split(" ");

            String[] A=str1[1].split("\\.");
            String[] P=str1[0].split("\\.");
            int[] Anum=new int[A.length];//实际付的钱
            int[] Pnum=new int[P.length];//应该付的钱
            for(int i=0;i<A.length;i++){
                Anum[i]=Integer.parseInt(A[i]);
                Pnum[i]=Integer.parseInt(P[i]);
            }
            int key3 = 0 ;
            int key2 = 0 ;
            int key1 = 0 ;
            for(int j=Anum.length-1;j>=0;j--){
                if(j==Anum.length-1){
                   key3 = Anum[j]-Pnum[j];
                   if(key3<0){
                       if(Anum[j-1]>0){
                           Anum[j-1]=Anum[j-1]-1;
                           Anum[j]=Anum[j]+29;
                           key3 = Anum[j]-Pnum[j];
                       }else if(Anum[0]>0){
                           Anum[0]=Anum[0]-1;
                           Anum[j]=Anum[j]+17*29;
                           key3 = Anum[j]-Pnum[j];
                       }else{
                           key3=Pnum[j]-Anum[j];
                           StrKey.append("-"+Pnum[0]+"."+Pnum[1]+"."+key3);
                       }
                   }

                }
             if(j==1){
                 key2=Anum[1]-Pnum[1];
                 if(key2<0){
                     if(Anum[0]>0){
                         Anum[0]=Anum[0]-1;
                         Anum[1]=Anum[1]+17;
                         key2 = Anum[1]-Pnum[1];
                     }else{
                         key2=Pnum[1]-Anum[1];
                         StrKey.append("-"+Pnum[0]+"."+key2+"."+key3);
                     }
                 }
             }
             if(j==0){
                 key1=Anum[0]-Pnum[0];
                 if(key1<0){
                     key1=Pnum[0]-Anum[0];
                     StrKey.append("-"+key1+"."+key2+"."+key3);
                 }else{
                     StrKey.append(key1+"."+key2+"."+key3);
                 }

             }
            }

            System.out.println(StrKey.toString());
        }
    }
}
