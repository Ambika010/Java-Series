import java.util.*;
class Nth_Faibonacci_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n=sc.nextInt();
        int f1=0,f2=1,f3;
        for(int i=0;i<n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        System.out.println("Nth Fibonacci num : "+f1);
    }
}
