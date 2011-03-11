<%-- 
    Document   : V_AgregarDpto
    Created on : Mar 10, 2011, 8:32:09 PM
    Author     : chitty
--%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>

    <head>
        <title><bean:message key="V_ConsultarDpto.title"/></title>
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
            <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesión --%></html:link></p>
        </div>

        <div id="header"></div>

	<!-- end #header -->

        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            <br>
                            <h3 align="center">${empty msg ? "" : msg}</h3>
                            <br>
                            <br>
                            <html:form action="/A_AgregarDpto.do" method="post">
                            <table border="0" align="center">
                                <tr><td><bean:message key="F_AgregarDpto.label0"/><%-- Nombre del Departamento --%></td>
                                    <td><html:text property="dpto" size="30"/></td>
                                <tr><td></td>
                                    <td><html:submit styleClass="button"><bean:message key="Agregar.label"/><%-- Agregar --%></html:submit></td></tr>
                            </table>
                            </html:form>
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
