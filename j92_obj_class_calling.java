/** 
 * @Title object creation and class use methods
 * @author V.C22.3
 * @version 0.1
 */
class B{
    B(){
        System.out.println("I am B class !");
    }
}
class A{
    void show(){
        System.out.println("Test method !");
    }
}
public class j92_obj_class_calling {
    public static void main(String[] args) {
        // b class operations
        B obj1=new B();
        new B();
        B obj;
        obj=new B();
        
        System.out.println();

        // a class operations
        A oj1=new A();
        oj1.show();

        A oj;
        oj=new A();
        oj.show();
    
        new A().show();
        new A();
        //A().show(); not allow
    }
}
