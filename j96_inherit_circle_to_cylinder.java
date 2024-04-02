import java.util.Scanner;

/** 
 * @Title inherit circle to cylinder
 * @author V.C22.3
 * @version 0.1
 */
class circle{
    float radius;
    circle(float radius){
        this.radius=radius;
    }
    public void circleProperty(){
        System.out.println("Area of circle is : "+(Math.PI*(Math.pow(radius, 2))));
        System.out.println("Diameter of circle is : "+(2*radius));
        System.out.println("Circumference of circle is : "+(2*Math.PI*radius));
        System.out.println("--------------------------------\n");
    }
}
class cylinder extends circle{
    float height;
    float volume;
    cylinder(float radius,float height){
        super(radius);
        this.height=height;
        this.volume=(float)(Math.PI*(Math.pow(radius, 2))*height);
    }
    void cylinderProperty(){
        System.out.println("Volume of cylinder : "+volume);
        System.out.println("Diameter of cylinder is : "+(2*Math.sqrt((volume/(Math.PI*height)))));
        System.out.println("Surface area of cylinder is : "+((2*Math.PI*radius*height)+(2*(Math.PI*(Math.pow(radius, 2))))));
        System.out.println("Base area of cylinder is : "+(Math.PI*Math.pow(radius, 2)));
        System.out.println("Iateral Surface of cylinder is : "+(2*Math.PI*radius*height));
    }
}
public class j96_inherit_circle_to_cylinder {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        float radius,height;
        System.out.print("Enter radius : ");
        radius=user.nextFloat();
        System.out.print("Enter height : ");
        height=user.nextFloat();
        user.close();
        cylinder obj=new cylinder(radius, height);
        obj.circleProperty();
        obj.cylinderProperty();
    }
}
