/** 
 * @Title rectangle class with amethod to initialize its length ,width and calcualting area(w*l) perimeter(2*(l+w)),diagonal(√w²+l²) etc.
 * @author V.C22.3
 * @version 0.1
 */

 class rectangle{
    float length;
    float width;
    /* use contructor overloading
     * recatangle(){
     * length=4;
     * width=5;
     * }
     * rectangle(float a,float b){
     * length=a;
     * width=b;
     * }
     */
    java.util.Scanner user=new java.util.Scanner(System.in);
    public void setAttributes(){
        System.out.print("Enter width of rectangle : ");
        this.width=user.nextFloat();
        System.out.print("Enter length of rectangle : ");
        this.length=user.nextFloat();
    }
    public void areaRectangle(){
        System.out.println("Area of rectangle is : "+(width*length));
    }
    public void perimeterRectangle(){
        System.out.println("Perimeter of rectangle is : "+(2*(width+length)));
    }
    public void diagonalRectangle(){
        System.out.println("Diagonal of rectangle is : "+(Math.sqrt(Math.pow(width,2)+Math.pow(length,2))));
    }
}
public class j80_rectangleclass_method {
    public static void main(String[] args) {
        rectangle obj=new rectangle();
        obj.setAttributes();
        obj.areaRectangle();
        obj.perimeterRectangle();
        obj.diagonalRectangle();
    }
}
