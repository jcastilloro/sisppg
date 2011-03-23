<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_perfil_prof.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840411 {width: 400px; margin: 40px auto; }
        form#1840411 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840411 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840411 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840411 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840411 p#1840413_C {clear: both; width: 400px; }
          form#1840411 p#1840413_C label {clear: both; width: 400px; }
          form#1840411 p#1840413_C input {clear: both; width: 396px; }
          form#1840411 p#1840416_C {clear: both; width: 400px; }
          form#1840411 p#1840416_C label {clear: both; width: 400px; }
          form#1840411 p#1840416_C input {clear: both; width: 396px; }
          form#1840411 p#1840419_C {clear: both; width: 400px; }
          form#1840411 p#1840419_C label {clear: both; width: 400px; }
          form#1840411 p#1840419_C input {clear: both; width: 396px; }
          form#1840411 p#1840423_C {clear: both; width: 400px; }
          form#1840411 p#1840423_C label {clear: both; width: 400px; }
          form#1840411 p#1840423_C input {clear: both; width: 396px; }
          form#1840411 p#1840426_C {clear: both; width: 400px; }
          form#1840411 p#1840426_C label {clear: both; width: 400px; }
          form#1840411 p#1840426_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_perfil_prof.title"/></div>
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
                <div class="box1840411"><html:form
                  action="/A_guardar_perfil_prof.do" method="post">
                  <p id="1840413_C"><label for="1840413"><bean:message key="F_Perfil_Profesor.label0"/><%-- Nombre: --%></label><html:text styleId="1840413" property="nombre" size="30"/></p>
                  <p id="1840416_C"><label for="1840416"><bean:message key="F_Perfil_Profesor.label1"/><%-- Apellido: --%></label><html:text styleId="1840416" property="apellido" size="30"/></p>
                  <p id="1840419_C"><label for="1840419"><bean:message key="F_Perfil_Profesor.label2"/><%-- Cedula: --%></label><html:text styleId="1840419" property="cedula" size="30"/></p>
                  <p id="1840423_C"><label for="1840423"><bean:message key="F_Perfil_Profesor.label3"/><%-- Email: --%></label><html:text styleId="1840423" property="email" size="30"/></p>
                  <p id="1840426_C"><label for="1840426"><bean:message key="F_Perfil_Profesor.label4"/><%-- Departamento: --%></label>

                  <html:select styleId="1840426" property="departamento">
                        <logic:iterate id="departamento" collection="${empty L_Departamentos ? _vacio : L_Departamentos}">
                              <option value="${departamento.idDepartamento}">${departamento.nombre}</option>
                        </logic:iterate>
                  </html:select>
                </p>
                  <html:submit styleClass="button"><bean:message key="V_perfil_prof.label0"/><%-- Crear --%></html:submit>
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