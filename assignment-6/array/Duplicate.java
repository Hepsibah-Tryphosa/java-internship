public class Duplicate {
    public static void main(String[] args) {

        int numbers[] = { 10, 20, 30, 50, 20, 30 };

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j])
                    System.out.println(numbers[j]);
            }

        }

    }

}
