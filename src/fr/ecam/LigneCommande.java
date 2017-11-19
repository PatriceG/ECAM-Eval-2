package fr.ecam;

/*
 * Ligne de commande
 * Modélise le contenu d'une ligne du fichier commandes.csv
 */
public class LigneCommande {
	private String client;
	private String titre;
	private double montant;
	
	public LigneCommande(String client, String titre, double montant){
		this.client = client;
		this.montant = montant;
		this.titre = titre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	@Override
	public String toString(){
		return "client: " + client+", montant: " + montant+", titre: " + titre;
	}
	
}
