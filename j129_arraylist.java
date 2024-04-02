import java.util.ArrayList;
/**
 * @Title arraylist intro level zero (just a hind )
 * @author V.C22.3
 * @version 0.1
 */
public class j129_arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> newArrList1=new ArrayList<> ();
        ArrayList <Integer> newArrList2=new ArrayList<> (3); // with size
        newArrList1.add(10);
        newArrList1.add(11);
        newArrList1.add(1101);
        newArrList1.add(101);
        newArrList1.add(12);

        newArrList2.add(10);
        newArrList2.add(11);
        newArrList2.add(1101);
        newArrList2.add(101);
        newArrList2.add(12);

        newArrList1.add(0,111);
        newArrList2.add(1,111);

        for (int i = 0; i < newArrList1.size(); i++) {
            System.out.println(newArrList1.get(i));
        }

        newArrList1.addAll(0,newArrList2);
        // newArrList1.addAll(newArrList2);

        newArrList2.clear();

        System.out.println(newArrList1.contains(101));
        
        System.out.println(newArrList1.indexOf(101));
        
        System.out.println(newArrList1.lastIndexOf(101));
        
        newArrList1.set(2, 200);

        newArrList1.remove(4); // at index

        newArrList2.isEmpty();

        // find by your approach
    }
}
