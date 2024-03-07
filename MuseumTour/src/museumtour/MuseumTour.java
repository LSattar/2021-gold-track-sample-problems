/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package museumtour;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author PP
 */
public class MuseumTour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows then columns:");
        int rows = s.nextInt()-1;
        int columns = s.nextInt()-1;
        s.nextLine();
        System.out.println("Enter starting room (row then column):");
        int startrow = s.nextInt();
        int startcolumn = s.nextInt();
        int srow = startrow;
        int scolumn = startcolumn;
        s.nextLine();
        System.out.println("Enter instructions:");
        String str = s.nextLine();
        String[] strs = str.split(" ");
        int[] instructions = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            int value = Integer.parseInt(strs[i]);
            instructions[i] = value;
        }
        ArrayList<String> foundrooms = new ArrayList();
        /*
        1 = south
        2 = east
        3 = north
        4 = west
        */
        int orientation;
        if(startrow == 0)
            orientation = 1;
        else if(startrow==rows)
            orientation = 3;
        else if(startcolumn ==0)
            orientation = 2;
        else
            orientation = 4;
        int index = 0;
        boolean solved = false;
        int lastinst = 5;
        int count = 0;
        int inst;
        while(instructions[index]!= 99){
            inst = instructions[index];
            if(inst == lastinst){
                count++;
            }
            else
                count = 0;
            if(count == 2){
                System.out.println("visited same room more than once");
                solved = true;
            }
            {
            if(instructions[index]== 0){
                if(orientation == 1)
                    startrow = startrow + 1;
                else if(orientation ==2)
                    startcolumn = startcolumn +1;
                else if(orientation ==3)
                    startrow = startrow -1;
                else if(orientation ==4)
                    startcolumn = startcolumn -1;
            }
            if(instructions[index]==1){
                if(orientation == 1){
                    startcolumn = startcolumn -1;
                    orientation = 4;
                }
                else if(orientation ==2){
                    startrow = startrow + 1;
                    orientation =1;
                }
                else if(orientation ==3){
                    startcolumn = startcolumn + 1;
                    orientation =2;
                }
                else if(orientation ==4){
                    startrow = startrow-1;
                    orientation = 3;
                }
            }
            if(instructions[index]==2){
                if(orientation == 1){
                    startcolumn = startcolumn + 1;
                    orientation = 2;
                }
                else if(orientation ==2){
                    startrow = startrow - 1;
                    orientation = 3;
                }
                else if(orientation ==3){
                    startcolumn = startcolumn - 1;
                    orientation = 4;
                }
                else if(orientation ==4){
                    startrow = startrow + 1;
                    orientation = 1;
                }
            }
        }
        lastinst = instructions[index];
        String found = String.valueOf(startrow)+ " " + String.valueOf(startcolumn);
        int ind = foundrooms.indexOf(found);
        if(ind != -1){
            System.out.println("visited same room more than once");
            solved = true;
            break;
        }
        foundrooms.add(found);
        /* DEBUGGING
        System.out.println(instructions[index]);
        System.out.println("row: " + startrow);
        System.out.println("column: " + startcolumn);
        */
        if((startcolumn > columns || startcolumn < 0)||(startrow > rows || startrow < 0)){
            if(index != instructions.length-2)
            System.out.println("left building before tour was over");
            else
                System.out.println("successful tour");
            solved = true;
            break;
        }
        index++;
        }
        
        if(solved == false){
            System.out.println("tour ended before leaving building");
        }

    }
    
}
