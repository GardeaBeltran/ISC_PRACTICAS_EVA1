/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_arreglo_objetos;

import java.util.Scanner;

/**
 *
 * @author Ximena Hernandez
 */
public class EVA1_21_ARREGLO_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona[] aPersonas = new Persona [10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < aPersonas.length; i++) {
            aPersonas[i] = new Persona();
            System.out.println("introduce un nombre ;");
            String nombre = input.nextLine();
             aPersonas[i].setNombre(nombre);
        }
         for (int i = 0; i < aPersonas.length; i++) {
             System.out.println("Nombre: " + aPersonas[i].getNombre());
        }
    }
}
    class Persona{
        private String nombre;

        public String getNombre() {
            return nombre;
        }
 
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
    }

