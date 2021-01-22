package formationSpringJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import formationSpringJpa.entity.LigneCommande;

public interface RepositoryLigneCommande extends JpaRepository<LigneCommande, Integer> {

}
