import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Write a number between 1-10:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num){
            case 1:
                Scanner sc = new Scanner(System.in);

                //Creating list
                List<Integer> l1 = new ArrayList<>();

                System.out.print("Write the number: ");
                int n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    int element = sc.nextInt();
                    l1.add(element);
                }

                int res = TASKS.MinNum(l1);
                System.out.println(res);
                break;



        }


    }
}