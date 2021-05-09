public class EmployeePayrollData {
    public int id;
    public String name;
    public double salary;

    public EmployeePayrollData(Integer id, String Name, Double salary){
        this.id = id;
        this.name = Name;
        this.salary = salary;
    }
    public String toString(){
        return "id=" + id+ ", name='" +name + '\'' + ", salary=" + salary;
    }
}
