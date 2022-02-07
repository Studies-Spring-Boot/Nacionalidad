


package xyz.arley.persona.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "persona")
public class Persona {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	//Le decimos que en la base de datos los guarde como nombre_completo en lugar de nombre 
	//@Column (name = "nombre_completo")
	private String nombre;
	private String apellido;
	private int edad;
	
	@ManyToOne //muchas personas pertenecen a un pais
	@JoinColumn(name="pais_id", referencedColumnName = "id")
	private Pais pais;
	
	@ManyToOne //un estado tiene muchas personas
	@JoinColumn(name="estado_id", referencedColumnName = "id")
	private Estado estado;
	
	public Persona(){

	}
	
	public Persona(String nombre, String apellido, int edad, Pais pais, Estado estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.pais = pais;
		this.estado = estado;
	} 
	

}

