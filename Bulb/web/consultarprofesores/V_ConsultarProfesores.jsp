<%--
    Document   : ConsultarProfesores
    Created on : Feb 18, 2011, 10:14:48 PM
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
            <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesi�n --%></html:link>
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
                                <br>
                                <html:form action="/A_Profesores.do" method="post" focus="departamento">

                                    <table border="0" width="450px">

                                        <tr><td>
                                                <bean:message key="V_ConsultarProfesores.label1"/><%-- Dpto --%>
                                            </td>
                                            <td>
                                                <select name="departamento">
                                                    <logic:empty name="L_Dpts">
                                                        <option value="todos">Todos</option>
                                                    </logic:empty>
                                                    <logic:notEmpty name="L_Dpts">
                                                        <option value="todos">Todos</option>
                                                        <logic:iterate id="d" name="L_Dpts">
                                                            <option value = '<bean:write name="d" filter='false'/>'><bean:write name="d" filter='false'/></option>
                                                        </logic:iterate>
                                                    </logic:notEmpty>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr><td>
                                                <bean:message key="V_ConsultarProfesores.label2"/><%-- Area --%>
                                            </td>
                                            <td>
                                                <select name="area">
                                                    <logic:empty name="L_Area">
                                                        <option value="todas">Todas</option>
                                                    </logic:empty>
                                                    <logic:notEmpty name="L_Area">
                                                        <option value="todas">Todas</option>
                                                        <logic:iterate id="a" name="L_Area">
                                                            <option value = '<bean:write name="a" filter='false'/>'><bean:write name="a" filter='false'/> </option>
                                                        </logic:iterate>
                                                    </logic:notEmpty>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr><td></td>
                                            <td>
                                                <br><html:submit><bean:message key="V_ConsultarProfesores.label0"/><%-- Consultar --%></html:submit>
                                            </td>
                                        </tr>

                                    </table>
                                </center>
                            </html:form>
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