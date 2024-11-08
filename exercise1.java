//QUES.1

// import java.util.*;
// public class exercise1 {
//     public static int average(int a,int b,int c){
//         return (a+b+c)/3;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();

//         System.out.println("average of 3 numbers is :"+average(a,b,c));

    
//     }
// }


//QUES.2

// import java.util.*;
// public class exercise1 {
//     public static int sumofOdd(int n){
//         int total=0;
//         for(int i=1;i<=n;i+=2){
//             total+=i;
//         }
//         return total;
//     }
//     public static void main(String args[]){
//         int n=10;
//         int sum=sumofOdd(n);

//         System.out.println("the sum of odd numbers from 1 to "+n+"is:"+sum);

    
 //   }
//}



//QUES.3-WRITE A FUNCTION WHICH TAKES 2 NUMBERS AND RETURNS THE GREATER OF TWO
// import java.util.*;
// public class exercise1 {
//     public static int greaterofTwo(int a,int b){
//         if(a>b){
//             return a;
//         }
//         else{
//             return b;
//         }
        
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         System.out.println("the greater of two  numbers is :"+greaterofTwo(a,b));

    
//    }
//}


//QUES.4-WRITE A FUNCTION WHICH TAKES IN THE RADIUS AS INPUT AND RETURN THE CIRCUMFERENCE OF A CIRCLE
// import java.util.*;
// public class exercise1 {
//     public static double circumference1(double radius){
//         return 2*3.14*radius;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         double radius=sc.nextInt();

//         System.out.println("the circumference of circle is :"+circumference1(radius));

    
//     }
// }


//QUES 5-WRITE A FUNCTIONS THAT TAKES IN AGE AS INPUT AND RETURNS IF THAT PERSON IS ELIGIBLE TO VOTE OR NOT.
// import java.text.NumberFormat.Style;
// import java.util.*;
// public class exercise1 {
//     public static boolean voting(int age){
//         return age>=18;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your age:");
//         int age=sc.nextInt();
//         if(voting(age)){
//             System.out.println("you are eligible");
//         }
//         else{
//             System.out.println("you are not eligible");
//         }
//     }
// }



//QUES.6-WRITE AN INFINITE LOOP USING DO WHILE CONDITION
// public class exercise1{
//     public static void main(String args[]){
//         do{
//             System.out.println("this is an infinite loop.press ctrl+c to exit");
//         }
//         while(true);
//     }
// }



//QUES.7-WRITE A PROGRAM TO ENTER THE NUMBERS TILL USER WANTS AND AT THE END IT SHOULD DISPLAY THE COUNT OF POSITIVE,NEGATIVE AND ZEROS ENTERED.
// import java.util.*;
// public class countNumbers{
//     public static void main(String[] args){
//         Scanner scanner=new Scanner(System.in);

//         int positivecount=0;
//         int negativecount=0;
//         int zerocount=0;
        

//         char choice;

//         do{
//             System.out.print("enter a number");
//             int number=scanner.nextInt();
            
//             if(number>0){
//                 positivecount++;
//             }
//         else if(number<0){
//             negativecount++;
//         }else{
//             zerocount++;
//         }
//     System.out.print("do you want to another number");
// choice=scanner.next().charAt(0);
// }while(choice=='y'||choice=='Y');
// System.out.print("count of positive integer number"+positivecount);
// System.out.print("count of negative number"+negativecount);
// System.out.print("count of zero  number"+zerocount);
//     }
// }


//QUES.8TWO NUMBERS ARE ENTERED BY THE USER,X AND N.WRITE A FUNCTION TO FIND THE VALUE OF ONE NUMBER RAISE TO POWER OF ANOTHER NUMBER



//QUES.9GCD OF TWO NUMBERS
// import java.util.*;
// public class exercise1{
//     public static int findgcd(int a,int b){
//         while(b!=0){
//             int temp=b;
//             b=a%b;
//             a=temp;
//         }
//         return a;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2=sc.nextInt();

//         System.out.println("the gcd is:"+findgcd(n1, n2));
//     }
    
// }



//QUES10.FIBONACCI SERIES
import java.util.*;
public class exercise1{
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("fibonacci series:");
        for(int i=0;i<n;i++){
            System.out.println(fibonacci(i)+" ");
        }
    }
}
