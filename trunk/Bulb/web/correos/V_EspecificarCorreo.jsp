<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title>Escribir Correo Electrónico</title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>

    </head>
    <body>

            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_VistaCoordinacion.do">Regresar</html:link></li>
                </ul>
                <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesión --%></html:link>
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
                            <h1>Estudiantes de la Carrera</h1>
                            <br>
                            <table border="1" align="center" width="400px">

                                <tr>
                                    <th>Carnet</th>
                                    <th>Nombre</th>
                                </tr>
                                <logic:empty name="Estudiantes">
                                    <span style="font-weight: bold;">No existen estudiantes de la carrera registrados en el sistema.</span>
                                </logic:empty>
                                <logic:notEmpty name="Estudiantes">
                                    <logic:iterate id="e" name="Estudiantes">
                                        <tr>
                                            <td><html:link action="/A_EnviarCorreo.do" paramName="e" paramProperty="carnetE" paramId="Carnet"><bean:write name="e" property="carnetE" /></html:link></td>
                                            <td><bean:write name="e" property="nombreE" /></td>

                                        </tr>
                                    </logic:iterate>
                                </logic:notEmpty>

                            </table>
                            <br>
                         <h3 align="center">${empty msg ? "" : msg}</h3>
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>

                        </div>
                    </div>

                    <div class="clearer"></div>
                    <div class="bottom"></div>

                <div class="clearer"></div>
            </div>
            <div class="clearer"></div>
        </div>
        </div>
        <div id="end_body"></div>
        <div id="footer"> <bean:message key="bottom.label"/> </div>

    </body>
</html:html>