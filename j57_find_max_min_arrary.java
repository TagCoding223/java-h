/**
 * @author V.C22.3
 * @version 0.1
 */
public class j57_find_max_min_arrary {
    public static void main(String[] args) {
        // find max and min value in array
        // Question for you try it with foreach loop
        int []arr={12,52,445,45,1078,65,4,68,43,452,711,555,36,47,9};
        // System.out.println(Integer.MAX_VALUE);

        // max value in array
        int maxV=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1]){
                if(arr[i]>maxV){
                    maxV=arr[i];
                }
            }
            else if(arr[i-1]<maxV){
                continue;
            }
            else{
                maxV=arr[i-1];
            }
        }
        System.out.println("Maximum value in array is : "+maxV);

        //min value in array
        int minV=Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                if(arr[i]<minV){
                    minV=arr[i];
                }
            }
            else if(arr[i-1]>minV){
                continue;
            }
            else{
                minV=arr[i-1];
            }
            i++;
        }
        System.out.println("Minnimum value in array is : "+minV);
    }
}
