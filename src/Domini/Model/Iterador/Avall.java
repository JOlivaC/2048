package Domini.Model.Iterador;

public class Avall extends Vertical {
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
