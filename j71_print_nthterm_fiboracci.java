import java.util.Scanner;

/**
 * @author V.C22.3
 * @version 0.1
 */
public class j71_print_nthterm_fiboracci {
    // simple code for fibonacci sereis by resursion and pass nth number
    static int arrFibo1(int i, int j, int counter, int scope) {
        // if(counter==scope){
        // return j;
        // }
        if (scope != 1 && scope != 2 && scope>0) {
            if (counter != scope) {
                i = i + j;
                counter++;
                if (counter == scope) {
                    return i;
                }
            }
            if (counter != scope) {
                j = i + j;
                counter++;
                if (counter == scope) {
                    return j;
                }
                if (counter != scope) {
                    return arrFibo1(i, j, counter, scope);
                }
            }
        } else if (scope == 1) {
            return 0;
        } else if (scope == 2) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // position count at 1 
        Scanner user = new Scanner(System.in);
        System.out.print("Enter a nth term fo fibonacci series : ");
        int limit = user.nextInt();
        int check=arrFibo1(0, 1, 2, limit); // we pass 2 as counter becuse we already pass two position values is 0 or 1 
        if(check!=-1){
        System.out.println("Value in fiboancii series at " + limit + " position is : " + check);
        }
        else{
            System.out.println("Given position is not valid!");
        }
        user.close();
    }
}
// we replace 31 & 33 line condition toit
// else if(scope==1 || scope ==2){
//     return scope-1;
// }