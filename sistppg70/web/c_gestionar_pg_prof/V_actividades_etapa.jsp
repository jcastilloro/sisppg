<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_actividades_etapa.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840623 {width: 400px; margin: 40px auto; }
        form#1840623 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840623 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840623 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840623 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840623 p#1840626_C {clear: both; width: 400px; }
          form#1840623 p#1840626_C label {clear: both; width: 400px; }
          form#1840623 p#1840626_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_actividades_etapa.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="8"><html:link action="/A_finalizar_actividades_etapa.do"><bean:message key="V_actividades_etapa.label1"/><%-- A_finalizar_actividades_etapa --%></html:link></cohesion:actor></li>

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
                <div class="box1840623"><html:form
                  action="/A_agregar_actividad_etapa.do" method="post">
                  <p id="1840626_C"><label for="1840626"><bean:message key="F_Actividad_Etapa.label0"/><%-- Descripcion: --%></label><html:textarea styleId="1840626" property="descripcion" cols="60" rows="10"></html:textarea></p>

                  <html:submit styleClass="button"><bean:message key="V_actividades_etapa.label0"/><%-- Agregar --%></html:submit>
                </html:form></div>

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