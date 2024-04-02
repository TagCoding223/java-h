/** 
 * @Title constructor overloading in inheritance
 * @author V.C22.3
 * @version 0.1
 */
class A{
    A(){
        System.out.println("I am A class defualt constructor !");
    }
    A(int a){
        System.out.println("I am A class parameter constructor ! , value is : "+a);
    }
}
class B extends A{
    B(){
        super(6); // try to comment it 
        System.out.println("I am B class defualt constructor !");
    }
    B(int a,int b){
        super(a);
        System.out.println("I am B class parameter constructor ! , value is : "+b);
    }
}
class C extends B{
    C(){
        super(0,0); // try to comment it 
        System.out.println("I am C class defualt constructor !");
    }
    C(int a,int b,int c){
        super(a,b);
        System.out.println("I am C class parameter constructor ! , value is : "+c);
    }
}
public class j90_consturctor_overloading_inherit {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println();
        B obj1=new B(10,20);
        System.out.println();
        C onj2=new C();
        System.out.println();
        C obj2=new C(11, 22, 33);
    }
}
