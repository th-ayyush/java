//ques 1
// *****
// *****y
// *****
// *****

//ANS
// import java.util.*;
// public class patterns {
//     public static void main(String args[]){
//         int n=4;
//         int m=5;

//         //outer loop
//         for(int i=1;i<=n;i++){
//             //inner loop
//             for(int j=1;j<=m;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// ques.2
// *****
// *   *
// *   *
// *****

//ANS
// import java.util.*;
//  public class patterns {
//      public static void main(String args[]){
//          int n=4;
//          int m=5;

//         //  outerloop
//         for(int i=1;i<=n;i++){
//             //inner loop
//             for(int j=1;j<=m;j++){
//                 //cell->(i,j)
//                 if(i ==1 || j==1 || i==n || j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//      }
//     }



// QUES.3
// *
// **
// ***
// ****
// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


//QUES.4
//**** 
//*** 
//** 
//* 
// int n=4;
// for(int i=n;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");    
//     }
//     System.out.println();
// }



// QUES.5
//    *
//   **
//  ***
// ****

// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }

//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// QUES.6
// 1
// 12
// 123
// 1234
// 12345

// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j+" ");  
//     }
//     System.out.println();
// }


// QUES.7
// 12345
// 1234
// 123
// 12
// 1


// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i+1;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }


// QUES.8
// 1
// 23
// 456
// 78910
// 1112131415


// int n=5;
// int number=1;
// for(i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(number+" ");
//         number++;
//     }
//     System.out.println();

// }


// QUES.9
// 1
// 01
// 101
// 0101
// 10101

// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         int sum=i+j;
//         if(sum % 2==0){
//             System.out.print("1 ");
//         }
//         else{
//             System.out.printl("0 ")
//         }
//         System.out.println();9
//     }
// }
