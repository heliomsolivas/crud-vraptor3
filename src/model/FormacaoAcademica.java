package model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "user_formacao")
@Table(name = "user_formacao")
public class FormacaoAcademica {
	
	private Long id;
	private User user;
	private Collection<Cursos> cursosList;
	private Collection<Idiomas> idiomasList;
	
	
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
	@JoinColumn(name="fk_user", nullable=false)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@OneToMany(mappedBy="formacaoAcademica", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public Collection<Cursos> getCursosList() {
		return cursosList;
	}
	public void setCursosList(Collection<Cursos> cursosList) {
		this.cursosList = cursosList;
	}
	
	@OneToMany(mappedBy="formacaoAcademica", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public Collection<Idiomas> getIdiomasList() {
		return idiomasList;
	}
	public void setIdiomasList(Collection<Idiomas> idiomasList) {
		this.idiomasList = idiomasList;
	}

}
