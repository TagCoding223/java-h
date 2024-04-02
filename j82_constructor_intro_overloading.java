/** 
 * @Title constructor introduction and overloading 
 * @author V.C22.3
 * @version 0.1
 */
class demoConst{
    public int num;
    public String name;
    private void show(){
        System.out.println("Num is : "+num+"\nName is : "+name);
    }
    demoConst(){
        System.out.println("\nhello, guys i am default constructor!");
    }
    demoConst(int i){
        System.out.println("\ni am a parameter constructor and pass it : "+i);
    }
    demoConst(int i, String give){
        System.out.println("\ni am int & string constructor");
        this.name=give;
        this.num=i;
        show();
    }
    demoConst(int i, int j){
        System.out.println("\ni am sum constructor");
        System.out.println("sum of "+i+" + "+j+" is : "+(i+j));
    }
}
public class j82_constructor_intro_overloading {
    public static void main(String[] args) {
        // when we crate object then construcor automatically called ! , and constructor name same as class name
        demoConst obj=new demoConst(); // this statement call default consturctor that does need any parameters
        demoConst obj1=new demoConst(4); // this statement call parameterlizy consturctor that need one intger parameter

        demoConst obj2=new demoConst(4,"Vishal(v.c22.3)");
        demoConst obj3=new demoConst(4,6);
    }
}
