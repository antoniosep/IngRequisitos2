package GUI_APP;

import javax.swing.table.AbstractTableModel;
import java.util.Date;

public class MyTable extends AbstractTableModel {
    private String[] columnNames = {
            "Nombre", "NIF", "Tipo", ""
    };
    private Object[][] data = {};


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

    public void addRow(Object[] values){
        Object[][] newData = new Object[data.length+1][columnNames.length];
        int i = 0;
        for(Object[] row : data){
            newData[i] = row;
            i++;
        }

        newData[i] = values;

        data = newData;
        fireTableRowsInserted(0, getRowCount());
    }

    public void remove() {
        if(getRowCount()>0){
            Object[][] newData = new Object[data.length-1][columnNames.length];
            for(int i = 0; i< newData.length; i++){
                newData[i] = data[i];
            }

            data = newData;
            fireTableRowsDeleted(0, data.length);
        }
    }
}
