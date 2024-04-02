/**
 * @author V.C22.3
 * @version 0.1
 * @title string methods
 */
public class j19_string_methods {
    public static void main(String[] args) {
        //string methods
        String name="Vishal";
        System.out.println("Length of string (my vscode index start with 1) "+name.length());//show the length of string
        System.out.println("String in lower case "+name.toLowerCase());
        System.out.println("String in upper case "+name.toUpperCase());
        name="    Vishal     ";
        System.out.println("Make same change on string "+name);
        System.out.println("String after using trim "+name.trim());
        name="Vishal";
        System.out.println("Substring with start index "+name.substring(3));
        System.out.println("Substring with start and end index "+name.substring(3,5));
        System.out.println("Replace character "+name.replace('a','e'));
        // System.out.println(name.replace("el","al love")); not return acpected result becuase, line 14 does not change origanl string just print if i am write name=name.replace('a','e') then it works
        // System.out.println(name);
        System.out.println("Replace string "+name.replace("al","al love"));//char,string not allow means -> replace('a',"hello")
        System.out.println("Startswith "+name.startsWith("Vi"));
        System.out.println("Startswith "+name.startsWith("vi"));
        System.out.println("Endswith"+name.endsWith("l"));
        System.out.println("Endswith "+name.endsWith("sd"));
        System.out.println("Charat "+name.charAt(2));
        System.out.println("index of "+name.indexOf('s'));
        System.out.println("indexof "+name.indexOf("ha"));
        name="VishalVishal";
        System.out.println(name.indexOf('a',5));//traverse forword
        System.out.println(name.lastIndexOf("l",8));//traverse backward
        System.out.println(name.equals("VishalVishal"));
        System.out.println(name.equals("Vishalvishal"));
        System.out.println(name.equalsIgnoreCase("vishalvishal"));

    }
}
