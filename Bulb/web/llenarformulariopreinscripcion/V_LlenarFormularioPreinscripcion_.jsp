<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_LlenarFormularioPreinscripcion.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
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
        <div id="header">
            <div id="title"><bean:message key="V_LlenarFormularioPreinscripcion.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_GestionarPreinscripcion.do"><bean:message key="V_LlenarFormularioPreinscripcion.label1"/><%-- Regresar --%></html:link></li>
                    <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_LlenarFormularioPreinscripcion.label2"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>

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
                <div class="box1409001"><html:form styleId="F1409001"
                  action="/A_LlenarFormularioPreinscripcion.do" method="post">
                  <p id="1409009_C"><label for="1409009"><bean:message key="F_PreInscripcion.label0"/><%-- EP --%></label><html:text styleId="1409009" property="ep" size="30"/></p>
                  <p id="1409232_C"><label for="1409232"><bean:message key="F_PreInscripcion.label1"/><%-- Per&iacute;odo Pasant&iacute;a --%></label><html:text styleId="1409232" property="periodo_pasantia" size="30"/></p>
                  <p id="1409259_C"><label for="1409259"><bean:message key="F_PreInscripcion.label2"/><%-- A&ntilde;o --%></label><html:text styleId="1409259" property="ano" size="30"/></p>
                  <p id="1409303_C"><label for="1409303"><bean:message key="F_PreInscripcion.label3"/><%-- Edo. Civil --%></label><html:text styleId="1409303" property="estado_civil" size="30"/></p>
                  <p id="1409306_C"><label for="1409306"><bean:message key="F_PreInscripcion.label4"/><%-- Tel&eacute;fono Hab --%></label><html:text styleId="1409306" property="telef_hab" size="30"/></p>
                  <p id="1409309_C"><label for="1409309"><bean:message key="F_PreInscripcion.label5"/><%-- Otro Tel&eacute;fono --%></label><html:text styleId="1409309" property="otro_telef" size="30"/></p>
                  <p id="1409312_C"><label for="1409312"><bean:message key="F_PreInscripcion.label6"/><%-- E-mail --%></label><html:text styleId="1409312" property="correo" size="30"/></p>
                  <p id="1409315_C"><label for="1409315"><bean:message key="F_PreInscripcion.label7"/><%-- Direcci&oacute;n --%></label><html:textarea styleId="1409315" property="direccion" cols="60" rows="10"></html:textarea></p>
                  <p id="1480471_C"><label for="1480471"><bean:message key="F_PreInscripcion.label8"/><%-- Te graduas  --%></label><html:checkbox styleId="1480471" property="graduando"/></p>
                  <p id="1480484_C"><label for="1480484"><bean:message key="F_PreInscripcion.label9"/><%-- Deseas que la CCTDS tramite el proceso de Busqueda de Pasantia en la Empresa --%></label><html:checkbox styleId="1480484" property="tramiteCCTDS"/></p>
                  <p id="1480491_C"><label for="1480491"><bean:message key="F_PreInscripcion.label10"/><%-- Region del Pais que estaria dispuesto a ir:  --%></label><html:text styleId="1480491" property="region" size="30"/></p>
                  <p id="1480498_C"><label for="1480498"><bean:message key="F_PreInscripcion.label11"/><%-- Estado del Pais: --%></label><html:text styleId="1480498" property="estado" size="30"/></p>
                  <p id="1480502_C"><label for="1480502"><bean:message key="F_PreInscripcion.label12"/><%-- Ciudad --%></label><html:text styleId="1480502" property="ciudad" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_LlenarFormularioPreinscripcion.label0"/><%-- Enviar --%></html:submit>
                </html:form></div>

                        </div>
                    </div>
                    <div id="right"><ul id="nav"><li><script type="text/javascript">var hb = new HelpBalloon({ dataURL: '//tooltip.do?V=V_LlenarFormularioPreinscripcion'});</script></li></ul></div>
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