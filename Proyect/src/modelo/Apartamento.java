package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the apartamento database table.
 * 
 */
@Entity
@NamedQuery(name="Apartamento.findAll", query="SELECT a FROM Apartamento a")
public class Apartamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idApartamento;

	private float costApartamento;

	private String descApartamento;

	private String dirApartamento;

	private String statApartamento;

	//bi-directional many-to-one association to Sector
	@ManyToOne
	private Sector sector;

	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="apartamento")
	private List<Comentario> comentarios;

	//bi-directional many-to-one association to Intencion
	@OneToMany(mappedBy="apartamento")
	private List<Intencion> intencions;

	public Apartamento() {
	}

	public int getIdApartamento() {
		return this.idApartamento;
	}

	public void setIdApartamento(int idApartamento) {
		this.idApartamento = idApartamento;
	}

	public float getCostApartamento() {
		return this.costApartamento;
	}

	public void setCostApartamento(float costApartamento) {
		this.costApartamento = costApartamento;
	}

	public String getDescApartamento() {
		return this.descApartamento;
	}

	public void setDescApartamento(String descApartamento) {
		this.descApartamento = descApartamento;
	}

	public String getDirApartamento() {
		return this.dirApartamento;
	}

	public void setDirApartamento(String dirApartamento) {
		this.dirApartamento = dirApartamento;
	}

	public String getStatApartamento() {
		return this.statApartamento;
	}

	public void setStatApartamento(String statApartamento) {
		this.statApartamento = statApartamento;
	}

	public Sector getSector() {
		return this.sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Comentario addComentario(Comentario comentario) {
		getComentarios().add(comentario);
		comentario.setApartamento(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setApartamento(null);

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
		intencion.setApartamento(this);

		return intencion;
	}

	public Intencion removeIntencion(Intencion intencion) {
		getIntencions().remove(intencion);
		intencion.setApartamento(null);

		return intencion;
	}

}