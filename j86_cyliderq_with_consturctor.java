/** 
 * @Title cylinder class with constructor overloading to initialize its radius ,hieght and calcualting volume(pi*r²*h) diameter(2*√(volume/(pi*hieght))), surface area (2*pi*radius*height)+(2*pi*r²) , base area (pi*radius²) , iateral surface(2*pi*radius*height) etc.
 * @author V.C22.3
 * @version 0.1
 */
class cylinder{
    float radius;
    float height;
    float volume; // we also make getter and setter for this atributes but its create huge length of code and we need to call multiple methods
    java.util.Scanner user=new java.util.Scanner(System.in);
    cylinder(){
        /*  */
        System.out.println("I am use default constructor !\n");
        System.out.print("Enter radius of cylinder : ");
        this.radius=user.nextFloat();
        System.out.print("Enter height of cylinder : ");
        this.height=user.nextFloat();
        volumeCylinder();
        diameterCylinder();
        surfaceAreaCylinder();
        baseAreaCylinder();
        iateralSurfaceCylinder();
    }
    cylinder(float height,float radius){
        System.out.println("\n\nI am use overload constructor !\n\n");
        System.out.println("Radius of cylider is : "+radius);
        System.out.println("Height of cylider is : "+height);
        this.radius=radius;
        this.height=height;
        volumeCylinder();
        diameterCylinder();
        surfaceAreaCylinder();
        baseAreaCylinder();
        iateralSurfaceCylinder();
    }
    public void volumeCylinder(){
        System.out.println("Volume of cylinder is : "+(Math.PI*(Math.pow(radius, 2))*height));
        volume=(float)(Math.PI*(Math.pow(radius, 2))*height);
    }
    public void diameterCylinder(){
        System.out.println("Diameter of cylinder is : "+(2*Math.sqrt((volume/(Math.PI*height)))));
    }
    public void surfaceAreaCylinder(){
        System.out.println("Surface area of cylinder is : "+((2*Math.PI*radius*height)+(2*(Math.PI*(Math.pow(radius, 2))))));
    }
    public void baseAreaCylinder(){
        System.out.println("Base area of cylinder is : "+(Math.PI*Math.pow(radius, 2)));
    }
    public void iateralSurfaceCylinder(){
        System.out.println("Iateral Surface of cylinder is : "+(2*Math.PI*radius*height));
    }
}
public class j86_cyliderq_with_consturctor {
    public static void main(String[] args) {
        
        cylinder obj=new cylinder();
        
        
        cylinder obj1=new cylinder(5,4);
        
    }
}
