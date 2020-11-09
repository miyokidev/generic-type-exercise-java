// Notre classe Train o� l'on effectue les actions comme ajouter un wagon.
public class Train<T> {
	
	private Wagon<T> first; // premier wagon
	
	private Wagon<T> last; // dernier wagon
	
	private int nbWagon = 0;
	
	// M�thode pour ajouter un wagon.
	public void add(T merchandise) {
		
		if (first == null) {
			// Quand la locomotive est null cela veut dire que le wagon que l'on cr�e est le premier mais aussi le dernier.
			first = last = new Wagon<T>(merchandise);
		} else {			
			last.setNext(new Wagon<T>(merchandise)); // On ajoute un wagon � la suite du dernier.
			last = last.getNext(); // Le dernier wagon devient donc le wagon qui suit le dernier ACTUEL.
		}
		
		nbWagon++; // On incr�mente le nombre de wagon.
	}
	
	// M�thode qui retourne le premier wagon.
	public T getFirst() {
		return first.getMerchandise();
	}
	
	// M�thode qui retourne le dernier wagon.
	public T getLast() {
		return last.getMerchandise();
	}
	
	// M�thode pour afficher le train.
	public void displayTrain() {
		Wagon<T> current = first;
		
		// Affichage locomotive
		System.out.print("<||");
		
		// On parcourt les wagons pour tous les afficher.
		for (int i = 0; i < nbWagon; i++) {
			System.out.print("-|"+ current.getMerchandise() + "|"); // Affichage du wagon actuel avec son contenu.
			current = current.getNext(); // Passage au wagon suivant.
		}
	}
	
}
 