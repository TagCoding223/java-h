/** 
 * @Title sphere class with a method to initialize its radius  and calcualting volume(4/3*pi*r³) diameter(2*r), surface area (4*pi*r²)
 * @author V.C22.3
 * @version 0.1
 */

class sphere{
    float radius;
    java.util.Scanner user=new java.util.Scanner(System.in);
    public void setAttributes(){
        System.out.print("Enter radius of sphere : ");
        this.radius=user.nextFloat();
    }
    public void volumeSphere(){
        System.out.println("Volume of sphere is : "+((4*Math.PI*Math.pow(radius,3))/3));
    }
    public void diameterSphere(){
        System.out.println("Diameter of sphere is : "+(2*radius));
    }
    public void surfaceAreaSphere(){
        System.out.println("Surface area of sphere is : "+(4*Math.PI*Math.pow(radius,2)));
    }
    
}
public class j87_sphereclass_mrthod {
    public static void main(String[] args) {
        sphere obj=new sphere();
        obj.setAttributes();
        obj.volumeSphere();
        obj.diameterSphere();
        obj.surfaceAreaSphere();
    }
}
