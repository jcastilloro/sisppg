<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_MostrarConsulta.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>

    </head>
    <body>
        
            
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_ConsultarEstudiante.do"><bean:message key="V_MostrarConsulta.label1"/><%-- Nueva Consulta --%></html:link></li>
                    <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_MostrarConsulta.label2"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>

                </ul>
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
                           <table align="center">
                            	<logic:iterate  name="L_Estudiante" id="estudiante">
                                    <tr><th><bean:write name="estudiante" property="nombreE"/>
                                    <html:link action="/A_MostrarConsultaEstudiante.do" paramName="estudiante" paramProperty="carnetE" paramId="carnetE"> Detalles </html:link></th></tr>
                                    

	                        </logic:iterate>
                                    </table>
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