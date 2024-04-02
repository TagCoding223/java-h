/** 
 * @Title Employee class prcatice
 * @author V.C22.3
 * @version 0.1
 */
class employee{
    int salary;
    String name;
    // using auto create getter and setter for properties/Attributes
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class j77_employee_class_prac {
    public static void main(String[] args) {
        employee obj=new employee();
        obj.setSalary(20000);
        obj.setName("Krishna");
        System.out.println("Employee name is : "+obj.getName());
        System.out.println("Employee salary is : "+obj.getSalary());
    }
}
