/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_pasoxaval_pasoxref;

/**
 *
 * @author Ximena Hernandez
 */
public class EVA1_6_PASOXAVAL_PASOXREF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valOrig = 5;
        System.out.println("valOrig en main =" + valOrig);
        incrementa(valOrig);
        System.out.println("ValOrig despues de llamar a incrementa" + valOrig);
        
    }
     
    public static void incremnenta( int val){
        val++;
        System.out.println("Valor en incrementa = " + val);
    }
}
