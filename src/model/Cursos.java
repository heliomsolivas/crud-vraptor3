package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "user_cursos")
@Table(name = "user_cursos")
public class Cursos {
	
	private Long id;
	private FormacaoAcademica formacaoAcademica;
	private String curso;
	private String instituicao;
	
	
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
	
	@Column(name="curso", nullable=true)
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Column(name="instituicao", nullable=true)
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

}
