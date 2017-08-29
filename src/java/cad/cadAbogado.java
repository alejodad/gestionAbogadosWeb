/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;
import conexion.ConexionMysql;
import java.sql.*;
import java.util.ArrayList;
import modelo.Abogado;
import modelo.Especialidad;
/**
 *
 * @author Ale
 */
public class cadAbogado {
    private static ConexionMysql cnx =  new ConexionMysql();
    private static PreparedStatement sentencia;
    private static ResultSet resultado;
    private static String query="";
    public static String mensaje="";
    
    public static ArrayList<Especialidad> mostrarEspecialidades(){ //vamos ver listas!! 
        ArrayList<Especialidad> especilidades = new ArrayList();
        try {
        query="select * from tbl_especialidad";
        sentencia=cnx.Conectar().prepareStatement(query);
        resultado=sentencia.executeQuery();
            while (resultado.next()) {                
                Especialidad una = new Especialidad();
                una.setIdEspecialidad(resultado.getString("idEspecialidad"));
                una.setNombreEspecialidad(resultado.getString("nombreEspecialidad"));
                especilidades.add(una);
            }
        } catch (Exception e) {
        }
        return especilidades;
        
        
    }
    
    public static boolean insertarAbogado(Abogado uno ){
        try {                   
        query="insert into tbl_abogado values (?,?,?,?,?)";
        sentencia=cnx.Conectar().prepareStatement(query);
        sentencia.setString(1, uno.getCedulaAbogado());
        sentencia.setString(2, uno.getNombreAbogado());
        sentencia.setString(3, uno.getNumeroTelefonoAbogado());
        sentencia.setString(4, uno.getBiograiaAbogado());
        sentencia.setString(5, uno.getIdEspecialidad());
        int numero=sentencia.executeUpdate();
        if (numero >0){
            mensaje="Se inserto correctamente";         
        }
           return true;
        }
         catch (SQLException e) {
             mensaje="No se insertío\nRazon:\n"+e.getMessage();
             return false;
        }
        }
    
    public static boolean modificarAbogado(Abogado uno ){
        try {                   
        query="UPDATE tbl_abogado  SET nombreAbogado = ?, numeroTelefonoAbogado = ?, biograiaAbogado = ?, idEspecialidad = ? WHERE cedulaAbogado =?; ";
        sentencia=cnx.Conectar().prepareStatement(query);
        sentencia.setString(5, uno.getCedulaAbogado());
        sentencia.setString(1, uno.getNombreAbogado());
        sentencia.setString(2, uno.getNumeroTelefonoAbogado());
        sentencia.setString(3, uno.getBiograiaAbogado());
        sentencia.setString(4, uno.getIdEspecialidad());
        int numero=sentencia.executeUpdate();
        if (numero >0){
            mensaje="Se modifico correctamente";         
        }
           return true;
        }
         catch (SQLException e) {
             mensaje="No se modifico\nRazon:\n"+e.getMessage();
             return false;
        }
        }
    
    public static boolean eliminarAbogado(String id) {
        try {
            query="delete from tbl_abogado where cedulaAbogado = (?)";
        sentencia=cnx.Conectar().prepareStatement(query);
        sentencia.setString(1, id);
        int rowsAffected=sentencia.executeUpdate();
        if (rowsAffected >0){
            mensaje="Se borro correctamente";         
        }
           return true;
        }
         catch (SQLException e) {
             mensaje=e.getMessage();
             return false;
        }
        }
        
            
            
    
    public static ArrayList<Abogado> listarAbogados(){
            ArrayList<Abogado>datos= new ArrayList();        
        try {
            query="select * from tbl_abogado";
            sentencia=cnx.Conectar().prepareStatement(query);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
            Abogado uno = new Abogado();
            uno.setCedulaAbogado(resultado.getString("cedulaAbogado"));
            uno.setNombreAbogado(resultado.getString("nombreAbogado"));
            uno.setNumeroTelefonoAbogado(resultado.getString("numeroTelefonoAbogado"));
            uno.setBiograiaAbogado(resultado.getString("biograiaAbogado"));
            uno.setIdEspecialidad(resultado.getString("idEspecialidad"));
            datos.add(uno);
        }
           
        } catch (SQLException e) {
            mensaje=e.getMessage();
        }
        return datos;
    }
    
    public static ArrayList<Abogado> buscarAbogados(String palabra, String busqueda){
            ArrayList<Abogado>datos= new ArrayList();        
        try {
            query="SELECT * FROM tbl_abogado WHERE "+palabra+" LIKE '%"+busqueda+"%';";
            sentencia=cnx.Conectar().prepareStatement(query);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
            Abogado uno = new Abogado();
            uno.setCedulaAbogado(resultado.getString("cedulaAbogado"));
            uno.setNombreAbogado(resultado.getString("nombreAbogado"));
            uno.setNumeroTelefonoAbogado(resultado.getString("numeroTelefonoAbogado"));
            uno.setBiograiaAbogado(resultado.getString("biograiaAbogado"));
            uno.setIdEspecialidad(resultado.getString("idEspecialidad"));
            datos.add(uno);
        }
           
        } catch (SQLException e) {
            mensaje=e.getMessage();
        }
        return datos;
    }
    public static Abogado buscarUnAbogado(Abogado uno) {
        try {
            query="select * from tbl_abogado WHERE cedulaAbogado= '"+uno.getCedulaAbogado()+"'";
            sentencia=cnx.Conectar().prepareStatement(query);
            resultado=sentencia.executeQuery();
            while(resultado.next()){
                uno.setNombreAbogado(resultado.getString("nombreAbogado"));
                uno.setNumeroTelefonoAbogado(resultado.getString("numeroTelefonoAbogado"));
                uno.setBiograiaAbogado(resultado.getString("biograiaAbogado"));
                uno.setIdEspecialidad(resultado.getString("idEspecialidad"));
            }
            
        } catch (Exception e) {
            mensaje=e.getMessage();
            
        }
        return uno;
    }
    
    
}
