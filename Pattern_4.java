import java.util.*;
class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows : ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }    
}