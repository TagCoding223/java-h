package shapeFolder;
import shapeFolder.shape;
public class rectangle extends shape {
    public rectangle(float d1,float d2){
        super(d1, d2);
    }
    public float area(){
        return this.d1*this.d2;
    }
    public float perimeterRectangle(){
        return (2*(d1+d2));
    }
    public float diagonalRectangle(){
        return (float)(Math.sqrt(Math.pow(d1,2)+Math.pow(d2,2)));
    }
}
