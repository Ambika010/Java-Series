import java.util.*;
class P_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            int r=row;
            int s=n-row;
            for(int space=1;space<=s;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print(r);
                r=r+1;
            }

            System.out.println();
        }
    }
}
