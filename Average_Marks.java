import java.util.*;
public class Average_Marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name as a single character : ");
        char ch = sc.next().charAt(0);
        System.out.println("enter marks in 3 subjects:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(ch+"'s avg marks = "+avg);
    }
}
