<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_gestionar_solicitud_pasantes.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1843916 {width: 400px; margin: 40px auto; }
        form#1843916 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1843916 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1843916 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1843916 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1843916 p#1843918_C {clear: both; width: 400px; }
          form#1843916 p#1843918_C label {clear: both; width: 400px; }
          form#1843916 p#1843918_C input {clear: both; width: 396px; }
          form#1843916 p#1843921_C {clear: both; width: 400px; }
          form#1843916 p#1843921_C label {clear: both; width: 400px; }
          form#1843916 p#1843921_C input {clear: both; width: 396px; }
          form#1843916 p#1843924_C {clear: both; width: 400px; }
          form#1843916 p#1843924_C label {clear: both; width: 400px; }
          form#1843916 p#1843924_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_gestionar_solicitud_pasantes.title"/></div>
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
                <div class="box1843916"><html:form
                  action="/A_solicitar_pasante.do" method="post">
                  <p id="1843918_C"><label for="1843918"><bean:message key="F_Solicitud_Pasante.label0"/><%-- Carrera: --%></label><html:text styleId="1843918" property="carrera" size="30"/></p>
                  <p id="1843921_C"><label for="1843921"><bean:message key="F_Solicitud_Pasante.label1"/><%-- Periodo. --%></label><html:text styleId="1843921" property="periodo" size="30"/></p>
                  <p id="1843924_C"><label for="1843924"><bean:message key="F_Solicitud_Pasante.label2"/><%-- Tipo de Pasantia --%></label><html:text styleId="1843924" property="tipo_pasantia" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_gestionar_solicitud_pasantes.label0"/><%-- A_solicitar_pasante --%></html:submit>
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