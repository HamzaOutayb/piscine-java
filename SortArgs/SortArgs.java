import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        Arrays.sort(args);
        int[] ar = new int[args.length];
        int index = 0;
         for (String ele : args) {
            int num = Integer.parseInt(ele);
            ar[index] = num;
            index += 1;
        }

        System.out.println(Arrays.toString(ar));
    }
}
