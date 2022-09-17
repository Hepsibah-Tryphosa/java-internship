

public class Employee {
    int id;
    String name;
    String department;
    String companyname;
   

    Employee(int id, String name, String department, String companyname) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.companyname = companyname;
    }

    public String toString () {
        return ("id -"+id + " name -"+name + " depatment -"+department + " companyname -"+companyname + "\n");

    }
    
}