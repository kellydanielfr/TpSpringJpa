package formationSpringJpa.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "commande")
@SequenceGenerator(name = "seqCommande", sequenceName = "seq_commande", initialValue = 10, allocationSize = 1)
public class Commande implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCommande")
	private Long id; 
	private Integer nbProduits;
	private Double prixTotal;
	@Column(columnDefinition = "DATE")
	private LocalDate date;
	@OneToOne
	private Adresse adresseFacturation;
	@OneToOne
	private Adresse adresseLivraison;
	@OneToMany(mappedBy = "commande")
	private List<LigneCommande> ligneCommandes;
	@ManyToOne
	private Client client;
	
	@Version
	private int version;
	
	public Commande() {
	}
	public Commande(Integer nbProduits, Double prixTotal, LocalDate date, Adresse adresseFacturation,
			Adresse adresseLivraison, List<LigneCommande> ligneCommandes) {
		this.nbProduits = nbProduits;
		this.prixTotal = prixTotal;
		this.date = date;
		this.adresseFacturation = adresseFacturation;
		this.adresseLivraison = adresseLivraison;
		this.ligneCommandes = ligneCommandes;
	}
	public Commande(Long id, Integer nbProduits, Double prixTotal, LocalDate date, Adresse adresseFacturation,
			Adresse adresseLivraison, List<LigneCommande> ligneCommandes) {
		this.id = id;
		this.nbProduits = nbProduits;
		this.prixTotal = prixTotal;
		this.date = date;
		this.adresseFacturation = adresseFacturation;
		this.adresseLivraison = adresseLivraison;
		this.ligneCommandes = ligneCommandes;
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
	public List<LigneCommande> getLigneCommande() {
		return ligneCommandes;
	}
	public void setLigneCommande(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresseFacturation == null) ? 0 : adresseFacturation.hashCode());
		result = prime * result + ((adresseLivraison == null) ? 0 : adresseLivraison.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ligneCommandes == null) ? 0 : ligneCommandes.hashCode());
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
		if (ligneCommandes == null) {
			if (other.ligneCommandes != null)
				return false;
		} else if (!ligneCommandes.equals(other.ligneCommandes))
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
				+ ", ligneCommandes=" + ligneCommandes + ", client=" + client + ", version=" + version + "]";
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
