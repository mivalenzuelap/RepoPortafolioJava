/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Marcelo
 */
public class Conexion {

//    static Connection cn;
//    static Statement st;
//    static ResultSet rs;
//
//    public Conexion() {
//    }
//
//    public static Connection getCn() {
//        return cn;
//    }
//
//    public static void setCn(Connection cn) {
//        Conexion.cn = cn;
//    }
//
//    public static Statement getSt() {
//        return st;
//    }
//
//    public static void setSt(Statement st) {
//        Conexion.st = st;
//    }
//
//    public static ResultSet getRs() {
//        return rs;
//    }
//
//    public static void setRs(ResultSet rs) {
//        Conexion.rs = rs;
//    }
  
    public static Connection getConexion() {
        Connection conexion = null;
        try {
            String dbUrl = "jdbc:oracle:thin:@portafolioduoc2018.cdhjyk24fxli.us-west-2.rds.amazonaws.com:1521:orcl";            
            Class.forName("oracle.jdbc.OracleDriver");
            conexion = DriverManager.getConnection(dbUrl, "portafolio", "AdminDb123456");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo establecer conexion \n"+e);
        }
        return conexion;
    }
    
            
}
