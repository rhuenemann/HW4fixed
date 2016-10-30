
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Xboxgames;


public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    
    private Xboxgames xboxgame = new Xboxgames();
    private int gameID;
    
    public ReadRecord (int gameID) {
    
    Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.gameID = gameID;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public void doRead() {
    
        try {
            //set up a string to hold our query
            String query = "SELECT * FROM xboxgames WHERE gameID = ?";
            
            //create a preparedstatement using our query string
            PreparedStatement ps = conn.prepareStatement (query);
            
            //fill in the prepared statement
            ps.setInt(1, gameID);
            
            //execute the query
            this.results = ps.executeQuery();
            
            this.results.next();
            
            xboxgame.setGameID(this.results.getInt("gameID"));
            xboxgame.setGameTitle(this.results.getString("gameTitle"));
            xboxgame.setGameReleaseDate(this.results.getInt("gameReleaseDate"));
            xboxgame.setGameDeveloper(this.results.getString("gameDeveloper"));
            xboxgame.setGameRating(this.results.getString("gameRating"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Xboxgames getXboxgame(){
        
        return this.xboxgame;
    }
    
}
