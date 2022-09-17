public class Arrevenodd {
    public static void main(String[] args) {
        int eveodd[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("even");
        for (int i = 0; i < eveodd.length; i++) {

            if (eveodd[i] % 2 == 0) {
                System.out.println(eveodd[i]);
            }
        }

        System.out.println("odd");
        for (int i = 0; i < eveodd.length; i++) {
            if (eveodd[i] % 2 != 0) {
                System.out.println(eveodd[i]);

            }
        }
    }
}
