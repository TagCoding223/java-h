// /**
//  * @title case 3 subclass level access modifier explain
//  * @author V.C22.3
//  * @version 0.1
//  */
package vishalpack;


// public 
public class f2{
    public int a=1;
    protected int b=2;
    int c=3;// default (don't write default keyword)
    private int d=4;
    public void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
// that 3 befroe case can't create package ( by using javac -d . f1.java command ) , because default and private not allow in subclass level .

// protected
// protected class m2{
//     public int a=1;
//     protected int b=2;
//     int c=3;// default (don't write default keyword)
//     private int d=4;
//     public void show(){
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//     }
// }

// default
// class m3{
//     public int a=1;
//     protected int b=2;
//     int c=3;// default (don't write default keyword)
//     private int d=4;
//     public void show(){
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//     }
// }

// // private
// private class m4{
//     public int a=1;
//     protected int b=2;
//     int c=3;// default (don't write default keyword)
//     private int d=4;
//     public void show(){
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//     }
// }