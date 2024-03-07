/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package find.the.missing.side;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author PP
 */
public class FindTheMissingSide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first segment: ");
        String fsegment = s.nextLine();
        System.out.println("Enter first length: ");
        double flength = s.nextFloat();
        s.nextLine();
        System.out.println("Enter second segment: ");
        String ssegment = s.nextLine();
        System.out.println("Enter second length: ");
        double slength = s.nextFloat();
        s.nextLine();
        String tsegment;
        double tlength = 0;
        if (fsegment.equals("AB") || fsegment.equals("BC") && (ssegment.equals("AB") || ssegment.equals("BC"))) {
            tsegment = "AC";
            tlength = Math.sqrt(Math.pow(flength, 2) + Math.pow(slength, 2));
            System.out.printf("%s %.0f", tsegment, tlength);
        }
        else if ((fsegment.equals("AC") || fsegment.equals("BC")) && ((ssegment.equals("AC") || ssegment.equals("BC")))) {
            tsegment = "AB";
            if(fsegment.equals("AC")){
                tlength = Math.sqrt(Math.pow(flength, 2) - Math.pow(slength, 2));
            }
            if(ssegment.equals("AC")){
                tlength = Math.sqrt(Math.pow(slength, 2) - Math.pow(flength, 2));
            }
            System.out.printf("%s %.0f", tsegment, tlength);
        }
        else if ((fsegment.equals("AC") || fsegment.equals("AB")) && ((ssegment.equals("AC") || ssegment.equals("AB")))) {
            tsegment = "BC";
            if(fsegment.equals("AC")){
                tlength = Math.sqrt(Math.pow(flength, 2) - Math.pow(slength, 2));
            }
            if(ssegment.equals("AC")){
                tlength = Math.sqrt(Math.pow(slength, 2) - Math.pow(flength, 2));
            }
            System.out.printf("%s %.0f", tsegment, tlength);
        }
    }

}
