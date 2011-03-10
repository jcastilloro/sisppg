<%--
    Document   : Profesores
    Created on : Feb 24, 2011, 1:14:48 PM
    Author     : chitty
--%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"%>
<%@ page language="java" contentType="text/html;charset=ISO-8859-1" import="java.util.*"%>

<html:html>
    <head>
        <title><bean:message key="V_GestionarConsultaCoordinacion.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
    </head>

    <body>
        <div id="menu">
            <ul id="nav">
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
                            <center>
                                <br><br>
                                <h3> Profesores</h3>
                                <br><br>
                                <table border="1" width="400px">
                                    <tr><th>Nombre</th><th>Área</th><th>Departamento</th></tr>
                                    <logic:empty name="Profs">
                                        ¡No hay profesores!
                                    </logic:empty>
                                    <logic:notEmpty name="Profs">
                                        <logic:iterate id="p" name="Profs">
                                            <bean:write name="p" filter="false"/>

                                        </logic:iterate>
                                    </logic:notEmpty>
                                </table>
                                <br><br><br><br></center>
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