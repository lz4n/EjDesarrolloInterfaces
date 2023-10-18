package tabla;

import javax.swing.table.AbstractTableModel;
import java.util.Collection;
import java.util.List;

public class AlumnosTableModel extends AbstractTableModel {
    private List<Alumno> alumnos;

    public AlumnosTableModel(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public int getRowCount() {
        return this.alumnos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno alumno = this.alumnos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return alumno.getNombre();
            case 1:
                return alumno.getCurso();
        }
        return null;
    }
}
