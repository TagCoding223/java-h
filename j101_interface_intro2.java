/** 
 * @Title interface intro 2
 * @author V.C22.3
 * @version 0.1
 */
interface bicycle{
    int a=0; // allow
    // int a; not allow without value
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class hello implements bicycle{
    int speed = 20;
    public void applyBrake(int decrement){
        speed=speed-decrement;
    }
    public void speedUp(int increment){
        speed=speed+increment;
    }
}
public class j101_interface_intro2 {
    public static void main(String[] args) {
        hello objHello=new hello();
        objHello.applyBrake(2);
        objHello.speedUp(10);

        // bicycle objBicycle=new bicycle();error: bicycle is abstract; cannot be instantiated
        bicycle objBicycle=new bicycle(){
            int speed=60;
            public void applyBrake(int decrement){
                speed=speed-decrement;
            }
            public void speedUp(int increment){
                speed=speed+increment;
            }
        };
        objBicycle.applyBrake(8);
        objBicycle.speedUp(10);

        bicycle oBicycle=new hello();
        oBicycle.applyBrake(3);
        oBicycle.speedUp(2);
        // hello objHello2=new bicycle();not allowed
    }
}
/*
    interface class ka object create nahi hota referance ho sakta he .
    if you iimplement interface class then always read body of methods.

    Abstract v/s Interface
    we can't extends multiple abstract classes but we can implement multiple interfscrs at a time.

    we cannot modify properties in interface
 */