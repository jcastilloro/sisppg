<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_GestionarPreinscripcion.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_GestionarPreinscripcion.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_LlenarFormularioPreinscripcion.do"><bean:message key="V_GestionarPreinscripcion.label0"/><%-- Formulario de Preinscripci&oacute;n --%></html:link></li>
                    <li><html:link action="/A_Pre_ConsultarPreinscripcion.do"><bean:message key="V_GestionarPreinscripcion.label1"/><%-- Consultar Preinscripci&oacute;n --%></html:link></li>
                    <li><html:link action="/A_Pre_GestionarPasantia.do"><bean:message key="V_GestionarPreinscripcion.label2"/><%-- Regresar --%></html:link></li>
                    <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_GestionarPreinscripcion.label3"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>

                </ul>
            </div>
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            ${empty msg ? "" : msg}
                        </div>
                    </div>
                    <div id="right"><ul id="nav"><li><script type="text/javascript">var hb = new HelpBalloon({ dataURL: '//tooltip.do?V=V_GestionarPreinscripcion'});</script></li></ul></div>
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