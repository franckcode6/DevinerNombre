package fr.humanbooster.deviner_nombre;

import java.util.Scanner;

/**
 * Cette classe permet de faire deviner à l'utilsateur
 * un nombre entre 0 et 100
 * 
 * @author Franck
 *
 */
public class App {

	public static void main(String[] args) {
		//Partie déclarative
		int nombre = 0;
		int compteur = 0;
		int solution = (int) (Math.random() * 100);
		Scanner scanner = new Scanner(System.in);
	
		//Partie traitement
		//Tant que le chiffre n'est pas bon, on continue
		//et on incrémente le compteur
		do {
			System.out.println("Indiquez un nombre : ");
			nombre = scanner.nextInt();
			if (nombre > solution) {
				System.out.println("C'est plus petit!");

			} else if (nombre < solution) {
				System.out.println("C'est plus grand!");
			}
			compteur++;
		} while (nombre != solution);
		scanner.close();
		System.out.println("Vous avez réussi, en " + compteur + " tentatives!");
		if (compteur > 5) {
			System.out.println("Vous n'êtes pas très bon...");
		}
	}

}
