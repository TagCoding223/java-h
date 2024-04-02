/** 
 * @Title try-catch block
 * @author V.C22.3
 * @version 0.1
*/
public class j119_try_catch_block {
    public static void main(String[] args) {
        int a=200;
        int b=0;
        try {
            System.out.println("The result is : "+(a/b));
            System.out.println("end of try block !");
        } catch (Exception e) { // exception is a class
            System.out.println("Execution is fail ! because , ");
            System.out.println(e);
        }
        System.out.println("This is a end of program !");
    }
}
// without try catch program execute from line 9 then after throw error , but we use try catch then after an error we contiune run our program ( without try-catch 11 line does not execute )
// line 12 does not execute because java run program line by line and in line 11 has an exception then try block is break and go to catch block
// try-catch = try karo , exception aye to print karke aage bar jao . catch block tabhi caleka jab koi exception create ho .