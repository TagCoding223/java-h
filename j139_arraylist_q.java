import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
/**
 * @Title arraylist question
 * @author V.C22.3
 * @version 0.1
 */
public class j139_arraylist_q {
    public static void main(String[] args) {
        ArrayList<String> obArrayList=new ArrayList<String>(10);
        Scanner user=new Scanner(System.in);
        int i=0;
        String a;
        // System.out.println(obArrayList.size());
        for (int j = 0; j < 10; j++) { // we give 10 because run line 15
            System.out.print("Enter name "+(j+1)+" : ");
            a=user.next();
            obArrayList.add(a);
        }
        Collections.sort(obArrayList);
        for(String name : obArrayList){
            System.out.println("name "+(i+1)+" is  : "+name);
            i++;
        }
        System.out.println(obArrayList);
        user.close();
    }
}
