// import java.util.*;
// public class recursion{
//     public static void printnumb(int n) {
//     if(n==6){
//         return;
//     }
//     System.out.println(n);
//     printnumb(n-1);
// }
// public static void main(String args[]){
//     int n=5;
//     printnumb(n);//n=5
// }
// }


// import java.util.*;
// public class recursion{
//     public static void printSum(int i,int n,int sum) {
//     if(i == n){
//         sum +=i;
//         System.out.println(sum);
//         return;
//     }
//     sum +=i;
//     printSum(i+1,n,sum);
// }
// public static void main(String args[]){
//     printSum(1,5,0);
// }
// }



// import java.util.*;
// public class recursion{
//     public static int calcfactorial(int n) {
//     if(n==1 || n==0){
//         return 1;
//     }
//     int fact_nm1 = calcfactorial(n-1);
//     int fact_n = n * fact_nm1;
//     return fact_n;
// }
// public static void main(String args[]){
//     int n=5;
//     int ans =calcfactorial(n);
//     System.out.println(ans);
// }
// }


//FIBONACCI series
// import java.util.*;
// public class recursion{
//     public static void printfibo(int a,int b,int n) {
//         if(n==0){
//             return;
//         }
//     int c =a +b;
//     System.out.println(c);
//     printfibo(b,c,n-1);
// }
// public static void main(String args[]){
//     int a=0,b=1;
//     System.out.println(a);
//     System.out.println(b);
//     int n=7;
//     printfibo(a, b, n-2);
// }
// }


//Print x^n(stack height=n)

import java.util.*;
public class recursion{
    public static int calculatepow(int x,int n) {
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
       if(n%2==0){
        return calculatepow(x, n/2)*calculatepow(x, n/2);
       }
       else{
        return calculatepow(x, n/2)*calculatepow(x, n/2)*x;
       }

    
}
public static void main(String args[]){
    int x=2,n=5;
    int ans=calculatepow(x, n);
    System.out.println(ans);
}
}