/** 
 * @Title default and private method on interface 
 * @author V.C22.3
 * @version 0.1
 */
// assume your interface implement in more than one class than you update your interface then new method also need to incorret on all class is time west then to decradle in interface
interface update {
    void show();
    void mini();
    private void testPrivate(){
        System.out.println("This is a private method with body in interface class ."); // that will be allow but calling of this only by default method (other hands throw error)
        // it can not use by implemented class it just by because if default method is too long then you break it on multiple methods and use by calling by default method (not use directly)
    }
    default void addNewMethod(){
        testPrivate();// without it we face error
        System.out.println("This is default method ."); // This method when all process will be done , we does not need to override this method at once time , because implements multiple classes then its not possible to override at once time .
        testPrivate();//allow
    }
    // default void boy(); it's not be allow , without method body 
}
class derivedInterface1 implements update{
    public void show(){
        System.out.println("This is override show method in derivedInterface1 .");
    }
    public void mini(){
        System.out.println("This is override mini method in derivedInterface1 .");
    }
    public void addNewMethod(){
        System.out.println("This is default method but override in derivedInterface1 .");
    }
}

class derivedInterface2 implements update{
    public void show(){
        System.out.println("This is override show method in derivedInterface2 .");
    }
    public void mini(){
        System.out.println("This is override mini method in derivedInterface2 .");
    }
}

public class j104_default_method_and_interface_implementation {
    public static void main(String[] args) {
        derivedInterface1 objInterface1 = new derivedInterface1();
        objInterface1.show();
        objInterface1.mini();
        objInterface1.addNewMethod();
        System.out.println();
        derivedInterface2 objInterface2 = new derivedInterface2();
        objInterface2.show();
        objInterface2.mini();
        objInterface2.addNewMethod();
    }
}
