package Domini.Model.Iterador;

public abstract class Horitzontal extends CasellaMatIterador {
	public boolean segX(){
		fila++;
		return fila >= Mat.size();
	}
	public void primerX(){
		fila = 0;
	}
}
