<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_generar_inscripcion.title"/></title>
       <link rel="stylesheet" href="_css/style.css" type="text/css"/>
        <link rel="stylesheet" href="_css/validationEngine.jquery.css" type="text/css"/>
        <script src="_js/jquery-1.4.4.min.js" type="text/javascript"></script>
        <script src="_js/jquery.validationEngine.js" type="text/javascript"></script>
        <script src="_js/jquery.validationEngine-es.js" type="text/javascript"></script>
        <style type="text/css">
        div#box1840463 {width: 400px; margin: 40px auto; }
        form#1840463 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840463 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840463 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840463 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840463 p#1840465_C {clear: both; width: 400px; }
          form#1840463 p#1840465_C label {clear: both; width: 400px; }
          form#1840463 p#1840465_C input {clear: both; width: 396px; }
          form#1840463 p#1843570_C {clear: both; width: 400px; }
          form#1840463 p#1843570_C label {clear: both; width: 400px; }
          form#1840463 p#1843570_C input {clear: both; width: 396px; }
          form#1840463 p#1843573_C {clear: both; width: 400px; }
          form#1840463 p#1843573_C label {clear: both; width: 400px; }
          form#1840463 p#1843573_C input {clear: both; width: 396px; }
          form#1840463 p#1843577_C {clear: both; width: 400px; }
          form#1840463 p#1843577_C label {clear: both; width: 400px; }
          form#1840463 p#1843577_C input {clear: both; width: 396px; }
          form#1840463 p#1840471_C {clear: both; width: 400px; }
          form#1840463 p#1840471_C label {clear: both; width: 400px; }
          form#1840463 p#1840471_C input {clear: both; width: 396px; }
          form#1840463 p#1840468_C {clear: both; width: 400px; }
          form#1840463 p#1840468_C label {clear: both; width: 400px; }
          form#1840463 p#1840468_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_generar_inscripcion.title"/></div>
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
                            <div class="box1840463"><html:form styleId="pasForm"
                  action="/A_generar_inscripcion.do" method="post">
                  <p id="1840465_C"><label for="1840465"><bean:message key="F_Inscripcion_Pasantia.label0"/><%-- Titulo: --%></label><html:text styleId="1840465" property="titulo_pasantia" size="30" styleClass="validate[required]"/></p>
                  <p id="1843570_C"><label for="1843570"><bean:message key="F_Inscripcion_Pasantia.label1"/><%-- Tipo de pasantia: --%></label>
                      <html:select property="tipo" styleId="1843570">
                          <html:option value="1">Corta</html:option>
                          <html:option value="2">Corta</html:option>
                          <html:option value="3">Corta</html:option>
                      </html:select>
                  </p>
                  <p id="1843573_C"><label for="1843573"><bean:message key="F_Inscripcion_Pasantia.label2"/><%-- Tutor Academico: --%></label>
                      <html:select property="tutor_academico" styleId="1843573">
                          <logic:empty name="L_TA">
                              <html:option value="0">Fail.</html:option>
                          </logic:empty>
                          <logic:notEmpty name="L_TA">
                              <logic:iterate id="ta" name="L_TA">
                                  <html:option value="${ta.idProfesor}">${ta.apellido}, ${ta.nombre}</html:option>
                              </logic:iterate>
                          </logic:notEmpty>
                      </html:select>
                  </p>
                  <p id="1843577_C"><label for="1843577"><bean:message key="F_Inscripcion_Pasantia.label3"/><%-- Tutor Industrial: --%></label>
                      <html:select property="tutor_industrial" styleId="1843577">
                          <logic:empty name="L_TI">
                              <html:option value="0">Fail.</html:option>
                          </logic:empty>
                          <logic:notEmpty name="L_TI">
                              <logic:iterate id="ti" name="L_TI">
                                  <html:option value="${ti.idTutorIndustrial}">${ti.nombre}</html:option>
                              </logic:iterate>
                          </logic:notEmpty>
                      </html:select>
                  </p>
                  <p id="1840471_C"><label for="1840471"><bean:message key="F_Inscripcion_Pasantia.label4"/><%-- Objetivos Generales: --%></label><html:textarea styleId="1840471" property="objetivos" cols="60" rows="10" styleClass="validate[required]"></html:textarea></p>
                  <p id="1840468_C"><label for="1840468"><bean:message key="F_Inscripcion_Pasantia.label5"/><%-- Resumen del Proyecto: --%></label><html:textarea styleId="1840468" property="resumen" cols="60" rows="10" styleClass="validate[required]"></html:textarea></p>

                  <html:submit styleClass="button"><bean:message key="V_generar_inscripcion.label0"/><%-- Generar Inscripcion --%></html:submit>
                </html:form>
                            <script>
                            $(document).ready(function(){
                                $("#pasForm").validationEngine('attach');
                               });
                            </script>

                </div>

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