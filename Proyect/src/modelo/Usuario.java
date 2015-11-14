package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

	private String apeUsuario;

	private String dirUsuario;

	private String emailUsuario;

	private String nomUsuario;

	private String passUsuario;

	private String pregUsuario;

	private String respUsuario;

	private String userUsuario;

	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="usuario")
	private List<Comentario> comentarios;

	//bi-directional many-to-one association to Intencion
	@OneToMany(mappedBy="usuario")
	private List<Intencion> intencions;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApeUsuario() {
		return this.apeUsuario;
	}

	public void setApeUsuario(String apeUsuario) {
		this.apeUsuario = apeUsuario;
	}

	public String getDirUsuario() {
		return this.dirUsuario;
	}

	public void setDirUsuario(String dirUsuario) {
		this.dirUsuario = dirUsuario;
	}

	public String getEmailUsuario() {
		return this.emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getNomUsuario() {
		return this.nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getPassUsuario() {
		return this.passUsuario;
	}

	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}

	public String getPregUsuario() {
		return this.pregUsuario;
	}

	public void setPregUsuario(String pregUsuario) {
		this.pregUsuario = pregUsuario;
	}

	public String getRespUsuario() {
		return this.respUsuario;
	}

	public void setRespUsuario(String respUsuario) {
		this.respUsuario = respUsuario;
	}

	public String getUserUsuario() {
		return this.userUsuario;
	}

	public void setUserUsuario(String userUsuario) {
		this.userUsuario = userUsuario;
	}

	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Comentario addComentario(Comentario comentario) {
		getComentarios().add(comentario);
		comentario.setUsuario(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setUsuario(null);

		return comentario;
	}

	public List<Intencion> getIntencions() {
		return this.intencions;
	}

	public void setIntencions(List<Intencion> intencions) {
		this.intencions = intencions;
	}

	public Intencion addIntencion(Intencion intencion) {
		getIntencions().add(intencion);
		intencion.setUsuario(this);

		return intencion;
	}

	public Intencion removeIntencion(Intencion intencion) {
		getIntencions().remove(intencion);
		intencion.setUsuario(null);

		return intencion;
	}

}