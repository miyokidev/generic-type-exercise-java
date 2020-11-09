// Notre classe Train où l'on effectue les actions comme ajouter un wagon.
public class Train<T> {
	
	private Wagon<T> first; // premier wagon
	
	private Wagon<T> last; // dernier wagon
	
	private int nbWagon = 0;
	
	// Méthode pour ajouter un wagon.
	public void add(T merchandise) {
		
		if (first == null) {
			// Quand la locomotive est null cela veut dire que le wagon que l'on crée est le premier mais aussi le dernier.
			first = last = new Wagon<T>(merchandise);
		} else {			
			last.setNext(new Wagon<T>(merchandise)); // On ajoute un wagon à la suite du dernier.
			last = last.getNext(); // Le dernier wagon devient donc le wagon qui suit le dernier ACTUEL.
		}
		
		nbWagon++; // On incrémente le nombre de wagon.
	}
	
	// Méthode qui retourne le premier wagon.
	public T getFirst() {
		return first.getMerchandise();
	}
	
	// Méthode qui retourne le dernier wagon.
	public T getLast() {
		return last.getMerchandise();
	}
	
	// Méthode pour afficher le train.
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
 