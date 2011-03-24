<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_sesion_tutor_i.title"/></title>
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
          form#1840560 p#1844840_C {clear: both; width: 400px; }
          form#1840560 p#1844840_C label {clear: both; width: 400px; }
          form#1840560 p#1844840_C input {clear: both; width: 396px; }
          form#1840560 p#1844843_C {clear: both; width: 400px; }
          form#1840560 p#1844843_C label {clear: both; width: 400px; }
          form#1840560 p#1844843_C input {clear: both; width: 396px; }
          form#1840560 p#1840575_C {clear: both; width: 400px; }
          form#1840560 p#1840575_C label {clear: both; width: 400px; }
          form#1840560 p#1840575_C input {clear: both; width: 396px; }
          form#1840560 p#1844837_C {clear: both; width: 400px; }
          form#1840560 p#1844837_C label {clear: both; width: 400px; }
          form#1840560 p#1844837_C input {clear: both; width: 396px; }
          form#1840560 p#1844848_C {clear: both; width: 400px; }
          form#1840560 p#1844848_C label {clear: both; width: 400px; }
          form#1840560 p#1844848_C input {clear: both; width: 396px; }
          form#1840560 p#1844834_C {clear: both; width: 400px; }
          form#1840560 p#1844834_C label {clear: both; width: 400px; }
          form#1840560 p#1844834_C input {clear: both; width: 396px; }
          form#1840560 p#1844823_C {clear: both; width: 400px; }
          form#1840560 p#1844823_C label {clear: both; width: 400px; }
          form#1840560 p#1844823_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_sesion_tutor_i.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="16"><html:link action="/A_modificar_perfil.do"><bean:message key="V_sesion_tutor_i.label0"/><%-- Modificar Perfil --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="16"><html:link action="/A_prep_gestionar_pasatias_TI.do"><bean:message key="V_sesion_tutor_i.label1"/><%-- Gestionar Pasantias --%></html:link></cohesion:actor></li>
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
                <div class="box1840560"></div>

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