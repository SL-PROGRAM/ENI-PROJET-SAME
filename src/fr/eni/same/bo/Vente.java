/**
 * 
 */
package fr.eni.same.bo;

import java.time.LocalDate;

/**
 * @author sl
 *
 */
public class Vente {
	private int noVente;
	private String nomArticle;
	private String description;
	private LocalDate dateFinEncheres;
	private int miseAPrix;
	private int prixVente;
	private Utilisateur utilisateurAcheteur;
	private Utilisateur utilisateurVendeur;
	private Categorie categorie;

	
	
	public int getNoVente() {
		return noVente;
	}
	public void setNoVente(int noVente) {
		this.noVente = noVente;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}
	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}
	public int getMiseAPrix() {
		return miseAPrix;
	}
	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}
	public int getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}
	public Utilisateur getUtilisateurAcheteur() {
		return utilisateurAcheteur;
	}
	public void setUtilisateurAcheteur(Utilisateur utilisateurAcheteur) {
		this.utilisateurAcheteur = utilisateurAcheteur;
	}
	public Utilisateur getUtilisateurVendeur() {
		return utilisateurVendeur;
	}
	public void setUtilisateurVendeur(Utilisateur utilisateurVendeur) {
		this.utilisateurVendeur = utilisateurVendeur;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public Vente(int noVente, String nomArticle, String description, LocalDate dateFinEncheres, int miseAPrix,
			int prixVente, Utilisateur utilisateurAcheteur, Utilisateur utilisateurVendeur, Categorie categorie) {
		super();
		this.noVente = noVente;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.utilisateurAcheteur = utilisateurAcheteur;
		this.utilisateurVendeur = utilisateurVendeur;
		this.categorie = categorie;
	}
	
	public Vente(String nomArticle, String description, LocalDate dateFinEncheres, int miseAPrix, int prixVente,
			Utilisateur utilisateurAcheteur, Utilisateur utilisateurVendeur, Categorie categorie) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.utilisateurAcheteur = utilisateurAcheteur;
		this.utilisateurVendeur = utilisateurVendeur;
		this.categorie = categorie;
	}
	
	public Vente(String nomArticle, String description, LocalDate dateFinEncheres, int miseAPrix, int prixVente, Utilisateur utilisateurVendeur, Categorie categorie) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.utilisateurVendeur = utilisateurVendeur;
		this.categorie = categorie;
	}
	
	public Vente() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Vente [noVente=" + noVente + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateFinEncheres=" + dateFinEncheres + ", miseAPrix=" + miseAPrix + ", prixVente=" + prixVente
				+ ", utilisateurAcheteur=" + utilisateurAcheteur + ", utilisateurVendeur=" + utilisateurVendeur
				+ ", categorie=" + categorie + "]";
	}
	
	
	
	
	
}
	
	