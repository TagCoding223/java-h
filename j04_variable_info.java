/**
 * @author V.C22.3
 * @version 0.1
 */
public class j04_variable_info {
    public static void main(String[] args) {
        //defualt value of datatypes
        /* 
        byte a;//0
        short b;//0
        int c;//0
        float d;//0.0f,by default float is double but we initialized float a=45.5f then it will a float
        double e;//0.00000
        char f;//'\0'
        boolean g;//true
        lon w=2672;->it is not a long it is a integer literals if we want to create long then need to write l L ,EXAMPLE it below
        */
        /*System.out.println("byte default value is : "+(a));
        System.out.println("short default value is : "+(b));
        System.out.println("int default value is : "+(c));
        System.out.println("float default value is : "+(d));
        System.out.println("double default value is : "+(e));
        System.out.println("char default value is : "+(f));
        System.out.println("boolean default value is : "+(g));*/
        //you cannot print default value
        //long a=837777748399938;->throw a error:interger number too large
        long a=837777748399938L;
        //long a=837777748399938l;
        System.out.println(a);
    }

}
