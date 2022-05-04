package dev.sassine.api.postgresqlaws.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import dev.sassine.api.postgresqlaws.domain.PalestraEntity;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PalestraDTO { 

	@JsonProperty (
		value =  	"data_inicio" 
	)
	@JsonDeserialize (
		using =  	LocalDateTimeDeserializer.class 
	)
	private LocalDateTime dataInicio;
	@JsonProperty (
		value =  	"apresentador" 
	)
	private String apresentador;
	@JsonProperty (
		value =  	"titulo" 
	)
	private String titulo;
	@JsonProperty (
		value =  	"id" 
	)
	private Integer id; 

	public PalestraEntity toEntity() {
		PalestraEntity entity = new PalestraEntity(); 
		entity.setDataInicio(this.dataInicio); 
		entity.setApresentador(this.apresentador); 
		entity.setTitulo(this.titulo); 
		entity.setId(this.id); 
		return entity; 
	} 

}