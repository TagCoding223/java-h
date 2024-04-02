package accesspak;
/*
 * case 4 - world level (make file without package but import a package)
 * only public allow 
 */
public class demo_pack { // if class is not public then if we use this class to import another class then we face error in private , protected or defualt methods and attributes , but if it will be public then easily use only public attributes( like int a ) and methods ( like show() )
    public int a=1;
    protected int b=2;
    int c=3;// default (don't write default keyword)
    private int d=4;
    public void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
