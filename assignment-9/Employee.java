import java.io.Serializable;

public class Employee implements Serializable {
    String Name;
    int age;
    int Id;
    Address address;

    public Employee(String Name, int age, int Id, Address address) {
        this.Name = Name;
        this.age = age;
        this.Id = Id;
        this.address = address;
    }

    public Employee(String empName2, int age2, String string) {
    }

    public String getEmpName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getEmpId() {
        return Id;
    }

    public Address getAddress() {
        return address;
    }

    public String toString() {
        return "Employee [age=" + age + ", empId=" + Id + ", empName=" + Name + "]";
    }

}
