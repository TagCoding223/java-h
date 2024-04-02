/** 
 * @Title abstract & interface practice 1
 * @author V.C22.3
 * @version 0.1
 */
abstract class pen{
    abstract public void write();
    abstract void refill();
}
class fountainPen extends pen{
    public void write(){
        System.out.println("Writing is very smout !");
    }
    public void refill(){
        System.out.println("Refilling the pen !");
    }
    void changeNib(){
        System.out.println("Pen nib changed !");
    }
}
public class j107_abstract_interface_practice1 {
    public static void main(String[] args) {
        fountainPen oFountainPen=new fountainPen();
        oFountainPen.changeNib();
        oFountainPen.refill();
        oFountainPen.write();
    }
}
