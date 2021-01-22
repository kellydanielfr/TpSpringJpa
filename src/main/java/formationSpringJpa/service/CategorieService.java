package formationSpringJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import formationSpringJpa.entity.Categorie;
import formationSpringJpa.entity.Produit;
import formationSpringJpa.repository.RepositoryCategorie;

@Service
public class CategorieService {
	@Autowired
	private RepositoryCategorie categorieRepo;
	
	public Categorie newCategorie(String nom, String description) {
		return insert(new Categorie(nom, description));
	}
	public Categorie insert(Categorie categorie) {
		if(categorie.getNom() != null && !categorie.getNom().isEmpty()){
			categorieRepo.save(categorie);
			return categorie;
		}else {
			System.out.println("Il manque des infos");
		}
		return null;
	}
	
	public void delete(Categorie categorie) {
		Optional<Categorie> opt = categorieRepo.findById(categorie.getId());
		if (opt.isPresent()) {
			categorieRepo.delete(categorie);
		} else {
			System.out.println("La categorie n'existe pas");
		}
	}
	
	public void edit(Categorie newCategorie) {
		Optional<Categorie> oldCategorie = categorieRepo.findById(newCategorie.getId());
		if (oldCategorie.isPresent()) {
			oldCategorie.get().setNom(newCategorie.getNom());
			oldCategorie.get().setDescription(newCategorie.getDescription());
			categorieRepo.save(oldCategorie.get());
		} else {
			System.out.println("La categorie n'existe pas");
		}
	}
	
	public Categorie findById(Integer id) {
		Optional<Categorie> opt = categorieRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			System.out.println("La categorie n'existe pas");
			return null;
		}
	}
	
	public List<Categorie> findAll() {
		return categorieRepo.findAll();
	}
}
