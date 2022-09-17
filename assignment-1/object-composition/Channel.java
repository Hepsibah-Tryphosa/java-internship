public class Channel {
    String name;
    Viewer viewer;

    Channel(String name, Viewer viewer) {
        this.name = name;
        this.viewer = viewer;
    }

    public String toString() {
        return String.format("name-%s,viewer-%s", name, viewer.toString());
    }

}
