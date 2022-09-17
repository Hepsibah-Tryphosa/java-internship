import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        if (e1.empId == e2.empId) {
            return 0;
        } else if (e1.empId > e2.getEmpId()) {
            return 1;
        } else
            return -1;
    }

    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("hepsibah", 25, 1));
        al.add(new Employee("tryphosa", 27, 5));
        al.add(new Employee("sweety", 24, 9));
        al.add(new Employee("hepsi", 23, 6));

        EmployeeComparator ec = new EmployeeComparator();
        Collections.sort(al, ec);
        System.out.println(al);
    }
}
