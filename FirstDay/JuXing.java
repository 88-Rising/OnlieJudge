package FirstDay;


import java.util.*;
public class JuXing {
    //矩形重叠问题
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][4];
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][i] = sc.nextInt();
                if (i == 0 || i == 2) {
                    xList.add(arr[j][i]);
                }
                if (i == 1 || i == 3) {
                    yList.add(arr[j][i]);
                }
            }
        }
        int ret = 0;
        for (int x : xList) {
            for (int y : yList) {
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    if (x >= arr[i][0] && x < arr[i][2] && y >= arr[i][1] && y < arr[i][3]) {
                        cnt++;
                    }
                }
                if (cnt > ret) {
                    ret = cnt;
                }
            }
        }
        System.out.println(ret);
//        int count=1;
//     if((xList.get(0)>yList.get(0)&&xList.get(0)<yList.get(1))||(xList.get(1)>yList.get(0)&&xList.get(1)<yList.get(1))){
//         if(xList.get(2)>yList.get(2)&&xList.get(2)<yList.get(3)||(xList.get(3)>yList.get(2)&&xList.get(3)<yList.get(3))){
//            count++;
//         }
//
//     }
//        System.out.println(count);
    }
}