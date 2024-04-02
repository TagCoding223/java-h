/** 
 * @Title interface intro 3
 * @author V.C22.3
 * @version 0.1
 */
interface bicycle{
    int a=69;
    void Break();
    void speed();
}
class applyCycle implements bicycle{
    // @Override //there are a is not be override means bicycle a and applyCycle a is different to each
    public int a=45;
    public void Break(){ // public is necessary
        System.out.println("slow slow slow ...");
    }
    public void speed(){ // public is necessary
        System.out.println("go fast");
    }
    void sound(){
        System.out.println("Hello ji , hat raste se !");
    }
}
public class j102_interface_intro3 {
    public static void main(String[] args) {
        applyCycle objApplyCycle = new applyCycle();
        objApplyCycle.Break();
        // System.out.println(objApplyCycle.a); not allow to acess
        // objApplyCycle.a=33; error: cannot assign a value to final variable a

    }
}
interface demo{
    void demoMethod();
}

// class demoClass implements demo , bicycle{
    // allowed 
// }

// abstract clas only one , interface more than one ( like multiple inheritance )