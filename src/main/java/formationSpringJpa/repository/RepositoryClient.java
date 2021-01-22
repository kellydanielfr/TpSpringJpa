package formationSpringJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import formationSpringJpa.entity.Client;

public interface RepositoryClient extends JpaRepository<Client, Integer>{

}
