package unam.diplomado.pixup.artistasservice.domian;


public class ArtistaAlreadyExistsException  extends RuntimeException   {
	
	public ArtistaAlreadyExistsException(String nombre) {
		super("Ya exite el Artista con el nombre :" + nombre);
	}

}
