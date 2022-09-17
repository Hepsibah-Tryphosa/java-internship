public class Main {
    public static void main(String[] args ) {
        Viewer v1 = new Viewer("sweety", " sweety@gmail.com", 1);
        Viewer v2 = new Viewer("tej", "tej@gmail.com", 7);
       Viewer v3 = new Viewer("bujji", "bijji@gmail.com", 9);
        System.out.println(v1);
        System.out.println(v2);

      System.out.println(v3);

        Channel c = new Channel("tryphosa",v1 );
        System.out.println(c);

    }
}
