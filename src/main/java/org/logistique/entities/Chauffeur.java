package org.logistique.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "chauffeurs")
public class Chauffeur implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String matricule;
	private String nom;
	private String prenom;
	private String tel;
	private String adresse;
	
	@OneToMany(mappedBy="chauffeurPremier")
	private List<Voyage> voyages;
	
	@OneToMany(mappedBy="chauffeur")
	private List<Location> locations;

	public Chauffeur() {
	}

	public Chauffeur(Long id, String matricule, String nom, String prenom, String tel, String adresse) {
		this.id = id;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Voyage> getVoyages() {
		return this.voyages;
	}

	public List<Location> getLocations() {
		return this.locations;
	}

	@Override
	public String toString() {
		return "Chauffeur [id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", tel="
				+ tel + "]";
	}
}
