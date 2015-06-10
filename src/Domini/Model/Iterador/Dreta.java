package Domini.Model.Iterador;

import Domini.Model.Casella;
import java.util.List;
import java.util.Vector;

public class Dreta extends Horitzontal {

    public Dreta(Vector<Vector<Casella>> c) {
        super(c);
    }
	@Override
	public boolean segY() {
		columna --;
		return columna < 0;
	}

	@Override
	public void primerY() {
		columna = Mat.size() - 1;
	}

}
