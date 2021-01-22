package formationSpringJpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import formationSpringJpa.entity.Adresse;
import formationSpringJpa.entity.Commande;
import formationSpringJpa.entity.LigneCommande;
import formationSpringJpa.entity.Produit;
import formationSpringJpa.repository.RepositoryAdresse;
import formationSpringJpa.repository.RepositoryClient;
import formationSpringJpa.service.CategorieService;
import formationSpringJpa.service.CommandeService;
import formationSpringJpa.service.ProduitService;

public class AppSpring {
	@Autowired
	public ProduitService produitService;
	@Autowired
	public CategorieService categorieService;
	@Autowired
	public CommandeService commandeService;
	
	//Init data
	@Autowired 
	public RepositoryAdresse adresseRepo;
	@Autowired 
	public RepositoryClient clientRepo;
	
	
	public void run(String[] args) {
		//Init data
		
//		Adresse adresse = new Adresse("rue", "ville", 8965);
//		adresseRepo.save(adresse);
//		List<Adresse> adresses = null;
//		adresses.add(adresse);
//		
//		Client client = new Client("client", "mdp", Role.ROLE_CLIENT, Civilite.MLLE, "nom", "prenom", "email", adresses);
//		clientRepo.save(client);
		
	//Tests
		
		//Ajout
//		Categorie categorie = categorieService.newCategorie("nom", "description");
//		Produit produit = produitService.newProduit("nom", "description", 10.0, 10, categorie);
		
		//Modifier
//		Produit produitEdit = produitService.findById(10);
//		produitEdit.setNom("nom2");
//		produitService.edit(produitEdit);
//		Categorie categorieEdit = categorieService.findById(10); 
//		categorieEdit.setNom("nom2");
//		categorieService.edit(categorieEdit);
		
		//Consulter
//		System.out.println("byId");
//		System.out.println(produitService.findById(10));
//		System.out.println(categorieService.findById(10));
//		System.out.println("All");
//		System.out.println(produitService.findAll());
//		System.out.println(categorieService.findAll());
		
		//Supprimer
//		Produit produitSup = produitService.findById(10);
//		produitService.delete(produitSup);
//		Categorie categorieSup = categorieService.findById(10); 
//		categorieService.delete(categorieSup);
		
		//Consulter produit par categorie
//		Categorie categorie = categorieService.newCategorie("nom", "description");
//		Produit produit = produitService.newProduit("nom", "description", 10.0, 10, categorie);
//		Categorie categorieSup = categorieService.findById(11); 
//		System.out.println(produitService.findByCategory(categorieSup));
		
		//Consulter produit par mot clef
//		System.out.println(produitService.findByNomContaining("no"));
		
		//Ajouter  produit dans panier
//		Adresse adresse = new Adresse("rue", "ville", 8965);
//		Commande commande = new Commande(0, 0.0, adresse, adresse, new ArrayList<LigneCommande>());
//		Produit produitAdd = produitService.findById(11);
//		System.out.println("avant" + commande);
//		commandeService.addToCommande(produitAdd, 1, commande);
//		System.out.println("arpes" + commande);
//		commandeService.deleteProduitCommande(produitAdd, commande);
//		System.out.println("apres" + commande);
		
		//Enregistrer commande /!\ Marche pas
//		Adresse adresse = new Adresse("rue", "ville", 8965);
//		Commande commande = new Commande(0, 0.0, adresse, adresse, new ArrayList<LigneCommande>());
//		Produit produitAdd = produitService.findById(11);
//		System.out.println("avant" + commande);
//		commandeService.addToCommande(produitAdd, 1, commande);
//		System.out.println("arpes" + commande);
//		commandeService.insert(commande);
	}
}
