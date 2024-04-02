/**
 * @author V.C22.3
 * @version 0.1
 */
public class j49_array_intro {
    public static void main(String[] args) {
        // Introduction of arrays
        // step 1:
        // int []arr;
        // arr=new int[4];
        // step 2:
        // int [] arr=new int[4];
        // arr[0]=112;
        // arr[1]=27;
        // arr[2]=98;
        // arr[3]=12;
        // step 3:
        int [] arr={23,43,33,54};
        System.out.println(arr[3]);
        System.out.println(arr.length);
        int [] arr1=new int[4];
        arr1=arr.clone();
        System.out.println(arr1[2]);
        System.out.println("Element on arr : ");
        for(int i=0;i<4;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nElement on arr1 : ");
        for(int i=0;i<4;i++){
            System.out.print(arr1[i]+"\t");
        }

        //string array
        // String [] strArr=new String[4];
        // strArr[0]="hello";
        // strArr[1]="guys";
        // strArr[2]="i am";
        // strArr[3]="vishal";
         String [] strArr={"hello","guys","i am","vishal"};
        System.out.println("\nElement on strArr : ");
        for(int i=0;i<4;i++){
            System.out.print(strArr[i]+" ");
        }

        System.out.println();
        // print arrays items in reverse order
        for(int i=3;i>=0;i--){
            System.out.print(strArr[i]+" ");
        }
    }
}
