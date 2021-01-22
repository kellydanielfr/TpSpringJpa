package formationSpringJpa.entity;

import java.time.LocalDate;

public class Commande {
	private Long id; 
	private Integer nbProduits;
	private Double prixTotal;
	private LocalDate date;
	private Adresse adresseFacturation;
	private Adresse adresseLivraison;
	private LigneCommande ligneCommande;
	public Commande() {
	}
	public Commande(Integer nbProduits, Double prixTotal, LocalDate date, Adresse adresseFacturation,
			Adresse adresseLivraison, LigneCommande ligneCommande) {
		this.nbProduits = nbProduits;
		this.prixTotal = prixTotal;
		this.date = date;
		this.adresseFacturation = adresseFacturation;
		this.adresseLivraison = adresseLivraison;
		this.ligneCommande = ligneCommande;
	}
	public Commande(Long id, Integer nbProduits, Double prixTotal, LocalDate date, Adresse adresseFacturation,
			Adresse adresseLivraison, LigneCommande ligneCommande) {
		this.id = id;
		this.nbProduits = nbProduits;
		this.prixTotal = prixTotal;
		this.date = date;
		this.adresseFacturation = adresseFacturation;
		this.adresseLivraison = adresseLivraison;
		this.ligneCommande = ligneCommande;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNbProduits() {
		return nbProduits;
	}
	public void setNbProduits(Integer nbProduits) {
		this.nbProduits = nbProduits;
	}
	public Double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(Double prixTotal) {
		this.prixTotal = prixTotal;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Adresse getAdresseFacturation() {
		return adresseFacturation;
	}
	public void setAdresseFacturation(Adresse adresseFacturation) {
		this.adresseFacturation = adresseFacturation;
	}
	public Adresse getAdresseLivraison() {
		return adresseLivraison;
	}
	public void setAdresseLivraison(Adresse adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}
	public LigneCommande getLigneCommande() {
		return ligneCommande;
	}
	public void setLigneCommande(LigneCommande ligneCommande) {
		this.ligneCommande = ligneCommande;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresseFacturation == null) ? 0 : adresseFacturation.hashCode());
		result = prime * result + ((adresseLivraison == null) ? 0 : adresseLivraison.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ligneCommande == null) ? 0 : ligneCommande.hashCode());
		result = prime * result + ((nbProduits == null) ? 0 : nbProduits.hashCode());
		result = prime * result + ((prixTotal == null) ? 0 : prixTotal.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commande other = (Commande) obj;
		if (adresseFacturation == null) {
			if (other.adresseFacturation != null)
				return false;
		} else if (!adresseFacturation.equals(other.adresseFacturation))
			return false;
		if (adresseLivraison == null) {
			if (other.adresseLivraison != null)
				return false;
		} else if (!adresseLivraison.equals(other.adresseLivraison))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ligneCommande == null) {
			if (other.ligneCommande != null)
				return false;
		} else if (!ligneCommande.equals(other.ligneCommande))
			return false;
		if (nbProduits == null) {
			if (other.nbProduits != null)
				return false;
		} else if (!nbProduits.equals(other.nbProduits))
			return false;
		if (prixTotal == null) {
			if (other.prixTotal != null)
				return false;
		} else if (!prixTotal.equals(other.prixTotal))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", nbProduits=" + nbProduits + ", prixTotal=" + prixTotal + ", date=" + date
				+ ", adresseFacturation=" + adresseFacturation + ", adresseLivraison=" + adresseLivraison
				+ ", ligneCommande=" + ligneCommande + "]";
	}
	
	
	
}
