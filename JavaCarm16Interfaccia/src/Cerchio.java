
// public class Cerchio extends FiguraGeometrica implements Interfaccia, Interfaccia2   posso estendere 
//                                              un solo metodo astratto, ma implementare quante interfacce voglio

public class Cerchio implements Interfaccia{
	
	private double raggio;



	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	@Override
	public double calcolaArea() {
		return PI * (getRaggio() * 2);     //scrivo direttamente PI perchè l'ho implementata nell'interfaccia
		
	}

}
