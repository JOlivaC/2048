package Domini.Model.Iterador;

import java.util.List;

import Domini.Model.Casella;


public abstract class CasellaMatIterador {
	public static CasellaMatIterador get(int TipusMov,List<List<Casella>> M){
		CasellaMatIterador x;
		if (TipusMov == 0)  x =new Amunt();
		else if (TipusMov == 1) x = new Avall();
		else if (TipusMov == 2) x =new Dreta();
		else if (TipusMov == 3) x = new Esquerra();
		else return x = null;
		x.setMatriu(M);
		return x;
	}
	protected List<List<Casella>> Mat;
	protected int fila;
	protected int columna;
	public CasellaMatIterador(){}
	public void setMatriu(List<List<Casella>> c){ Mat = c;}
	public CasellaMatIterador(List<List<Casella>> c){
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
