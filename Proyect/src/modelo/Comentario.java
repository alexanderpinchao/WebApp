package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the comentario database table.
 * 
 */
@Entity
@NamedQuery(name="Comentario.findAll", query="SELECT c FROM Comentario c")
public class Comentario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idComentario;

	private String calComentario;

	private String descComentario;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechComentario;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	//bi-directional many-to-one association to Apartamento
	@ManyToOne
	private Apartamento apartamento;

	public Comentario() {
	}

	public int getIdComentario() {
		return this.idComentario;
	}

	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}

	public String getCalComentario() {
		return this.calComentario;
	}

	public void setCalComentario(String calComentario) {
		this.calComentario = calComentario;
	}

	public String getDescComentario() {
		return this.descComentario;
	}

	public void setDescComentario(String descComentario) {
		this.descComentario = descComentario;
	}

	public Date getFechComentario() {
		return this.fechComentario;
	}

	public void setFechComentario(Date fechComentario) {
		this.fechComentario = fechComentario;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Apartamento getApartamento() {
		return this.apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

}