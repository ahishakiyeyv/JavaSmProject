/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.sql.*;

import java.util.ArrayList;
import Modele.*;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modele.Beneficier;
import modele.Examen;
import modele.Patient;
import javax.swing.jComboBox1;
import javax.swing.jComboBox2;

/**
 *
 * @author Jk
 */
public class Factory {
    
    
     static Connection conn;
    static Statement st;
    static PreparedStatement ps;
    static ResultSet rs;
    static ArrayList<jComboBox1>pati= new ArrayList<>();
    static ArrayList<jComboBox2>exame= new ArrayList<>();
    

  ///begin patient--------------------------------------------------
   public static ArrayList<Patient> getPatient()throws Exception
    {
        ArrayList<Patient> pat = new ArrayList();
        try
        {
         conn=ConnectDB.getConnection();
         String query="SELECT * FROM patient ";
         st = conn.createStatement();
         rs=st.executeQuery(query);
         Patient patVar;
         
         while(rs.next())
         {
               patVar = new Patient();
               patVar.setIdp(rs.getInt("idPat_Patient"));
               patVar.setNom(rs.getString("nomPat_Patient"));
               patVar.setPrenom(rs.getString("prenPat_Patient"));
               patVar.setGenre(rs.getString("genrePat_Patient"));
               patVar.setDate(rs.getString("dateNais_Patient"));
               patVar.setAddresse(rs.getString("addrPat_Patient"));
               patVar.setPerRef(rs.getString("perRefPat_Patient"));
               patVar.setGrSang(rs.getString("grSangPat_Patient"));
               patVar.setFonction(rs.getString("fonctPat_Patient"));
               patVar.setMalChro(rs.getString("malChronPat_Patient"));
               pat.add(patVar);
          
        
         }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return pat;
        
    }
   
  public static void insererpatient(Patient pa)throws Exception
  {
      String query="INSERT INTO  patient(nomPat_Patient,prenPat_Patient,genrePat_Patient,dateNais_Patient,addrPat_Patient,perRefPat_Patient,grSangPat_Patient,fonctPat_Patient,malChronPat_Patient) VALUES (?,?,?,?,?,?,?,?,?)";
    // String query ="INSERT INTO patient(nomPat_Patient)VALUES(?)";
      conn=ConnectDB.getConnection();
      ps=conn.prepareStatement(query);
     String nom=pa.getNom();
     String prenom=pa.getPrenom();
     String genre=pa.getGenre();
     String dateNais=pa.getDate();
     String address=pa.getAddresse();
     String pRefe=pa.getPerRef();
     String grSang=pa.getGrSang();
     String funct=pa.getFonction();
     String mChro=pa.getMalChro();
      ps.setString(1, nom);
      ps.setString(2, prenom);
      ps.setString(3, genre);
      ps.setString(4, dateNais);
      ps.setString(5, address);
      ps.setString(6, pRefe);
      ps.setString(7,grSang);
      ps.setString(8, funct);
      ps.setString(9, mChro);
      ps.executeUpdate();
      conn.close();
       
  }
  public static void modifier(Patient pa)throws Exception
  {
      String query="UPDATE patient SET nomPat_Patient=?,prenPat_Patient=?,genrePat_Patient=?,dateNais_Patient=?,addrPat_Patient=?,perRefPat_Patient=?,grSangPat_Patient=?,fonctPat_Patient=?,malChronPat_Patient=? WHERE idPat_Patient=? ";
              
     conn=ConnectDB.getConnection();
      ps=conn.prepareStatement(query);
      ps.setInt(0, pa.getIdp());
      ps.setString(1, pa.getNom());
      ps.setString(2, pa.getPrenom());
      ps.setString(3, pa.getGenre());
      ps.setString(4, pa.getDate());
      ps.setString(5, pa.getAddresse());
      ps.setString(6, pa.getPerRef());
      ps.setString(7, pa.getGrSang());
      ps.setString(8, pa.getFonction());
      ps.setString(9, pa.getMalChro());
      
      ps.executeUpdate();
      conn.close();

  }
  public static void rechercher(Patient pa)throws Exception
  {

  }
  public static void supprimer(Patient pa)throws Exception
  {
      String query="DELETE FROM patient   WHERE idPat_Patient= ?";
              
     conn=ConnectDB.getConnection();
      ps=conn.prepareStatement(query);
      ps.setInt(1, pa.getIdp());
      ps.executeUpdate();
      conn.close();
  }   
  ///-------------------end patient-------------------------------------------------
     public static ArrayList<Examen> getExamen()throws Exception
    {
        ArrayList<Examen> exa = new ArrayList();
        try
        {
         conn=ConnectDB.getConnection();
         String query="SELECT * FROM examen ";
         st = conn.createStatement();
         rs=st.executeQuery(query);
         Examen exaVar;
         
         while(rs.next())
         {
               exaVar = new Examen();
               exaVar.setId(rs.getInt("idExa_Examen"));
               exaVar.setDate(rs.getString("dateExa_Examen"));
               exaVar.setPrix(rs.getInt("prixExa_Examen"));
               exaVar.setResult(rs.getString("resultExa_Examen"));
               exaVar.setType(rs.getString("typeExa_Examen"));
               //exaVar.setType(rs.getString("tyExa_Examen"));
               exa.add(exaVar);
          
        
         }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return exa;
        
    }
   
  public static void insererexamen(Examen exa)throws Exception
  {
      String query="INSERT INTO  examen(dateExa_Examen,prixExa_Examen,resultExa_Examen,typeExa_Examen) VALUES (?,?,?,?)";
     conn=ConnectDB.getConnection();
      ps=conn.prepareStatement(query);
     String date=exa.getDate();
     int price=exa.getPrix();
     String resultat=exa.getResult();
     String type=exa.getType();
      ps.setString(1, date);
      ps.setInt(2, price);
      ps.setString(3, resultat);
      ps.setString(4, type);
      ps.executeUpdate();
      conn.close();
        
  }
  public static void modifier(Examen exa)throws Exception
  {
      String query="UPDATE examen SET dateExa_Examen=?,prixExa_Examen=?,resultExa_Examen=?,typeExa_Examen=? WHERE idExa_Examen=? ";
              
     conn=ConnectDB.getConnection();
      ps=conn.prepareStatement(query);
      ps.setInt(0, exa.getId());
      ps.setString(1, exa.getDate());
      ps.setInt(2, exa.getPrix());
      ps.setString(3, exa.getResult());
      ps.setString(4, exa.getType());
      
      
      ps.executeUpdate();
      conn.close();

  }
  public static void rechercher(Examen exa)throws Exception
  {

  }
  public static void supprimer(Examen exa)throws Exception
  {
      String query="DELETE FROM examen   WHERE idExa_Examen= ?";
              
     conn=ConnectDB.getConnection();
      ps=conn.prepareStatement(query);
      ps.setInt(1, exa.getId());
      ps.executeUpdate();
      conn.close();
  }   
  //beneficier
  public static ArrayList<Beneficier> getBeneficier()throws Exception
    {
        ArrayList<Beneficier> ben = new ArrayList();
        try
        {
         conn=ConnectDB.getConnection();
         //String query="SELECT patient.*,beneficier.*,examen.* FROM patient,beneficier,examen WHERE patient.idPat_Patient=beneficier.idPat_Patient AND examen.idExa_Examen=beneficier.idExa_Examen";
         String query="SELECT beneficier.*,patient.nomPat_Patient,examen.typeExa_Examen FROM beneficier,patient,examen WHERE beneficier.idPat_Patient=patient.idPat_Patient AND beneficier.idExa_Examen=examen.idExa_Examen";
         st = conn.createStatement();
         rs=st.executeQuery(query);
         Beneficier benVar;
         
         while(rs.next())
         {
               benVar = new Beneficier();
               benVar.setIdBen(rs.getInt("id_beneficier"));
               benVar.setDate(rs.getString("date"));
               benVar.setComment(rs.getString("commantaire"));
               benVar.setNomPat(rs.getString("idPat_Patient"));
               benVar.setTypeExam(rs.getString("idExa_Examen"));
              
               ben.add(benVar);
         
        
         }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return ben;
        
    }
   
  public static void insererbeneficier(Beneficier ben)throws Exception
  {
      String query="INSERT INTO beneficier (date,commantaire,idPat_Patient,idExa_Examen) VALUES (?,?,?,?)";
     conn=ConnectDB.getConnection();
      ps=conn.prepareStatement(query);
      String date=ben.getDate();
      String commentaire=ben.getComment();
//      String nom=ben.getNomPat();
//      String type=ben.getTypeExam();
      int idPa=ben.getIdPat();
      int idEX=ben.getIdEx();
      ps.setString(1, date);
      ps.setString(2, commentaire);
//      ps.setString(3, nom);
//      ps.setString(4, type);
ps.setInt(3, idPa);
ps.setInt(4, idEX);
      ps.executeUpdate();
      conn.close();        
  }
  public static void modifierbeneficier(Beneficier ben)throws Exception
  {
      String query="UPDATE beneficier SET date=?,commantaire=?,idPat_Patient=?,idExa_Examen=?  WHERE id_beneficier= ?";
              
     conn=ConnectDB.getConnection();
      ps=conn.prepareStatement(query);
      
      ps.setString(1, ben.getDate());
      ps.setString(2, ben.getComment());
      ps.setString(3, ben.getNomPat());
      ps.setString(4, ben.getTypeExam());
      ps.executeUpdate();
      conn.close();
  }

  public static void supprimerbeneficier(Beneficier bn)throws Exception
  {
      String query="DELETE FROM beneficier   WHERE id_beneficier= ?";
              
     conn=ConnectDB.getConnection();
      ps=conn.prepareStatement(query);
      ps.setInt(1, bn.getIdBen());
      ps.executeUpdate();
      conn.close();
  }
  
 

    

//    public static void modifier(Examen exa) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public static void insererbeneficier(Beneficier ben, ArrayList<Patient> pa) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public static void supprimerbeneficier(DefaultTableModel benef) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}