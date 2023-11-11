package unam.diplomado.pixup.artistasservice.service;

import unam.diplomado.pixup.artistasservice.domian.Artista;


public interface ArtistaService {
	
	Artista registrarArtista(Artista artista);
	Artista actualizarArtista(String id,Artista artista);

}


 