import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for(i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum = "+max);
    }
}
