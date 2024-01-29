import java.util.*;
class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            int space = row-i;
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}