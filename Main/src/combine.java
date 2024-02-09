import java.util.ArrayList;
import java.util.List;

public class combine {
    public static void main(String[] args) {
        int[] array1 = {11, 22, 33, 45};
        int[] array2 = {1, 2, 3};

        int[] result = combine(array1, array2);
        for (int value : result) {
            System.out.print(value + " ");
        }
       
    }

    public static int[] combine(int[] array1, int[] array2) {
        List<Integer> combined = new ArrayList<>();
        int minLength = Math.min(array1.length, array2.length);
        
        for (int i = 0; i < minLength; i++) {
            combined.add(array1[i]);
            combined.add(array2[i]);
        }

        for (int i = minLength; i < array1.length; i++) {
            combined.add(array1[i]);
        }
        for (int i = minLength; i < array2.length; i++) {
            combined.add(array2[i]);
        }

        return combined.stream().mapToInt(Integer::intValue).toArray();
    }
}
