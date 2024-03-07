/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.sort;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PP
 */
public class StringSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        System.out.println("Enter count of words: ");
        int count = s.nextInt();
        s.nextLine();
        for(int i = 0; i <count; i++){
            System.out.println("Enter next word: ");
            String word = s.nextLine();
            list.add(word);
            
        }
        Collections.sort(list, (a,b)->Integer.compare(a.length(), b.length()));
        for(String i: list){
            if(list.indexOf(i)==list.size()-1)
                System.out.print(i);
            else System.out.print(i + " ");
        }
    }
    
}
