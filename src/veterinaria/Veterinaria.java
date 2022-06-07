/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import controlador.ClienteData;
import controlador.ConsultaData;
import controlador.MascotaData;
import controlador.TratamientoData;
import java.time.LocalDate;
import java.util.List;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Consulta;
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
    private static ConsultaData cd;
    private static MascotaData mascotaData;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion = new Conexion();
        ClienteData = new ClienteData(conexion);
        td = new TratamientoData(conexion);
        

        Tratamiento tdd1 = new Tratamiento(1,"cirugia", "corte", "pildoras", 12389, true);
        Tratamiento tdd2 = new Tratamiento("baño", "masajes", "pildoras", 12389, true);
        td.agregarTratamiento(tdd1);
//        td.agregarTratamiento(tdd2);
       td.eliminarTratamiento(1);
//        td.tratamientoExiste(2);
      td.buscarTratamiento(1);
        td.activarTratamiento(1);
//        
        
 //       List<Tratamiento> list = td.listarTratamientos();

 //      Cliente cl = new Cliente(1,39, "Maxi", "Gonzalez", "santaRosa", 2665, "2554", true);
 //       Cliente c2 = new Cliente(39, "Mario", "Gomez", "santaRosa", 2665, "2554", true);
  //     Mascota m1 = new Mascota();
//        ClienteData.agregarCliente(cl);
//        ClienteData.agregarCliente(c2);
//        ClienteData.eliminarCliente(1);
//      
       
  //     mascotaData = new MascotaData(conexion);
       
  //   Mascota mas1= new Mascota("Pepita", "Femenino", "ave", "loro", "verde", LocalDate.of(2022, 2, 10), 39, true);
   //  Mascota m3= new Mascota(1, "Pepita", "Femenino", "ave", "loro", "verde", LocalDate.of(2022, 2, 10), 15, true, cl);
//     Mascota mas2= new Mascota(1, "Pepita", "Femenino", "ave", "loro", "verde", LocalDate.of(2022, 2, 10), 15, true);
//       Mascota mas= new Mascota("Whisky", "Mascullino", "Perro", "pichichu", "Blanco", LocalDate.of(2020, 2, 13), 15, true);
//       mascotaData.agregarMascota(mas);
   //    Consulta con= new Consulta(500, LocalDate.of(2022,6,6), m3, tdd1, true, 2.5);
    //   cd= new ConsultaData(conexion);
      
     //3 cd.registrarConsulta(con);
      //8 ok
      
      /*List<Consulta> co =  cd.listarConsultasporMascota(23);
        for(Consulta a: co){
            System.out.println(" "+a.getFechaConsulta()+a.getFechaConsulta()+a.getMascota().getAlias()+a.getTratamiento().getTipoTratamiento());
        }*/
      //2 ok
//        System.out.println(""+ cd.buscarClientePorMascota(35));
      
    /// ok   cd.eliminarConsulta(23, 0);
     //11
    /* List<Consulta> co =  cd.listarConsultasActivas();
        for(Consulta a: co){
            System.out.println("" + a.getFechaConsulta()+a.getIdConsulta()+a.getMascota()+a.getPesoPromedio()+a.getTratamiento().getTipoTratamiento());
        }*/
  
      //12
      /*List<Consulta> co = cd.listarConsultasInactivas(); 
        for(Consulta a: co){
            System.out.println(""+a.getFechaConsulta()+ " "+a.getIdConsulta()+ " "+a.getMascota());
        }
      */
      //4
      /*  cd.modificarConsulta(0, con);
      //5
       
       //1
       cd.listarMascotasPorCliente(0);
       //
     String t= tdd1.getTipoTratamiento();
       cd.listarConsultasPorTratamiento(0, t);
     */
       /* List<Tratamiento> t =cd.listarTratamientosporMascota(25);
        for(Tratamiento tr: t ){
            System.out.println(""+ tr.getIdTratamiento()+" "+tr.getTipoTratamiento()+ " "+tr.getMedicamento());
        }
       */
      
       
    }

}
