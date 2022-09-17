import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        Conversion c = new Conversion();

        Scanner s = new Scanner(System.in);
        String b = s.nextLine();
        int a = c.stringToInt(b);

        System.out.println(a);
        int d = s.nextInt();
        String k = c.intToString(d);
        System.out.println(k);

    }

    int stringToInt(String s) {
        int i = Integer.parseInt(s);
        return i;
    }

    String intToString(int i) {
        String s = "" + i;
        return s;
    }

}
