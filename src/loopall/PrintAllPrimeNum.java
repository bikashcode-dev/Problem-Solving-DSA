package loopall;

import java.util.Scanner;

public class PrintAllPrimeNum {
    public static void main(String [] age){
        System.out.print("Enter the range n :");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        for (int i = 2 ; i <= n; i++){
            if ( printAllPrime(i)){
                System.out.print("," + i);
            }
        }
    }
    public static boolean printAllPrime(int n){
        if ( n == 0)
            return false;
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
}
