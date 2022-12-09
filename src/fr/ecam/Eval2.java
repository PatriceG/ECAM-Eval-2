package fr.ecam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Eval2 {

	public static void afficheCommandes(List<Commande> commandes) {
		System.out.println("==== Commandes ====");
		for (Commande c : commandes) {
			System.out.println(c);
		}
	}

	public static void main(String[] args){
		List<Commande> commandes = new ArrayList<>();

		//crée une liste de 15 commandes aléatoires
		for(int i=0; i<15; i++) {
			Commande cmd = Commande.newCommande();
			commandes.add(cmd);
		}
		//affiche la liste de commandes non-triée
		afficheCommandes(commandes);
		
		//Tri: compléter le CommandeComparator
		Collections.sort(commandes, new CommandeComparator());

		//affiche la liste de commandes triées
		afficheCommandes(commandes);	
	}

}
