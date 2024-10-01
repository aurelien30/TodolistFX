package database;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;


public class Database {
    public String serveur = "localhost";
    public String NomDeLaBase= "cours_todolist";

    public String utilisateur ="root" ;
    public String Motdepasse = "admin";



    public String getUrl() {
        String url ="jdbc:mysql://localhost:3306/cours_todolist?serverTimezone=UTC ";
        return url;

    }

    public  Connection getConnection(){
        try{
            Connection cnx = DriverManager.getConnection(this.getUrl(),this.utilisateur,this.Motdepasse);
            System.out.println("Etat de la connexion :");
            System.out.println(cnx.isClosed()?"fermée":"ouverte \r\n");
            return cnx;
        }catch (SQLException e){
            System.out.println("erreur lors de la tentative de connexion à la base de données");
            e.printStackTrace();
            return null;
        }
    }
}
