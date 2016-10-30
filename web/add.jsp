<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Game</title>
        <link rel="stylesheet" type="text/css" href="DbColorsCSS.css"/>
    </head>
    <body>
        <h1>Add A New Game</h1>
        
            <table class="add">
                
                <tr>                   
                    <td class="add">Game Title:</td>
                    <td><input type="text" name="title" value=""/></td>
                </tr>
                
                <tr>
                    <td class="add">Game Release Date:</td>
                    <td><input type="text" name="releaseDate" value=""/></td>
                </tr>
                
                <tr>
                    <td class="add">Game Developer:</td>
                    <td><input type="text" name="developer" value=""/></td>
                </tr>
                
                <tr>
                    <td class="add">Game Rating:</td>
                    <td><input type="text" name="rating" value=""/></td>
                </tr>
                
                <tr>
                    <td><input type="reset" name="reset" value="Clear   "/></td>
                    <td><input type="submit" name="submit" value="Submit"/></td>
                </tr>
            
        </table>
    </body>
</html>
