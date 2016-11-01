<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Game</title>
        <link rel="stylesheet" type="text/css" href="DbColorsCSS.css"/>
    </head>
    <body>


        <div class="wrap"> <!--div to hold all other divs -->

            <!--header-->
            <%@ include file="includes/header.jsp" %>

            <!--menu-->
            <%@ include file="includes/menu.jsp" %>

            <div class="main">
                <h1>Add A New Game</h1>

                <form name="addForm" action="addXboxgame" method="get">

                    <table class="add">

                        <tr>                   
                            <td class="right">Game Title:</td>
                            <td><input type="text" name="title" value=""/></td>
                        </tr>

                        <tr>
                            <td class="right">Game Release Date:</td>
                            <td><input type="text" name="releaseDate" value=""/></td>
                        </tr>

                        <tr>
                            <td class="right">Game Developer:</td>
                            <td><input type="text" name="developer" value=""/></td>
                        </tr>

                        <tr>
                            <td class="right">Game Rating:</td>
                            <td><input type="text" name="rating" value=""/></td>
                        </tr>

                        <tr>
                            <td><input type="reset" name="reset" value="Clear   "/></td>
                            <td><input type="submit" name="submit" value="Submit"/></td>
                        </tr>

                    </table>
                </form>

            </div>


            <!--footer-->
            <%@ include file="includes/footer.jsp" %>

        </div> 

    </body>
</html>
