
package model;


public class Xboxgames {
    
    private int gameID;
    private String gameTitle;
    private int gameReleaseDate;
    private String gameDeveloper;
    private String gameRating;
    
    public Xboxgames() {
        this.gameID = 0;
        this.gameTitle = "";
        this.gameReleaseDate = 0;
        this.gameDeveloper = "";
        this.gameRating = "";
    }
    
    public Xboxgames(int gameID, String gameTitle, int gameReleaseDate, String gameDeveloper, String gameRating) {
        this.gameID = gameID;
        this.gameTitle = gameTitle;
        this.gameReleaseDate = gameReleaseDate;
        this.gameDeveloper = gameDeveloper;
        this.gameRating = gameRating;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public int getGameReleaseDate() {
        return gameReleaseDate;
    }

    public void setGameReleaseDate(int gameReleaseDate) {
        this.gameReleaseDate = gameReleaseDate;
    }

    public String getGameDeveloper() {
        return gameDeveloper;
    }

    public void setGameDeveloper(String gameDeveloper) {
        this.gameDeveloper = gameDeveloper;
    }

    public String getGameRating() {
        return gameRating;
    }

    public void setGameRating(String gameRating) {
        this.gameRating = gameRating;
    }

    @Override
    public String toString() {
        return "Xboxgames{" + "gameID=" + gameID + ", gameTitle=" + gameTitle + ", gameReleaseDate=" + gameReleaseDate + ", gameDeveloper=" + gameDeveloper + ", gameRating=" + gameRating + '}';
    }
       
    
}
