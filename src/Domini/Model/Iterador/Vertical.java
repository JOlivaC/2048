package Domini.Model.Iterador;

public abstract class Vertical extends CasellaMatIterador {
	public boolean segX(){
		columna++;
		return columna >= Mat.get(fila).size();
	}
	public void primerX(){
		columna = 0;
	}
}
