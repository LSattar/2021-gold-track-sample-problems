/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package load.rocks;

import java.util.Scanner;

/**
 *
 * @author Leah-Laptop
 */
public class LoadRocks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter weight of rock order: ");
        Scanner s = new Scanner(System.in);
        int weight = s.nextInt();
        int total = 0;
        int count = 0;
        int addbag = 1;
        int firstnumber = 0;
        for(int startbag = 1; startbag < weight; startbag++){
        while(total < weight){
            total = total + addbag;
            addbag++;
            if(total == weight){
                firstnumber = firstnumber + startbag;
                count++;
                total = 1;
            }
            if(total >= weight){
                total = 0;
                break;
            }
        }
        addbag = startbag + 1;
        }
            
        System.out.println(count);
        System.out.println(firstnumber);
    }
}
