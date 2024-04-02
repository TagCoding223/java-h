
import accesspak.demo_pack;

public class subclass_access_modifier {
    public static void main(String[] args) {
        /*
        * case 4 - world level (make file without package but import a package)
        * only public allow 
        */
        demo_pack objModifier=new demo_pack();
        objModifier.show(); // show() method is a public method and class also be a public
        objModifier.a=0;
        // objModifier.b=0; error: b has protected access in demo_pack
        // objModifier.c=0; error: c is not public in demo_pack; cannot be accessed from outside package
        // objModifier.d=0; error: d has private access in demo_pack
        System.out.println();
        objModifier.show();
    }
}
