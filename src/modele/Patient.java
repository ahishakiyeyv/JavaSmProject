/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author HP
 */
public class Patient {
    private int idp;
     String nom;
     String prenom;
      String genre;
      String date;
    String addresse;
     String perRef;
      String grSang;
     String fonction;
      String malChro;
    public Patient(){

}
    public Patient(String name,String surname,String gender,String Date,String rue,String pRef,String Gsang,String function,String mChron){
    this.nom=name;
    this.prenom=surname;
    this.genre=gender;
    this.date=Date;
    this.addresse=rue;
    this.perRef=pRef;
    this.grSang=Gsang;
    this.fonction=function;
    this.malChro=mChron;
    }

    public Patient(String text) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the idp
     */
    public int getIdp() {
        return idp;
    }

    /**
     * @param idp the idp to set
     */
    public void setIdp(int idp) {
        this.idp = idp;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the addresse
     */
    public String getAddresse() {
        return addresse;
    }

    /**
     * @param addresse the addresse to set
     */
    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    /**
     * @return the perRef
     */
    public String getPerRef() {
        return perRef;
    }

    /**
     * @param perRef the perRef to set
     */
    public void setPerRef(String perRef) {
        this.perRef = perRef;
    }

    /**
     * @return the grSang
     */
    public String getGrSang() {
        return grSang;
    }

    /**
     * @param grSang the grSang to set
     */
    public void setGrSang(String grSang) {
        this.grSang = grSang;
    }

    /**
     * @return the fonction
     */
    public String getFonction() {
        return fonction;
    }

    /**
     * @param fonction the fonction to set
     */
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    /**
     * @return the malChro
     */
    public String getMalChro() {
        return malChro;
    }

    /**
     * @param malChro the malChro to set
     */
    public void setMalChro(String malChro) {
        this.malChro = malChro;
    }
    
}

