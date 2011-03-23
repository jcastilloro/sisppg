<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_generar_inscripcion.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840463 {width: 400px; margin: 40px auto; }
        form#1840463 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840463 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840463 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840463 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840463 p#1840465_C {clear: both; width: 400px; }
          form#1840463 p#1840465_C label {clear: both; width: 400px; }
          form#1840463 p#1840465_C input {clear: both; width: 396px; }
          form#1840463 p#1843570_C {clear: both; width: 400px; }
          form#1840463 p#1843570_C label {clear: both; width: 400px; }
          form#1840463 p#1843570_C input {clear: both; width: 396px; }
          form#1840463 p#1843573_C {clear: both; width: 400px; }
          form#1840463 p#1843573_C label {clear: both; width: 400px; }
          form#1840463 p#1843573_C input {clear: both; width: 396px; }
          form#1840463 p#1843577_C {clear: both; width: 400px; }
          form#1840463 p#1843577_C label {clear: both; width: 400px; }
          form#1840463 p#1843577_C input {clear: both; width: 396px; }
          form#1840463 p#1840471_C {clear: both; width: 400px; }
          form#1840463 p#1840471_C label {clear: both; width: 400px; }
          form#1840463 p#1840471_C input {clear: both; width: 396px; }
          form#1840463 p#1840468_C {clear: both; width: 400px; }
          form#1840463 p#1840468_C label {clear: both; width: 400px; }
          form#1840463 p#1840468_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_generar_inscripcion.title"/></div>
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
                <div class="box1840463"><html:form
                  action="/A_generar_inscripcion.do" method="post">
                  <p id="1840465_C"><label for="1840465"><bean:message key="F_Inscripcion_Pasantia.label0"/><%-- Titulo: --%></label><html:text styleId="1840465" property="titulo_pasantia" size="30"/></p>
                  <p id="1843570_C"><label for="1843570"><bean:message key="F_Inscripcion_Pasantia.label1"/><%-- Tipo de pasantia: --%></label><html:text styleId="1843570" property="tipo" size="30"/></p>
                  <p id="1843573_C"><label for="1843573"><bean:message key="F_Inscripcion_Pasantia.label2"/><%-- Tutor Academico: --%></label><html:text styleId="1843573" property="tutor_academico" size="30"/></p>
                  <p id="1843577_C"><label for="1843577"><bean:message key="F_Inscripcion_Pasantia.label3"/><%-- Tutor Industrial: --%></label><html:text styleId="1843577" property="tutor_industrial" size="30"/></p>
                  <p id="1840471_C"><label for="1840471"><bean:message key="F_Inscripcion_Pasantia.label4"/><%-- Objetivos Generales: --%></label><html:textarea styleId="1840471" property="objetivos" cols="60" rows="10"></html:textarea></p>
                  <p id="1840468_C"><label for="1840468"><bean:message key="F_Inscripcion_Pasantia.label5"/><%-- Resumen del Proyecto: --%></label><html:textarea styleId="1840468" property="resumen" cols="60" rows="10"></html:textarea></p>

                  <html:submit styleClass="button"><bean:message key="V_generar_inscripcion.label0"/><%-- Generar Inscripcion --%></html:submit>
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