/** 
 * @Title constructors of thread class
 * @author V.C22.3
 * @version 0.1
*/
/*
    1-> Thread() - allocates a new thread object
    2-> Thread(String name) - allocates a new thread object with name
    3-> Thread(Runnable r,String name) - allocates a new thread object
    4-> Thread(Runnable r) - allocates a new thread object
 */
class mythread1 extends Thread{ // thread is a built-in package
    mythread1(String name){
        super(name); // thread class has a defualt constructor , but we want to call a custom constructor that want a string 
    }
    @Override
    public void run(){ // already define in thread class , but we override here
        int i=1;
        //while(true){
        while(i<101){
            if(i==100){
                System.out.println(i);
            }
            System.out.println("This is a mythread1 class override run method !");
            i++;
        }
    }
}
public class j113_constructors_in_threads {
    public static void main(String[] args) {
        mythread1 th=new mythread1("vishal");
        mythread1 th1=new mythread1("vishal.Not");
        th.start();
        th1.start();
        // below method work (look at running start method)
        System.out.println("id for th is : "+th.getId());// The method getId() from the type Thread is deprecated since version 19
        System.out.println("name for th is : "+th.getName());
        System.out.println("priority for th is : "+th.getPriority());
        System.out.println("thread id for th is : "+th.threadId());


        System.out.println("id for th1 is : "+th1.getId());// The method getId() from the type Thread is deprecated since version 19
        System.out.println("name for th1 is : "+th1.getName());
        System.out.println("priority for th1 is : "+th1.getPriority());
        System.out.println("thread id for th1 is : "+th1.threadId());
    }
}
