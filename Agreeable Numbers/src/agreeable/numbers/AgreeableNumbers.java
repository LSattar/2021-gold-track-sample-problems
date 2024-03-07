package agreeable.numbers;
import java.util.Scanner;
import java.util.ArrayList;

public class AgreeableNumbers {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers separated by a space:");
        String str = s.nextLine();
        String[] strs = str.split(" ");
        int[] nums = new int[]{Integer.parseInt(strs[0]), Integer.parseInt(strs[1])};
        int fdivisortotal = 0;
        int sdivisortotal = 0;
        for(int i = 1; i<= nums[0]/2; i++){
            if(nums[0]%i == 0)
                fdivisortotal += i;
        }
        for(int i = 1; i<= nums[1]/2; i++){
            if(nums[1]%i == 0)
                sdivisortotal += i;
        }
        if(fdivisortotal == nums[1] || sdivisortotal == nums[0])
            System.out.println("Agreeable numbers");
        else
            System.out.println("Not agreeable numbers");
    }
    
}
