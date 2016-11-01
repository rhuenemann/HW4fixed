<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="DbColorsCSS.css"/>
    </head>

    <% String table = (String) request.getAttribute("table");%>

    <body>

        <div class="wrap"> <!--div to hold all other divs -->

            <!--header-->
            <%@ include file="includes/header.jsp" %>

            <!--menu-->
            <%@ include file="includes/menu.jsp" %>

            <div class="main">
                <h1>Xbox Games</h1>

                <%= table%>

                <br><br>

            </div>


            <!--footer-->
            <%@ include file="includes/footer.jsp" %>

        </div> 


    </body>
</html>
