<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_ModificarInscripcion.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <style type="text/css">
        div#box1496666 {width: 400px; margin: 40px auto; }
        form#1496666 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1496666 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1496666 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1496666 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1496666 p#1508113_C {clear: both; width: 400px; }
          form#1496666 p#1508113_C label {clear: both; width: 400px; }
          form#1496666 p#1508113_C input {clear: both; width: 396px; }
          form#1496666 p#1508124_C {clear: both; width: 400px; }
          form#1496666 p#1508124_C label {clear: both; width: 400px; }
          form#1496666 p#1508124_C input {clear: both; width: 396px; }
          form#1496666 p#1508166_C {clear: both; width: 400px; }
          form#1496666 p#1508166_C label {clear: both; width: 400px; }
          form#1496666 p#1508166_C input {clear: both; width: 396px; }
          form#1496666 p#1508176_C {clear: both; width: 400px; }
          form#1496666 p#1508176_C label {clear: both; width: 400px; }
          form#1496666 p#1508176_C input {clear: both; width: 396px; }
          form#1496666 p#1508181_C {clear: both; width: 400px; }
          form#1496666 p#1508181_C label {clear: both; width: 400px; }
          form#1496666 p#1508181_C input {clear: both; width: 396px; }
          form#1496666 p#1508203_C {clear: both; width: 400px; }
          form#1496666 p#1508203_C label {clear: both; width: 400px; }
          form#1496666 p#1508203_C input {clear: both; width: 396px; }
          form#1496666 p#1508210_C {clear: both; width: 400px; }
          form#1496666 p#1508210_C label {clear: both; width: 400px; }
          form#1496666 p#1508210_C input {clear: both; width: 396px; }
          form#1496666 p#1508221_C {clear: both; width: 400px; }
          form#1496666 p#1508221_C label {clear: both; width: 400px; }
          form#1496666 p#1508221_C input {clear: both; width: 396px; }
          form#1496666 p#1508224_C {clear: both; width: 400px; }
          form#1496666 p#1508224_C label {clear: both; width: 400px; }
          form#1496666 p#1508224_C input {clear: both; width: 396px; }
          form#1496666 p#1508227_C {clear: both; width: 400px; }
          form#1496666 p#1508227_C label {clear: both; width: 400px; }
          form#1496666 p#1508227_C input {clear: both; width: 396px; }
          form#1496666 p#1508230_C {clear: both; width: 400px; }
          form#1496666 p#1508230_C label {clear: both; width: 400px; }
          form#1496666 p#1508230_C input {clear: both; width: 396px; }
          form#1496666 p#1508233_C {clear: both; width: 400px; }
          form#1496666 p#1508233_C label {clear: both; width: 400px; }
          form#1496666 p#1508233_C input {clear: both; width: 396px; }
          form#1496666 p#1508236_C {clear: both; width: 400px; }
          form#1496666 p#1508236_C label {clear: both; width: 400px; }
          form#1496666 p#1508236_C input {clear: both; width: 396px; }
          form#1496666 p#1508239_C {clear: both; width: 400px; }
          form#1496666 p#1508239_C label {clear: both; width: 400px; }
          form#1496666 p#1508239_C input {clear: both; width: 396px; }
          form#1496666 p#1508244_C {clear: both; width: 400px; }
          form#1496666 p#1508244_C label {clear: both; width: 400px; }
          form#1496666 p#1508244_C input {clear: both; width: 396px; }
          form#1496666 p#1508247_C {clear: both; width: 400px; }
          form#1496666 p#1508247_C label {clear: both; width: 400px; }
          form#1496666 p#1508247_C input {clear: both; width: 396px; }
          form#1496666 p#1508250_C {clear: both; width: 400px; }
          form#1496666 p#1508250_C label {clear: both; width: 400px; }
          form#1496666 p#1508250_C input {clear: both; width: 396px; }
          form#1496666 p#1508253_C {clear: both; width: 400px; }
          form#1496666 p#1508253_C label {clear: both; width: 400px; }
          form#1496666 p#1508253_C input {clear: both; width: 396px; }
          form#1496666 p#1508256_C {clear: both; width: 400px; }
          form#1496666 p#1508256_C label {clear: both; width: 400px; }
          form#1496666 p#1508256_C input {clear: both; width: 396px; }
          form#1496666 p#1508259_C {clear: both; width: 400px; }
          form#1496666 p#1508259_C label {clear: both; width: 400px; }
          form#1496666 p#1508259_C input {clear: both; width: 396px; }
          form#1496666 p#1637449_C {clear: both; width: 400px; }
          form#1496666 p#1637449_C label {clear: both; width: 400px; }
          form#1496666 p#1637449_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
      
           
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_ConsultarInscripcion.do"><bean:message key="V_ModificarInscripcion.label0"/><%-- Regresar --%></html:link></li>
                </ul>
                <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesi�n --%></html:link>
            </div>
                    <div id="header">                        
                    </div>
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            ${empty msg ? "" : msg}
                            <br>
                             <div class="box1496666" align ="center"><html:form styleId="F1496666"
                  action="/A_ModificarInscripcion.do" method="post">
                                     <table border="0" width="400px" align="left">
               <tr><th>Codigo PT</th><td><bean:write  name='codigoPt'/></td></tr>                                         
                 </table>
                 <br>
                    <table border="0" width="400px" align="center">
                      <tr><th width="125px"><p id="1508113_C" ><label for="1508113"><bean:message key="F_PlanTrabajo.label0"/><%-- Empresa:  --%></label></th><td><html:text styleId="1508113" property="empresa" value='${empresa}' size="28"/></p></th></tr>
                    </table>
                  
                    <br>
                    
                       <h1>Tutor Industrial</h1>

                   <br>
                   <table border="0" width="400px" align="center">
                      <tr><th><p id="1508124_C"><label for="1508124"><bean:message key="F_PlanTrabajo.label1"/><%-- Tutor Industrial:  --%></label></th><td><html:text styleId="1508124" property="codigoTutorIndustrial" value='${codigoTutorIndustrial}' size="30"/></p></th></tr>
                   </table>
                   
                  <br>

                   <h1>Tutor Acad&eacute;mico</h1>

                   <br>
                   <table border="0" width="400px" align="center">
                        <tr><th><p id="1508166_C"><label for="1508166"><bean:message key="F_PlanTrabajo.label2"/><%-- Tutor Acad&eacute;mico: --%></label></th><td><html:text styleId="1508166" property="codigoTutorAcademico" value='${codigoTutorAcademico}' size="28"/></p></th></tr>
                   </table>
                   
                   <br>

                   <h1>Pasant&iacute;a</h1>

                   <br>
                   <table border="0" width="400px">
                        <tr><th><p id="1508176_C"><label for="1508176"><bean:message key="F_PlanTrabajo.label3"/><%-- Titulo: --%></label></th><td><html:text styleId="1508176" property="tituloPasantia" value='${tituloPasantia} 'size="28"/></p></td></tr>
                        <tr><th><p id="1508181_C"><label for="1508181"><bean:message key="F_PlanTrabajo.label4"/><%-- Area de Proyecto: --%></label></th><td><html:text styleId="1508181" property="areaProyecto" value='${areaProyecto}' size="28"/></p></td></tr>
                        <tr><th><p id="1508203_C"><label for="1508203"><bean:message key="F_PlanTrabajo.label5"/><%-- Resumen del Proyecto:  --%></label></th><td><html:textarea styleId="1508203" property="resumenProyecto" value='${resumenProyecto}' cols="35" rows="10"></html:textarea></p></td></tr>
                        <tr><th><p id="1508210_C"><label for="1508210"><bean:message key="F_PlanTrabajo.label6"/><%-- Objetivos de la Pasantia:  --%></label></th><td><html:textarea styleId="1508210" property="objetivosPasantias" value='${objetivosPasantias}' cols="35" rows="10"></html:textarea></p></td></tr>
                        <tr><th><p id="1508221_C"><label for="1508221"><bean:message key="F_PlanTrabajo.label7"/><%-- Fases:  --%></label></th><td><html:textarea styleId="1508221" property="fasesPasantia" value='${fasesPasantia}' cols="35" rows="10"></html:textarea></p></td></tr>
                  </table>
                  
                  <br>

                   <h1>Fase 1</h1>

                   <br>
                  <table border="0" width="400px">
                        <tr><th><p id="1508224_C"><label for="1508224"><bean:message key="F_PlanTrabajo.label8"/><%-- Objetivos especificos: --%></label></th><td><html:textarea styleId="1508224" property="objetivoFaseI" value='${objetivoFaseI}' cols="35" rows="10"></html:textarea></p></td></tr>
                        <tr><th><p id="1508227_C"><label for="1508227"><bean:message key="F_PlanTrabajo.label9"/><%-- Actividades:  --%></label></th><td><html:textarea styleId="1508227" property="actividadesFaseI" value='${actividadesFaseI}' cols="35" rows="10"></html:textarea></p></td></tr>
                        <tr><th><p id="1508230_C"><label for="1508230"><bean:message key="F_PlanTrabajo.label10"/><%-- Tiempo estimado: --%></label></th><td><html:textarea styleId="1508230" property="tiempoFaseI" value='${tiempoFaseI}' cols="35" rows="10"></html:textarea></p></td></tr>
                  </table>
                   
                   <br>

                    <h1>Fase 2</h1>

                   <br>
                  <table border="0" width="400px">
                        <tr><th><p id="1508233_C"><label for="1508233"><bean:message key="F_PlanTrabajo.label11"/><%-- Objetivos especificos: --%></label></th><td><html:textarea styleId="1508233" property="objetivoFaseII" value='${objetivoFaseII}' cols="35" rows="10"></html:textarea></p></td></tr>
                        <tr><th><p id="1508236_C"><label for="1508236"><bean:message key="F_PlanTrabajo.label12"/><%-- Actividades: --%></label></th><td><html:textarea styleId="1508236" property="actividadesFaseII" value='${actividadesFaseII}' cols="35" rows="10"></html:textarea></p></td></tr>
                        <tr><th><p id="1508239_C"><label for="1508239"><bean:message key="F_PlanTrabajo.label13"/><%-- Tiempo estimado: --%></label></th><td><html:textarea styleId="1508239" property="tiempoFaseII"value='${tiempoFaseII}'  cols="35" rows="10"></html:textarea></p></td></tr>
                    </table>
                   
                    <br>

                    <h1>Fase 3</h1>

                    <br>
                    
                   <table border="0" width="400px">
                        <tr><th><p id="1508244_C"><label for="1508244"><bean:message key="F_PlanTrabajo.label14"/><%-- Objetivos especificos: --%></label></th><td><html:textarea styleId="1508244" property="objetivoFaseIII" value='${objetivoFaseIII}' cols="35" rows="10"></html:textarea></p></td></tr>
                        <tr><th><p id="1508247_C"><label for="1508247"><bean:message key="F_PlanTrabajo.label15"/><%-- Actividades: --%></label></th><td><html:textarea styleId="1508247" property="actividadesFaseIII" value='${actividadesFaseIII}' cols="35" rows="10"></html:textarea></p></td></tr>
                        <tr><th><p id="1508250_C"><label for="1508250"><bean:message key="F_PlanTrabajo.label16"/><%-- Tiempo estimado: --%></label></th><td><html:textarea styleId="1508250" property="tiempoFaseIII" value='${tiempoFaseIII}' cols="35" rows="10"></html:textarea></p></td></tr>
                   </table>
                  <br>

                   <h1>Fase 4</h1>

                   <br>
                   <table border="0" width="400px">
                        <tr><th><p id="1508253_C"><label for="1508253"><bean:message key="F_PlanTrabajo.label17"/><%-- Objetivos especificos:  --%></label></th><td><html:textarea styleId="1508253" property="objetivoFaseIV" value='${objetivoFaseIV}' cols="35" rows="10"></html:textarea></p></td></tr>
                        <tr><th><p id="1508256_C"><label for="1508256"><bean:message key="F_PlanTrabajo.label18"/><%-- Actividades: --%></label></th><td><html:textarea styleId="1508256" property="actividadesFaseIV"value='${actividadesFaseIV}'  cols="35" rows="10"></html:textarea></p></td></tr>
                        <tr><th><p id="1508259_C"><label for="1508259"><bean:message key="F_PlanTrabajo.label19"/><%-- Tiempo estimado: --%></label></th><td><html:textarea styleId="1508259" property="tiempoFaseIV"value='${tiempoFaseIV}'  cols="35" rows="10"></html:textarea></p></td></tr>
               
                   </table>
                    
                 <br>
                  <html:submit styleClass="button"><bean:message key="V_ModificarInscripcion.label1"/><%-- Modificar Inscripci&oacute;n --%></html:submit>
                </html:form></div>

                        </div>
                    </div>
                  
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