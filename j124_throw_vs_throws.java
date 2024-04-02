/**
 * @Title THROW V/S THROWS
 * @author V.C22.3
 * @version 0.1
 */
class NagativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be nagative !";
    }
    @Override
    public String getMessage(){
        // return super.getMessage()+"I am getMessage() Method !";
        return "Radius cannot be nagative !";
    }
}
public class j124_throw_vs_throws {
    public static double area (int r) throws NagativeRadiusException{
        if(r<0){
            throw new NagativeRadiusException();
        }
        double result =Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c=divide(6, 0);
            System.out.println(c);
            double ar=area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
// throws say that try to tegeer exception , becauce it pass a error .