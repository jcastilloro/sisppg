<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_areas_pg.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_areas_pg.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="8"><html:link action="/A_agregar_area_PG.do"><bean:message key="V_areas_pg.label0"/><%-- Agregar Area --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="8"><html:link action="/A_prep_etapas_ppg.do"><bean:message key="V_areas_pg.label1"/><%-- Finalizar Areas --%></html:link></cohesion:actor></li>

                </ul>
            </div>
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            Nombre Proyecto: <bean:write name="ProyectoDeGrado" property="nombre"></bean:write> <br>
                            Recursos Necesarios: <bean:write name="ProyectoDeGrado" property="recursos"></bean:write><br>
                            Duraci�n de Recursos: <bean:write name="ProyectoDeGrado" property="duracion_recursos"></bean:write><br>
                            Puntos de Interes: <bean:write name="ProyectoDeGrado" property="puntos_de_interes"></bean:write><br><br><br>

                            ${empty msg ? "" : msg}
                         </div>
                    </div>
                    <div id="right"></div>
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