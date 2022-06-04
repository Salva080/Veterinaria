/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import controlador.ClienteData;
import controlador.MascotaData;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Mascota;

/**
 *
 * @author salva
 */
public class Veterinaria {
    
    private static Conexion conexion;
    private static ClienteData ClienteData;
    private static MascotaData MascotaData;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion = new Conexion();
        ClienteData = new ClienteData(conexion);
        Cliente cl = new Cliente(39,"Maxi","Gonzalez","santaRosa",2665,"2554",true);
      //  Mascota m1 = new Mascota();
      ClienteData.agregarCliente(cl);
      ClienteData.eliminarCliente(1);
      
    }
    
}
