import java.util.*;
class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            int r = i;
            int space = row-i;
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(r);
                r=r-1;
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}