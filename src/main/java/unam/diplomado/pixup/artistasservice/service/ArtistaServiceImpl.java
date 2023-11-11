package unam.diplomado.pixup.artistasservice.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unam.diplomado.pixup.artistasservice.domian.Artista;
import unam.diplomado.pixup.artistasservice.domian.ArtistaAlreadyExistsException;
import unam.diplomado.pixup.artistasservice.repository.ArtistaRepository;


@Service
public class ArtistaServiceImpl  implements ArtistaService{

	@Autowired
	private ArtistaRepository artistaRepository;
	
	private static final Logger LOG = LoggerFactory.getLogger(ArtistaServiceImpl.class);

	
	@Override
	public Artista registrarArtista(Artista artista) {
		// TODO Auto-generated method stub
		Optional<Artista> artistaExistente =  artistaRepository.findByNombre(artista.getNombre());
		
		if( artistaExistente.isPresent()) {
		
			throw new ArtistaAlreadyExistsException(artista.getNombre());
			
		}
		

		artistaRepository.save(artista);
		LOG.info("Artista registrado:" + artista);
		return artista;
		
	}
	

	@Override
	public Artista actualizarArtista(String id, Artista artista) {
		
		Optional<Artista> artistaExistente= artistaRepository.findById(id);
		
		if(artistaExistente.isPresent()) {
			Artista artistaActualizar= artistaExistente.get();
			artistaActualizar.setNombre(artista.getNombre());
			artistaRepository.save(artistaActualizar);
			return artistaActualizar;
			
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}