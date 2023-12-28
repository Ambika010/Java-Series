import java.util.*;
class Factorial {
    public static void main(String[] args){
    //prints factorial of n numbers
    /*int i,n,fac=1;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    for(i=1;i<=n;i++){
        fac = fac*i;
    }
    System.out.println(fac);
    */


    //prints even no. from 1 to N and calculates their sum
    Scanner sc = new Scanner(System.in);
    System.out.print("enter n=");
    int n = sc.nextInt();
    int sum=0 ;
    for(int i=1;i<=n;i++){
        if(i%2==0){
            System.out.println(i);
            sum=sum+i;
        }
    }
    System.out.println(sum);
    }
}
