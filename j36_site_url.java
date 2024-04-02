/**
 * @author V.C22.3
 * @version 0.1
 */
public class j36_site_url {
    public static void main(String[] args) {
        java.util.Scanner user=new java.util.Scanner(System.in);
        System.out.print("Enter your site name : ");
        String url=user.next();
        if(url.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("oraganization website");
        }
        else if(url.endsWith(".in")){
            System.out.println("indian website");
        }
        else{
            System.out.println("Given string is not supported");
        }
        user.close(); 
    }
}
