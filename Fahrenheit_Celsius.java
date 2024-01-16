import java.util.*;
public class Fahrenheit_Celsius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Start Fahrenheit value = ");
        int s = sc.nextInt();
        System.out.print("End Fahrenheit value = ");
        int e = sc.nextInt();
        System.out.print("interval value = ");
        int w = sc.nextInt();
        int cel;
        int i=s;
        while(i<=e){
            cel=(int)((i-32)*5/9);
            System.out.println(i+"\t"+cel);
            i=i+w;
        }
    }
}
