/** 
 * @Title circle class parameter error detect
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
        if(radius<=0){
            System.out.println("error : Wrong parameter pass!");
        }
        else{
        System.out.println("Area of circle is : "+(Math.PI*(Math.pow(radius, 2))));
        }
    }
}
public class j81_circle_parameter_error {
    public static void main(String[] args) {
        circle obj=new circle();
        obj.setAttributes();
        obj.areaCircle();
    }
}
