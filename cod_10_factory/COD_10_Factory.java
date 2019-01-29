/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_10_factory;

/**
 *
 * @author fsancheztemprano
 */
public class COD_10_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dialogo dialogo1 = Dialogo.crearDialogo(Dialogo.Tipo.CONSOLA);
        dialogo1.mostrar("Msg por consola");
        
        Dialogo dialogo2 = Dialogo.crearDialogo(Dialogo.Tipo.VENTANA);
        dialogo2.mostrar("Msg por ventana");
    }
    
}
