/** 
* @Title dynamic method dispatch
 * @author V.C22.3
 * @version 0.1
 */
// object create at run time (MOST IMPORTANT IN SOFTWARE DEVLOPMENT     )
class Phone{
    public void demoMethod(){
        System.out.println("I am A class method !\n");
    }
    public void hello(){
        System.out.println("I am A class method hello , Hello !\n");
    }
}
class Smartphone extends Phone{
    public void demoMethod(){
        System.out.println("I am B class method !");
    }
    public void bye(){
        System.out.println("I am B class method bye , Hello !\n");
    }
}
public class J94_dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj=new Smartphone(); // it's allow when referance(Phone obj) belong to super class and object(new Smartphone()) belongs to subclass -> superclass referance = sub class object , but revese not allow -> Smartphone obj=new Phone(); error
        obj.demoMethod(); // demoMethod is override . means smartphone method run (meann override mrthod ko jorkar keval refeance class ke method call hoke) smartphone me kewr phone ke feature avaliable he baki not avaliable
        obj.hello();
        // obj.bye(); when we use dynamic method dispatch then only referance class method allow to invoke(only referance class method allow)
    }
}
