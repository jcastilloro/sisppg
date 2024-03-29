<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_CancelarRegistro.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <style type="text/css">
        div#box1617352 {width: 400px; margin: 40px auto; }
        form#1617352 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1617352 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1617352 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1617352 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1617352 p#1617354_C {clear: both; width: 400px; }
          form#1617352 p#1617354_C label {clear: both; width: 400px; }
          form#1617352 p#1617354_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_CancelarRegistro.title"/></div>
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
                <div class="box1617352"><html:form styleId="F1617352"
                  action="/A_CancelarRegistro.do" method="post">
                  <p id="1617354_C"><label for="1617354"><bean:message key="F_CancelarDatosEmpresa.label0"/><%-- &iquest;Desea cancelar su registro del sistema? --%></label><html:checkbox styleId="1617354" property="verificacion"/></p>

                  <html:submit styleClass="button"><bean:message key="V_CancelarRegistro.label0"/><%-- Cancelar Registro --%></html:submit>
                </html:form></div>

                        </div>
                    </div>
                    <div id="right"><ul id="nav"><li><script type="text/javascript">var hb = new HelpBalloon({ dataURL: '//tooltip.do?V=V_CancelarRegistro'});</script></li></ul></div>
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