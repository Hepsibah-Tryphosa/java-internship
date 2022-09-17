public class Viewer {

    String name;
    String mail;
    int count;

    public Viewer(String name, String mail, int count) {
       this.name = name;
        this.mail = mail;
        this.count = count;

    }

    public String toString() {
        return String.format("name:%s,mail:%s,count:%d",name,mail,count);
    }

}
