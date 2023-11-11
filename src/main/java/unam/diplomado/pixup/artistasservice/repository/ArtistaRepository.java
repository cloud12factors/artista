package unam.diplomado.pixup.artistasservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import unam.diplomado.pixup.artistasservice.domian.Artista;

public interface ArtistaRepository 
	extends MongoRepository<Artista, String> {
	

	Optional<Artista> findByNombre(String name);
}