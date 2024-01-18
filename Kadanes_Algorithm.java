import java.util.*;
import java.lang.*;
public class Kadanes_Algorithm {
    public static void kadanes(int array[]){
        int cur_sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            cur_sum = cur_sum + array[i];
            if(cur_sum<0){
                cur_sum=0;
            }
            maxSum = Math.max(cur_sum, maxSum);
        }
        System.out.println("maximum subarray sum = "+maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        kadanes(array);
    }
}