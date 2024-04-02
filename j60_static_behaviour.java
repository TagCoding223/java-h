/**
 * @author V.C22.3
 * @version 0.1
 */
class demo{
    static int i =0; 
    void staticBehaviour(){  //i am also decale this method as a static method , but case we face waring on method calling
        System.out.println("Value of i is : "+i);
        i++;
    }
}

public class j60_static_behaviour {  
    // static keyword behaviour in prime class
    static int i=0;
    static void staticBehaviour(){
        System.out.println("Value of i is : "+i);
        i++;
    }

    public static void main(String[] args) {
        staticBehaviour();
        staticBehaviour();
        staticBehaviour();
        System.out.println();
        demo obj=new demo();
        obj.staticBehaviour();
        obj.staticBehaviour();
        obj.staticBehaviour();
        obj.staticBehaviour();
        System.out.println();
        demo obj1=new demo();
        obj1.staticBehaviour();
        obj1.staticBehaviour();
        obj1.staticBehaviour();
        obj1.staticBehaviour();
    }
}

//if we want to decale a variable in static from then we decale at outside the class 
//if a method is static then just one time at allocate at memory and that use by all 