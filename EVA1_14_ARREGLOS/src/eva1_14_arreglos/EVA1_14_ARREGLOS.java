/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_arreglos;

/**
 *
 * @author Ximena Hernandez
 */
public class EVA1_14_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [] iArreglo = new int[3]; //12 bytes----> 3 enteros X 4 bytes
        System.out.println("Direccion de iArreglo = " + iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        
        //iArreglo[3] = 3; //error ArrayIndexQutOfBround ---> Nos pasamos de los limites del arreglo
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA iArreglo" + i + "= $" + iArreglo[i]);    
        }
        //QUIERO UNA COPIA DE LOS DATOS DE LOS ARREGLOS
        //int [] iCopia = iArreglo;  No funciona
        int [] iCopia = new int [3];
         System.out.println("Direccion de iArreglo = " + iCopia);
         for (int i = 0; i < iArreglo.length; i++) {
            iCopia[i] = iArreglo[i];
        }
         iCopia[0]=10000000;
          for (int i = 0; i < iCopia.length; i++) {
            System.out.println("CUENTA iCopia" + i + "= $" + iCopia[i]);    
        }
          for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA iArreglo" + i + "= $" + iArreglo[i]);    
        }
    }
    
}
