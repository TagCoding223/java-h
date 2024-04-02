/** 
 * @Title circle class with a method to initialize its radius calcualting area(pi*radius²) diameter(2*radius),circumference(2*pi*radius) etc.
 * @author V.C22.3
 * @version 0.1
 */

 class circle{
    float radius;

    java.util.Scanner user=new java.util.Scanner(System.in);
    public void setAttributes(){
        System.out.print("Enter radius of circle : ");
        this.radius=user.nextFloat();
    }
    public void areaCircle(){
        System.out.println("Area of circle is : "+(Math.PI*(Math.pow(radius, 2))));
    }
    public void diameterCircle(){
        System.out.println("Diameter of circle is : "+(2*radius));
    }
    public void circumferenceCircle(){
        System.out.println("Circumference of circle is : "+(2*Math.PI*radius));
    }
}
public class j81_circleclass_method {
    public static void main(String[] args) {
        circle obj=new circle();
        obj.setAttributes();
        obj.areaCircle();
        obj.diameterCircle();
        obj.circumferenceCircle();
    }
}
