/**
 * @author V.C22.3
 * @version 0.1
 */
public class j43_break_continue {
    public static void main(String[] args) {
        //break statement
        System.out.println("break case :");
        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==5){
                System.out.println("loop is break because base condition is match!");
                break;
            }
        }

        //continue satement
        System.out.println("break case :");
        for(int i=0;i<10;i++){
            if(i==5){
                System.out.println("number is miss because base condition is match!");
                continue;
            }
            System.out.println(i);
        }
    }
}
