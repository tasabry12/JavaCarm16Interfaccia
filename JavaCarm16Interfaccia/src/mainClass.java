
public abstract class mainClass extends Esempio {

	public static void main(String[] args) {


		/*
		 * MODIFICATORE ABSTRACT
		 * Può essere applicato a metodi ed a classi
		 * Non può essere applicato a blocchi di codici, variabili ed a costruttori
		 */

		
//   Esempio e = new Esempio(); //<-- NON lo posso fare.   Una classe astratta non può essere istanziata però posso estenderla    
	Cerchio c = new Cerchio(4);
	Triangolo t =  new Triangolo(3,4);
	Rettangolo r = new Rettangolo(2,3);
	
	System.out.println("Area cerchio di raggio "+c.getRaggio()+": "+c.calcolaArea());
	System.out.println("Area triangolo di base "+t.getBase()+" ed altezza "+t.getAltezza()+": "+t.calcolaArea());
	System.out.println("Area rettangolo di base "+r.getBase()+" ed altezza "+r.getAltezza()+": "+r.calcolaArea());
	}





}
