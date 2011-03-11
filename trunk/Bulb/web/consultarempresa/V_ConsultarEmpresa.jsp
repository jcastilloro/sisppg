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
        <title>Consultar Empresa</title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
    </head>

    <body>
        <div id="menu">
            <ul id="nav">
                <li><html:link action="/A_Pre_VistaUsuarioCCTDS.do"><bean:message key="V_VistaUsuarioCCTDS.label0"/><%-- Crear Alarma --%></html:link></li>
                <li><html:link action="/A_Pre_GestionarCorreos.do">Gestionar Correos</html:link></li>
                <li><html:link action="/A_Pre_VistaUsuarioCCTDS.do"><bean:message key="V_VistaUsuarioCCTDS.label1"/><%-- Expedir Constancia de Tutor --%></html:link></li>
                <li><html:link action="/A_Pre_RevisarDocumentos.do"><bean:message key="V_VistaUsuarioCCTDS.label2"/><%-- Revisar Documentos --%></html:link></li>
                <li><html:link action="/A_Pre_GestionarConsultaCCTDS.do"><bean:message key="V_VistaUsuarioCCTDS.label3"/><%-- Gestionar Consulta --%></html:link></li>
                <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesión --%></html:link>
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
                                                    <html:form action="/A_ConsultarEmpresa" method="post" enctype="multipart/form-data">
                                                        <br>


                                                </tr>
                                                <tr>
                                                    <td align="left" colspan="2">
                                                        <font color="red"><html:errors/></font>
                                                </tr>

                                                <br><br><br>
                                                <br>
                                                <br>

                                                <tr>
                                                    <td align="right">
                                                        Rif
                                                    </td>
                                                    <td align="left">
                                                        <html:text styleId="1508113" property="rif" size="28"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td align="right">
                                                        Nombre
                                                    </td>
                                                    <td align="left">
                                                        <html:text styleId="1508113" property="nombre" size="28" />
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td align="right">
                                                        Dirección
                                                    </td>
                                                    <td align="left">
                                                        <html:text styleId="1508113" property="direccion" size="28" />
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td align="right">
                                                        País
                                                    </td>
                                                    <td align="left">
                                                        <html:text styleId="1508113" property="pais" size="28" />
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td align="right">
                                                        Ciudad
                                                    </td>
                                                    <td align="left">
                                                        <html:text styleId="1508113" property="ciudad" size="28" />
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td align="right">
                                                        Nombre de Usuario
                                                    </td>
                                                    <td align="left">
                                                        <html:text styleId="1508113" property="login" size="28" />
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