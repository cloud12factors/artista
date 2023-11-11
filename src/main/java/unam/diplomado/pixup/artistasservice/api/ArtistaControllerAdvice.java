package unam.diplomado.pixup.artistasservice.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import unam.diplomado.pixup.artistasservice.domian.ArtistaAlreadyExistsException;

@RestControllerAdvice
public class ArtistaControllerAdvice {
	
	@ExceptionHandler(ArtistaAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	private String artistaAlreadyExistsHandler(
			ArtistaAlreadyExistsException exception) {
			
		return exception.getMessage();
		
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	private String validatorHandler(MethodArgumentNotValidException exception) {
		
		return "Existen Errores de validacion  en el payload ***"+exception.toString() + "*****";
		
	}
	
	
}