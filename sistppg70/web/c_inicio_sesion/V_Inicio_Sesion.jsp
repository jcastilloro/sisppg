<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_Inicio_Sesion.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840387 {width: 400px; margin: 40px auto; }
        form#1840387 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840387 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840387 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840387 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840387 p#1840389_C {clear: both; width: 400px; }
          form#1840387 p#1840389_C label {clear: both; width: 400px; }
          form#1840387 p#1840389_C input {clear: both; width: 396px; }
          form#1840387 p#1840392_C {clear: both; width: 400px; }
          form#1840387 p#1840392_C label {clear: both; width: 400px; }
          form#1840387 p#1840392_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_Inicio_Sesion.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Prep_Inicio_Sesion_Empresa.do"><bean:message key="V_Inicio_Sesion.label1"/><%-- Empresas --%></html:link></li>
                    <li><html:link action="/A_prep_inicio_sesion_t_industrial.do"><bean:message key="V_Inicio_Sesion.label2"/><%-- Tutores Industriales --%></html:link></li>
                    <li><html:link action="/A_Prep_Inicio_Sesion_Adm.do"><bean:message key="V_Inicio_Sesion.label3"/><%-- Administrador --%></html:link></li>

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
                <div class="box1840387"><html:form
                  action="/A_Inicio_Sesion.do" method="post">
                  <p id="1840389_C"><label for="1840389"><bean:message key="F_Inicio_Sesion.label0"/><%-- Usbid: --%></label><html:text styleId="1840389" property="usbid" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_Inicio_Sesion.label0"/><%-- Ingresar --%></html:submit>
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