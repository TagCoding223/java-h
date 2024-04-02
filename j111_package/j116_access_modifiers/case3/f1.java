package pack1;
/**
 * @title sub class access modifier demo
 * @author V.C22.3
 * @version 0.1
 */
public class f1 {
    public void showPublic(){
        System.out.println("Public method !");
    }
    protected void showProtected(){
        System.out.println("Protected method !");
    }
    void showDefault(){
        System.out.println("Defualt method !");
    }
    private void showPrivate(){
        System.out.println("Private method !");
    }
}
