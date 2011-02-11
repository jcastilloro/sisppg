<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_GestionarPPG.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>

    </head>
    <body>
        
            
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_ModificarPPG.do" paramName="PPG" paramProperty="numeroPPG" paramId="numeroPPG" ><bean:write name="PPG" property="numeroPPG"/><bean:message key="V_MostrarDetallesPPG.label2"/><%-- Modificar --%></html:link></li>
                    
                    <li><html:link action="/A_Pre_ConsultarPPGTutor.do" ><bean:message key="V_MostrarDetallesPPG.label0"/><%-- Regresar --%></html:link></li>
                    <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_MostrarDetallesPPG.label1"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>

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
                           <h3> ${empty msg ? "" : msg}</h3>
                           <br>
                                <table align="center">
                                <tr><th width="200px">Nombre: </th><td><bean:write name="PPG" property="nombrePPG"/></td></tr>
                                <tr><th>Fecha: </th><td><bean:write name="PPG" property="fechaPPG"/></td></tr>
                                <tr><th>Propuesto por: </th><td><bean:write name="PPG" property="propuestop"/></td></tr>
                                <tr><th>Actividades que involucra el Proyecto: </th><td><bean:write name="PPG" property="actvPPG"/></td></tr>
                                <tr><th>Puntos de Inter&eacute;s: </th><td><bean:write name="PPG" property="ptosInte"/></td></tr>
                                <tr><th>Areas: </th><td><bean:write name="PPG" property="areas"/></td></tr>
                                <tr><th>Duraci&oacute;n y recursos: </th><td><bean:write name="PPG" property="duraYrec"/></td></tr>
                                <tr><th>Nombre de la Primera Etapa: </th><td><bean:write name="PPG" property="primeraE"/></td></tr>
                                <tr><th>Trimestre: </th><td><bean:write name="PPG" property="trimestreUno"/></td></tr>
                                <tr><th>A&ntilde;o: </th><td><bean:write name="PPG" property="anoUno"/></td></tr>
                                <tr><th>Resultados espec&iacute;ficos m&iacute;nimos a alcanzar en esta etapa: </th><td><bean:write name="PPG" property="resultMinUno"/></td></tr>
                                <tr><th>Actividades que propone realizar para lograr estos resultados: </th><td><bean:write name="PPG" property="actResulUno"/></td></tr>
                                <tr><th>Descripci&oacute;n de T&oacute;picos I: </th><td><bean:write name="PPG" property="descTopicosICI"/></td></tr>
                                <tr><th>Nombre de la Segunda Etapa: </th><td><bean:write name="PPG" property="segundaE"/></td></tr>
                                <tr><th>Trimestre: </th><td><bean:write name="PPG" property="trimestreDos"/></td></tr>
                                <tr><th>A&ntilde;o: </th><td><bean:write name="PPG" property="anoDos"/></td></tr>
                                <tr><th>Resultados espec&iacute;ficos m&iacute;nimos a alcanzar en esta etapa: </th><td><bean:write name="PPG" property="resultMinDos"/></td></tr>
                                <tr><th>Actividades que propone realizar para lograr estos resultados: </th><td><bean:write name="PPG" property="actResulDos"/></td></tr>
                                <tr><th>Descripci&oacute;n de T&oacute;picos II: </th><td><bean:write name="PPG" property="descTopicosICII"/></td></tr>
                                <tr><th>Nombre de la Tercera Etapa: </th><td><bean:write name="PPG" property="terceraE"/></td></tr>
                                <tr><th>Trimestre: </th><td><bean:write name="PPG" property="trimestreTres"/></td></tr>
                                <tr><th>A&ntilde;o: </th><td><bean:write name="PPG" property="anoTres"/></td></tr>
                                <tr><th>Resultados espec&iacute;ficos m&iacute;nimos a alcanzar en esta etapa: </th><td><bean:write name="PPG" property="resultMinTres"/></td></tr>
                                <tr><th>Actividades que propone realizar para lograr estos resultados: </th><td><bean:write name="PPG" property="actResulTres"/></td></tr>
                                <tr><th>Previsiones para lograr la disponibilidad de recursos materiales: </th><td><bean:write name="PPG" property="recurMate"/></td></tr>
                                <tr><th> Realizado Por: </th></tr>
                                <logic:notEmpty name="posts" scope="request"><%-- esto esta cableando pa q funcione --%>
                                <logic:iterate  name="Estudiante" id="e">
                                    <tr><th><bean:write name="e" property="nombree"/> </th></tr>
                                </logic:iterate>
                             </logic:notEmpty>
                               
                            </table>
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
