public class ComputeArray {
    public static int[] computeArray(int[] array) {
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num%3 == 0) {
                res[i] = num*5;
            } else if (num%3 == 1) {
                res[i] = num+7;
            } else if (num%3 == 2) {
                res[i] = num;
            }
        }
        return res;
    }
}