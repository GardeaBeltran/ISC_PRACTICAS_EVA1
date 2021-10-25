/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ximena Hernandez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iVal = Integer.MAX_VALUE;
        System.out.println("Valor mas grande " + iVal);
        iVal +=1;//overflow--> stackoverflow
        System.out.println("Valor mas grande "+ iVal);
        iVal= Integer.MIN_VALUE;
        System.out.println("Valor mas pequeño " + iVal);
    }
    
}
