//print prime number from 1 to N
import java.util.*;
public class N_Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean r = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    r = false;
                    break;
                }
            }
            if(r==true){
                System.out.print(i+" ");
            }
        }
    }
}
