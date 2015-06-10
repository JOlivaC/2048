package Domini.Model.Iterador;

import java.util.List;

import Domini.Model.Casella;
import java.util.Vector;


public abstract class CasellaMatIterador {
	protected Vector<Vector<Casella>> Mat;
	protected int fila;
	protected int columna;
	public CasellaMatIterador(Vector<Vector<Casella>> c){
		Mat = c;
	}
	public Casella getElement(){
		return Mat.get(fila).get(columna);
	}
	
	public abstract boolean segX();
	public abstract boolean segY();
	
	public abstract void primerX();
	public abstract void primerY();
	
	public void primer(){
		primerX();
		primerY();
	}
	
}
