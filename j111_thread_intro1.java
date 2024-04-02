
/** 
 * @Title extends thread class
 * @author V.C22.3
 * @version 0.1
*/
/*  there are two ways to create a thread in java 
    1 -> by extendig thread class
    2 -> by implementing runnable interface
 */
class mythread1 extends Thread{ // thread is a built-in package
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
class mythread2 extends Thread{
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
public class j111_thread_intro1{
    public static void main(String[] args) {
        mythread1 objMythread1=new mythread1();
        mythread2 objMythread2=new mythread2();
        objMythread1.start();
        objMythread2.start();
    }
}
/*
    cpu some time run mythread1 and some time mythread2.
    when we use thread then calling method start() define in thread class and it will execute run method automatically .thread use to achive faster executin.
    thread has more methods like run , start etc . search at internet
 */