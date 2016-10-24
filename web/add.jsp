<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Game</title>
    </head>
    <body>
        <h1>Add A New Game</h1>
        
        <form name ="addForm" action="addXboxgame" method="get">
            
            <label>Game Title:</label>
            <input type="text" name="title" value=""/>
            <br>
            <label>Game Release Date:</label>
            <input type="text" name="releaseDate" value=""/>
            <br>
            <label>Game Developer:</label>
            <input type="text" name="developer" value=""/>
            <br>
            <label>Game Rating:</label>
            <input type="text" name="rating" value=""/>
            <br>
            <input type="submit" name="submit" value="Submit"/>
            
            
        </form>
    </body>
</html>
