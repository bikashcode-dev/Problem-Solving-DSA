package loopall;

import java.util.Scanner;

public class PrintAllPrimeNum {
   public static void main( String[] args){
    System.out.print("Enter a num 1 and range num : print all prime num :");
    Scanner sc = new Scanner(System.in);

       int lower = sc.nextInt();
       int higher = sc.nexInt();

       for( int x = lower; x <= higher; x++){
           if ( isPrime(x) ) {
              System.out.print("," + x );   
           }
       }
   }
    
    public static boolean isPrime(int isprime){
     if ( isprime <= 1) return false;

        for(int i = 2; i*i<=isprime; i++ ){
            if( isprime % i == 0){
                return false;
            }
        }
        return true;
    }
}
