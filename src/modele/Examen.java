/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author HP
 */
public class Examen {
    private int id;
    private String date;
    private int prix;
    private String result;
     String type;
   // private int matr;
    
    public Examen(){
    
    }
    public Examen(String Date,int price,String resultat,String type_exa){
        
        this.date=Date;
        this.prix=price;
        this.result=resultat;
        this.type=type_exa;
       // this.matr=matricule;
    }

    public Examen(String text) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the prix
     */
    public int getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the matr
     */
//    public int getMatr() {
//        return matr;
//    }

    /**
     * @param matr the matr to set
     */
//    public void setMatr(int matr) {
//        this.matr = matr;
//    }
//    
}
