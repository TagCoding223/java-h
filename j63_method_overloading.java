/**
 * @author V.C22.3
 * @version 0.1
 */
public class j63_method_overloading {
    static void overMethod(){
        System.out.println("This is just display method .");
    }
    static void overMethod(int a ){
        System.out.println("This is overload method , there pass a as an integer is : "+a+".");
    }
    static void overMethod(float a){
        System.out.println("This is overload method , there pass a as float is : "+a+".");
    }
    static void overMethod(int a,int b){
        System.out.println("This is overload method , there pass "+a+"&"+b+" as integer & there sum is : "+(a+b)+".");
    }
    static void overMethod(int a, float b ,char c){
        System.out.println("This is overload method , there pass a="+a+" , b="+b+" & c="+c+".");
    }
    public static void main(String[] args) {
        overMethod();
        overMethod(5);
        overMethod(3.14f);
        overMethod(8, 4);
        overMethod(3, 7.36f, 'h');
    }
}
// method overloading means same name but different parameters