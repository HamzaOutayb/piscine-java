javapublic class ComputeArray {
    public static int[] computeArray(int[] array) {
        if array == null {
            return null;
        }

        int[] res = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num%3 == 0) {
                res[i] = num * 5;
            } else if (num%3 == 1) {
                res[i] = num + 7;
            }
        }
        return res;
    }
}