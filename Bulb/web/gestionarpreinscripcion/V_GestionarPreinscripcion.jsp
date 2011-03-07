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
        
            
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_LlenarFormularioPreinscripcion.do"><bean:message key="V_GestionarPreinscripcion.label0"/><%-- Formulario de Preinscripci&oacute;n --%></html:link></li>
                    <li><html:link action="/A_Pre_ConsultarPreinscripcion.do"><bean:message key="V_GestionarPreinscripcion.label1"/><%-- Consultar Preinscripci&oacute;n --%></html:link></li>
                </ul>
                <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesión --%></html:link>l>
            </div>
         <div id="header">          
		
	</div>
	<!-- end #header -->
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            <br>
                            <br>
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