package mathpack;
public class multiplicationTwoNumber{
    int a,b;
    int multipleResult;
    public multiplicationTwoNumber(int a,int b){
        this.a=a;
        this.b=b;
        this.multipleResult=a*b;
    }
    public void show(){
        System.out.println("Sum of "+a+" and "+b+" is : "+multipleResult);
    }
}