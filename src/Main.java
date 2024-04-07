import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Write a number between 1-10: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num){
            case 1:
                Scanner sc = new Scanner(System.in);

                //Creating list
                List<Integer> l1 = new ArrayList<>();

                System.out.print("Write the number: ");
                int n = sc.nextInt();
                System.out.print("Write the list's numbers: ");
                for (int i = 1; i <= n; i++) {
                    int element = sc.nextInt();
                    l1.add(element);
                }

                int res = TASKS.MinNum(l1);
                System.out.println(res);
                break;

            case 2:
                Scanner sc_2 = new Scanner(System.in);


                System.out.print("Write the number: ");
                int n_2 = sc_2.nextInt();
                int[] nums = new int[n_2];  // Creates an array with a capacity of n_2 integers
                System.out.print("Write the list's numbers: ");
                for (int i = 0; i < nums.length; i++) {
                    int element_2 = sc_2.nextInt();
                    nums[i] = element_2;  // Assigns values to the array elements
                }

                double res_2 = TASKS.average(nums, 0, 0.0);
                System.out.println(res_2);
                break;

        }


    }
}