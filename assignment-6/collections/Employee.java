
public class Employee {
    String empName;
    int age;
    int empId;
    public Employee(String empName, int age, int empId) {
        this.empName = empName;
        this.age = age;
        this.empId = empId;
    }
    public Employee(String empName2, int age2, String string) {
    }
    public String getEmpName() {
        return empName;
    }
    public int getAge() {
        return age;
    }
    public int getEmpId() {
        return empId;
    }
    public String toString() {
        return "Employee [age=" + age + ", empId=" + empId + ", empName=" + empName + "]";
    }

    
}
