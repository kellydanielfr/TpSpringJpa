package formationSpringJpa.entity;

public class LigneCommande {
	private Long id;
	private Integer quantite;
	private Double montant;
	private Produit produit;
	public LigneCommande() {
	}
	public LigneCommande(Integer quantite, Double montant, Produit produit) {
		this.quantite = quantite;
		this.montant = montant;
		this.produit = produit;
	}
	public LigneCommande(Long id, Integer quantite, Double montant, Produit produit) {
		this.id = id;
		this.quantite = quantite;
		this.montant = montant;
		this.produit = produit;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((montant == null) ? 0 : montant.hashCode());
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
		result = prime * result + ((quantite == null) ? 0 : quantite.hashCode());
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
		LigneCommande other = (LigneCommande) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (montant == null) {
			if (other.montant != null)
				return false;
		} else if (!montant.equals(other.montant))
			return false;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		if (quantite == null) {
			if (other.quantite != null)
				return false;
		} else if (!quantite.equals(other.quantite))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LigneCommande [id=" + id + ", quantite=" + quantite + ", montant=" + montant + ", produit=" + produit
				+ "]";
	}
	
	
}
