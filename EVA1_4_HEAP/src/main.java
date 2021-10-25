/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ximena Hernandez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj= new MiClase();
        System.out.println(obj.getMensaje());
        System.out.println(obj);
    }
    
    class MiClase {
    String mensaje;
    public MiClase(){
        mensaje="hola mundo";
    }

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }
    
}
}
