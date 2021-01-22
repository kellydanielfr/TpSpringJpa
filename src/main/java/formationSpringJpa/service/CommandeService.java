package formationSpringJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import formationSpringJpa.entity.Commande;
import formationSpringJpa.entity.LigneCommande;
import formationSpringJpa.entity.Produit;
import formationSpringJpa.repository.RepositoryCommande;
import formationSpringJpa.repository.RepositoryProduit;

@Service
public class CommandeService {
	@Autowired
	private RepositoryCommande commandeRepo;
	@Autowired
	private RepositoryProduit produitRepo;
	
	public void insert(Commande commande) {
		Optional<Commande> opt = commandeRepo.findById(commande.getId());
		if (opt.isPresent()) {
			System.out.println("La commande existe déjà");
		} else {
			commandeRepo.save(commande);
		}
	}
	
	public void delete(Commande commande) {
		Optional<Commande> opt = commandeRepo.findById(commande.getId());
		if (opt.isPresent()) {
			commandeRepo.delete(commande);
		} else {
			System.out.println("La commande n'existe pas");
		}
	}
	
	public void edit(Commande newCommande) {
		Optional<Commande> oldCommande = commandeRepo.findById(newCommande.getId());
		if (oldCommande.isPresent()) {
			oldCommande.get().setNbProduits(newCommande.getNbProduits());
			oldCommande.get().setPrixTotal(newCommande.getPrixTotal());
			oldCommande.get().setAdresseFacturation(newCommande.getAdresseFacturation());
			oldCommande.get().setAdresseLivraison(newCommande.getAdresseLivraison());
			oldCommande.get().setLigneCommande(newCommande.getLigneCommande());
			commandeRepo.save(oldCommande.get());
		} else {
			System.out.println("La commande n'existe pas");
		}
	}
	
	public Commande findById(Integer id) {
		Optional<Commande> opt = commandeRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			System.out.println("La commande n'existe pas");
			return null;
		}
	}
	
	public List<Commande> findAll() {
		return commandeRepo.findAll();
	}
	
	public Commande addToCommande(Produit produit, Integer qte, Commande commande) {
		Optional<Produit> opt = produitRepo.findById(produit.getId());
		if (opt.isPresent()) {
			if(opt.get().getStock()>=qte) {
				LigneCommande ligneCommande = new LigneCommande(qte, (opt.get().getPrix()*qte), opt.get());
				List<LigneCommande> listligne = commande.getLigneCommande();
				listligne.add(ligneCommande);
				commande.setLigneCommande(listligne);
			}else {
				System.out.println("Pas assez de stock");
			}
		} else {
			System.out.println("Le produit n'existe pas");
		}
		return commande;
	}
	
	public Commande deleteProduitCommande(Produit produit, Commande commande) {
		List<LigneCommande> listLigneCommande = commande.getLigneCommande();
		listLigneCommande.removeIf(ligneCommande -> ligneCommande.getProduit().equals(produit));
		commande.setLigneCommande(listLigneCommande);
		return commande;
	}
}
