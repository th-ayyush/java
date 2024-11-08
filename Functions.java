// import java.util.*;
// public class Functions {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);//call kiya function ne 
//     }
// }



// import java.util.*;
// public class Functions {
//     public static int calculateSum(int a,int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         int sum = calculateSum(a,b);
//         System.out.println("sum of 2 numbers is:"+sum); 
//     }
// }



// import java.util.*;
// public class Functions {
//     public static int calculateProduct(int a,int b){
//         return a*b;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         System.out.println("products of 2 numbers is :"+calculateProduct(a,b));
//     }
// }



import java.util.*;
public class Functions {
    public static void printFactorial(int n){
        int factorial = 1;
        
        for(int i=n; i>=1;i--){
            factorial = factorial +i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);//call kiya function ne 
    }
}