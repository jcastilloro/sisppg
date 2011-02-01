<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_VistaEmpresa.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>

    </head>
    <body>
        
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_EvaluarPasantia.do"><bean:message key="V_VistaEmpresa.label1"/><%-- Evaluar Pasantias --%></html:link></li>
                    <li><html:link action="/A_Pre_ModificarDatosEmpresa.do"><bean:message key="V_VistaEmpresa.label3"/><%-- Modificar Datos --%></html:link></li>
                    <li><html:link action="/A_Pre_CancelarRegistro.do"><bean:message key="V_VistaEmpresa.label2"/><%-- Cancelar Registro --%></html:link></li>                    
                    <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_VistaEmpresa.label0"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>
                </ul>
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
                            <h3 align="center">${empty msg ? "" : msg}</h3>
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