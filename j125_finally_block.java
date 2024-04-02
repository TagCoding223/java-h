/**
 * @Title finally block
 * @author V.C22.3
 * @version 0.1
 */
public class j125_finally_block {
    public static int geet(){
        try{
            int a=4,b=0;
            int c=a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block , clean resource . ");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k=geet();
        System.out.println(k);
        int a=7,b=9;
        while(true){
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally ! value of b is : "+b);
            }
            b--;
        }
        try {
            System.out.println(9/0);
        }
        finally{
            System.out.println("this is finally");
        }
    }
}
// finally block contions the code which is always content whether the exception is handled or not .
// it is used to execute code contanning instraction to release the system resourcess , lose a connection etc.
// exception aaye ya na aaye ham chayeke kuch klna
// single try means error(withot catch ya finally )
