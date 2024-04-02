/** 
 * @Title inheritance in interface 
 * @author V.C22.3
 * @version 0.1
 */
interface parent{
    void method1();
    void method2();
}
interface child extends parent{
    void method3();
    @Override
    void method2();
}
class myDerive implements child{ // when we not override interface class methods then we need to abstract this class
    @Override
    public void method1() {
        System.out.println("method1");
    }
    @Override
    public void method2() {
        System.out.println("method2");
    }
    @Override
    public void method3() {
        System.out.println("method3");
    }
    public void testMethod() {
        System.out.println("method4");
    }
}
public class j105_inherit_in_interface {
    public static void main(String[] args) {
        myDerive objDerive=new myDerive();
        objDerive.method1();
        objDerive.method2();
        objDerive.method3();
        objDerive.testMethod();
    }
}
/*
    it allow to inheritance in interface by using extends keyword
    Remember that interface cannot implement another interface , only classes can do that
    
    task for himself - perform all kind of inheritance like , single multilevel etc.
 */