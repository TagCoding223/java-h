/**
 * @author V.C22.3
 * @version 0.1
 */
public class j72_avg_setof_num {
    static double sumSetNo(double ...arr){
        int count=0;
        double sum=0;
        for(double i: arr){
            sum=sum+i;
            count++;
        }
        return sum/count;
    }
    public static void main(String[] args) {
        // average of set of numbers passed by arguments
        System.out.println("Average of 20,50,60 (highest marks : 100) : "+sumSetNo(20,50,60));
        System.out.println("Average of 60 (highest marks : 100) : "+sumSetNo(60));
        System.out.println("Average of 50,60 (highest marks : 100) : "+sumSetNo(50,60));
        System.out.println("Average of 10,20,50,60 (highest marks : 100) : "+sumSetNo(10,20,50,60));
        System.out.println("Average of 20,90,80,50,60 (highest marks : 100) : "+sumSetNo(20,90,80,50,60));
        System.out.println("Average of null (highest marks : 100) : "+sumSetNo());        
    }
}
