package br.com.tech4me.testeprova.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.testeprova.Model.Musica;

public interface MusicaRepository extends MongoRepository<Musica, String>{
    
}
