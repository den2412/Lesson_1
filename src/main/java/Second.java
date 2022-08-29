public class Second {
    public static void main(String[] args) {
        int[] array = {5,6,3,2,5,1,4,9};
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] > array[k + 1]) {
                    int var = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = var;
                }
            }
        }
        for (int j : array) {
            System.out.println(j);
        }
    }
}
