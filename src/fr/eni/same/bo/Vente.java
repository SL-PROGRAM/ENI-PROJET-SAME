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
	
	
	public Vente(int noVente, String nomArticle, String description, LocalDate dateFinEncheres, int miseAPrix,
			int prixVente) {
		super();
		this.noVente = noVente;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
	}
	
	public Vente(int noVente, String nomArticle, String description, LocalDate dateFinEncheres, int miseAPrix) {
		super();
		this.noVente = noVente;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
	}
	
	public Vente() {
		super();
	}
}
