/** 
 * @Title employee class constructor to initialize attributes
 * @author V.C22.3
 * @version 0.1
 */
class employee{
    int salary;
    String name;
    int id;
    employee(int a,int b,String c){
        this.id=a;
        this.salary=b;
        this.name=c;
        show();
    }
    void show(){
        System.out.println("\nid : "+id);
        System.out.println("name : "+name);
        System.out.println("salary : "+salary);
    }
}
public class j83_employee_constr {
    public static void main(String[] args) {
        employee obj=new employee(101, 10000, "Devdas");
        employee obj1=new employee(102, 11000, "Ramdas");
    }
}
