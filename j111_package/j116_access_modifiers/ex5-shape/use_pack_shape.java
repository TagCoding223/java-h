import shapeFolder.*;
public class use_pack_shape {
    public static void main(String[] args) {
        circle objCircle=new circle(4);
        System.out.println("Area of circle is : "+objCircle.areaCircle());
        System.out.println("Circumference of circle is : "+objCircle.circumferenceCircle());
        System.out.println("Diameter of circle is : "+objCircle.diameterCircle());

        System.out.println();
        sphere objSphere=new sphere(4);
        System.out.println("Volume of sphere is : "+objSphere.volumeSphere());
        System.out.println("Diameter of sphere is : "+objSphere.diameterSphere());
        System.out.println("Surface area of sphere is : "+objSphere.surfaceAreaSphere());

        System.out.println();
        cylinder objCylinder=new cylinder(4, 2);
        System.out.println("Volume of cylinder is : "+objCylinder.volumeCylinder());
        System.out.println("Diameter of cylinder is : "+objCylinder.diameterCylinder());
        System.out.println("Surface area of cylinder is : "+objCylinder.surfaceAreaCylinder());
        System.out.println("Base area of cylinder is : "+objCylinder.baseAreaCylinder());
        System.out.println("Iateral Surface of cylinder is : "+objCylinder.iateralSurfaceCylinder());

        System.out.println();
        rectangle objRectangle=new rectangle(4, 5);
        System.out.println("Area of rectangle is : "+objRectangle.area());
        System.out.println("Perimeter of rectangle is : "+objRectangle.perimeterRectangle());
        System.out.println("Diagonal of rectangle is : "+objRectangle.diagonalRectangle());

        System.out.println();
        squere objSquere=new squere(5);
        System.out.println("Area of square is : "+objSquere.areaSquare());
        System.out.println("Perimeter of square is : "+objSquere.perimeterSquare());
        System.out.println("Diagonal of square is : "+objSquere.diagonalSquare());
    }
}
// run by  java use_pack_shape.java