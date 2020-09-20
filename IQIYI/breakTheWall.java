package IQIYI;

import java.util.Scanner;

public class breakTheWall {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t>0){
            String[] s=sc.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            char[][] miGong=new char[n][m];
            int HIndex=0;
            int LIndex=0;
            for(int i=0;i<n;i++){
                String str=sc.nextLine();
                for(int j=0;j<m;j++){
                    if(str.charAt(j)=='@'){
                         HIndex=i;
                         LIndex=j;
                    }
                    miGong[i][j]=str.charAt(j);
                }
            }
            int result=0;
            while(HIndex!=n-1&&LIndex!=m-1&&HIndex!=0&&LIndex!=0){
                if(miGong[HIndex-1][LIndex]=='#'
                        &&miGong[HIndex][LIndex-1]=='#'
                        &&miGong[HIndex+1][LIndex]=='#'
                        &&miGong[HIndex][LIndex+1]=='#'){
                    result=-1;
                    break;
                }
                if(miGong[HIndex-1][LIndex]=='.'){
                    HIndex-=1;
                    continue;
                }
                if(miGong[HIndex][LIndex-1]=='.'){
                    LIndex-=1;
                    continue;
                }
                if(miGong[HIndex][LIndex+1]=='.'){
                    LIndex+=1;
                    continue;
                }
                if(miGong[HIndex+1][LIndex]=='.'){
                    HIndex+=1;
                    continue;
                }
                if(miGong[HIndex-1][LIndex]=='*'){
                    HIndex-=1;
                    result++;
                    continue;
                }
                if(miGong[HIndex][LIndex-1]=='*'){
                    LIndex-=1;
                    result++;
                    continue;
                }
                if(miGong[HIndex][LIndex+1]=='*'){
                    LIndex+=1;
                    result++;
                    continue;
                }
                if(miGong[HIndex+1][LIndex]=='*'){
                    HIndex+=1;
                    result++;
                    continue;
                }


            }
            System.out.println(result);
            t--;
        }


    }
}
