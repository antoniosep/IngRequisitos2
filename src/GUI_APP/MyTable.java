package GUI_APP;

import javax.swing.table.AbstractTableModel;
import java.util.Date;

public class MyTable extends AbstractTableModel {
    private String[] header = {
            "Nombre", "NIF", "Tipo", ""
    };
    private Object[][] data = {
            {"null", "null", "null", Boolean.FALSE},
            {"null", "null", "null", Boolean.TRUE},
            {"null", "null", "null", Boolean.FALSE},
            {"null", "null", "null", Boolean.TRUE},
    };


    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return header.length;
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
        Object[][] newData = new Object[data.length+1][header.length];
        int i = 0;
        for(Object[] row : data){
            newData[i] = row;
            i++;
        }

        newData[i] = values;

        data = newData;
        fireTableRowsInserted(0, getRowCount());
    }

}
