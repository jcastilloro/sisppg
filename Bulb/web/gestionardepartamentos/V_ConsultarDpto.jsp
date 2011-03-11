<%-- 
    Document   : V_ConsultarDpto
    Created on : Mar 10, 2011, 6:41:05 PM
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
                <li><html:link action="/A_GestionarDepartamentos.do">Agregar</html:link></li>
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
                            
                                
                                <logic:empty name="Dpto">
                                    <h2><center> ¡No hay Departamentos! </center></h2>
                                </logic:empty>
                                <logic:notEmpty name="Dpto">
                                    <table border="1" width="400px" align="center">
                                        <tr><th>Departamento</th></tr>
                                        <logic:iterate id="nombreDpto" name="Dpto">
                                        <tr><td><bean:write name="nombreDpto" filter="false"/></td></tr>
                                        </logic:iterate>
                                    </table>
                                </logic:notEmpty>
                            
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
