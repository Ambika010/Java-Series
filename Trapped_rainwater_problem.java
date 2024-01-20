import java.util.*;
import java.lang.*;
public class Trapped_rainwater_problem {
    public static int trappedWater(int height[]){
        //calculate left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0]=height[0]; //start from LHS
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length-1]=height[height.length-1]; //start from RHS
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int Trapped_water = 0;
        int width = 1;
        for(int i=0;i<height.length;i++){
            //calculate water level
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //calculate total trapped water
            Trapped_water += (waterLevel - height[i]) * width;
        }
        return Trapped_water;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no. of bars : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the heights of the bars : ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Total Trapped Rainwater = "+trappedWater(array));
    }
}
