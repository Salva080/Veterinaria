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
import vistas.Prueba;

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
        
//         ViewVeterinaria cv= new  ViewVeterinaria();
//      cv.setVisible(true);
      
      //............prueba............//
        Prueba cv= new  Prueba();
        cv.setVisible(true);
//      //............prueba............//
      
      
      
        ClienteData = new ClienteData(conexion);
        td = new TratamientoData(conexion);

        /*........................Tratamiento.........................*/
        Tratamiento tdd1 = new Tratamiento(1, "cirugia", "corte", "pildoras", 12389, true);
        Tratamiento tdd2 = new Tratamiento("baño", "masajes", "pildoras", 444, true);
//        td.agregarTratamiento(tdd1);
//        td.agregarTratamiento(tdd2);
//        td.eliminarTratamiento(1);
//        td.tratamientoExiste(2);
//        td.buscarTratamiento(1);
//        td.activarTratamiento(1);
//        List<Tratamiento> list = td.listarTratamientos();
 /*        List<Tratamiento> list = td.listarTiposDeTratamientos();
         for(Tratamiento tt:list){
             System.out.println(" - "+tt.getTipoTratamiento());
         }
  */          
 /*       List<Tratamiento> list = td.listarTratamientosActivos();
            for(Tratamiento tt:list){
             System.out.println(tt.getIdTratamiento()+"-"+ tt.getTipoTratamiento());
            }
*/
 //               td.modificarTratamiento(18, tdd2);
        /*........................Cliente.........................*/
        Cliente cli = new Cliente(15, 39, "Maxi", "Gonzalez", "santaRosa", 2665, "2554", true);
        Cliente cl2 = new Cliente(39, "Mario", "Gomez", "santaRosa", 2665, "2554", true);
        Mascota ma1 = new Mascota();

        Cliente cl = new Cliente(26, 39, "Maxi", "Gonzalez", "santaRosa", 2665, "2554", true);
        Cliente c2 = new Cliente(15,39, "Mario", "Gomez", "santaRosa", 2665, "2554", true);
        Mascota m1 = new Mascota();
//        ClienteData.agregarCliente(cl);
//        ClienteData.agregarCliente(c2);
//        ClienteData.eliminarCliente(1);
//        ClienteData.eliminarCliente(23);
            
//            System.out.println("" +ClienteData.buscarClientePorDni(33333) );

        /*........................Mascota.........................*/
        mascotaData = new MascotaData(conexion);
        Mascota mas1 = new Mascota(26,"Pepita", "Femenino", "ave", "loro", "verde", LocalDate.of(2022, 12, 1), 39, true, cl,2);
        Mascota m3 = new Mascota(15,"Rodolfo", "Macho", "ave", "aguila", "negro", LocalDate.of(2019, 05, 3), 17, true, c2,23);


//        mascotaData.agregarMascota(mas1);
//        mascotaData.agregarMascota(mas1);// SE DEBE PASAR COMO PARAMETRO UNA MASCOTA SIN ID ,LA CUAL EN EL NEW DE MASCOTA , DEBE RECIBIR UN CLIENTE CON ID (EXISTENTE EN LA BASE)
//        System.out.println("" + mascotaData.buscarMascota(29));
//        mascotaData.eliminarMascota(39);
//        mascotaData.eliminarMascota(35);
//        mascotaData.activarMascotas(39);
//        List<Mascota> masc = mascotaData.listarMascotasActivas();
//        for(Mascota m: masc){
//            System.out.println(m.getIdMascota() + " " + m.getAlias() + " " + m.getSexo() + " " + m.getEspecie() + " " + m.getRaza() + " " + m.getColorPelaje() + " " + m.getFechaNac() + " " + m.isActivo());
//        } 
//        List<Mascota> masco = mascotaData.listarMascotasInactivas();
//        for(Mascota t: masco){
//            System.out.println(t.getIdMascota() + " " + t.getAlias() + " " + t.getSexo() + " " + t.getEspecie() + " " + t.getRaza() + " " + t.getColorPelaje() + " " + t.getFechaNac() + " " + t.isActivo());
//        }
//        mascotaData.modificarMascota(23, m3);
//        System.out.println("" + mascotaData.mascotaExiste(23));
          
            
        /*........................Consulta.........................*/
        Tratamiento tdd3 = new Tratamiento(16, "cirugia", "corte", "pildoras", 12389, true);

        Consulta con = new Consulta(1500, LocalDate.of(2000, 12, 06), m3, tdd3,"dwdra", true, 2.5);
        Consulta cone = new Consulta(23, 500, LocalDate.of(2022, 07, 06), m3, tdd3,"jdñljsaldj", true, 40);
       
        cd = new ConsultaData(conexion);

        Consulta coneee = new Consulta(15, 500, LocalDate.of(2020, 8, 8), m3, tdd1,"dñakdñas", true, 2.5);
        cd = new ConsultaData(conexion);
        
      //  cd.actualizarPesoActual(234, 26.5);
        
     //   cd.promediarPesoPorMascota(23);
     //   cd.modificarConsulta(27, con);
        
        
      /*      
        List<Consulta> coned = cd.promediarPesoPorMascota(23);
        for (Consulta a : coned) {
            System.out.println("id consulta: " + a.getIdConsulta() + " id mascota : " + a.getMascota().getIdMascota() + "  peso prom : " + a.getPesoConsulta()+" kg");

        }
      */
       
        //        ok
       //        cd.registrarConsulta(cone);
        /*      8 ok   
            List<Consulta> co =  cd.listarConsultasporMascota(23);
            for(Consulta a: co){
            System.out.println(" "+a.getFechaConsulta()+a.getFechaConsulta()+a.getMascota().getAlias()+a.getTratamiento().getTipoTratamiento());
   } 
         */
//        2 ok System
//        .out.println("" + cd.buscarClientePorMascota(35));

//        5
//        ok 
//       cd.eliminarConsulta(23, 0);

 /*                List<Consulta> co =  cd.listarConsultasActivas();
        for(Consulta a: co){
            System.out.println(" fecha consulta : " + a.getFechaConsulta()+" id consulta: "+a.getIdConsulta()+" mascota:  " +a.getMascota().getAlias()+" peso consulta:" +a.getPesoPromedio()+" tipo tratamiento :"+a.getTratamiento().getTipoTratamiento());
          }
    */
        
 /*          List<Consulta> cot = cd.listarConsultasInactivas(); 
        for(Consulta a: co){
             System.out.println(" fecha consulta : " + a.getFechaConsulta()+" id consulta: "+a.getIdConsulta()+" mascota:  " +a.getMascota().getAlias()+" peso consulta:" +a.getPesoPromedio()+" tipo tratamiento :"+a.getTratamiento().getTipoTratamiento());
        }
    */        
  
// 1
/*      
         List<Consulta> consult= cd.listarMascotasPorClienteActivo(15);
       for(Consulta c: consult){
           System.out.println("id consulta  "+c.getIdConsulta()+ " id cliente :" +c.getMascota().getCliente().getIdCliente()+ " id mascota: "+c.getMascota().getIdMascota());
       }
*/                
     
  /*    List<Consulta> co = cd.listarConsultasPorTratamiento(16, "");
        for(Consulta a: co){
            System.out.println(a.getFechaConsulta()+" "+a.getIdConsulta()+" "+ a.getTratamiento().getTipoTratamiento()+ " "+a.getMascota().getAlias());
        }
 */ 
        
   /* 
        List<Consulta> consukltas = cd.listarConsultasPorTratamiento(0, "cirugia");
        for(Consulta a: consukltas){
            System.out.println(a.getFechaConsulta()+" "+a.getIdConsulta()+" "+ a.getTratamiento().getTipoTratamiento()+ " "+a.getMascota().getAlias());
        }
    */             
    

  // 10 
  /*  
        List<Tratamiento> t =cd.listarTratamientosporMascota(23);
        for(Tratamiento tr: t ){
            System.out.println(" id Tratamiento : "+ tr.getIdTratamiento()+"-tipo de tratamiento "+tr.getTipoTratamiento()+ "- medicamento: "+tr.getMedicamento()+"  precio :$ "+tr.getPrecio());
        }
 */ 
  
/*   
  
         List<Consulta> t =cd.listarMascotasPorCliente(15);
        for(Consulta tr: t ){
            System.out.println("id consulta "+tr.getIdConsulta()+", id mascota "+tr.getMascota().getIdMascota()+",id cliente "+tr.getMascota().getCliente().getIdCliente() );
                    }
*/
  
//        List<Consulta> conn =cd.listarConsultasporMascota(23);
//             for(Consulta tr: conn ){
//              System.out.println(tr.getIdConsulta()+" fecha : "+tr.getFechaConsulta()+" Mascota "+tr.getMascota().getIdMascota()+" - "+tr.getMascota().getAlias()+" tratamiento :"+tr.getTratamiento().getTipoTratamiento());
//                    }
//  
    }

}
