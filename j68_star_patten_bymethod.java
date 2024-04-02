/**
 * @author V.C22.3
 * @version 0.1
 */
public class j68_star_patten_bymethod {
    // star patten by using method (this method upgrade change is very high , so try new ideas on them)
    static void starPatten(){
        int extra=1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <extra ; j++) {
                System.out.print("*");
            }
            System.out.println();
            extra++;
        }
    }
    public static void main(String[] args) {
    starPatten();    
    }
}
