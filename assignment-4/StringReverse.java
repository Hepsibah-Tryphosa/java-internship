
public class StringReverse {
    public static void main(String[] args) {
        String s = "DO NOT USE ANY BUILT IN METHODS";
        String s1 = "";
        for (int i = s.length() - 1; i > 0; i--) {
            char charAt = s.charAt(i);

            s1 = s1 + charAt;

        }
        System.out.println(s1);

    }

}