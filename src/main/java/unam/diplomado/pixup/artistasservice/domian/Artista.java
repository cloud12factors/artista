package unam.diplomado.pixup.artistasservice.domian;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="artistas")
public class Artista {
	
	@Id
	private String id;
	@NotBlank(message="Nombre no puede estar vacio")
	private String nombre;
	
}