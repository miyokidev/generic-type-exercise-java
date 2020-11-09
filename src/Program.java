/*
 * Manière facile de comprendre l'excerice du MyLinkedList vue en cours où l'on utilise le generic type.
 * 
 * On va créer le MyLinkedList en partant du fait que c'est un train avec plusieurs wagons.
 * 
 * Le generic type représente donc le type de marchandise que l'on stock dans les wagons.
 */
public class Program {

	public static void main(String[] args) {
		
		// On initialise le train dans lequel on va stocker de la marchandise de type String
		Train<String> train = new Train<>();
		
		// On ajoute des wagons avec leur marchandises.
		train.add("Un");
		train.add("Deux");
		train.add("Trois");
		train.add("Quatre");
		
		System.out.println(train.getFirst()); // Retourne la locomotive
		System.out.println(train.getLast()); // Retourne le dernier wagon
		
		train.displayTrain(); // Afficher le train
		
		System.out.println(); // Saut de ligne
		
		// On initialise le deuxième train dans lequel on va stocker de la marchandise de type Integer
		Train<Integer> train2 = new Train<>();
		
		// On ajoute des wagons avec leur marchandises.
		train2.add(1);
		train2.add(2);
		train2.add(3);
		train2.add(4);
		
		System.out.println(train2.getFirst()); // Retourne la locomotive
		System.out.println(train2.getLast()); // Retourne le dernier wagon
		
		train2.displayTrain(); // Afficher le train

	}

}
