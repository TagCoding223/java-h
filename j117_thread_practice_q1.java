/** 
 * @Title thread practice q1
 * @author V.C22.3
 * @version 0.1
*/

class mythread1 extends Thread{
    public void run(){
        int j=0;
        while (j<400) {
            try {
                sleep(200); // one by one 
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good morning !     :    "+j);
            j++;
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        int j=0;
        while (j<400) {
            try {
                sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome !   :   "+j);
            j++;
        }
    }
}
public class j117_thread_practice_q1 {
    public static void main(String[] args) {
        mythread1 oMythread1=new mythread1();
        mythread2 oMythread2=new mythread2();
        oMythread1.start();
        oMythread2.start();
    }
}
