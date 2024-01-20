import java.util.*;
class P_15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //diamond always contains odd number of rows
        System.out.print("no. of rows(odd nos only) : ");
        int r = sc.nextInt();
        int mid_row = (r+1)/2;

        //upper half of diamond i.e. till the middle row
        for(int i=1;i<=mid_row;i++){
            int s = mid_row-i;
            for(int space=1;space<=s;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half of diamond i.e. after the middle row
        for(int i=1;i<=(mid_row-1);i++){
            int s = i;
            for(int space=1;space<=s;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*(mid_row-i))-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
