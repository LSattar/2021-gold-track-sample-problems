/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eliminate.unlucky.numbers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leah-Laptop
 */
public class EliminateUnluckyNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        s.nextLine();
        ArrayList<Integer> unlucky = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            unlucky.add(2 * i + 1);
        }
        int passindex = 3;
        int indexcounter = 2;
        if (n > 1) {
            while (count < n - 1) {
                int startindex = unlucky.size() - (unlucky.size() % passindex);
                for (int i = startindex; i > 1; i--) {
                    if ((i + 1) % passindex == 0 && unlucky.size() > 2066) {
                        unlucky.remove(i);
                    }
                }
                count++;
                if (passindex >= unlucky.size()) {
                    break;
                }
                passindex = unlucky.get(indexcounter);
                indexcounter++;
            }
        }
        System.out.println(unlucky.get(n - 1));

    }

}
