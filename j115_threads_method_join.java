/** 
 * @Title thread methods join
 * @author V.C22.3
 * @version 0.1
*/
class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public void run(){
        int j=0;
        while(j<100){
            System.out.println(getName());
            j++;
        }
        System.out.println("hello");
    }
}
public class j115_threads_method_join {
    public static void main(String[] args) {
        mythread objMythread1=new mythread("thread1");
        mythread objMythread2=new mythread("thread2");
        objMythread1.start();
        // objMythread1.join(); error : Unhandled exception type InterruptedException , if we want that t2 not start execution if t1 will noot comelte execute , but there are error , agar f1.start par contorl he to t1.join() par contorl jab jayega t1 terminat ho cuka ho is lye ham try catch use karte he
        try{ // java try it , means java try to join t1
            // objMythread1.join(4);
            // objMythread1.join(400);
            objMythread1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        objMythread2.start();
    }
}
