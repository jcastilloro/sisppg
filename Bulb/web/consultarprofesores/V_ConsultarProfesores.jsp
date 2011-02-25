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
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
    </head>

    <body>
        <div id="menu">
            <ul id="nav">
                <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_GestionarConsultaCoordinacion.label4"/><%-- Cerrar Sesión --%></html:link></li>
            </ul>
        </div>
        <div id="header">
        </div>

        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">

                            <br><br>
                            <h3> Profesores</h3>
                            <br>
                            <html:form action="/A_Profesores.do" method="post" focus="dpto">
                                <table border="1" width="450px">
                                    <tr><td>
                                            <bean:message key="V_ConsultarProfesores.label1"/><%-- Dpto --%>
                                        </td>
                                        <td>
                                            <select name="dpto">
                                                <option value="todos">Todos</option>
                                                <option value="Computación">Computación</option>
                                                <option value="pys">Procesos y Sistemas</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr><td>
                                            <bean:message key="V_ConsultarProfesores.label2"/><%-- Area --%>
                                        </td>
                                        <td>
                                            <select name="area">
                                                <logic:empty name="L_Area">
                                                    <option value="1">Todas</option>
                                                </logic:empty>
                                                <logic:notEmpty name="L_Area">
                                                    <option value="1">Todas</option>
                                                    <logic:iterate id="a" name="L_Area">
                                                        <option value = <bean:write name="a" property="nombreArea" /> ><bean:write name="a" property="nombreArea" /></option>
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