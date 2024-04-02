import java.util.ArrayDeque;

/**
 * @Title arraydeque intro level zero (just a hind )
 * @author V.C22.3
 * @version 0.1
 */
public class j131_dequeue {
    public static void main(String[] args) {
        // ArrayDeque<Float> objDeque= new ArrayDeque<>(10);
        ArrayDeque<Float> objDeque= new ArrayDeque<>();
        objDeque.add(34.2f);
        objDeque.add(3.2f);
        objDeque.add(347.8f);
        objDeque.add(34.20f);
        objDeque.add(34.2f);
        
        objDeque.getFirst();
        objDeque.getLast();
        objDeque.addFirst(000f);
        objDeque.addLast(999.9f);
        objDeque.remove(3.2f);
        objDeque.removeFirst();
        objDeque.removeLast();
    }
}
