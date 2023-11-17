import java.util.*;
public class All_Pairs_in_Array {
    public static void arrayPairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            for(int j=i+1;j<arr.length;j++){
                int cur = arr[j];
                System.out.print("("+current+","+cur+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total no. of possible pairs : "+tp);
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
        System.out.println("All Possible Pairs in the given Array : ");
        arrayPairs(array);
    }
}
