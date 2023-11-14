import java.util.*;
public class LinearSearchStringArray {
    public static int linearSearchInString(String a[],String x){
        for(int j=0;j<a.length;j++){  //In Java, .equals() method to compare the content of strings should be used instead of == 
            if(a[j].equals(x)){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        String arr[]=new String[size];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.next();
        }
        System.out.print("Enter the element to search : ");
        String x=sc.next();
        int index = linearSearchInString(arr, x);
        if(in==-1){
            System.out.println("element is not present in the array");
        }else{
            System.out.println("Element found at index : "+index);
        }
    }
}
