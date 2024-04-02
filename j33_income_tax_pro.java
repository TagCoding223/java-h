/**
 * @author V.C22.3
 * @version 0.1
 */
public class j33_income_tax_pro {
    public static void main(String[] args) {
        /*income tax 
         below 2.5l     no tax
         2.5l-5.0l      5%
         5.0l-10.0l     20%
         above 10.0l    30%
         */
        int income;
        int [] per={5,20,30};
        float tax=0;
        System.out.print("Enter your income : ");
        java.util.Scanner user= new java.util.Scanner(System.in);
        income=user.nextInt();
        if(income<250000){
            System.out.println("You are not come in tax payer parameters.");
        }
        else if(income>=250000 && income<500000){
            tax=(per[0]/100.0f)*income;
            System.out.println("You should pay "+per[0]+"% tax , means "+tax+" tax to goverment , because your income is : "+income);
        }
        else if(income>=500000 && income<1000000){
            tax=(per[1]/100.0f)*income;
            System.out.println("You should pay "+per[1]+"% tax , means "+tax+" tax to goverment , because your income is : "+income);
        }
        else if(income>=1000000){
            tax=(per[2]/100.0f)*income;
            System.out.println("You should pay "+per[2]+"% tax , means "+tax+" tax to goverment , because your income is : "+income);
        }
        else{
            System.out.println("Given value format not Supported .");
        }
        user.close();
    }
}
