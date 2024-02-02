//check whether a number is prime or not
import java.util.Scanner;
class Prime{
    public static void main(String[] args){
        int i;
        int check=0;
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0){
                check=1;
                break;
            }
        }
        if(check == 1){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime number");
        }
    }
}
