package formationSpringJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import formationSpringJpa.entity.Commande;

public interface RepositoryCommande extends JpaRepository<Commande, Integer>{

}
