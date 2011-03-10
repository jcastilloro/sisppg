<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title><bean:message key="V_VistaEstudiante.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>

    </head>
    <body>
         <div id="wrapper">
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_GestionarPasantia.do"><bean:message key="V_VistaEstudiante.label0"/><%-- Pasant&iacute;as --%></html:link></li>
                    <li><html:link action="/A_Pre_GestionarPPG.do"><bean:message key="V_VistaEstudiante.label1"/><%-- Proyecto de Grado --%></html:link></li>
                </ul>
                <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesión --%></html:link></p>
            </div>
          <div id="header"></div>
	<!-- end #header -->          
        </div>
        <div id="page">
            <div id="content">
                <div id="body_wrapper">
                    <div id="body">
                        <div id="split">
                        <div class="top"></div>
                            <div id="left">
                            <div class="content">
                                ${empty msg ? "" : msg}
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
            <!-- end #content -->
            <div style="clear: both;">&nbsp;</div>
            </div>
	</div>

	<!-- end #page -->                                    
        <br></br><br></br><br></br><br></br><br></br>

    </body>

        <div id="footer">
            <div id="footer"> <bean:message key="bottom.label"/> </div>	
	</div>
	<!-- end #footer -->    
</html>