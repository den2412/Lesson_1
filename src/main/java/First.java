import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int n = 5;
        double[][] array = new double[n][n];

        for (int i = 0; i < array.length; i++) {
            array[i][i] = Math.random();
        }

        System.out.println(Arrays.deepToString(array));

        double max = array[0][0];
        double min = array[0][0];
        double mid = 0;

        for (int i = 0; i < array.length; i++) {
            if(max < array[i][i])
                max = array[i][i];
            if(min > array[i][i])
                min = array[i][i];
            mid += array[i][i]/array.length;
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(mid);
    }
}
