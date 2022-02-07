package xyz.arley.persona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*import lombok.Data;*/
import lombok.Getter;
import lombok.Setter;

//@Data

@Getter
@Setter
@Entity
@Table(name = "estado")
public class Estado {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	
	@ManyToOne
    @JoinColumn(name = "pais_id", referencedColumnName = "id")
	private Pais pais;

	public Estado( ) {
	}

	public Estado( String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais= pais;
	}

}

