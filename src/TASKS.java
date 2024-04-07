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



}
