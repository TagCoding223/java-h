/** 
 * @Title thread practice q3
 * @author V.C22.3
 * @version 0.1
*/

class mythread1 extends Thread{
    public void run(){
        int j=0;
        while (j<100) {
            System.out.println("Good morning !     :    "+j);
            j++;
        }
    }
}
public class j117_thread_practice_q3 {
    public static void main(String[] args) {
        mythread1 oMythread1=new mythread1();
        // oMythread1.start();
        // currentThread is method to refere current executing thread here main is current thread(currentThread means main method)
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
