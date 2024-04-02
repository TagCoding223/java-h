/** 
* @Title inherit class methods overriding
 * @author V.C22.3
 * @version 0.1
 */
class A{
    public void demoMethod(){
        System.out.println("I am A class method !\n");
    }
}
class B extends A{
    @Override // this notition use to which action we take action on override method (if method is not override then easily identify by red line of method name) try to comment a clas method
    public void demoMethod(){
        System.out.println("I am B class method !");
    }
}
public class j93_method_overriding {
    public static void main(String[] args) {
        A onj=new A();
        onj.demoMethod();
    
        B obj=new B(); // because we override method then class call its own method
        obj.demoMethod();
    }
}
/*
 name , argument , return type and access modifer of base & derived class same then method will be override .
 if you change your program and this change update override method and override is over then '@override' perdues error , means @override or not .
 */