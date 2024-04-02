import mathpack.multiplicationTwoNumber;
import mathpack.sumTwoNumber;
/**
 * @title perform custom package in other file
 * @author V.C22.3
 * @version 0.1
 */
public class perform_custom_package {
    public static void main(String[] args) {
        sumTwoNumber objTwoNumber=new sumTwoNumber(3, 8);
        // objTwoNumber.main("hello");
        objTwoNumber.show();
        multiplicationTwoNumber objNumber=new multiplicationTwoNumber(2, 9);
        objNumber.show();
    }
}
