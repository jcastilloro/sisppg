<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html xmlns="http://www.w3.org/1999/xhtml">

    
    <head>
        <title><bean:message key="V_LlenarFormularioPreinscripcion.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../scripts/datetimepicker.js"></script>
        <style type="text/css">


        div#box1409001 {width: 400px; margin: 40px auto; }

        form#1409001 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }

        form#1409001 p {float: left; margin: 0; padding: 0; display: inline; }

        form#1409001 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }

        form#1409001 input {float: left; margin: 0; padding: 0; display: inline; }

          form#1409001 p#1409009_C {clear: both; width: 400px; }

          form#1409001 p#1409009_C label {clear: both; width: 400px; }

          form#1409001 p#1409009_C input {clear: both; width: 396px; }

          form#1409001 p#1409232_C {clear: both; width: 400px; }

          form#1409001 p#1409232_C label {clear: both; width: 400px; }

          form#1409001 p#1409232_C input {clear: both; width: 396px; }

          form#1409001 p#1409259_C {clear: both; width: 400px; }

          form#1409001 p#1409259_C label {clear: both; width: 400px; }

          form#1409001 p#1409259_C input {clear: both; width: 396px; }

          form#1409001 p#1409269_C {clear: both; width: 400px; }

          form#1409001 p#1409269_C label {clear: both; width: 400px; }

          form#1409001 p#1409269_C input {clear: both; width: 396px; }

          form#1409001 p#1409272_C {clear: both; width: 400px; }

          form#1409001 p#1409272_C label {clear: both; width: 400px; }

          form#1409001 p#1409272_C input {clear: both; width: 396px; }

          form#1409001 p#1409291_C {clear: both; width: 400px; }

          form#1409001 p#1409291_C label {clear: both; width: 400px; }

          form#1409001 p#1409291_C input {clear: both; width: 396px; }

          form#1409001 p#1409294_C {clear: both; width: 400px; }

          form#1409001 p#1409294_C label {clear: both; width: 400px; }

          form#1409001 p#1409294_C input {clear: both; width: 396px; }

          form#1409001 p#1409297_C {clear: both; width: 400px; }

          form#1409001 p#1409297_C label {clear: both; width: 400px; }

          form#1409001 p#1409297_C input {clear: both; width: 396px; }

          form#1409001 p#1409300_C {clear: both; width: 400px; }

          form#1409001 p#1409300_C label {clear: both; width: 400px; }

          form#1409001 p#1409300_C input {clear: both; width: 396px; }

          form#1409001 p#1409303_C {clear: both; width: 400px; }

          form#1409001 p#1409303_C label {clear: both; width: 400px; }

          form#1409001 p#1409303_C input {clear: both; width: 396px; }

          form#1409001 p#1409306_C {clear: both; width: 400px; }

          form#1409001 p#1409306_C label {clear: both; width: 400px; }

          form#1409001 p#1409306_C input {clear: both; width: 396px; }

          form#1409001 p#1409309_C {clear: both; width: 400px; }

          form#1409001 p#1409309_C label {clear: both; width: 400px; }

          form#1409001 p#1409309_C input {clear: both; width: 396px; }

          form#1409001 p#1409312_C {clear: both; width: 400px; }

          form#1409001 p#1409312_C label {clear: both; width: 400px; }

          form#1409001 p#1409312_C input {clear: both; width: 396px; }

          form#1409001 p#1409315_C {clear: both; width: 400px; }

          form#1409001 p#1409315_C label {clear: both; width: 400px; }

          form#1409001 p#1409315_C input {clear: both; width: 396px; }

          form#1409001 p#1480471_C {clear: both; width: 400px; }

          form#1409001 p#1480471_C label {clear: both; width: 400px; }

          form#1409001 p#1480471_C input {clear: both; width: 396px; }

          form#1409001 p#1480484_C {clear: both; width: 400px; }

          form#1409001 p#1480484_C label {clear: both; width: 400px; }

          form#1409001 p#1480484_C input {clear: both; width: 396px; }

          form#1409001 p#1480491_C {clear: both; width: 400px; }

          form#1409001 p#1480491_C label {clear: both; width: 400px; }

          form#1409001 p#1480491_C input {clear: both; width: 396px; }

          form#1409001 p#1480498_C {clear: both; width: 400px; }

          form#1409001 p#1480498_C label {clear: both; width: 400px; }

          form#1409001 p#1480498_C input {clear: both; width: 396px; }

          form#1409001 p#1480502_C {clear: both; width: 400px; }

          form#1409001 p#1480502_C label {clear: both; width: 400px; }

          form#1409001 p#1480502_C input {clear: both; width: 396px; }



        </style>
    </head>

    <body>
        <div id="wrapper">
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_GestionarPreinscripcion.do"><bean:message key="V_LlenarFormularioPreinscripcion.label1"/><%-- Regresar --%></html:link></li>
                </ul>
                <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesión --%></html:link></p>
            </div>
        </div>
        <div id="header">          
	</div>

	<!-- end #header -->

        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                              <br></br>
                              <br></br>
                              <h3 align="center">${empty msg ? "" : msg}</h3>
                              <br></br>
                              <br></br>
                   <div class="box1409001" align="center"><html:form styleId="F1409001"

                      action="/A_LlenarFormularioPreinscripcion.do" method="post">

                  <table border="0" width="450px">

                     <tr><th><p id="1409009_C"><label for="1409009"><bean:message key="F_PreInscripcion.label0"/><%-- EP --%></label></th><td>

                        <select name="ep">	
                              <option value="3420">3420 (Pasant&iacute;a Larga)</option>
                              <option value="2420">2420 (Pasant&iacute;a Intermedia)</option>
                              <option value="1420">1420 (Pasant&iacute;a Corta)</option>
                        </select>  
                     </p></td></tr>
                     <tr><th><p id="1409232_C"><label for="1409232"><bean:message key="F_PreInscripcion.label1"/><%-- Per&iacute;odo Pasant&iacute;a --%></label></p></th><td> <html:text styleId="1409232" property="periodo_pasantia" size="30"/></td></tr>
                     <tr><th><p id="1409259_C"><label for="1409259"><bean:message key="F_PreInscripcion.label2"/><%-- A&ntilde;o --%></label></p></th><td> <html:text styleId="1409259" property="ano" size="30"/></td></tr>
                     <tr><th><p id="1409303_C"><label for="1409303"><bean:message key="F_PreInscripcion.label3"/><%-- Edo. Civil --%></label></p></th><td>
                         <select name="estado_civil">	
                                 <option value="Soltero">Soltero</option>
                                 <option value="Casado">Casado</option>
                                 <option value="Divorciado">Divorciado</option>
                         </select> 
                    </p></td></tr>
                    <tr><th><p id="1409306_C"><label for="1409306"><bean:message key="F_PreInscripcion.label4"/><%-- Tel&eacute;fono Hab --%></label></th><td> <html:text styleId="1409306" property="telef_hab" size="30"/></p></td></tr>
                    <tr><th><p id="1409309_C"><label for="1409309"><bean:message key="F_PreInscripcion.label5"/><%-- Otro Tel&eacute;fono --%></label></th><td> <html:text styleId="1409309" property="otro_telef" size="30"/></p></td></tr>
                    <tr><th><p id="1409312_C"><label for="1409312"><bean:message key="F_PreInscripcion.label6"/><%-- E-mail --%></label></th><td> <html:text styleId="1409312" property="correo" size="30"/></p></td></tr>
                    <tr><th><p id="1409315_C"><label for="1409315"><bean:message key="F_PreInscripcion.label7"/><%-- Direcci&oacute;n --%></label></th><td><html:textarea styleId="1409315" property="direccion" cols="38" rows="10"></html:textarea></p></td></tr>
                    <tr><th><p id="1480471_C"><label for="1480471"><bean:message key="F_PreInscripcion.label8"/><%-- Te graduas --%></label><td>
                            <logic:equal name="graduando" value="true">
                                    <input type="checkbox" name="graduando" value="true" checked></p></tr>
                            </logic:equal>
                            <logic:notEqual name="graduando" value="true">
                                <input type="checkbox" name="graduando" value="true"></p></tr>
                            </logic:notEqual>
                  </table>
                   <br>
                  <table border="0" width="450px">
                       <th><p><label for="1480484"><bean:message key="F_PreInscripcion.label9"/><%-- Deseas que la CCTDS tramite el proceso de Busqueda de Pasantia en la Empresa --%></label></p></th>
                  </table>
                       <logic:equal name="tramiteCCTDS" value="true">
                            <input type="checkbox" name="tramiteCCTDS" value="true" checked></p>
                       </logic:equal>
                       <logic:notEqual name="tramiteCCTDS" value="true">
                            <input type="checkbox" name="tramiteCCTDS" value="true"></p>
                       </logic:notEqual>
                  <table border="0" width="450px">
                     <tr><th><p id="1480491_C"><label for="1480491"><bean:message key="F_PreInscripcion.label10"/><%-- Region del Pais que estaria dispuesto a ir:  --%></label></th><td><html:text styleId="1480491" property="region" value='${region}' size="30"/></p></td></tr>
                     <tr><th><p id="1480498_C"><label for="1480498"><bean:message key="F_PreInscripcion.label11"/><%-- Estado del Pais: --%></label></th><td><html:text styleId="1480498" property="estado" value='${estado}' size="30"/></p></td></tr>
                     <tr><th><p id="1480502_C"><label for="1480502"><bean:message key="F_PreInscripcion.label12"/><%-- Ciudad --%></label></th><td><html:text styleId="1480502" property="ciudad" value='${ciudad}' size="30"/></p></td></tr>
                  </table>
           <html:submit styleClass="button"><bean:message key="V_LlenarFormularioPreinscripcion.label0"/><%-- Enviar --%></html:submit>
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

</html>