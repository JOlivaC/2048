package Domini.Model.Iterador;

import Domini.Model.Casella;
import java.util.List;
import java.util.Vector;

public class Esquerra extends Horitzontal{

    public Esquerra(Vector<Vector<Casella>> c) {
        super(c);
    }
	@Override
	public boolean segY() {
		columna ++;
		return columna >= Mat.get(fila).size();
	}

	@Override
	public void primerY() {
		columna = 0;
	}

}
