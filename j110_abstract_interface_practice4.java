/** 
 * @Title abstract & interface practice 4
 * @author V.C22.3
 * @version 0.1
*/
interface tvRemote{
    void changeChennal();
}
interface smartTvRemote extends tvRemote{
    void openBrowser();
}
class tv implements tvRemote{
    public void changeChennal(){
        System.out.println("Channel changed !");
    }
    public void openBrowser(){
        System.out.println("Browser is open , now you acces internet !");
    }
}
public class j110_abstract_interface_practice4 {
    public static void main(String[] args) {
        tv objTv=new tv();
        objTv.changeChennal();
        objTv.openBrowser();
    }
}
