<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_ConsultarEstudiante.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <style type="text/css">
        div#box1689880 {width: 400px; margin: 40px auto; }
        form#1689880 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1689880 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1689880 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1689880 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1689880 p#1689882_C {clear: both; width: 400px; }
          form#1689880 p#1689882_C label {clear: both; width: 400px; }
          form#1689880 p#1689882_C input {clear: both; width: 396px; }
          form#1689880 p#1689885_C {clear: both; width: 400px; }
          form#1689880 p#1689885_C label {clear: both; width: 400px; }
          form#1689880 p#1689885_C input {clear: both; width: 396px; }
          form#1689880 p#1689889_C {clear: both; width: 400px; }
          form#1689880 p#1689889_C label {clear: both; width: 400px; }
          form#1689880 p#1689889_C input {clear: both; width: 396px; }
          form#1689880 p#1689892_C {clear: both; width: 400px; }
          form#1689880 p#1689892_C label {clear: both; width: 400px; }
          form#1689880 p#1689892_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_ConsultarEstudiante.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_GestionarConsultaCoordinacion.do"><bean:message key="V_ConsultarEstudiante.label1"/><%-- Regresar --%></html:link></li>
                    <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_ConsultarEstudiante.label2"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>

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
                <div class="box1689880"><html:form styleId="F1689880"
                  action="/A_BusquedaEstudiante.do" method="post">
                  <p id="1689882_C"><label for="1689882"><bean:message key="F_ConsultarEstudiante.label0"/><%-- Por Area de PPG --%></label><html:text styleId="1689882" property="areaPPG" size="30"/></p>
                  <p id="1689885_C"><label for="1689885"><bean:message key="F_ConsultarEstudiante.label1"/><%-- Por tutor: --%></label><html:text styleId="1689885" property="tutorPPG" size="30"/></p>
                  <p id="1689889_C"><label for="1689889"><bean:message key="F_ConsultarEstudiante.label2"/><%-- Por per&iacute;odo: --%></label><html:text styleId="1689889" property="periodoPPG" size="30"/></p>
                  <p id="1689892_C"><label for="1689892"><bean:message key="F_ConsultarEstudiante.label3"/><%-- Por a&ntilde;o: --%></label><html:text styleId="1689892" property="anoPPG" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_ConsultarEstudiante.label0"/><%-- Consultar --%></html:submit>
                </html:form></div>

                        </div>
                    </div>
                    <div id="right"><ul id="nav"><li><script type="text/javascript">var hb = new HelpBalloon({ dataURL: '//tooltip.do?V=V_ConsultarEstudiante'});</script></li></ul></div>
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