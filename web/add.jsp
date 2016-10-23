<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Game</title>
    </head>
    <body>
        <h1>Add A New Game</h1>
        
        <form name ="addForm" action="addGame" method="get">
            
            <label>Game Title:</label>
            <input type="text" name="Title" value=""/>
            <br>
            <label>Game ReleaseDate:</label>
            <input type="text" name="ReleaseDate" value=""/>
            <br>
            <label>Game Developer:</label>
            <input type="text" name="Developer" value=""/>
            <br>
            <label>Game Rating:</label>
            <input type="text" name="Rating" value=""/>
            <br>
            <input type="submit" name="submit" value="Submit"/>
            
            
        </form>
    </body>
</html>
