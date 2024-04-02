import java.util.Scanner;

/** 
 * @Title interface intro 1
 * @author V.C22.3
 * @version 0.1
 */
interface basicProOfVechie{
    String modelName="Hf-delux";
    Scanner user=new Scanner(System.in);
    int series=12;
    int constantSpeed=10;
    void modelName();
    void speed(int a);
}
class vechie implements basicProOfVechie{
    public void modelName(){ // without public they throw error
        // System.out.print("Enter model name of vechie : ");
        // modelName=user.next(); we can't do that , means we does not assign interface class variable in other class 
    }
    public void speed(int a){ // without public they throw error
        //speed=a;not allowed
        a=constantSpeed+a;
        if(a>60){
            System.out.println("You are so fast !");
        }
        else if(a>50){
            System.out.println("You are average !");
        }
        else{
            System.out.println("You are normal !");
        }
    }
    void vechieInfo(){
        System.out.println("Vechie series : "+series);
        System.out.println("Vechie model name : "+modelName);
        System.out.println("Vechie constant speed : "+constantSpeed);
    }
}
public class j100_interface_intro1 {
    public static void main(String[] args) {
        vechie objVechie=new vechie();
        objVechie.modelName();
        objVechie.speed(50);
        objVechie.vechieInfo();
    }
}
