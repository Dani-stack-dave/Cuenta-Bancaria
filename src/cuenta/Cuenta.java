/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 *
 * @author SAM
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario=new Usuario("Daniel Zúñiga",50000);
        CajeroAutomatico cajero=new CajeroAutomatico();
        cajero.consultarSaldo(usuario);
        cajero.Depositar(usuario,500);
        cajero.retirar(usuario,300);
        cajero.retirar(usuario,100000);
        cajero.consultarSaldo(usuario);
    }
    
}
