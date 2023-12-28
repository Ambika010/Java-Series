import java.util.*;
public class Character_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the required input : ");
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println(1);
        } else if(Character.isLowerCase(ch)){
            System.out.println(0);
        } else{
            System.out.println(-1);
        }
    }
}
