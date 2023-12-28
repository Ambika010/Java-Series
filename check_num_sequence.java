import java.util.*;
class check_num_sequence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N=");
        int n = sc.nextInt();
        boolean isDec=true;
        int count=2;
        System.out.println("Enter "+n+" numbers : ");
        int previous=sc.nextInt();
        while(count<=n){
            int current = sc.nextInt();
            if(current==previous){
                System.out.println("False");
                return;
            }
            if(current<previous){
                if(isDec==false){
                    System.out.println("False");
                    return;
                }
            }
            else{
                if(isDec==true){
                    isDec=false;
                }
            }
            previous=current;
            count++;
        }
        System.out.println("True");
    }
}