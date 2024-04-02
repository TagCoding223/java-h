/** 
 * @Title thread priorities
 * @author V.C22.3
 * @version 0.1
*/
/*
    min(low)=1
    normal=5
    max(high)=10
    defualt priorities in java is normal , priorities depends on os , if cpu avaliable then provet to low priorities threads
 */
class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public void run(){
        int j=0;
        while(j<100){
            System.out.println("Thread name : "+getName());
            j++;
        }
    }
}
public class j114_thread_priorities {
    public static void main(String[] args) {
        mythread objMythread1=new mythread("v1");
        mythread objMythread2=new mythread("v2");
        mythread objMythread3=new mythread("v3");
        mythread objMythread4=new mythread("v4");
        objMythread4.setPriority(Thread.MAX_PRIORITY);
        objMythread1.setPriority(1);
        objMythread1.start();
        objMythread2.start();
        objMythread3.start();
        objMythread4.start();
        System.out.println("Priority for obj 1 : "+objMythread1.getPriority());
        System.out.println("Priority for obj 2 : "+objMythread2.getPriority());
        System.out.println("Priority for obj 3 : "+objMythread3.getPriority());
        System.out.println("Priority for obj 4 : "+objMythread4.getPriority());
    }
}
// other thread priority is normal 
// which threads gets executed is highly dependent on the os .