package Domini.Model.Iterador;

import Domini.Model.Casella;
import java.util.List;
import java.util.Vector;

public abstract class Horitzontal extends CasellaMatIterador {

        public Horitzontal(Vector<Vector<Casella>> c) {
            super(c);
        }
	public boolean segX(){
		fila++;
		return fila >= Mat.size();
	}
	public void primerX(){
		fila = 0;
	}
}
