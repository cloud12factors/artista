package unam.diplomado.pixup.artistasservice.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import unam.diplomado.pixup.artistasservice.domian.Artista;

@Data
@NoArgsConstructor
public class RegistroArtistaRequest {

	
	@NotNull
	@Valid
	private Artista artista;
	

}