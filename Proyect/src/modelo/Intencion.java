package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the intencion database table.
 * 
 */
@Entity
@NamedQuery(name="Intencion.findAll", query="SELECT i FROM Intencion i")
public class Intencion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idIntencion;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechIntencion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	//bi-directional many-to-one association to Apartamento
	@ManyToOne
	private Apartamento apartamento;

	public Intencion() {
	}

	public int getIdIntencion() {
		return this.idIntencion;
	}

	public void setIdIntencion(int idIntencion) {
		this.idIntencion = idIntencion;
	}

	public Date getFechIntencion() {
		return this.fechIntencion;
	}

	public void setFechIntencion(Date fechIntencion) {
		this.fechIntencion = fechIntencion;
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