package JEditorPane;

import java.util.ArrayList;
import java.util.List;

public class Historial {

	private List<String> lista;
	private int pos;

	public Historial() {
		lista = new ArrayList<String>();
		pos = 0;
	}



	public void add(String url) {
		lista.add(url);
		pos++;
	
	}
	
	public String next() {
		if (pos < lista.size())
			return lista.get(++pos);
		else
			return null;
	}
	
	public String previous() {
		
		if (pos > 0) 
			return lista.get(--pos);
		else
			return null;
	}

}
