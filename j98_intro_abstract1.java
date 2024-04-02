/** 
 * @Title abstract intro 1
 * @author V.C22.3
 * @version 0.1
 */
// abstract void sum() this is not allow abstract method include inside class
abstract class demoAbstract{ // if class has at less one abstract method then complete class will be automatically abstract and we need to incorrect abstract keyword before class keyword (if a class includes abstract methods then class itself must be declared abstract ) , if remove abstract keyword you face an error
    abstract void sumMethod(int ...arr); //this is a abstract method and only include in classes , not be outside of class, this is declared eiyhout an implementation 
    void sumSay(){
        System.out.println("Sum of numbers is ,");
    }
}
class sum extends demoAbstract{ // when we inherit a abstract class then we need to define abstract method on derived class
    @Override
    void sumMethod(int ...arrq){
        int sum=0;
        for (int i = 0; i < arrq.length; i++) {
            sum=sum+arrq[i];
        }
        System.out.println(sum);
    }
    void hello(){
        System.out.println("hello guys !");
    }
}
public class j98_intro_abstract1 {
    public static void main(String[] args) {
        // demoAbstract obj=new demoAbstract(); we cannot create abstract class object
        sum obj = new sum();
        obj.hello();
        obj.sumSay();
        obj.sumMethod(2);
        obj.sumMethod(2,3);
        obj.sumMethod(2,3,4);
    }
}
// abstract class ki help se or class create hoki
// abstract class use to create other use classes
// jab abstract base class se koi class derived hoti he , to uske pass 2 option hote he 1 ki vo abstract method ko override kar de ya 2 derived class me bena override  method ke pur class ko abstract kar de