package shapeFolder;
import shapeFolder.shape;
public class circle extends shape {
    public circle(float d1){
        super(d1, -1);
    }
    public Float areaCircle(){
        return (float)(Math.PI*(Math.pow(d1, 2)));
    }
    public Float diameterCircle(){
        return (2*d1);
    }
    public Float circumferenceCircle(){
        return (float)(2*Math.PI*d1);
    }
}
