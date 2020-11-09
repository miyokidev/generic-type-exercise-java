// Notre classe Wagon o� l'on g�re la marchandise et attacher les wagons ensembles.
public class Wagon<T> {
	
	private T merchandise;
	
	private Wagon<T> next;
	
	// Constructeur
	public Wagon(T merchandise) {
		this.merchandise = merchandise;
	}
	
	// Retourne la marchandise du wagon.
	public T getMerchandise(){
		return merchandise;
	}

	// Retourne le wagon suivant.
	public Wagon<T> getNext() {
		return next;
	}
	
	// Ajoute un wagon � la suite.
	public void setNext(Wagon<T> e) {
		this.next = e;
	}

	
}
