<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Xboxgames"%>
<% Xboxgames xboxgame = (Xboxgames) request.getAttribute("xboxgame");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Game</title>
        <link rel="stylesheet" type="text/css" href="DbColorsCSS.css"/>
    </head>
    <body>

        <div class="wrap"> <!--div to hold all other divs -->

            <!--header-->
            <%@ include file="includes/header.jsp" %>

            <!--menu-->
            <%@ include file="includes/menu.jsp" %>

            <div class="main">

                <h1>Update Game Record</h1>

                <form  name="updateForm" action="updateXboxgame" method="get">

                    <table class="update">
                        <tr>
                            <td class="right">Game ID:</td>
                            <td><input type="text" name="id" value="<%= xboxgame.getGameID()%>" readonly/></td>
                        </tr>

                        <tr>
                            <td class="right">Game Title:</td>
                            <td><input type="text" name="title" value="<%= xboxgame.getGameTitle()%>"/></td>
                        </tr>

                        <tr>
                            <td class="right">Game Release Date:</td>
                            <td><input type="text" name="releaseDate" value="<%= xboxgame.getGameReleaseDate()%>"/></td>
                        </tr>

                        <tr>
                            <td class="right">Game Developer:</td>
                            <td><input type="text" name="developer" value="<%= xboxgame.getGameDeveloper()%>"/></td>
                        </tr>

                        <tr>
                            <td class="right">Game Rating:</td>
                            <td><input type="text" name="rating" value="<%= xboxgame.getGameRating()%>"/></td>
                        </tr>

                        <tr>
                            <td><input type="reset" name="reset" value="Clear"/></td>
                            <td><input type="submit" name="submit" value="Update"/></td>
                        </tr>

                    </table>
                </form>

            </div>


            <!--footer-->
            <%@ include file="includes/footer.jsp" %>

        </div> 

    </body>
</html>
