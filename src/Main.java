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

            case 3:
                System.out.print("Write the number: ");
                Scanner sc_3 = new Scanner(System.in);
                int num_3 = sc_3.nextInt();
                if (TASKS.isPrime(num_3)) {
                    System.out.println(num_3 + " is a prime number");
                } else {
                    System.out.println(num_3 + " is not a prime number");
                }
                break;

            case 4:
                System.out.print("Write the number: ");
                Scanner sc_4 = new Scanner(System.in);
                int num_4 = sc_4.nextInt();
                int res_4 = TASKS.factorial(num_4);
                System.out.println(num_4 + "! = " + res_4);
                break;

            case 5:
                System.out.print("Write the number: ");
                Scanner sc_5 = new Scanner(System.in);
                int num_5 = sc_5.nextInt();
                int res_5 = TASKS.fibonacci(num_5);
                System.out.println(num_5 + " = " + res_5);
                break;

            case 6:
                System.out.print("Write the number: ");
                Scanner sc_6 = new Scanner(System.in);
                double num_6 = sc_6.nextInt();
                System.out.print("Write the power: ");
                Scanner sc_6_1 = new Scanner(System.in);
                int b = sc_6_1.nextInt();
                double res_6 = TASKS.pow(num_6,b);
                System.out.println(num_6 + "^" + b + " = " + res_6);
                break;

            case 7:
                System.out.print("7th task is not ready))) ");
                break;

            case 8:
                System.out.print("Write something: ");
                Scanner sc_8 = new Scanner(System.in);
                String str = sc_8.nextLine();
                System.out.println(str + " is all digits: " + TASKS.Check(str));
                break;
        }


    }
}