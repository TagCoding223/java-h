/** 
 * @Title intro of constructor in inheritance
 * @author V.C22.3
 * @version 0.1
 */
class A{
    A(){
        System.out.println("i am A class constructor!");
    }
}
class B extends A{
    B(){
        System.out.println("i am B class constructor!");
    }
}
class C extends B{
    C(){
        System.out.println("i am C class constructor!");
    }
}
/*  inheritance hierarchy
            A - parent
            |
            B - child
            |
            C - grand child
    multilevel
 */
/*  inheritance hierarchy
            A - parent
            |
            B - child
    singel
 */


// class C extends A{
//     C(){
//         System.out.println("i am C class constructor!");
//     }
// }
/*  inheritance hierarchy
            A - parent
           / \
  child - B   C - child (siblings)
  sub hybrid(not complete hybrid)
 */

public class j89_constructor_inheritance_intro {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println();
        B obj1=new B();
        System.out.println();
        C obj2=new C();
   }
}
/*  inheritance hierarchy , the constructor are executed in the order parent->child->grandchild
 means constructor execute in top to bottom order
 */