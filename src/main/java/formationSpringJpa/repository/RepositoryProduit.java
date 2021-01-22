package formationSpringJpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formationSpringJpa.entity.Categorie;
import formationSpringJpa.entity.Produit;

public interface RepositoryProduit extends JpaRepository<Produit, Integer>{
	public List<Produit> findByCategorie(Categorie categorie);
	
	public List<Produit> findByNomContaining(String nom);
}
