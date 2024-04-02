import java.util.Scanner;
/**
 * @title libaray management system 
 * @author V.C22.3
 * @version 0.3
 */

class library{
    Scanner user=new Scanner(System.in);
    String []booksAvaliable=new String[100];
    String []booksIssued=new String[100];
    //String []booksAvaliable;
    //String []booksIssued;
    String name=null;
    int countA=0;
    int countI=0;
    void bookName(){
        System.out.print("Enter book title : ");
        name=user.nextLine();
    }
    void addBook(){
        boolean flag=true;
        boolean checkBook=true;
        for(int i=0; i<booksAvaliable.length;i++){
            if(name.equalsIgnoreCase(booksAvaliable[i])){
                checkBook=false;
            }
        }
        if(checkBook){
            for (int i = 0;i<booksAvaliable.length; i++) {
                if(booksAvaliable[i]==null){
                    booksAvaliable[i]=name;
                    System.out.println(booksAvaliable[i]+" , Add in library !");
                    flag=false;
                    break;
                }
            }
            if(flag){
                booksAvaliable[countA]=name;
                System.out.println(booksAvaliable[countA]+" , Add in library !");
                countA++;
            }
        }
        else{
        System.out.println("This book is already part of Libaray !");
        }
        name=null;
        System.out.println("\n-----------------------------------");
    }
    void issueBook(){
        boolean flag=true;
        boolean bookNotHere=true;
        String subName=null;
        for(int i=0;i<booksAvaliable.length;i++){
            if(name.equalsIgnoreCase(booksAvaliable[i])){
                subName=booksAvaliable[i];
                booksAvaliable[i]="0";
                bookNotHere=false;
                break;
            }
        }
        if(bookNotHere){
            System.out.println("Book not avaliable in Libaray !");
            return;
        }

        for (int i = 0; i < booksIssued.length; i++) {
            if(booksIssued[i]=="0"){
                booksIssued[i]= subName;
                System.out.println(booksIssued[i]+" , book is issued ! ");
                flag=false;
                break;
            }
        }
        if(flag){
            booksIssued[countI]=subName;
            System.out.println(booksIssued[countI]+" , book is issued ! ");
            countI++;
        }
        name=null;
        System.out.println("\n-----------------------------------");
    }

    void returnBook(){
        boolean flag =true;
        boolean returnBookFlag=false;
        for (int i = 0; i < booksIssued.length; i++) {
            if(name.equalsIgnoreCase(booksIssued[i])){
                returnBookFlag=true;
            }
        }
        if(returnBookFlag){
            for(int i=0;i<booksAvaliable.length;i++){
                if(booksAvaliable[i].equalsIgnoreCase("0")){
                    booksAvaliable[i]=name;
                    System.out.println(booksAvaliable[i]+" , book add in libaray !");
                    flag = false;
                    break;
                }
            }
            if(flag){
                booksAvaliable[countA]=name;
                System.out.println(booksAvaliable[countA]+" , book add in libaray !");
                countA++;
            }
            for (int i = 0; i < booksIssued.length; i++) {
                if(name.equalsIgnoreCase(booksIssued[i])){
                    booksIssued[i]="0";
                }
            }
        }
        else{
            System.out.println("This book is not a part of Libaray !");
        }
        name=null;
        System.out.println("\n-----------------------------------");
    }

    void showAvaliableBooks(){
        boolean flag =true;
        int j=0;
        if(booksAvaliable[0]!=null){
            System.out.println("Avalaible books names in libaray,\n");
            for (int i = 0; i < booksAvaliable.length; i++) {
                if(booksAvaliable[i]==null || booksAvaliable[i]=="0"){
                    continue;
                }
                System.out.println((j+1)+" -> "+booksAvaliable[i]);
                flag=false;
                j++;
            }
        }
        if(flag){
            System.out.println("Books not avaliable in libaray !");
        }
        System.out.println("\n-----------------------------------");
    }

    void showIssueBooks(){
        int j=0;
        boolean flag =true;
        if(booksIssued[0]!=null){
            System.out.println("Issue books names in libaray,\n");
            for (int i = 0; i < booksIssued.length; i++) {
                if(booksIssued[i]==null || booksIssued[i]=="0"){
                    continue;
                }
                System.out.println((j+1)+" -> "+booksIssued[i]);
                flag=false;
                j++;
            }
        }
        if(flag){
            System.out.println("Any book not issue by Libaray !");
        }
        System.out.println("\n-----------------------------------");
    }
}
public class J95_library_management_system {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        int option;
        library bookLibrary=new library();
        System.out.println("What you want ?");
        System.out.println("Option ,\n1->Add Book\t2->Issue Book\n3->Return Book\t4->Show Avaliable Books\n5->Show Issued Books\t6->Exit");
        for (int i = 0; true ; i++) {
            System.out.print("Enter your choice : ");
            option=user.nextInt();
            // user.close(); this new throw thread
            switch (option) {
                case 1:
                    bookLibrary.bookName();
                    bookLibrary.addBook();
                    break;
                case 2:
                    bookLibrary.bookName();
                    bookLibrary.issueBook();
                    break;
                case 3:
                    bookLibrary.bookName();
                    bookLibrary.returnBook();
                    break;
                case 4:
                    bookLibrary.showAvaliableBooks();
                    break;
                case 5:
                    bookLibrary.showIssueBooks();
                    break;
                case 6:
                    System.exit(i);
                default:
                    System.out.println("Given output not support !");
            }
        }
    }
}
// goto , not avaliable in java 
// in this program never use user.close() method 