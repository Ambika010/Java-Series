import java.util.*;
public class Linear_Search {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1; 
        // -1 is returned in case when element is not found in the array
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int key=sc.nextInt();
        int index = linearSearch(array, key);
        if(index==-1){
            System.out.println("element is not present in the array");
        }else{
            System.out.println("Element found at index : "+index);
        }
    }
}
