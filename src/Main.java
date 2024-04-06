import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int MinNum(List<Integer> list){
        if (list.size() == 1){
            return list.get(0);
        }
        int fElement = list.get(0);
        int Min = MinNum(list.subList(1, list.size()));

        return Math.min(fElement, Min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creating list
        List<Integer> l1 = new ArrayList<>();

        System.out.println("Write the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int element = sc.nextInt();
            l1.add(element);
        }

        int res = MinNum(l1);
        System.out.println(res);
    }
}