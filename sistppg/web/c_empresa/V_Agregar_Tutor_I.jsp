<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_Agregar_Tutor_I.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840560 {width: 400px; margin: 40px auto; }
        form#1840560 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840560 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840560 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840560 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840560 p#1840562_C {clear: both; width: 400px; }
          form#1840560 p#1840562_C label {clear: both; width: 400px; }
          form#1840560 p#1840562_C input {clear: both; width: 396px; }
          form#1840560 p#1840565_C {clear: both; width: 400px; }
          form#1840560 p#1840565_C label {clear: both; width: 400px; }
          form#1840560 p#1840565_C input {clear: both; width: 396px; }
          form#1840560 p#1840569_C {clear: both; width: 400px; }
          form#1840560 p#1840569_C label {clear: both; width: 400px; }
          form#1840560 p#1840569_C input {clear: both; width: 396px; }
          form#1840560 p#1840572_C {clear: both; width: 400px; }
          form#1840560 p#1840572_C label {clear: both; width: 400px; }
          form#1840560 p#1840572_C input {clear: both; width: 396px; }
          form#1840560 p#1840575_C {clear: both; width: 400px; }
          form#1840560 p#1840575_C label {clear: both; width: 400px; }
          form#1840560 p#1840575_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_Agregar_Tutor_I.title"/></div>
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
                <div class="box1840560"><html:form
                  action="/A_Agregar_Tutor_Ind.do" method="post">
                  <p id="1840562_C"><label for="1840562"><bean:message key="F_Tutor_Industrial.label0"/><%-- Nombre: --%></label><html:text styleId="1840562" property="nombre" size="30"/></p>
                  <p id="1840565_C"><label for="1840565"><bean:message key="F_Tutor_Industrial.label1"/><%-- Email: --%></label><html:text styleId="1840565" property="email" size="30"/></p>
                  <p id="1840569_C"><label for="1840569"><bean:message key="F_Tutor_Industrial.label2"/><%-- Cedula: --%></label><html:text styleId="1840569" property="cedula" size="30"/></p>
                  <p id="1840572_C"><label for="1840572"><bean:message key="F_Tutor_Industrial.label3"/><%-- Telefono: --%></label><html:text styleId="1840572" property="telefono" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_Agregar_Tutor_I.label0"/><%-- Agregar Tutor --%></html:submit>
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