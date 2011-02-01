<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_IniciarSesionEmpresa.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <style type="text/css">
        div#box1465928 {width: 400px; margin: 40px auto; }
        form#1465928 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1465928 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1465928 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1465928 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1465928 p#1465930_C {clear: both; width: 400px; }
          form#1465928 p#1465930_C label {clear: both; width: 400px; }
          form#1465928 p#1465930_C input {clear: both; width: 396px; }
          form#1465928 p#1465933_C {clear: both; width: 400px; }
          form#1465928 p#1465933_C label {clear: both; width: 400px; }
          form#1465928 p#1465933_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_IniciarSesionEmpresa.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_RegistrarEmpresa.do"><bean:message key="V_IniciarSesionEmpresa.label1"/><%-- Registrar --%></html:link></li>
                    <li><html:link action="/A_Pre_IniciarSesion.do"><bean:message key="V_IniciarSesionEmpresa.label2"/><%-- Regresar --%></html:link></li>

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
                <div class="box1465928"><html:form styleId="F1465928"
                  action="/A_IniciarSesionEmpresa.do" method="post">
                  <p id="1465930_C"><label for="1465930"><bean:message key="F_IniciarSesion.label0"/><%-- Login --%></label><html:text styleId="1465930" property="login" size="30"/></p>
                  <p id="1465933_C"><label for="1465933"><bean:message key="F_IniciarSesion.label1"/><%-- Password --%></label><html:password styleId="1465933" property="password" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_IniciarSesionEmpresa.label0"/><%-- Ingresar --%></html:submit>
                </html:form></div>

                        </div>
                    </div>
                    <div id="right"><ul id="nav"><li><script type="text/javascript">var hb = new HelpBalloon({ dataURL: '//tooltip.do?V=V_IniciarSesionEmpresa'});</script></li></ul></div>
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