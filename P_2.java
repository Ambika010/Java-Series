import java.util.*;
class P_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int r = sc.nextInt();
        int value=1;
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(value+"\t");
        //         value=value+1;
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=r;i++){
            int s = r-i;
            for(int space=1;space<=s;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(value);
                value=value+1;
            }
            System.out.println();
        }
    }
}
