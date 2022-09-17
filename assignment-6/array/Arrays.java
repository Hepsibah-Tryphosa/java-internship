public class Arrays {
    public static void main(String[] args) {
        String[] s = new String[3];
        s[0] = "copy";
        s[1] = "the";
        s[2] = "elements";
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        String ss[] = new String[s.length];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = s[i];
            System.out.println(ss[i]);
        }

    }

}
