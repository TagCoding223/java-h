import java.util.HashSet;

/**
 * @Title hashset intro level zero (just a hind )
 * @author V.C22.3
 * @version 0.1
 */
public class j132_hashset {
    public static void main(String[] args) {
        // HashSet <Integer> objHashSet=new HashSet<>(100, 0.5f);
        // HashSet <Integer> objHashSet=new HashSet<>();
        HashSet <Integer> objHashSet=new HashSet<>(100);
        objHashSet.add(12);
        objHashSet.add(1);
        objHashSet.add(2);
        objHashSet.add(112);
        System.out.println(objHashSet);
        System.out.println(objHashSet.size());
        
        // they have lot of method discover it your self and your program needs .
        // try - a hashset index hold a new hashset or linkedlist etc.(means chaining)
        // searching is fast
    }
}
