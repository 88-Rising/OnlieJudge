package Daily;
import java.util.*;
//木棒拼图
public class MakeMap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int remove = sc.nextInt();
            int chang = sc.nextInt();
            if (remove == 1) {
                list.add(chang);
            } else {
                int idx=list.get(chang);
                list.remove(idx);
            }

            if (list.size() < 3) {
                System.out.println("No");
            } else {
                Collections.sort(list,Collections.reverseOrder());
                int max = list.get(0);
                int sum = 0;
                for (int j = 1;j<list.size();j++) {
                    sum = sum+list.get(j);
                }
                if (max < sum) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

}