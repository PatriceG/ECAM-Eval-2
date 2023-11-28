package fr.ecam;

/*
 * Modélise une Commande d'un client
 */
public class Commande {
	private String client;
	private String titre;
	private double montant;
	
	/**
	 * Constructeur privé pour obliger à passer par la méthode factory newCommande
	 */
	private Commande(){
		
	}
	
	/**
	 * Méthode "factory" statique permettant de retourner une Commande initialisée avec des valeurs aléatoires
	 * @return Commande
	 */
	public static Commande newCommande() {
		Commande cmd = new Commande();
				
		//tableau des noms de clients possibles, un nom est choisi aléatoirement parmi ce tableau
		final String[] clients = { "client A","client B","client C","client D","client E","client F","client G","client H"};
		int index = (int) Math.floor(Math.random() * clients.length);
		cmd.client = clients[index];
		
		//tableau des titres de commandes possibles
		final String[] titres = { "commande A","commande B","commande C","commande D","commande E","commande F","commande G","commande H"};
		index = (int) Math.floor(Math.random() * titres.length);
		cmd.titre = titres[index];
		
		double montant = Math.floor(Math.random() * 1000);
		cmd.montant = montant;
		
		return cmd;
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
