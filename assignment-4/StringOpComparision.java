public class StringOpComparision {

    public static void main(String[] args) {
        String s1 = new String("a");
        String s2 = new String("b");
        String s3 = new String("a");

        if (s1 == s3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        boolean s = s1.equals(s3);
        System.out.println(s);

        int c = s1.compareTo(s2);
        System.out.println(c);

    }

}
