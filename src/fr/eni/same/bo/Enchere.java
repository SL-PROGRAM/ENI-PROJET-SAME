package fr.eni.same.bo;

import java.time.LocalDate;

public class Enchere {
	private LocalDate dateEnchère;
	private Utilisateur utilisateurEnchere;
	private Vente venteEnchere;
	
	
	public LocalDate getDateEnchère() {
		return dateEnchère;
	}
	public void setDateEnchère(LocalDate dateEnchère) {
		this.dateEnchère = dateEnchère;
	}
	public Utilisateur getUtilisateurEnchere() {
		return utilisateurEnchere;
	}
	public void setUtilisateurEnchere(Utilisateur utilisateurEnchere) {
		this.utilisateurEnchere = utilisateurEnchere;
	}
	public Vente getVenteEnchere() {
		return venteEnchere;
	}
	public void setVenteEnchere(Vente venteEnchere) {
		this.venteEnchere = venteEnchere;
	}
	
	
	public Enchere(LocalDate dateEnchère, Utilisateur utilisateurEnchere, Vente venteEnchere) {
		super();
		this.dateEnchère = dateEnchère;
		this.utilisateurEnchere = utilisateurEnchere;
		this.venteEnchere = venteEnchere;
	}
	
	public Enchere() {
		super();
	}
	
	@Override
	public String toString() {
		return "Enchere [dateEnchère=" + dateEnchère + ", utilisateurEnchere=" + utilisateurEnchere + ", venteEnchere="
				+ venteEnchere + "]";
	}
	
}

