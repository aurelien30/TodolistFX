package repository;



import database.Database;

import java.sql.Connection;

public class UtilisateurRepository {


    public void inscription(){
        Database db = new Database();
        db.getConnection();

    }
}
