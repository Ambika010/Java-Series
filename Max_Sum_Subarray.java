//Brute force approach
import java.util.*;
public class Max_Sum_Subarray{
    public static void printSubarrays(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int sum=0;
                for(int k=start;k<=end;k++){ //calculate the sum of subarrays
                    sum=sum+arr[k];
                }
                System.out.print("Sum = "+sum);
                System.out.println();
                if(maxSum<sum){ //compares each sum and prints the maximum out of it
                    maxSum=sum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum Sum = "+maxSum);
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
        System.out.println("Sum of all possible subarrays : ");
        printSubarrays(array);
    }
}
