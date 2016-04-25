package JComboBox;

import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class ComboBoxModeloCiudad extends AbstractListModel implements ComboBoxModel{

	Vector<Ciudad> ciudades;
	Ciudad ciudadSeleccionada;
	
	/**
	 * @param ciudades
	 */
	public ComboBoxModeloCiudad(Vector<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return ciudades.size();
	}

	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		return ciudades.elementAt(index);
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO Auto-generated method stub
		ciudadSeleccionada = (Ciudad) anItem;
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return ciudadSeleccionada;
	}
	
}
