import java.util.*;
public static void printnumb(int n) {
    if(n==0){
        return;
    }
    System.out.println(n);
    printnumb(num-1);
}
public static void main(String args[]){
    int n=5;
    printnumb(n);//n=5
}
