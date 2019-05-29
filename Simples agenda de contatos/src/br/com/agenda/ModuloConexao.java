/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda;

/**
 * Simples agenda de contatos - DAL (Data Acces Layer)
 * @author José de Assis
 */

// importando recursos para trabalhar com a conexão com o banco de dados
import java.sql.*;
public class ModuloConexao {
    //criando um método para conectar o banco de dados
    //método com retorno (sem void)
    //Connection -> biblioteca do pacote java.sql responsável pela conexão
    public static Connection conector(){
        //criando uma variável para apoio a conexão
        //atribuimos o valor nulo a esta variável por questões de segurança
        java.sql.Connection conexao = null;
        //carregar o driver correspondente ao tipo banco de dados
        //criar uma variável e carregar a biblioteca externa
        String driver = "com.mysql.jdbc.Driver";
        //Criando variáveis para armazenar informações sobre o banco de dados
        String url = "jdbc:mysql://10.26.49.250:3306/dbcontatos?useSSL=false";
        String user = "admin";
        String password = "Senac@tat123";
        //estabelencendo a conexão com o banco
        //neste caso usamos uma estrutura do tipo try catch para tratar exceções
        try {
            Class.forName(driver); //driver de conexão(MySQL)
            conexao = DriverManager.getConnection(url,user,password); //parâmetros
            return conexao;
        } catch (Exception e) {
           //System.out.println(e); //entendendo o problema
            return null;
        }        
    }
}
