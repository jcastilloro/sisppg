<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_ConsultarPPGCoordinacion.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <style type="text/css">
        div#box1700978 {width: 400px; margin: 40px auto; }
        form#1700978 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1700978 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1700978 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1700978 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1700978 p#1700983_C {clear: both; width: 400px; }
          form#1700978 p#1700983_C label {clear: both; width: 400px; }
          form#1700978 p#1700983_C input {clear: both; width: 396px; }
          form#1700978 p#1700987_C {clear: both; width: 400px; }
          form#1700978 p#1700987_C label {clear: both; width: 400px; }
          form#1700978 p#1700987_C input {clear: both; width: 396px; }
          form#1700978 p#1700990_C {clear: both; width: 400px; }
          form#1700978 p#1700990_C label {clear: both; width: 400px; }
          form#1700978 p#1700990_C input {clear: both; width: 396px; }
          form#1700978 p#1700993_C {clear: both; width: 400px; }
          form#1700978 p#1700993_C label {clear: both; width: 400px; }
          form#1700978 p#1700993_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_ConsultarPPGCoordinacion.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_GestionarConsultaCoordinacion.do"><bean:message key="V_ConsultarPPGCoordinacion.label1"/><%-- Regresar --%></html:link></li>
                    <li><html:link action="/A_Pre_GestionarPPG.do"><bean:message key="V_ConsultarPPGCoordinacion.label2"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>

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
                <div class="box1700978"><html:form styleId="F1700978"
                  action="/A_ConsultarPPGCoordinacion.do" method="post">
                  <p id="1700983_C"><label for="1700983"><bean:message key="F_ConsultarPPG.label0"/><%-- Por Area: --%></label><html:text styleId="1700983" property="area" size="30"/></p>
                  <p id="1700987_C"><label for="1700987"><bean:message key="F_ConsultarPPG.label1"/><%-- Por Tutor --%></label><html:text styleId="1700987" property="tutor" size="30"/></p>
                  <p id="1700990_C"><label for="1700990"><bean:message key="F_ConsultarPPG.label2"/><%-- Por Trimestre: --%></label><html:text styleId="1700990" property="trimestre" size="30"/></p>
                  <p id="1700993_C"><label for="1700993"><bean:message key="F_ConsultarPPG.label3"/><%-- Por A&ntilde;o: --%></label><html:text styleId="1700993" property="ano" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_ConsultarPPGCoordinacion.label0"/><%-- Consultar --%></html:submit>
                </html:form></div>

                        </div>
                    </div>
                    <div id="right"><ul id="nav"><li><script type="text/javascript">var hb = new HelpBalloon({ dataURL: '//tooltip.do?V=V_ConsultarPPGCoordinacion'});</script></li></ul></div>
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