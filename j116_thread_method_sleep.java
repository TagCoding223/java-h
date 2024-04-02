/** 
 * @Title thread methods sleep
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
            if(j==50){
                System.out.println("waiting ....!");
                try{
                    Thread.sleep(4000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            j++;
        }
        System.out.println("morning");
    }
}
class mythread1 extends Thread{
    public mythread1(String name){
        super(name);
    }
    public void run(){
        int j=0;
        while(j<100){
            System.out.println(getName());
            try{
                Thread.sleep(40);
            }
            catch(Exception e){
                System.out.println(e);
            }
            j++;
        }
        System.out.println("morning");
    }
}
public class j116_thread_method_sleep {
    public static void main(String[] args) {
        mythread objMythread=new mythread("hello");
        //mythread objMythread1=new mythread("bye");
        mythread1 obMythread2=new mythread1("good");
        obMythread2.start();
        objMythread.start();
        // objMythread1.start();
    }
}
