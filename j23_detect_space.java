/**
 * @author V.C22.3
 * @version 0.1
 */
public class j23_detect_space {
    public static void main(String[] args) {
        //detect double and triptle space in string
        String str="Hello guys , this is double  , & this is triptle   space";
        System.out.println("Double space on index (-1 means not found) : "+str.indexOf("  "));
        System.out.println("Triptle space on index (-1 means not found) : "+str.indexOf("   ",28));
        // System.out.println(str.charAt(27));
    }
    
}
