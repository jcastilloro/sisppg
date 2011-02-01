<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_MostrarConsultaEstudiante.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>

    </head>
    <body>
        
            
            <div id="menu">
                <ul id="nav">                    
                    <li><html:link action="/A_Pre_GestionarConsultaCoordinacion.do"><bean:message key="V_MostrarConsultaEstudiante.label1"/><%-- Nueva Consulta --%></html:link></li>
                    <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_MostrarConsultaEstudiante.label2"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>

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
                            <br>
                           <h3 align="center"> ${empty msg ? "" : msg}</h3>
                           <br> 
                           <table align="center">
                                <tr><th>Nombre: </th><td><bean:write name="nombre"/></td></tr>
                                <tr><th>Carnet: </th><td><bean:write name="carnet"/></td></tr>
                                <tr><th>C&eacute;dula: </th><td><bean:write name="cedula"/></td></tr>
                                <tr><th>Fecha de Nacimiento: </th><td><bean:write name="fechanac"/></td></tr>
                                <tr><th>Sexo: </th><td><bean:write name="sexo"/></td></tr>
                                <tr><th>Nacionalidad: </th><td><bean:write name="nacionalidad"/></td></tr>
                                <tr><th>Indice: </th><td><bean:write name="indice"/></td></tr>
                                <tr><th> Realiza Proyecto: 
                                </th><td> <html:link action="A_MostrarConsultaPPG.do" paramName="ppg" paramProperty="numeroPPG" paramId="numeroPPG"> <bean:write name="ppg" property="nombrePPG"/> </html:link> </td></tr>
                            </table>
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