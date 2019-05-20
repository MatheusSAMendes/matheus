package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Advogado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer oab;
	
	public Advogado() {
		
	}
	
	@Override
	public String toString() {
		return "Advogado [id=" + id + ", nome=" + nome + ", oab=" + oab + "]";
	}

	public Advogado(Integer id, String nome, Integer oab) {
		super();
		this.id = id;
		this.nome = nome;
		this.oab = oab;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getOab() {
		return oab;
	}

	public void setOab(Integer oab) {
		this.oab = oab;
	}
		
}
