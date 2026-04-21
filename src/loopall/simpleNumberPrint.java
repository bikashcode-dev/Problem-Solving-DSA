package loopall;

import java.util.Scanner;

public class simpleNumberPrint {
    public static void main(String[]ag){
        System.out.println("Enter a Number to print Table :");
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i=0; i<=10; i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
