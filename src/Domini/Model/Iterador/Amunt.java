package Domini.Model.Iterador;

public class Amunt extends Vertical {

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
