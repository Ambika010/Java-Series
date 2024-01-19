import java.util.*;
class P_14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            int row = i;
            int row_1=2*(i-1);
            int s = r-i;
            for(int space=1;space<=s;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(row);
                row=row+1;
            }
            for(int j=1;j<=(i-1);j++){
                System.out.print(row_1);
                row_1=row_1-1;
            }
            System.out.println();
        }
    }
}