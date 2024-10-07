package repository;



import database.Database;
import model.Utilisateur;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

public class UtilisateurRepository {


    public void inscription(Utilisateur utilisateur) throws SQLException {
        Database db = new Database();
        db.getUrl();
        db.getConnection();
        Connection maConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cours_todolist","root","");

        PreparedStatement requetePrepareInsert =
                db.getConnection().prepareStatement (
                        "INSERT INTO Utilisateur (nom,prenom,email,mot_de_passe) VALUES (?,?,?,?)");

        requetePrepareInsert.setString(1, utilisateur.getNom());
        requetePrepareInsert.setString(2, utilisateur.getPrenom());
        requetePrepareInsert.setString(3, utilisateur.getEmail());
        requetePrepareInsert.setString(4, utilisateur.getMot_de_passe());

        requetePrepareInsert.executeUpdate();


    }
    public void getutilisateurByEmail(Utilisateur utilisateur) throws SQLException {
        Database db = new Database();
        db.getConnection();

        PreparedStatement requPrepareSelect = db.getConnection().prepareStatement(
                "SELECT * FROM Utilisateur WHERE email = ?"
        );

        requPrepareSelect.setString(1,utilisateur.getEmail());

        ResultSet resultatsRequetes = requPrepareSelect.executeQuery();

    }

}
