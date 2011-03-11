<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_VistaUsuarioCCTDS.title"/></title>
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
                <li><html:link action="/A_Pre_VistaUsuarioCCTDS.do"><bean:message key="V_VistaUsuarioCCTDS.label3"/><%-- Gestionar Consulta --%></html:link></li>
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
                            <br>
                            <br>
                            <br>
                          <h3 align="center"> ${empty msg ? "" : msg}</h3>
                            <br>
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