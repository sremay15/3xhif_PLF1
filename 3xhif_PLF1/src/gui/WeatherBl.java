/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcs
 */
public class WeatherBl extends AbstractTableModel{
    
    private ArrayList<Weather> data = new ArrayList();
    private String [] columnnames = {"Place","Sea Level","Temperature","Humidity"};
    
    public void add(Weather w){
        data.add(w);
        fireTableDataChanged();
    }
    
    public void removeRows(int [] rows){
        for(int i = 0; i < rows.length;i++){
            data.remove(rows[i]);
        }
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnnames.length;
    }
    
    @Override
    public String getColumnName(int index){
        return columnnames[index];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Weather w = data.get(rowIndex);
        switch(columnIndex){
            case 0: return ""+w.getPlace();
            case 1: return ""+w.getSealvl();
            case 2: return ""+w.getTemp();
            case 3: return ""+w.getHum();
            default: return "???";
        }
    }
    
}
