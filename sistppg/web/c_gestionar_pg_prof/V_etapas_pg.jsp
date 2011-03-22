<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_etapas_pg.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_etapas_pg.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="8"><html:link action="/A_prep_agregar_primera_etapa.do"><bean:message key="V_etapas_pg.label0"/><%-- Primera Etapa --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="8"><html:link action="/A_prep_agregar_segunda_etapa.do"><bean:message key="V_etapas_pg.label1"/><%-- Segunda Etapa --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="8"><html:link action="/A_prep_agregar_tercera_etapa.do"><bean:message key="V_etapas_pg.label2"/><%-- Tercera Etapa --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="8"><html:link action="/A_finalizar_generar_PG.do"><bean:message key="V_etapas_pg.label3"/><%-- Finalizar Proceso --%></html:link></cohesion:actor></li>

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