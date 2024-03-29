//gives solution for the special case of kadane's algorithm when the all the elements in the array are negative numbers
import java.util.*;
import java.lang.*;
public class special_case_Kadanes {
    public static void kadanes(int arr[]){
        int cur_sum=0;
        int maxSum = Integer.MIN_VALUE;
        boolean allnegative = true;
        for(int i=0;i<arr.length;i++){ //this for loop checks whether all the array elements are negative numbers or not
            if(arr[i]>=0){
                allnegative = false;
                break;
            }
        }
        if(allnegative){
            int min_element=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>min_element){ // Note: using ">" for negative numbers because we're looking for the "most positive" negative number.
                    min_element=arr[i];
                }
            }
            System.out.println("maximum subarray sum = "+min_element);
        }else{
            for(int i=0;i<arr.length;i++){
                cur_sum = cur_sum + arr[i];
                if(cur_sum<0){
                    cur_sum=0;
                }
                maxSum = Math.max(cur_sum, maxSum);
            }
            System.out.println("maximum subarray sum = "+maxSum);
        }
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
