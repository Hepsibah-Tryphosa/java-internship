
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class TimeDate {
    public static void main(String[] args) {
        DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(d.format(now));

       DateTimeFormatter t = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
       LocalDateTime present = LocalDateTime.now();
        System.out.println(t.format(present));

    }

}
