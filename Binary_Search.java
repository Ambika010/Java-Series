// This is a binary search program without using the concept of recursion
import java.util.*;
public class Binary_Search {
    public static int binarySearch(int arr[],int key){
        int x = arr.length;
        int start = 0;
        int end = x-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){ //at a point of time this condition will be true (when there will be only that element left which is to be searched and that element alone will be start=end=mid)
                return mid;
            }
            if(arr[mid]>key){
                end = mid-1; //this updates the end as the first half(start remains the same) needs to be checked to search the element
            }
            else{
                start = mid+1; //this updates the start as the second half(end remains the same) needs to be checked to search the element
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of sorted array : ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int key=sc.nextInt();
        int index = binarySearch(array, key);
        if(index==-1){
            System.out.println("element is not present in the array");
        }else{
            System.out.println("Element found at index : "+index);
        }
    }
}
