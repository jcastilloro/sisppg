<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_Inscripcion.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
    </head>

    <body>  
          
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_LlenarFInscripcion.do"><bean:message key="V_Inscripcion.label0"/><%-- Llenar Formulario de Inscripci&oacute;n --%></html:link></li>
                    <li><html:link action="/A_Pre_ConsultarInscripcion.do"><bean:message key="V_Inscripcion.label1"/><%-- Consultar Inscripci&oacute;n --%></html:link></li>
                    <li><html:link action="/A_Pre_MontarDocumentosInscripcion.do"><bean:message key="V_Inscripcion.label2"/><%-- Montar Documento --%></html:link></li>
                </ul>
                <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesi�n --%></html:link>
            </div>
        <div id="header">
        </div>
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            <h3>${empty msg ? "" : msg}</h3>
                            <br>
                            
                            <br>
                            <br>
                            
                            <br>
                            <br>
                            
                            <br>
                            
                            <br>
                            <br>
                            
                            <br>
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