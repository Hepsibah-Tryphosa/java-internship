import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String a = "12321";
        String b = " ";
        try (Scanner s = new Scanner(System.in)) {
            a = s.nextLine();
        }
        for (int i = 0; i == a.length() - 1; i--) {
            char c = a.charAt(i);
            b = b + c;

        }
        if (b.equals(a)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

}