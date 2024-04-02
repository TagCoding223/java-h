
import java.util.HashSet;

/**
 * @Title hashset duplicte element
 * @author V.C22.3
 * @version 0.1
 */
public class j142_hash_duplicate_elements {
    public static void main(String[] args) {
        HashSet <Integer> objHashSet=new HashSet<>(100);
        objHashSet.add(112);
        objHashSet.add(1);
        objHashSet.add(2);
        objHashSet.add(112);
        objHashSet.add(112);
        objHashSet.add(1);
        objHashSet.add(2);
        objHashSet.add(112);
        
        System.out.println(objHashSet); // hash does not stroe duplicate element and not display
    }
}
