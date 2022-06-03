/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import modelo.Conexion;

/**
 *
 * @author Manuel Belgrano Nº3
 */
public class MascotaData {
    
    private Connection con = null;
    private String sql;
    
    public MascotaData(Conexion conexion){
        con = conexion.getConexion();
    }
}
