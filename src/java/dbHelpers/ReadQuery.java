
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


public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery (){
        
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doRead(){
        
        try {
            String query = "SELECT * FROM xboxgames ORDER BY gameID ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getHTMLtable(){
        
        String table = "";
        table += "<table class=\"read\">";
        
        table += "<tr>";
            table += "<th>GameID</th>";
            table += "<th>GameTitle</th>";
            table += "<th>GameReleaseDate</th>";
            table += "<th>GameDeveloper</th>";
            table += "<th>GameRating</th>";
            table += "<th>Change / Remove</th>";
        table += "</tr>";
        
        try {
            while(this.results.next()){
                
                Xboxgames xboxgame = new Xboxgames();
                xboxgame.setGameID(this.results.getInt("gameID"));
                xboxgame.setGameTitle(this.results.getString("gameTitle"));
                xboxgame.setGameReleaseDate(this.results.getInt("gameReleaseDate"));
                xboxgame.setGameDeveloper(this.results.getString("gameDeveloper"));
                xboxgame.setGameRating(this.results.getString("gameRating"));
                              
                
                table += "<tr>";
                table += "<td>";
                table += xboxgame.getGameID();
                table += "</td>";
                
                table += "<td>";
                table += xboxgame.getGameTitle();
                table += "</td>";
                
                table += "<td>";
                table += xboxgame.getGameReleaseDate();
                table += "</td>";
                
                table += "<td>";
                table += xboxgame.getGameDeveloper();
                table += "</td>";
                
                table += "<td>";
                table += xboxgame.getGameRating();
                table += "</td>";

                table += "<td>";
                table += "<a href=update?gameID=" + xboxgame.getGameID() + "> Update </a>" + "<a href=delete?gameID=" + xboxgame.getGameID() + "> / Delete </a>";
                table += "</td>";      
                
                table += "</tr>";  
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        table += "</table";
            return table;
    }
}
