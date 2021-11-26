/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author HP
 */
public class Beneficier {
    private int idBen;
    private String date;
    private String comment;
    private int idPat;
    private String nomPat;
    private int idEx;
    private String typeExam;
    public Beneficier(){
    
    }
    public Beneficier(String Date,String Comment,int id_Pat,int id_Ex){
        this.date=Date;
        this.comment=Comment;
        this.idPat=id_Pat;
        this.idEx=id_Ex; 
    }

    public Beneficier(String dateFormatString, String text, int idpati) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the idBen
     */
    public int getIdBen() {
        return idBen;
    }

    /**
     * @param idBen the idBen to set
     */
    public void setIdBen(int idBen) {
        this.idBen = idBen;
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
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the idPat
     */
    public int getIdPat() {
        return idPat;
    }

    /**
     * @param idPat the idPat to set
     */
    public void setIdPat(int idPat) {
        this.idPat = idPat;
    }

    /**
     * @return the nomPat
     */
    public String getNomPat() {
        return nomPat;
    }

    /**
     * @param nomPat the nomPat to set
     */
    public void setNomPat(String nomPat) {
        this.nomPat = nomPat;
    }

    /**
     * @return the idEx
     */
    public int getIdEx() {
        return idEx;
    }

    /**
     * @param idEx the idEx to set
     */
    public void setIdEx(int idEx) {
        this.idEx = idEx;
    }

    /**
     * @return the typeExam
     */
    public String getTypeExam() {
        return typeExam;
    }

    /**
     * @param typeExam the typeExam to set
     */
    public void setTypeExam(String typeExam) {
        this.typeExam = typeExam;
    }
    
}
