/** 
 * @Title abstract intro 2
 * @author V.C22.3
 * @version 0.1
 */
abstract class base{
    static int count=1;
    static int countHello=1;
    base(){
        System.out.println("base : "+count);
        count++;
    }
    void hello(){
        System.out.println("Hello : "+countHello);
        countHello++;
    }
    abstract void geet();
    abstract void geet1();
    // abstract void geet(){
        // Abstract methods do not specify a body
    // }
}
class child1 extends base{
    @Override
    void geet(){
        System.out.println("Child1 class geet");
    }
    void geet1(){
        System.out.println("Child1 class geet1");
    }
    void test(){
        System.out.println("This is child1 class test method !");
    }
}
abstract class child2 extends base{ // because we not override base class abstract method then we create child2 class as abstract class , without abstract keyword we face error
    void the(){
        System.out.println("Child2 class the");
    }
    void geet(){
        System.out.println("Child2 class geet");
    }
}
// class demo extends base , child2{} not allow multiple abstract class
public class j99_abstract_intro2 {
    public static void main(String[] args) {
        // base obj = new base(); error: base is abstract; cannot be instantiated
        child1 obj = new child1();
        // child2 obj1 = new child2(); object creation not allow if we remove abstract keyword then allow but we need to override abstract methods of base class becasce child2 is inherit from it
        base obj1=new base() {
            void geet(){
                System.out.println("Main class base object geet");
            }
            void geet1(){
                System.out.println("Main class base object geet1");
            }
        };
        obj1.geet();
        obj1.geet1();
        obj1.hello();
        child2 obChild2=new child2() {
            void geet(){
                System.out.println("Main class base object geet");
            }
            void geet1(){
                System.out.println("Main class base object geet1");
            }
        };
        obChild2.geet();
        obChild2.geet1();
        obChild2.hello();
        
        obj.hello();
        obj.geet();
        obj.geet1();
        obj.test();

        base oBase=new child1();
        oBase.hello();
        oBase.geet();
        oBase.geet1();
        // oBase.test();not allowed

        // child1 oChild1=new base(); not allowed , becaue reference he smartphone ka or object he phone ka ( feature he smartphone ke per object he phone ka (to phone to cale ka he nahi))
    }
}
/*
    abstract class -> concrte class (with override methods)
    abstract class -> abstract class (without override method and with abstract keyword )(object creation )

    it is possible to create reference of an abstract class . we can also assign referance of an abstract class to the object of a constructor
 */