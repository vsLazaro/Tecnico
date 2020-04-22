package camisnew.exemple_databaseJPA.repository;

import camisnew.exemple_databaseJPA.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends CrudRepository<ClientEntity, Long> {
}
