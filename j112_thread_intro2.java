/** 
 * @Title creating a thread using runnable interface
 * @author V.C22.3
 * @version 0.1
*/
class mythreadRunnable1 implements Runnable{ // thread is a built-in package
    @Override
    public void run(){ // already define in thread class , but we override here
        int i=1;
        //while(true){
        while(i<501){
            if(i==500){
                System.out.println(i);
            }
            System.out.println("This is a mythread1 class override run method !");
            i++;
        }
    }
}
class mythreadRunnable2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        //while(true){
        while(i<500){
            if(i==499){
                System.out.println(i);
            }
            System.out.println("This is a mythread2 class override run method !");
            i++;
        }
    }
}
public class j112_thread_intro2 {
    public static void main(String[] args) {
        mythreadRunnable1 bullet1=new mythreadRunnable1();
        Thread gun1=new Thread(bullet1);

        mythreadRunnable2 bullet2=new mythreadRunnable2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
/*
        Life cycle of thread

        New
         ↓
        Runnable ↘
         ↓         Non Runnable(blocked)
        Running  ↗
         ↓
        Terminted
        
 */