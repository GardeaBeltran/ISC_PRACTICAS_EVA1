/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_promedios;

import java.util.Scanner;

/**
 *
 * @author Ximena Hernandez
 */
public class EVA1_18_PROMEDIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int [][] aiGrupos;
        //PREGUNTA AL USUARIO LOS GRUPOS
        System.out.println("¿Cuantos grupos son?");
        int iNoGrupos = input.nextInt();
        
        aiGrupos = new int[iNoGrupos][];
        for (int i = 0; i < aiGrupos.length; i++) {
            System.out.println("para el grupo: "+ i + "¿Cuantos estudiantes son?");
            int iNoEstu = input.nextInt();
            aiGrupos[i] = new int [iNoEstu];
        }
            //VAMOS A PREGUNTAR LAS EDADES
            for (int i = 0; i < aiGrupos.length; i++) {
                for (int j = 0; j < aiGrupos[i].length; j++) {
                    System.out.print("[" + "]");
                }
                System.out.println("");
            }
         
    } 
    
}
