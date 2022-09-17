public class StringReverse {
    public static void main(String[] args) {
        String a = " this is java class output";
        String b = "";
        for (int i = a.length() - 1; i > 0; i--) {
            char c = a.charAt(i);
            b = b + c;
            System.out.println(c);

        }
      
    }
}
