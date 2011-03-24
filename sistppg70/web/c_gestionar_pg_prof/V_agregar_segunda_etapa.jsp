<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_agregar_segunda_etapa.title"/></title>
       <link rel="stylesheet" href="_css/style.css" type="text/css"/>
        <link rel="stylesheet" href="_css/validationEngine.jquery.css" type="text/css"/>
        <script src="_js/jquery-1.4.4.min.js" type="text/javascript"></script>
        <script src="_js/jquery.validationEngine.js" type="text/javascript"></script>
        <script src="_js/jquery.validationEngine-es.js" type="text/javascript"></script>
        <style type="text/css">
        div#box1840596 {width: 400px; margin: 40px auto; }
        form#1840596 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840596 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840596 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840596 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840596 p#1840610_C {clear: both; width: 400px; }
          form#1840596 p#1840610_C label {clear: both; width: 400px; }
          form#1840596 p#1840610_C input {clear: both; width: 396px; }
          form#1840596 p#1840613_C {clear: both; width: 400px; }
          form#1840596 p#1840613_C label {clear: both; width: 400px; }
          form#1840596 p#1840613_C input {clear: both; width: 396px; }
          form#1840596 p#1840616_C {clear: both; width: 400px; }
          form#1840596 p#1840616_C label {clear: both; width: 400px; }
          form#1840596 p#1840616_C input {clear: both; width: 396px; }
          form#1840596 p#1840620_C {clear: both; width: 400px; }
          form#1840596 p#1840620_C label {clear: both; width: 400px; }
          form#1840596 p#1840620_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_agregar_segunda_etapa.title"/></div>
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
                            <div class="box1840596"><html:form styleId="etapa2Form"
                  action="/A_guardar_segunda_etapa.do" method="post">
                                <p id="1840610_C"><label for="1840610"><bean:message key="F_Etapa_PG.label0"/></label><html:text styleClass="validate[required]" styleId="1840610" property="nombre" size="30"/></p>
                                <p id="1840613_C"><label for="1840613"><bean:message key="F_Etapa_PG.label1"/></label><html:textarea styleClass="validate[required]" styleId="1840613" property="resultados_minimos" cols="60" rows="10"></html:textarea></p>
                                <p id="18406131_C">Descripcion Topicos:<html:textarea styleClass="validate[required]" styleId="18406131" property="topicos" cols="60" rows="10"></html:textarea></p>
                  <p id="1840616_C"><label for="1840616">
                          <html:select styleId="18405891" property="trimestre">
                            <logic:iterate id="trim" collection="${empty L_Trim ? _vacio : L_Trim}">
                                <option value="${trim.idTrimestre}">${trim.nombre}</option>
                            </logic:iterate>
                          </html:select></p>
                  <p id="1840620_C"><label for="1840620"><bean:message key="F_Etapa_PG.label3"/><%-- A&ntilde;o: --%></label><html:text styleId="1840620" property="ano" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_agregar_segunda_etapa.label0"/><%-- Continuar --%></html:submit>
                </html:form>
                            <script>
                            $(document).ready(function(){
                                $("#etapa2Form").validationEngine('attach');
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