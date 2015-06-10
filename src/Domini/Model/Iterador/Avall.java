package Domini.Model.Iterador;

import Domini.Model.Casella;
import java.util.List;
import java.util.Vector;

public class Avall extends Vertical {

    public Avall(Vector<Vector<Casella>> c) {
        super(c);
    }
	@Override
	public boolean segY() {
		fila --;
		return fila < 0;
	}

	@Override
	public void primerY() {
		fila = Mat.size() - 1;
	}

}
