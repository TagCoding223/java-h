/**
 * @author V.C22.3
 * @version 0.1
 */
public class j70_revese_star_patten_bymethod {
    static void starPatten(){
        //using do-while loop
        int i=4;
        int j=0;
        do{
            do{
                System.out.print("*");
                j++;
            }while(j<i);
            System.out.println();
            i--;
            j=0;
        }while(i>0);
    }
    public static void main(String[] args) {
        starPatten();
    }
}
