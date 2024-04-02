/**
 * @author V.C22.3
 * @version 0.1
 */
public class j13_resulting_datatypes {
    public static void main(String[] args) {
    // Resulting datatype after arithmetic operation
    // b+s=i
    // s+i=i
    // l+f=f if we spcify and fouce to be a float ex = 3.4f
    // i+f=f
    // c+s=i
    // c+i=i
    // l+d=d
    // f+d=d
    float a=3.3f;
    System.out.println(a+3);
    char b='c';
    System.out.println(b+3);//unic value of c + 3 is our result

    // Incerment and decrement operators
    int c=54;
    System.out.println(c++);
    System.out.println(c);
    System.out.println(--c);
    System.out.println(c++);
    System.out.println(++c);

    // Test an expresion
    int y=7;
    int x=++y*5;//incerment/decerement opreator percedence is high to arithmetic operators
    System.out.println("value of x : "+x);

    // Incerement/decrement opertor with character
    char j='d';
    System.out.println(++j);
    }
}
