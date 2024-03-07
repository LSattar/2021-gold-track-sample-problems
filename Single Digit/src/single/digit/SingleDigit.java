//Leah Gold #2
package single.digit;

import java.util.Scanner;
import java.lang.Integer;
import static java.lang.Integer.parseInt;
import java.lang.StringBuilder;

/**
 *
 * @author Leah-Laptop
 */
public class SingleDigit {

    public static String singleDigit(String num) {
        StringBuilder str = new StringBuilder("0");
        int testnum = Integer.parseInt(num);
        if (testnum < 10) {
            return num;
        } else {
            String[] chars = num.split("");
            int[] digits = new int[chars.length];
            for (int i = 0; i < chars.length; i++) {
                digits[i] = Integer.parseInt((chars[i]));
            }
            for (int i = 0; i < digits.length - 1; i++) {
                String numchar;
                int addnum = digits[i];
                int nextnum = digits[i + 1];
                int newnum = Math.abs(addnum - nextnum);
                if(newnum > 0){
                    numchar = Integer.toString(newnum);
                    str.append(numchar);
                }
            }
            if(str.length()>1)
                str.deleteCharAt(0);
            singleDigit(str.toString());
        }
        return singleDigit(str.toString());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String n = s.nextLine();
        System.out.println(singleDigit(n));
        

    }

}
