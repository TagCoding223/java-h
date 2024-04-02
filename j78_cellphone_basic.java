/** 
 * @Title cellphone basic class prcatice
 * @author V.C22.3
 * @version 0.1
 */
class cellphone{
    public void ring(){
        System.out.println("Phone is ringing!");
    }
    public void vibrating(){
        System.out.println("Phone is vibrating!");
    }
}
public class j78_cellphone_basic {
    public static void main(String[] args) {
        cellphone obj=new cellphone();
        obj.ring();
        obj.vibrating();
    }
}
