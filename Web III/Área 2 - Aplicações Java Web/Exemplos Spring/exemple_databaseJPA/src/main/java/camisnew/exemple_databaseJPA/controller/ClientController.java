package camisnew.exemple_databaseJPA.controller;

import camisnew.exemple_databaseJPA.model.ClientEntity;
import camisnew.exemple_databaseJPA.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

//    Autowired é
//    ClientController (ClientRepository clientRepository) {
//        this.clientRepository = clientRepository;
//    }

    @GetMapping
    public ResponseEntity<List<ClientEntity>> findAll() {
        return new ResponseEntity<List<ClientEntity>>(
                (List<ClientEntity>) this.clientRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK
        );
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientEntity> findById(@PathVariable("id") Long id) {
        if(this.clientRepository.findById(id).isPresent()){
            return new ResponseEntity<ClientEntity>(
                    this.clientRepository.findById(id).get(), new HttpHeaders(), HttpStatus.OK
            );
        }
        return new ResponseEntity<ClientEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<ClientEntity> register(@RequestBody ClientEntity clientEntity) {
        return new ResponseEntity<ClientEntity>(
                this.clientRepository.save(clientEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ClientEntity> update(@PathVariable("id") Long id,
                                    @RequestBody ClientEntity clientEntity) throws Exception {
        if (id == 0 || !this.clientRepository.existsById(id)) {
            throw new Exception("id não encontrado ou inexistente!");
        }

        return new ResponseEntity<ClientEntity>(
                this.clientRepository.save(clientEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<ClientEntity> delete(@PathVariable("id") Long id) {
        this.clientRepository.deleteById(id);
        return new ResponseEntity<ClientEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}
