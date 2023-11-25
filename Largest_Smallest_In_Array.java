import java.util.*;
public class Largest_Smallest_In_Array {
    public static int getLargest(int array[]){
        int largest=Integer.MIN_VALUE; // -infinity or the smallest value in the range of integers in java
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }
                return largest;
    }
    public static int getSmallest(int array[]){
        int smallest=Integer.MAX_VALUE; // +infinity or the largest value in the range of integers in java
        for(int i=0;i<array.length;i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        return smallest;
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
        System.out.println("Largest element in the array : "+getLargest(array));
        System.out.println("Smallest element in the array : "+getSmallest(array));
    }
}
