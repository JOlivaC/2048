package Domini.Model.Iterador;

import Domini.Model.Casella;
import java.util.List;
import java.util.Vector;

public abstract class Vertical extends CasellaMatIterador {

    public Vertical(Vector<Vector<Casella>> c) {
        super(c);
    }
	public boolean segX(){
		columna++;
		return columna >= Mat.get(fila).size();
	}
	public void primerX(){
		columna = 0;
	}
}
