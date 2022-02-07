package xyz.arley.persona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*import lombok.Data;*/



//@Data
@Getter
@Setter
@Entity
@Table(name="pais")
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;

	public Pais() {

	}
	public Pais( String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	
}