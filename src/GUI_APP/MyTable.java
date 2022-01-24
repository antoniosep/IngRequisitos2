package GUI_APP;

import Modelo.DBaccess;
import Modelo.Persona;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyTable extends AbstractTableModel {
    private String[] columnNames = {
            "Nombre", "NIF", "Tipo", ""
    };
    private Object[][] data = {};
    private List<Persona> coleccion = new ArrayList<>();
    private String idEmpresa;

    public MyTable(String idEmpresa){
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    public String getColumnName(int col){
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex){
        data[rowIndex][columnIndex] = value;
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void addRow(Object[] values, Persona persona){
        Object[][] newData = new Object[data.length+1][columnNames.length];
        int i = 0;

        for(Object[] row : data){
            newData[i] = row;
            i++;
        }

        newData[i] = values;
        data = newData;

        coleccion.add(persona);

        fireTableRowsInserted(0, getRowCount());
    }

    public void remove(int j) {
        if(getRowCount()>0){
            Object[][] newData = new Object[data.length-1][columnNames.length];
            int i = 0;
            int m = 0;
            while(i<data.length && m<newData.length){
                if(i!=j){
                    newData[m] = data[i];
                    m++;
                }
                i++;
            }
            DBaccess db = new DBaccess();

            Persona persona = coleccion.get(j);
            db.borrarCuentaPersonaRelacionada(persona.getNif(), persona.getCP(), idEmpresa);

            data = newData;
            fireTableRowsDeleted(0, data.length);
        }
    }
}
