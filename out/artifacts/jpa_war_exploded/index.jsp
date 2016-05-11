
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
    <head>
    <title>$Title$</title>
    </head>
    <body>
        <html:form action="/first.do" method="post">
            <html:text property="nom"/><html:errors property="nom"/> <br>
            <html:text property="prenom"/><html:errors property="prenom"/> <br>
            <html:submit value="Ajouter a la BDD !"/>
        </html:form>
    </body>
</html>
