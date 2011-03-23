<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_inicio_sesion_t_industrial.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840980 {width: 400px; margin: 40px auto; }
        form#1840980 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840980 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840980 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840980 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840980 p#1840982_C {clear: both; width: 400px; }
          form#1840980 p#1840982_C label {clear: both; width: 400px; }
          form#1840980 p#1840982_C input {clear: both; width: 396px; }
          form#1840980 p#1840985_C {clear: both; width: 400px; }
          form#1840980 p#1840985_C label {clear: both; width: 400px; }
          form#1840980 p#1840985_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_inicio_sesion_t_industrial.title"/></div>
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
                <div class="box1840980"><html:form
                  action="/A_inicio_sesion_t_industrial.do" method="post">
                  <p id="1840982_C"><label for="1840982"><bean:message key="F_Inicio_Sesion_externo.label0"/><%-- Login: --%></label><html:text styleId="1840982" property="login" size="30"/></p>
                  <p id="1840985_C"><label for="1840985"><bean:message key="F_Inicio_Sesion_externo.label1"/><%-- Password: --%></label><html:password styleId="1840985" property="password" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_inicio_sesion_t_industrial.label0"/><%-- inicio sesion --%></html:submit>
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