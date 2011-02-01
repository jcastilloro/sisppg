<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 

%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 

%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 

%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"

%><%@ page contentType="text/html;charset=ISO-8859-1"

%><html:html>

    <head>

        <title><bean:message key="V_ModificarDatosEmpresa.title"/></title>

        <html:base/>

        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>

        <style type="text/css">

        div#box1503587 {width: 400px; margin: 40px auto; }

        form#1503587 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }

        form#1503587 p {float: left; margin: 0; padding: 0; display: inline; }

        form#1503587 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }

        form#1503587 input {float: left; margin: 0; padding: 0; display: inline; }

          form#1503587 p#1503589_C {clear: both; width: 400px; }

          form#1503587 p#1503589_C label {clear: both; width: 400px; }

          form#1503587 p#1503589_C input {clear: both; width: 396px; }

          form#1503587 p#1503592_C {clear: both; width: 400px; }

          form#1503587 p#1503592_C label {clear: both; width: 400px; }

          form#1503587 p#1503592_C input {clear: both; width: 396px; }

          form#1503587 p#1503595_C {clear: both; width: 400px; }

          form#1503587 p#1503595_C label {clear: both; width: 400px; }

          form#1503587 p#1503595_C input {clear: both; width: 396px; }

          form#1503587 p#1503599_C {clear: both; width: 400px; }

          form#1503587 p#1503599_C label {clear: both; width: 400px; }

          form#1503587 p#1503599_C input {clear: both; width: 396px; }

          form#1503587 p#1503602_C {clear: both; width: 400px; }

          form#1503587 p#1503602_C label {clear: both; width: 400px; }

          form#1503587 p#1503602_C input {clear: both; width: 396px; }

          form#1503587 p#1503606_C {clear: both; width: 400px; }

          form#1503587 p#1503606_C label {clear: both; width: 400px; }

          form#1503587 p#1503606_C input {clear: both; width: 396px; }

          form#1503587 p#1503609_C {clear: both; width: 400px; }

          form#1503587 p#1503609_C label {clear: both; width: 400px; }

          form#1503587 p#1503609_C input {clear: both; width: 396px; }

          form#1503587 p#1503615_C {clear: both; width: 400px; }

          form#1503587 p#1503615_C label {clear: both; width: 400px; }

          form#1503587 p#1503615_C input {clear: both; width: 396px; }

          form#1503587 p#1503622_C {clear: both; width: 400px; }

          form#1503587 p#1503622_C label {clear: both; width: 400px; }

          form#1503587 p#1503622_C input {clear: both; width: 396px; }



        </style>



    </head>

    <body>

        

          

            <div id="menu">

                <ul id="nav">

                    <li><html:link action="/A_Pre_VistaEmpresa.do"><bean:message key="V_ModificarDatosEmpresa.label1"/><%-- Regresar --%></html:link></li>



                </ul>

            </div>

        <div id="header">          

		

	</div>

	<!-- end #header -->

        </div>

        <div id="body_wrapper">

            <div id="body">

                <div id="split">

                    <div class="top"></div>

                    <div id="left">

                        <div class="content">

                            <br>

                            <br>

                            <br>

                            <br>

                <div class="box1503587" align="center"><html:form styleId="F1503587"

                  action="/A_ModificarDatosEmpresa.do" method="post">

                   <table border="0" width="500px">

                  <tr><th>Login </th><td><bean:write name="login"/></td></tr>

                  <tr><th>Nombre de la Empresa </th><td><bean:write name="nombreEmpresa"/></td></tr>

                  <tr><th>RIF</th><td><bean:write name="rif"/></td></tr>

                  <tr><th><p id="1503606_C"><label for="1503606"><bean:message key="F_RegistrarEmpresa.label5"/><%-- Telefono --%></label></th><td><html:text styleId="1503606" property="telefono"value='${telefono}' size="30"/></p></td></tr>

                  <tr><th><p id="1503609_C"><label for="1503609"><bean:message key="F_RegistrarEmpresa.label6"/><%-- Direcci&oacute;n --%></label></th><td><html:text styleId="1503609" property="direccion"value='${direccion}' size="30"/></p></td></tr>

                  <tr><th><p id="1503615_C"><label for="1503615"><bean:message key="F_RegistrarEmpresa.label7"/><%-- Ciudad --%></label></th><td><html:text styleId="1503615" property="ciudad" value='${ciudad}'size="30"/></p></td></tr>

                  <tr><th><p id="1503622_C"><label for="1503622"><bean:message key="F_RegistrarEmpresa.label8"/><%-- Pais --%></label></th><td><html:text styleId="1503622" property="pais" value='${pais}' size="30"/></p></td></tr>

                 </table>

                  <html:submit styleClass="button"><bean:message key="V_ModificarDatosEmpresa.label0"/><%-- Modificar Datos --%></html:submit>

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