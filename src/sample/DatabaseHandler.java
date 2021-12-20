package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DatabaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException,SQLException{
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbport + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString,
                dbUser, dbPass);
        return dbConnection;
    }

    public void SignUpUser(String name, String surname, String Email, String password){
        String insert = "INSERT INTO "+ Const.USER_TABLE + "(" +
                Const.USERS_NAME + "," +Const.USERS_SURNAME + ","+
                Const.USERS_EMAIL + ","+ Const.USERS_PASSWORD + ")"+"VALUES(?,?,?,?)";



        try {
            PreparedStatement prt = getDbConnection().prepareStatement(insert);
            prt.setString(1, name);
            prt.setString(2, surname);
            prt.setString(3, Email);
            prt.setString(4, password);

            prt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
