package mathpack;
public class sumTwoNumber{
    int a,b;
    int sumResult;
    public sumTwoNumber(int a,int b){
        this.a=a;
        this.b=b;
        this.sumResult=a+b;
    }
    public void show(){
        System.out.println("Sum of "+a+" and "+b+" is : "+sumResult);
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}