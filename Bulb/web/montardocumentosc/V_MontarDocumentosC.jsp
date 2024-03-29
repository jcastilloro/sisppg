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

        <title><bean:message key="V_MontarDocumentosC.title"/></title>

        <html:base/>

        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>

        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>

        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>


    </head>
    <body>

        <div id="menu">

            <ul id="nav">

                    <li><html:link action="/A_Pre_GestionarCulminacion.do"><bean:message key="V_GestionarPasantia.label7"/><%-- Regresar --%></html:link></li>
                </ul>
                <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesión --%></html:link>
        </div>

        <div id="header">



        </div>

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
                                <html:form action="/A_MontarDocumentosC" method="post" enctype="multipart/form-data">
                                    <table>
                                        <tr>
                                            <td align="center" colspan="2">
                                                <font size="4">Ruta al Documento</font>
                                        </tr>

                                        <tr>
                                            <td align="left" colspan="2">
                                                <font color="red"><html:errors/></font>
                                        </tr>



                                        <tr>
                                            <td align="right">
                                                Documento
                                            </td>
                                            <td align="left">
                                                <html:file property="theFile"/>
                                            </td>
                                        </tr>


                                        <tr>
                                            <td align="center" colspan="2">
                                                <html:submit>Montar Documento</html:submit>
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
