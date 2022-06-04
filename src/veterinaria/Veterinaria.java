/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import controlador.ClienteData;
import controlador.MascotaData;
import controlador.TratamientoData;
import java.util.List;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Mascota;
import modelo.Tratamiento;

/**
 *
 * @author salva
 */
public class Veterinaria {

    private static Conexion conexion;
    private static ClienteData ClienteData;
    private static TratamientoData td;

    private static MascotaData MascotaData;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion = new Conexion();
        ClienteData = new ClienteData(conexion);
        td = new TratamientoData(conexion);

        Tratamiento tdd1 = new Tratamiento("cirugia", "corte", "pildoras", 12389, true);
        Tratamiento tdd2 = new Tratamiento("baño", "masajes", "pildoras", 12389, true);
        td.agregarTratamiento(tdd1);
        td.agregarTratamiento(tdd2);
        td.eliminarTratamiento(1);
        td.tratamientoExiste(2);
        td.buscarTratamiento(2);
        td.activarTratamiento(1);
        
        
        List<Tratamiento> list = td.listarTratamientos();

       /* Cliente cl = new Cliente(39, "Maxi", "Gonzalez", "santaRosa", 2665, "2554", true);
        Cliente c2 = new Cliente(39, "Mario", "Gomez", "santaRosa", 2665, "2554", true);
        //  Mascota m1 = new Mascota();
        ClienteData.agregarCliente(cl);
        ClienteData.agregarCliente(c2);
        ClienteData.eliminarCliente(1);
        */
    }

}
