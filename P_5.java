import java.util.*;
class P_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            int s=n-row;
            for(int space=1;space<=s;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=(2*row)-1;col++){
                System.out.print("@");
            }

            System.out.println();
        }
    }
}
