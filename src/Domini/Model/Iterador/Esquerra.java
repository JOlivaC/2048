package Domini.Model.Iterador;

public class Esquerra extends Horitzontal{
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
