/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.Factory.conn;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class ConnectDB {

    /**
     *
     * @return
     */
    public static Connection getConnection(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hopital(2)","root","");
}catch(Exception e){
    e.printStackTrace();
}
return conn;
}
    public static void closeStatement(Statement st){
    try{
        if(conn!=null){
        st.close();
        }
    }catch(Exception e){
    e.printStackTrace();
    }
    }
    
    public static void closeConnection(Connection conn){
        try{
            if(conn!=null){
            conn.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args []){
    Connection conn=null;
    try{
    conn=ConnectDB.getConnection();
    System.out.println("Connexion reussie");
    }finally{
    ConnectDB.closeConnection(conn);
    }
    }

    private static class Statement {

        public Statement() {
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
}
