//GET BIT
// import java.util.*;
// public class bits{
//     public static void main(String args[]) {
//         int n=5;//0101
//         int pos=2;
//         int bitMask = 1<<pos;

//         if((bitMask & n)==0){
//             System.out.println("bit was zero");
//         }else{
//             System.out.println("bit was one");
//         }
//     }
// }


//SET BIT
// import java.util.*;
// public class bits{
//     public static void main(String args[]) {
//         int n=5;//0101
//         int pos=2;
//         int bitMask = 1<<pos;

//         int newnumber = bitMask | n ;
//         System.out.println(newnumber);
//     }
// }


//CLEAR BIT
// import java.util.*;
// public class bits{
//     public static void main(String args[]) {
//         int n=5;//0101
//         int pos=2;
//         int bitMask = 1<<pos;
//         int notbitmask = ~(bitMask);

//         int newnumber=notbitmask & n;
//         System.out.println(newnumber);
//     }
// }

//UPDATE BIT
import java.util.*;
public class bits{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        //oper=1:set oper=0:clear
        int n=5;//0101
        int pos=1;
        
        int bitMask = 1<<pos;
        if(oper==1){
        int newnumber=bitMask | n;
        System.out.println(newnumber);
        }else{
        //clear
        int newbitmask=~(bitMask);
        int newnumber=newbitmask & n;
        System.out.println(newnumber);
        }

        
    }
}