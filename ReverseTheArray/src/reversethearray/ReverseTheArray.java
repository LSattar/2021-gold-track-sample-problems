/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversethearray;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author PP
 */
public class ReverseTheArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter count, integers separated by a space:");
        String str = s.nextLine();
        ArrayList<Integer> answer = new ArrayList();
        String[] strs = str.split(" ");
        ArrayList<Integer> ints = new ArrayList();
        for (String str1 : strs) {
            ints.add(Integer.parseInt(str1));
        }
        for(int i = 1; i<ints.size(); i++){
            answer.add(ints.get(i));
            Collections.reverse(answer);
        }
        for(int i: answer){
            if(answer.indexOf(i)==answer.size()-1)
                System.out.print(i);
            else System.out.print(i + " ");
        }
    }
    
}
