<%--
    Document   : V_MontarDocumentosInscripcion
    Created on : 10/02/2011, 08:20:48 PM
    Author     : Gurren Lagann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"%>

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
                        <center>
                            <div class="content">
                                <br><br>
                                <h3> Jurados</h3>
                                <br><br>
                                <logic:empty name="Jurs">
                                    Consulta Vacía
                                </logic:empty>
                                <logic:notEmpty name="Jurs">
                                    <table border="1" width="400px">
                                        <tr><th>Nombre</th><th>Departamento</th><th>Proyectos Asignados</th><th>Próxima Defensa</th></tr>

                                        <logic:iterate id="p" name="Resultado">
                                            <bean:write name="p" filter="false"/>
                                        </logic:iterate>
                                </logic:notEmpty>
                                </table>
                                <br><br><br><br>
                             </div>
                        </center>

                    </div>
                </div>
                <div class="clearer"></div>
                <div class="bottom"></div>
           </div>
           <div class="clearer"></div>
      </div>
      <div class="clearer"></div>
      <div id="end_body"></div>
      <div id="footer"> <bean:message key="bottom.label"/> </div>
      
    </body>

</html:html>