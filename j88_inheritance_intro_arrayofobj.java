/** 
 * @Title intro of inheritance and array of objects
 * @author V.C22.3
 * @version 0.2
 */
// task for ourselevs make program of all types of inheritance
// class base extends derivedAnimal{ -> not allowed in cycle path and multiple inheritance (because java devloper incollet interface to use better implemetation (use indrect inheritance))
 class base{ // we say this class -> base , super , parent class
    String name;
    java.util.Scanner user=new java.util.Scanner(System.in);
    void setName(){ // accses modifer select method incollet in other class or not (YOU NEED TO CREATE A SEPREATE PROGRAM ONLY DEPEND ON ACCSES MODIFER'S) -> public , protected & defualt allow this method to use in derived class , if incollet private then we face an error (means method can't inherit)
        System.out.print("Enter your pad name : ");
        this.name=user.next();
    }
 }
 // use extends keyword to inherit base class in derived class
 class derivedAnimal extends base{ // we say this class -> subclass , derived , child class
    String category;
    void setCategory(){
        System.out.print("Which animal category you pad's come : ");
        category=user.next(); // base class scanner object also use there
    }
    void aniDel(){
        System.out.println("\nYour pad name is : "+name);
        System.out.println("\nAnd it is a : "+category);
    }
 }
public class j88_inheritance_intro_arrayofobj {
    public static void main(String[] args) {
        // normal creation of objects and showing inheritance
        // base obj1=new base();
        // obj1.setName(); THIS OBJECT CAN;T USE DERIVED CLASS METHOD BECUASE IT IS A PARENT CLASS 
        // derivedAnimal obj=new derivedAnimal();
        // obj.setName();
        // obj.setCategory();

        // creation of array of objects and displaying inheritance
        derivedAnimal obj4[]=new derivedAnimal[4]; // derived class object creation (REMEBER THAT OBJECTS CREATE AT RUN TIME(RUNTIME POLYMORPHISM))
        for (int i = 0; i < obj4.length; i++) {
            obj4[i]=new derivedAnimal(); // we does not use array of object in direct way , because java suppote dynamic method dispatch then we need what we want !
            /*  this statement say to compiler
                case i=0
                    obj4[0]=new derivedAnimal(); // you also say that we create a new object
                case i=1
                    obj4[1]=new derivedAnimal();
                case i=2
                    obj4[2]=new derivedAnimal();
                case i=3
                    obj4[3]=new derivedAnimal();
                note : without this satement you face run time error
             */
            obj4[i].setName(); // base class method called using derived class object
            obj4[i].setCategory(); // derived class method called using derived class object
        }        

        System.out.println("Animal's detials ,");
        for(int i=0;i<4;i++){
            obj4[i].aniDel();
        }
    }
}
