package shapeFolder;
import shapeFolder.shape;
public class squere extends shape {
    public squere(float d1){
        super(d1, -1);
    }
    public float areaSquare(){
        return (d1*d1);
    }
    public float perimeterSquare(){
        return (4*d1);
    }
    public float diagonalSquare(){
        return (float)(Math.sqrt(2)*d1);
    }
}
