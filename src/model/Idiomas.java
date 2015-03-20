package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity(name = "user_idiomas")
@Table(name = "user_idiomas")
public class Idiomas {
	
	private Long id;
	private FormacaoAcademica formacaoAcademica;
	private String idioma;
	private String nivel;
	
	@Id
	@GeneratedValue
	@Column(name="id", nullable=false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="fk_formacaoAcademica", nullable=false)
	public FormacaoAcademica getFormacaoAcademica() {
		return formacaoAcademica;
	}
	public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}
	
	@Column(name="idioma", nullable=true)
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	@Column(name="nivel", nullable=true)
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	

}
