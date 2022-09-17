import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        FileOperations fo = new FileOperations();
        fo.createFile();
        fo.readFile();
        Address a = new Address(1, "hyderabad", 500062);
        Employee ee = new Employee("sweety", 11, 1, a);
        fo.serializeObj(ee, "emp");
    }

    public void serializeObj(Object obj, String fname) {
        try (FileOutputStream fos = new FileOutputStream(fname);
                ObjectOutputStream os = new ObjectOutputStream(fos);) {

            os.writeObject(obj);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void createFile() {
        try {

            File f = new File("anyname.txt");
            f.createNewFile();

            FileOutputStream fos = new FileOutputStream(f, true);
            String b = "file program";
            fos.write(b.getBytes());
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFile() {
        try {
            File f = new File("anyname.txt");
            FileInputStream fis = new FileInputStream(f);
            Scanner sc = new Scanner(fis);
            String s = sc.nextLine();
            System.out.println(s);
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
