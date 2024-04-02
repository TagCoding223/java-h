/** 
 * @Title abstract & interface practice 2
 * @author V.C22.3
 * @version 0.1
 */
interface basicAnimal{
    void eat();
    void sleep();
}
class mokey{
    void jump() {
        System.out.println("You got a long jump !");
    }
    void bite() {
        System.out.println("You bite fruit !");
    }
}
class human extends mokey implements basicAnimal{
    public void eat(){
        System.out.println("Human eats too much sweet !");
    }
    public void sleep(){
        System.out.println("Human need 8 hours sleep every day !");
    }
}
public class j108_abstract_interface_practice2 {
    public static void main(String[] args) {
        // run time polymorphism
        mokey objMokey=new human();
        objMokey.jump();
        objMokey.bite();

        // objMokey.eat();
        // objMokey.sleep(); not allow 
    }
}
