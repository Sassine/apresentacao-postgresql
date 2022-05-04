package dev.sassine.api.postgresqlaws.domain;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table (
	name =  	"palestra" 
)
public class PalestraEntity { 

	@Column (
		name =  	"data_inicio",
		nullable =  	false 
	)
	private LocalDateTime dataInicio;
	@Column (
		name =  	"apresentador",
		nullable =  	false 
	)
	private String apresentador;
	@Column (
		name =  	"titulo",
		nullable =  	false 
	)
	private String titulo;
	@Column (
		name =  	"id",
		nullable =  	false 
	)
	@Id
	@GeneratedValue
	private Integer id; 

}