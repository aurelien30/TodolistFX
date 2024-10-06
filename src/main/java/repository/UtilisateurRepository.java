package repository;



import database.Database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

public class UtilisateurRepository {


    public static void inscription(String nom, String prenom, String email, String mot_de_passe) throws SQLException {
        Database db = new Database();
        db.getUrl();
        db.getConnection();
        Connection cnx;
        Connection maConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cours_todolist","root","");

        PreparedStatement requetePrepareInsert =
                maConnection.prepareStatement(
                        "INSERT INTO Utilisateur (nom,prenom,email,mot_de_passe) VALUES (?,?,?,?)");

        requetePrepareInsert.setString(1,nom);
        requetePrepareInsert.setString(2,prenom);
        requetePrepareInsert.setString(3,email);
        requetePrepareInsert.setString(3,mot_de_passe);

        requetePrepareInsert.executeUpdate();


    }
}
