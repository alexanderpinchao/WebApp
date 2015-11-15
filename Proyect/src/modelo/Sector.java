package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sector database table.
 * 
 */
@Entity
@NamedQuery(name="Sector.findAll", query="SELECT s FROM Sector s")
public class Sector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSector;

	private String descSector;

	private String nomSector;

	//bi-directional many-to-one association to Apartamento
	@OneToMany(mappedBy="sector")
	private List<Apartamento> apartamentos;

	public Sector() {
	}

	public int getIdSector() {
		return this.idSector;
	}

	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	public String getDescSector() {
		return this.descSector;
	}

	public void setDescSector(String descSector) {
		this.descSector = descSector;
	}

	public String getNomSector() {
		return this.nomSector;
	}

	public void setNomSector(String nomSector) {
		this.nomSector = nomSector;
	}

	public List<Apartamento> getApartamentos() {
		return this.apartamentos;
	}

	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}

	public Apartamento addApartamento(Apartamento apartamento) {
		getApartamentos().add(apartamento);
		apartamento.setSector(this);

		return apartamento;
	}

	public Apartamento removeApartamento(Apartamento apartamento) {
		getApartamentos().remove(apartamento);
		apartamento.setSector(null);

		return apartamento;
	}

}