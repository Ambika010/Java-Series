import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("count=");
        int N=sc.nextInt();
        int f1=0,f2=1,f3;
        System.out.print(f1+" "+f2);
        for(int i=2;i<=N;i++){
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
        }
    }
}