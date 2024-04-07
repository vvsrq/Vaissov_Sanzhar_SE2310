import java.util.Arrays;
import java.util.List;


public class TASKS {
    public static int MinNum(List<Integer> list){
        if (list.size() == 1){
            return list.get(0);
        }
        int fElement = list.get(0);
        int Min = MinNum(list.subList(1, list.size()));

        return Math.min(fElement, Min);
    }

    public static double average(int[] data, int index, double total) {
        if (index == data.length) {
            return total / data.length;
        } else {
            return average(data, index + 1, total + data[index]);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        // Only check for divisibility by 2 and 3 for efficiency
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        // Check for divisibility by numbers of the form 6k +/- 1
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static double pow(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1.0 / pow(a, -n); // Handle negative exponents (optional)
        } else {
            return a * pow(a, n - 1);
        }
    }



}
