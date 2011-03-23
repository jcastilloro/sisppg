<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_Registro_Empresa.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840529 {width: 400px; margin: 40px auto; }
        form#1840529 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840529 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840529 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840529 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840529 p#1840531_C {clear: both; width: 400px; }
          form#1840529 p#1840531_C label {clear: both; width: 400px; }
          form#1840529 p#1840531_C input {clear: both; width: 396px; }
          form#1840529 p#1840534_C {clear: both; width: 400px; }
          form#1840529 p#1840534_C label {clear: both; width: 400px; }
          form#1840529 p#1840534_C input {clear: both; width: 396px; }
          form#1840529 p#1840537_C {clear: both; width: 400px; }
          form#1840529 p#1840537_C label {clear: both; width: 400px; }
          form#1840529 p#1840537_C input {clear: both; width: 396px; }
          form#1840529 p#1840540_C {clear: both; width: 400px; }
          form#1840529 p#1840540_C label {clear: both; width: 400px; }
          form#1840529 p#1840540_C input {clear: both; width: 396px; }
          form#1840529 p#1840543_C {clear: both; width: 400px; }
          form#1840529 p#1840543_C label {clear: both; width: 400px; }
          form#1840529 p#1840543_C input {clear: both; width: 396px; }
          form#1840529 p#1840546_C {clear: both; width: 400px; }
          form#1840529 p#1840546_C label {clear: both; width: 400px; }
          form#1840529 p#1840546_C input {clear: both; width: 396px; }
          form#1840529 p#1840550_C {clear: both; width: 400px; }
          form#1840529 p#1840550_C label {clear: both; width: 400px; }
          form#1840529 p#1840550_C input {clear: both; width: 396px; }
          form#1840529 p#1840553_C {clear: both; width: 400px; }
          form#1840529 p#1840553_C label {clear: both; width: 400px; }
          form#1840529 p#1840553_C input {clear: both; width: 396px; }
          form#1840529 p#1840557_C {clear: both; width: 400px; }
          form#1840529 p#1840557_C label {clear: both; width: 400px; }
          form#1840529 p#1840557_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_Registro_Empresa.title"/></div>
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
                <div class="box1840529"><html:form
                  action="/A_Registrar_Empresa.do" method="post">
                  <p id="1840531_C"><label for="1840531"><bean:message key="F_Registro_Empresa.label0"/><%-- Login: --%></label><html:text styleId="1840531" property="login" size="30"/></p>
                  <p id="1840534_C"><label for="1840534"><bean:message key="F_Registro_Empresa.label1"/><%-- Password: --%></label><html:password styleId="1840534" property="password" size="30"/></p>
                  <p id="1840537_C"><label for="1840537"><bean:message key="F_Registro_Empresa.label2"/><%-- Confirmar Password: --%></label><html:password styleId="1840537" property="confirmar_password" size="30"/></p>
                  <p id="1840540_C"><label for="1840540"><bean:message key="F_Registro_Empresa.label3"/><%-- Nombre Empresa: --%></label><html:text styleId="1840540" property="nombre" size="30"/></p>
                  <p id="1840543_C"><label for="1840543"><bean:message key="F_Registro_Empresa.label4"/><%-- RIF: --%></label><html:text styleId="1840543" property="rif" size="30"/></p>
                  <p id="1840546_C"><label for="1840546"><bean:message key="F_Registro_Empresa.label5"/><%-- Telefono: --%></label><html:text styleId="1840546" property="telefono" size="30"/></p>
                  <p id="1840550_C"><label for="1840550"><bean:message key="F_Registro_Empresa.label6"/><%-- Direccion: --%></label><html:textarea styleId="1840550" property="direccion" cols="60" rows="10"></html:textarea></p>
                  <p id="1840553_C"><label for="1840553"><bean:message key="F_Registro_Empresa.label7"/><%-- Pais: --%></label><html:text styleId="1840553" property="pais" size="30"/></p>
                  <p id="1840557_C"><label for="1840557"><bean:message key="F_Registro_Empresa.label8"/><%-- Ciudad: --%></label><html:text styleId="1840557" property="ciudad" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_Registro_Empresa.label0"/><%-- RegistrarEmpresa --%></html:submit>
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