//prefix array approach
import java.util.*;
public class Max_Sum_Subarray_2nd_sol{
    public static void printSubarrays(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix_array[] = new int[arr.length];
        prefix_array[0] = arr[0]; //0th index value remains same
        //start the loop from i=1 as 0th index has been defined
        for(int i=1;i<prefix_array.length;i++){
            prefix_array[i] = prefix_array[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int sum = (start == 0) ? prefix_array[end] : prefix_array[end] - prefix_array[start-1]; //ternary operator
                System.out.print("Sum = "+sum);
                System.out.println();
                if(maxSum<sum){   //compares each sum and prints the maximum out of it 
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