/**
 * @author V.C22.3
 * @version 0.1
 */
public class j18_string_printmethod {
    public static void main(String[] args) {
        //string and print method in java 
        String s;//string is a class in java but that given ous special support
        s=new String("hello");
        String b=new String("guys");
        String c="vishal";
        float age=18.54f;
        // print methods
        System.out.print(s);
        System.out.println(b);
        System.out.printf("my name is %s",c);
        System.out.format("\nand my age is %8.1f",age);//space works with value not work with string
    }
}
