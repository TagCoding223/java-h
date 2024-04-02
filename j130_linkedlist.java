
import java.util.LinkedList;

/**
 * @Title linkedlist intro level zero (just a hind )
 * @author V.C22.3
 * @version 0.1
 */
public class j130_linkedlist {
    public static void main(String[] args) {
        LinkedList <Integer> newLinkedList1=new LinkedList<> ();
        // LinkedList <Integer> newArrList2=new LinkedList<> (3); // size not allowed
        newLinkedList1.add(10);
        newLinkedList1.add(11);
        newLinkedList1.add(1101);
        newLinkedList1.add(101);
        newLinkedList1.add(12);

        newLinkedList1.add(10);
        newLinkedList1.add(11);
        newLinkedList1.add(1101);
        newLinkedList1.add(101);
        newLinkedList1.add(12);

        newLinkedList1.add(0,111);
        newLinkedList1.add(1,111);

        for (int i = 0; i < newLinkedList1.size(); i++) {
            System.out.println(newLinkedList1.get(i));
        }

        newLinkedList1.addAll(0,newLinkedList1);
        // newLinkedList1.addAll(newLinkedList1);

        
        System.out.println(newLinkedList1.contains(101));
        
        System.out.println(newLinkedList1.indexOf(101));
        
        System.out.println(newLinkedList1.lastIndexOf(101));
        
        newLinkedList1.set(2, 200);
        
        
        newLinkedList1.remove(4); // at index
        
        newLinkedList1.clear();
        newLinkedList1.isEmpty();

        // find by your approach
    }
}
