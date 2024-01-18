import java.util.*;
class P_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int r = sc.nextInt();
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=r;j++){
        //         System.out.print((char)('A'+j-1));
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=r;i++){
        //     char row = (char)('A'+i-1);
        //     for(int j=1;j<=r;j++){
        //         System.out.print(row);
        //         row=(char)(row+1);
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print((char)('A'+i-1));
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=r;i++){
        //     char row = (char)('A'+i-1);
        //     for(int j=1;j<=i;j++){
        //             System.out.print(row);
        //             row=(char)(row+1);
        //         }
        //     System.out.println();
        // }


        for(int i=1;i<=r;i++){
            char row = (char)('A'+r-i);
            for(int j=1;j<=i;j++){
                    System.out.print(row);
                    row = (char)(row+1);
                }
            System.out.println();
        }
    }
}