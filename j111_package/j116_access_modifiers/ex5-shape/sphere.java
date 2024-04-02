package shapeFolder;
import shapeFolder.shape;
public class sphere extends shape {
    public sphere(float d1){
        super(d1, -1);
    }
    public float volumeSphere(){
        return (float)((4*Math.PI*Math.pow(d1,3))/3);
    }
    public float diameterSphere(){
        return (2*d1);
    }
    public float surfaceAreaSphere(){
        return (float)(4*Math.PI*Math.pow(d1,2));
    }
    
}
