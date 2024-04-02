/** 
 * @Title oops and classes intro 
 * @author V.C22.3
 * @version 0.1
 */
// public class Hello{
    // this class throw an error because every java file has only one public class ( most case of file name class)
// }
// java me bena access modifer ke methods defult thodi he (java me defalut modifer he)
// oops terminology -> see your notes
// any real would object has = properties + Behaviour
// objects in oops has-> Attributes + Methods

class demo{
    // they are attributes 
    public int id;
    int salary; // access modifer defualt here , but if it is private then you see an error on statement( obj1.salary=8000; )
    public String name; // by defualt class string is null check to comment line 44
    // shoutcut to create getter and setter in vs code -> right click -> source action -> genrete getter and setter

    //they are methods
    // access modifer defualt here , but if it is private then you see an error on statement( obj.setter(101, 10000, "Ramesh"); )
    void setter(int a,int b, String c){
        // this useful when we pass an object to rasolve the comfusion
        this.id=a; 
        salary=b;
        this.name=c;
    }
    public void getter(){
        System.out.println("Id : "+id);
        System.out.println("Salary : "+salary);
        System.out.println("Name : "+name);
    }
}
public class j76_intro_oops_classes {
    public static void main(String[] args) {
        // object creation
        demo obj=new demo();
        obj.setter(101, 10000, "Ramesh");

        demo obj1=new demo();
        obj1.id=102;
        obj1.salary=8000;
        obj1.name="Deepak";

        obj.getter();
        obj1.getter();
    }
}
// remeber that class method are normal as there method , but class method declae on class body and use by class object and thise method does not need static keyword but they have access modifer