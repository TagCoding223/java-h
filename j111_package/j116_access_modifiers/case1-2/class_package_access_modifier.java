class demo{
    /*  case 1 - class me (same class me)
     *  public , private , protected or default accessble he
     */
    public int a=1;
    protected int b=2;
    int c=3;// default (don't write default keyword)
    private int d=4;
    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
class metrul extends demo{
    /*  case 2 - class ke attributes or method class ke baher yani dosere class (same package me)
     *  public , protected or default accessble he per private nahi
     */
    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // System.out.println(d); error: d has private access in demo ,if a class is extends(inherit then he has complete access but not access private variable and method )
    }
}
public class class_package_access_modifier{
    public static void main(String[] args) {
        /*  case 1 - class me (same class me)
        *  public , private , protected or default accessble he
        */
        {
            demo objDemo=new demo();
            objDemo.show();
            objDemo.a=5;
            objDemo.b=8;
            objDemo.c=9;
            // objDemo.d=2; error: d has private access in demo , if a attribute and method is private in class then it will be not access by not side the class . 
            System.out.println();
            objDemo.show();
        }

        /*  case 2 - class ke attributes or method class ke baher yani dosere class (same package me)
        *  public , protected or default accessble he per private nahi
        */
        {
            System.out.println();
            metrul objMetrul=new metrul();
            objMetrul.show();
        }
    }
}