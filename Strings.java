import java.util.*;
public class Strings {
    public static void main(String args[]) {
        //string declaration
        // String name="tony";
        // String fullname="tony stark";
        // String sentence="my name is tony stark";
        
        
        // Scanner sc=new Scanner(System.in);
        // String name= sc.nextLine();
        // System.out.println("your name is :"+name);


        //concatenation
        // String firstname="ayush";
        // String lastname=" jaiswal";
        // String fullname=firstname + lastname;
        // System.out.println(fullname);
        // //
        // System.out.println(fullname.length());
        // //
        // for(int i=0;i<fullname.length();i++){
        //     System.out.println(fullname.charAt(i));
        // }



        //comparison of strings
        // if(firstname.compareTo(lastname)==0){
        //     System.out.println("strings are equal");
        // }else{
        //     System.out.println("strings are not equal");
        // }


        //substrings
        String sentence="my name is tony";
        
        String name=sentence.substring(0,4);
        System.out.println(name);

        //NOTES-strings are immutable
     
    }
}
