/** 
 * @Title abstract & interface practice 3
 * @author V.C22.3
 * @version 0.1
 */
abstract class telephone{
    abstract void ring();
    abstract void left();
    abstract void diconnect();
}
class smartTelephone extends telephone{ 
    void ring(){
        System.out.println("Ring ring ring ...... ! ");
    }
    void left(){
        System.out.println("Call is left ...... ! ");
    }
    void diconnect(){
        System.out.println("Call is diconnect ...... ! ");
    }
}
public class j109_abstract_interface_practice3 {
    public static void main(String[] args) {
        // polymorphism
        telephone objTelephone = new smartTelephone();
        objTelephone.ring();
        objTelephone.left();
        objTelephone.diconnect();
    }
}
