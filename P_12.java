import java.util.*;
class P_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int r = sc.nextInt();
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=(r-i+1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i+1);j++){
                System.out.print(r-i+1);
            }
            System.out.println();
        }
    }
}