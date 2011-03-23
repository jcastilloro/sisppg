<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_agregar_primera_etapa.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840596 {width: 400px; margin: 40px auto; }
        form#1840596 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840596 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840596 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840596 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840596 p#1840610_C {clear: both; width: 400px; }
          form#1840596 p#1840610_C label {clear: both; width: 400px; }
          form#1840596 p#1840610_C input {clear: both; width: 396px; }
          form#1840596 p#1840613_C {clear: both; width: 400px; }
          form#1840596 p#1840613_C label {clear: both; width: 400px; }
          form#1840596 p#1840613_C input {clear: both; width: 396px; }
          form#1840596 p#1840616_C {clear: both; width: 400px; }
          form#1840596 p#1840616_C label {clear: both; width: 400px; }
          form#1840596 p#1840616_C input {clear: both; width: 396px; }
          form#1840596 p#1840620_C {clear: both; width: 400px; }
          form#1840596 p#1840620_C label {clear: both; width: 400px; }
          form#1840596 p#1840620_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_agregar_primera_etapa.title"/></div>
            <div id="menu">
                <ul id="nav">
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
                <div class="box1840596"><html:form
                  action="/A_guardar_primera_etapa.do" method="post">
                  <p id="1840610_C"><label for="1840610"><bean:message key="F_Etapa_PG.label0"/><%-- Nombre Etapa: --%></label><html:text styleId="1840610" property="nombre" size="30"/></p>
                  <p id="1840613_C"><label for="1840613"><bean:message key="F_Etapa_PG.label1"/><%-- Resultados Minimos: --%></label><html:textarea styleId="1840613" property="resultados_minimos" cols="60" rows="10"></html:textarea></p>
                  <p id="1840616_C"><label for="1840616"><bean:message key="F_Etapa_PG.label2"/><%-- Trimestre: --%></label><html:text styleId="1840616" property="trimestre" size="30"/></p>
                  <p id="1840620_C"><label for="1840620"><bean:message key="F_Etapa_PG.label3"/><%-- A&ntilde;o: --%></label><html:text styleId="1840620" property="ano" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_agregar_primera_etapa.label0"/><%-- Continuar --%></html:submit>
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