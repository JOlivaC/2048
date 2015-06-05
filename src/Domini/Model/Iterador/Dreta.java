package Domini.Model.Iterador;

public class Dreta extends Horitzontal {
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
