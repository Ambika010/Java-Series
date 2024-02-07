import java.util.*;
class Reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        // System.out.print("Reversed number = ");
        // while(num>0){
        //     int rem = num%10;
        //     System.out.print(rem);
        //     num = num/10;
        // }
        // System.out.println();


        int rev_num=0;
        while(num>0){
            int rem = num%10;
            rev_num=(rev_num)*10+rem;
            num = num/10;
        }
        System.out.println("Reversed number = "+rev_num);
    }
}