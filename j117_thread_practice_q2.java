/** 
 * @Title thread practice q2
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
class mythread2 extends Thread{
    public void run(){
        int j=0;
        while (j<100) {
            System.out.println("Welcome !   :   "+j);
            j++;
        }
    }
}
public class j117_thread_practice_q2 {
    public static void main(String[] args) {
        mythread1 oMythread1=new mythread1();
        mythread2 oMythread2=new mythread2();
        oMythread1.setPriority(1);
        oMythread2.setPriority(10);
        
        System.out.println("State1 of thread1 is : "+oMythread1.getState());
        System.out.println("State2 of thread2 is : "+oMythread2.getState());
        oMythread1.start();
        System.out.println("State3 of thread1 is : "+oMythread1.getState());
        System.out.println("State4 of thread2 is : "+oMythread2.getState());
        oMythread2.start();
        System.out.println("State5 of thread1 is : "+oMythread1.getState());
        System.out.println("State6 of thread2 is : "+oMythread2.getState());
        System.out.println("Priority of thread1 is : "+oMythread1.getPriority());
        System.out.println("Priority of thread2 is : "+oMythread2.getPriority());
        //oMythread2.join();7
        System.out.println("State7 of thread1 is : "+oMythread1.getState());
        System.out.println("State8 of thread2 is : "+oMythread2.getState());
    }
}
