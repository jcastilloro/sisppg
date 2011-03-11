<%-- 
    Document   : V_GestionarDepartamentos
    Created on : Feb 25, 2011, 8:57:10 AM
    Author     : chitty
--%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"%>
<html:html>
    <head>
        <title>Gestionar Departamentos</title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
    </head>
    
    <body>
        <div id="menu">
            <ul id="nav">
                <li><html:link action="/A_ConsultarDpto.do">Consultar</html:link></li>
                <li><html:link action="/A_Pre_AgregarDpto.do">Agregar</html:link></li>
                <li><html:link action="/A_GestionarDepartamentos.do">Modificar</html:link></li>
                <li><html:link action="/A_GestionarDepartamentos.do">Eliminar</html:link></li>
            </ul>
            <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesi�n --%></html:link></p>
            </div>
               <div id="header">
               </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">                            
                            <br>
                            <br>
                            <br>
                            <center><h2>${empty msg ? "" : msg}</h2></center>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                        </div>
                    </div>

                    <div class="clearer"></div>
                    <div class="bottom"></div>
                </div>
                <div class="clearer"></div>
            </div>
            <div class="clearer"></div>
        </div>
        <div id="end_body"></div>
        <div id="footer"> <bean:message key="bottom.label"/> </div>

    </body>
</html:html>