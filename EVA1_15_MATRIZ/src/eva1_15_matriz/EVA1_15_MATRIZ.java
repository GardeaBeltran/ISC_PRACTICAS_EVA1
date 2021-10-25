/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_matriz;

/**
 *
 * @author Ximena Hernandez
 */
public class EVA1_15_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un arreglo de dos dimensiones 5 filas X 3 columnas
        int iMatriz[][]= new int [5][3];
        //ACCEDER A UN ELEMENTO
        iMatriz[0][0]= 1000;//PRIMER POSICION
        iMatriz[4][2]= 2000;//ULTIMA POSICION
        System.out.println("TAMAÑO DEL ARREGLO: " + iMatriz.length);
        
        for (int i = 0; i <iMatriz.length; i++) {//FILAS
            for (int j = 0; j < 3; j++) {
                iMatriz[i][j]=1000;
            }
                
            }
        //CICLO X CACDA DIMENSION
        //CICLOS ANIDADOS ( CICLO DENTRO DE OTRO CICLO)
        for (int i = 0; i <iMatriz.length; i++) {//FILAS
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + iMatriz[i][j] + "]");
        }
            System.out.println("");
    }
    
    }
}
