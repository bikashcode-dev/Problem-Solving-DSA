package Dsa.aray_all_problem.Arry;
import java.util.Scanner;

public class Secod_largest_number {
    public void main(){

        int arr[]  = new int[10];
        Scanner arry = new Scanner(System.in);
        for(int p=0; p< arr.length-1;p++){
            arr[p] = arry.nextInt();
        }

        int smax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<=arr.length-1; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        for(int j=0; j<arr.length; j++){
            if(smax<arr[j] && arr[j]!=max)smax = arr[j];
        }
        IO.println(smax);
        IO.println(max);

    }
}
