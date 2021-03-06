package formationSpringJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import formationSpringJpa.entity.Categorie;
import formationSpringJpa.entity.Commande;
import formationSpringJpa.entity.LigneCommande;
import formationSpringJpa.entity.Produit;
import formationSpringJpa.repository.RepositoryProduit;

@Service
public class ProduitService {
	@Autowired
	private RepositoryProduit produitRepo;

	public Produit newProduit(String nom, String description, Double prix, Integer stock, Categorie categorie) {
		return insert(new Produit(nom, description, prix, stock, categorie));
	}
	
	public Produit insert(Produit produit) {
		if(produit.getNom() != null && !produit.getNom().isEmpty() && produit.getCategorie() != null && produit.getPrix() != null && produit.getStock() != null) {
			produitRepo.save(produit);
			return produit;
		}else {
			System.out.println("Il manque des infos");
		}
		return null;
	}
	
	public void delete(Produit produit) {
		Optional<Produit> opt = produitRepo.findById(produit.getId());
		if (opt.isPresent()) {
			produitRepo.delete(produit);
		} else {
			System.out.println("La produit n'existe pas");
		}
	}
	
	public void edit(Produit newProduit) {
		Optional<Produit> oldProduit = produitRepo.findById(newProduit.getId());
		if (oldProduit.isPresent()) {
			oldProduit.get().setNom(newProduit.getNom());
			oldProduit.get().setDescription(newProduit.getDescription());
			oldProduit.get().setPrix(newProduit.getPrix());
			oldProduit.get().setStock(newProduit.getStock());
			oldProduit.get().setCategorie(newProduit.getCategorie());
			produitRepo.save(oldProduit.get());
		} else {
			System.out.println("La produit n'existe pas");
		}
	}
	
	public Produit findById(Integer id) {
		Optional<Produit> opt = produitRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			System.out.println("La produit n'existe pas");
			return null;
		}
	}
	
	public List<Produit> findAll() {
		return produitRepo.findAll();
	}
	
	public List<Produit> findByCategory(Categorie categorie){
		return produitRepo.findByCategorie(categorie);
	}
	
	public List<Produit> findByNomContaining(String nom){
		return produitRepo.findByNomContaining(nom);
	}
}
