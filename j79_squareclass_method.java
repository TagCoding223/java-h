import java.util.Scanner;
/** 
 * @Title square class with amethod to initialize its side and calcualting area(a²) perimeter(4a),diagonal(√2a) etc.
 * @author V.C22.3
 * @version 0.1
 */

class square{
    float side;
    Scanner user=new Scanner(System.in);
    public void setSide(){
        System.out.print("Enter side of square : ");
        this.side=user.nextFloat();
    }
    public void areaSquare(){
        System.out.println("Area of square is : "+(side*side));
    }
    public void perimeterSquare(){
        System.out.println("Perimeter of square is : "+(4*side));
    }
    public void diagonalSquare(){
        System.out.println("Diagonal of square is : "+(Math.sqrt(2)*side));
    }
}
public class j79_squareclass_method {
    public static void main(String[] args) {
        square obj=new square();
        obj.setSide();
        obj.areaSquare();
        obj.perimeterSquare();
        obj.diagonalSquare();
    }
}
//window shoutcut key for symbol √->alt+numpad251 , ²->alt+numpad253 , ³->alt+numpad0179 , 