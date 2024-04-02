package shapeFolder;
import shapeFolder.shape;
public class cylinder extends shape {
    public float volume;
    public cylinder(float d1,float d2){
        super(d1, d2);
    }
    public float volumeCylinder(){
        volume=(float)(Math.PI*(Math.pow(d1, 2))*d2);
        return (float)(Math.PI*(Math.pow(d1, 2))*d2);
    }
    public float diameterCylinder(){
        return (float)(2*Math.sqrt((volume/(Math.PI*d2))));
    }
    public float surfaceAreaCylinder(){
        return (float)((2*Math.PI*d1*d2)+(2*(Math.PI*(Math.pow(d1, 2)))));
    }
    public float baseAreaCylinder(){
        return (float)(Math.PI*Math.pow(d1, 2));
    }
    public float iateralSurfaceCylinder(){
        return (float)(2*Math.PI*d1*d2);
    }
}
