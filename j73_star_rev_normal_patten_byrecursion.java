/**
 * @author V.C22.3
 * @version 0.1
 */
public class j73_star_rev_normal_patten_byrecursion {
    // reverse patten
    static void starPattenReverce(int line){
        if(line>0){
            for (int i = 0; i < line; i++) {
                System.out.print("*");
            }
            System.out.println();
            starPattenReverce(line-1);
        }
        else{
            return;
        }
    }

    //star normal patten
    static void starPattenNormal(int line,int oneTime){
        if(line>0){
            for (int i = 0; i < oneTime; i++) {
                System.out.print("*");
            }
            System.out.println();
            starPattenNormal(line-1,oneTime+1);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        // star normal and reverse patten using recursion
        starPattenNormal(4,1);
        starPattenReverce(4);
    }
}
