import java.util.Scanner;

/** 
 * @Title inherit rectangle to cuboid
 * @author V.C22.3
 * @version 0.1
 */
class rectangle{
    float length;
    float width;
    java.util.Scanner user=new java.util.Scanner(System.in);
    rectangle(){
        System.out.print("Enter width : ");
        this.width=user.nextFloat();
        System.out.print("Enter length : ");
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
class cuboid extends rectangle{
    float height;
    cuboid(int x){
        if(x==2){
            System.out.print("Enter height : ");
            this.height=user.nextFloat();
        }
    }
    void surfaceAreaCuboid(){
        System.out.println("Surface area of cuboid is : "+(2*(width*length+height*length+height*width)));
    }
    void volumeCuboid(){
        System.out.println("Volume of cuboid is : "+(width*height*length));
    }
    void spaceDiagonalCuboid(){
        System.out.println("Space diagonal of cuboid is : "+(Math.sqrt(Math.pow(width,2)+Math.pow(height,2)+Math.pow(length,2))));
    }

}
public class j97_inherit_rectangle_to_cubeid {
    public static void main(String[] args) {
        Scanner user =new Scanner(System.in);
        System.out.print("Enter 1 for show properties of rectangle and same as 2 for cuboid : ");
        int choice=user.nextInt();
        switch (choice) {
            case 1:
                cuboid obj=new cuboid(1);
                obj.areaRectangle();
                obj.diagonalRectangle();
                obj.perimeterRectangle();
                break;
            case 2:
                cuboid obj1=new cuboid(2);
                obj1.surfaceAreaCuboid();
                obj1.volumeCuboid();
                obj1.spaceDiagonalCuboid();
                break;
                
            default:
                System.out.println("Wrong choise !");
                break;
        }
        user.close();
    }
}
