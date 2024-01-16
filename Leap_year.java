import java.util.*;
public class Leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a year : ");
        int y=sc.nextInt();
        boolean x = (y%4)==0;
        boolean w = (y%100)!=0;
        boolean z = ((y%100 == 0)&&(y%400==0));
        if(x && (w || z)){
            System.out.println("LEAP YEAR");
        } else{
            System.out.println("NOT A LEAP YEAR");
        }
    }
}