<%--
    Document   : V_MontarDocumentosInscripcion
    Created on : 10/02/2011, 08:20:48 PM
    Author     : Gurren Lagann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %>

<html:html>

    <head>
        <title><bean:message key="V_ConsultarJurados.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
    </head>

    <body>
        <div id="menu">
            <ul id="nav">
                <li><html:link action="/A_Pre_GestionarCulminacion.do"><bean:message key="V_GestionarPasantia.label2"/><%-- Regresar --%></html:link></li>
                <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_GestionarPasantia.label3"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>
            </ul>
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
                            <center>

                                <table>
                                    <tr>
                                        <td align="center" colspan="2">
                                            <font size="10">Introduzca los criterios de búsqueda</font>
                                            <br><br><br><br><br>
                                            <html:form action="/A_ConsultarJurados" method="post" enctype="multipart/form-data">
                                                <br>
                                                <html:select property="filtro">
                                                    <html:option value="Pasantia">Sólo Pasantías</html:option>
                                                    <html:option value="PPG">Sólo Proyectos de Grado</html:option>
                                                    <html:option value="Todo">Pasantías y Proyectos de Grado</html:option>
                                                </html:select>

                                                <br><br><br>

                                        </tr>
                                        <tr>
                                            <td align="left" colspan="2">
                                                <font color="red"><html:errors/></font>
                                        </tr>
                                        <tr>
                                            <td align="right">
                                                Departamento del Jurado
                                            </td>
                                            <td align="left">
                                                <html:select property="dptoJurado">
                                                    <logic:iterate id="d" name="Dpto">
                                                <option value = <bean:write name="d" filter='false'/>><bean:write name="d" filter='false'/>
                                        </tr>
                                                </logic:iterate>
                                            </html:select>
                                        <br><br><br>
                                        <br>
                                        <br>

                                        <tr>
                                            <td align="right">
                                                Nombre del Profesor
                                            </td>
                                            <td align="left">
                                                <html:text styleId="1508113" property="nombreProfesor" size="28"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right">
                                                Máximo de proyectos asignados
                                            </td>
                                            <td align="left">
                                                <html:text styleId="1508113" property="tutoreos" size="28" value='5'/>
                                            </td>
                                        </tr>
                                        <br><br><br>
                                        <tr>
                                            <td align="center" colspan="2">
                                                <br><br>
                                                <html:submit>Realizar Consulta</html:submit>
                                                <br><br><br>
                                            </td>
                                        </tr>
                                    </table>
                                </center>

                            </html:form>

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