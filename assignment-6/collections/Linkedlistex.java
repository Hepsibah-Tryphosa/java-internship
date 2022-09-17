import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistex {

    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        Employee e1 = new Employee("sweety", 1, "eee");
        Employee e2 = new Employee("hepsibah", 2, "ccc");
        Employee e3 = new Employee("tryphosa", 3, "vvv");
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        Iterator<Employee> it = employees.iterator();
        /*
         * Employee emp = it.next();
         * System.out.println(emp);
         * Employee emp2 = it.next();
         * System.out.println(emp2);
         * Employee emp3 = it.next();
         * System.out.println(emp3);
         * Employee emp4 = it.next();
         * System.out.println(emp4);
         */
        while (it.hasNext()) {
            Employee em = it.next();
            System.out.println(em);
        }

    }
}
