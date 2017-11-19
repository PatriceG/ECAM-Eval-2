package fr.ecam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Eval2 {

	public static void afficheCommandes(List<LigneCommande> commandes) {
		System.out.println("==== Commandes ====");
		for (LigneCommande lc : commandes) {
			System.out.println(lc);
		}
	}

	public static void ecritFichier(List<LigneCommande> list) {
		
		try {
			FileWriter fw = new FileWriter(new File("commandes_triées.csv"));
			//TODO compléter
			//utiliser un BufferedWriter, une boucle for(LigneCommande lc : list)
			//utiliser la méthode write de BufferedWriter pour reconstituer une ligne CSV à partir d'une Lignecommande 
			//afin d'obtenir un fichier à la structure identique au fichier non-trié
			//en fin de ligne, utiliser bw.write("\n") pour écrire le retour à la ligne dans le fichier
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		//Lecture du fichier commandes.csv et stockage dans une liste de ligneCommande:
		List<String> lines = Files.readAllLines(Paths.get("commandes.csv"), Charset.defaultCharset());
		List<LigneCommande> commandes = new ArrayList<>();
		for (String line : lines) {
			String[] colonnes = line.split(",");
			commandes.add(new LigneCommande(colonnes[0], colonnes[2],Double.parseDouble(colonnes[1])));
		}

		afficheCommandes(commandes);
		//Tri: compléter le CommandeComparator
		Collections.sort(commandes, new CommandeComparator());

		afficheCommandes(commandes);
		
		ecritFichier(commandes);
	}

}
