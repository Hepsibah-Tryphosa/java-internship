import java.util.*;

public class EmployeeCamparable implements Comparable<EmployeeCamparable> {
    String empName;
    int age;
    int empId;

    public EmployeeCamparable(String name, int age, int empId) {
        this.empName = name;
        this.age = age;
        this.empId = empId;
    }

    public String toString() {
        return (empName + " " + age + " " + empId);
    }

    public int getId() {
        return empId;
    }

    public int compareTo(EmployeeCamparable ec) {
        if (this.getId() == ec.getId())
            return 0;
        else if (this.getId() > ec.getId())
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        ArrayList<EmployeeCamparable> al = new ArrayList<>();
        al.add(new EmployeeCamparable("hepsibah", 25, 1));
        al.add(new EmployeeCamparable("tryphosa", 27, 5));
        al.add(new EmployeeCamparable("sweety", 24, 9));
        al.add(new EmployeeCamparable("hepsi", 23, 6));

        Collections.sort(al);
        System.out.println(al);

    }
}