import java.util.*;
class P_13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            int row=i-1;
            int s = r-i;
            for(int space=1;space<=s;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=(i-1);j++){
                System.out.print(row);
                row=row-1;
            }
            System.out.println();
        }
    }
}