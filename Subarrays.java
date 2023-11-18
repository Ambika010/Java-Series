import java.util.*;
public class Subarrays{
    public static void printSubarrays(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){ //This loop prints the subarrays
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : "+ts);
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
        System.out.println("All possible subarrays : ");
        printSubarrays(array);
        //an alternative to find the total number of possible subarrays for a given array
        //int total_subarrays = (size*(size+1))/2;
        //System.out.println("total subarrays : "+total_subarrays);
    }
}
