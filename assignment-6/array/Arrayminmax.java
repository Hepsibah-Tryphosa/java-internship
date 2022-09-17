public class Arrayminmax {
    public static void main(String[] args) {
        int[] values = { 11, 2, 3, 4, 99 };
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
                System.out.println(min);
            }
        }

        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
                System.out.println(max);

            }
        }

    }
}