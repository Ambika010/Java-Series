import java.util.*;
class P_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            int row = i;
            for(int j=1;j<=i;j++){
                System.out.print(row);
                row = row - 1;
            }
            System.out.println();
        }
    }
}