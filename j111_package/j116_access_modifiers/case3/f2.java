package pack2;
import pack1.f1;

public class f2 extends f1{
    public static void main(String[] args) {
        f2 objF2=new f2();
        objF2.showPublic();
        objF2.showProtected();
        // objF2.showDefault(); error
        // objF2.showPrivate(); error
    }
}
// run by terminal using - java f2.java
// note : object create current file class look object is f2 class because f1 is extends here , that way we call sub class