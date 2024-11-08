import java.util.*;
public class stringbuild {
    public static void main(String args[]) {
        StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
         sb.setCharAt(0, 'P');
         System.out.println(sb);

         //insert
         sb.insert(2,'n');
         System.out.println(sb);

         //delete
         sb.delete(2, 3);
         System.out.println(sb);

        
        //REVERSE THE STRING
        //  for(int i=0;i<sb.length()/2;i++){
        //     int front=i;
        //     int back=sb.length()-1-i;
        //     char frontchar=sb.charAt(front);
        //     char backchar=sb.charAt(back);

        //     sb.charAt(front,backchar);
        //     sb.charAt(back,frontchar);
        //  }
        //  System.out.println(sb);
    }
}
