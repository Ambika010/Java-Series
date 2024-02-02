import java.util.*;
class power_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.print("Enter it's power : ");
        int n = sc.nextInt();
        int ans=1;
        while(n>0){
            ans=ans*x;
            n=n-1;
        }
        System.out.println("required answer = "+ans);
    }
}
