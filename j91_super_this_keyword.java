/** 
 * @Title super & this keyword
 * @author V.C22.3
 * @version 0.1
 */
class A{
    public int a;
    //A(){} if we not use super keyword in B class then we need defualt constructor
    A(int a){
        //a=a; not allowed
        this.a=a;
        System.out.println("This A class constructor ! , value of a : "+a);
    }
}
class B extends A{
    B(int a){
        super(a);
        // if we does not inccort super keyword and A class defualt constructor then we face run time error
        System.out.println("This B class constructor !");
        //super(a); error all time super keyword is first statement of constructor body(call to super must be first statement in constructor)
    }
}
public class j91_super_this_keyword {
    public static void main(String[] args) {
        B obj=new B(4);
    }
}
/*
 this keyword use when we pass a object of class then use this .
 this is a refeance to paticular variable.
 super is a refereance of parent class invok constructor , custom constructor etc.
 */