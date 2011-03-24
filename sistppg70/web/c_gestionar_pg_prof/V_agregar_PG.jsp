<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_agregar_PG.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840578 {width: 400px; margin: 40px auto; }
        form#1840578 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840578 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840578 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840578 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840578 p#1840580_C {clear: both; width: 400px; }
          form#1840578 p#1840580_C label {clear: both; width: 400px; }
          form#1840578 p#1840580_C input {clear: both; width: 396px; }
          form#1840578 p#1840583_C {clear: both; width: 400px; }
          form#1840578 p#1840583_C label {clear: both; width: 400px; }
          form#1840578 p#1840583_C input {clear: both; width: 396px; }
          form#1840578 p#1840586_C {clear: both; width: 400px; }
          form#1840578 p#1840586_C label {clear: both; width: 400px; }
          form#1840578 p#1840586_C input {clear: both; width: 396px; }
          form#1840578 p#1840589_C {clear: both; width: 400px; }
          form#1840578 p#1840589_C label {clear: both; width: 400px; }
          form#1840578 p#1840589_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_agregar_PG.title"/></div>
            <div id=""user">${profesor.usbid}</div>
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
                <div class="box1840578"><html:form
                  action="/A_agregar_PG.do" method="post">
                  <p id="1840580_C"><label for="1840580"><bean:message key="F_Inscripcion_PG.label0"/><%-- Nombre Proyecto: --%></label><html:text styleId="1840580" property="nombre" size="30"/></p>
                  <p id="1840583_C"><label for="1840583"><bean:message key="F_Inscripcion_PG.label1"/><%-- Recursos Necesarios: --%></label><html:textarea styleId="1840583" property="recursos" cols="60" rows="10"></html:textarea></p>
                  <p id="1840586_C"><label for="1840586"><bean:message key="F_Inscripcion_PG.label2"/><%-- Duracion de Recursos: --%></label><html:textarea styleId="1840586" property="duracion_recursos" cols="60" rows="10"></html:textarea></p>
                  <p id="1840589_C"><label for="1840589"><bean:message key="F_Inscripcion_PG.label3"/><%-- Puntos de Interes: --%></label><html:textarea styleId="1840589" property="puntos_de_interes" cols="60" rows="10"></html:textarea></p>
                  <p id="18405891_C">Estudiante:<html:select styleId="18405891" property="estudiante">
                                                    <logic:iterate id="estudiante" collection="${empty L_Est ? _vacio : L_Est}">
                                                        <option value="${estudiante.usbid}">${estudiante.apellido}, ${estudiante.nombre}</option>
                                                    </logic:iterate>
                                        </html:select></p>

                  <html:submit styleClass="button">Adelante</html:submit>
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