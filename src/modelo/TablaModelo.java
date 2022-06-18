/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caro_Z
 */

    public class TablaModelo extends DefaultTableModel {
    private Object Titulos[];
    private int filas;

    public TablaModelo(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
        this.Titulos=columnNames;
        this.filas=rowCount;
    }

 
    
    
}

