package Domini.Model.Iterador;

import Domini.Model.Casella;
import java.util.List;
import java.util.Vector;

public class Amunt extends Vertical {

    public Amunt(Vector<Vector<Casella>> c) {
        super(c);
    }

	@Override
	public boolean segY() {
		fila ++;
		return fila >= Mat.size();
	}

	@Override
	public void primerY() {
		fila = 0;
	}

}
