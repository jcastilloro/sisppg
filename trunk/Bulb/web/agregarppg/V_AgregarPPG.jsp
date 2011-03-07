<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>

    <head>
        <title><bean:message key="V_AgregarPPG.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <script type="text/javascript" src="../scripts/datetimepicker.js"></script>
        <style type="text/css">

        div#box1388408 {width: 400px; margin: 40px auto; }

        form#1388408 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }

        form#1388408 p {float: left; margin: 0; padding: 0; display: inline; }

        form#1388408 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }

        form#1388408 input {float: left; margin: 0; padding: 0; display: inline; }

          form#1388408 p#1388410_C {clear: both; width: 400px; }

          form#1388408 p#1388410_C label {clear: both; width: 400px; }

          form#1388408 p#1388410_C input {clear: both; width: 396px; }

          form#1388408 p#1388707_C {clear: both; width: 400px; }

          form#1388408 p#1388707_C label {clear: both; width: 400px; }

          form#1388408 p#1388707_C input {clear: both; width: 396px; }

          form#1388408 p#1388711_C {clear: both; width: 400px; }

          form#1388408 p#1388711_C label {clear: both; width: 400px; }

          form#1388408 p#1388711_C input {clear: both; width: 396px; }

          form#1388408 p#1388714_C {clear: both; width: 400px; }

          form#1388408 p#1388714_C label {clear: both; width: 400px; }

          form#1388408 p#1388714_C input {clear: both; width: 396px; }

          form#1388408 p#1388717_C {clear: both; width: 400px; }

          form#1388408 p#1388717_C label {clear: both; width: 400px; }

          form#1388408 p#1388717_C input {clear: both; width: 396px; }

          form#1388408 p#1388720_C {clear: both; width: 400px; }

          form#1388408 p#1388720_C label {clear: both; width: 400px; }

          form#1388408 p#1388720_C input {clear: both; width: 396px; }

          form#1388408 p#1388723_C {clear: both; width: 400px; }

          form#1388408 p#1388723_C label {clear: both; width: 400px; }

          form#1388408 p#1388723_C input {clear: both; width: 396px; }

          form#1388408 p#1388726_C {clear: both; width: 400px; }

          form#1388408 p#1388726_C label {clear: both; width: 400px; }

          form#1388408 p#1388726_C input {clear: both; width: 396px; }

          form#1388408 p#1388729_C {clear: both; width: 400px; }

          form#1388408 p#1388729_C label {clear: both; width: 400px; }

          form#1388408 p#1388729_C input {clear: both; width: 396px; }

          form#1388408 p#1388732_C {clear: both; width: 400px; }

          form#1388408 p#1388732_C label {clear: both; width: 400px; }

          form#1388408 p#1388732_C input {clear: both; width: 396px; }

          form#1388408 p#1388735_C {clear: both; width: 400px; }

          form#1388408 p#1388735_C label {clear: both; width: 400px; }

          form#1388408 p#1388735_C input {clear: both; width: 396px; }

          form#1388408 p#1388738_C {clear: both; width: 400px; }

          form#1388408 p#1388738_C label {clear: both; width: 400px; }

          form#1388408 p#1388738_C input {clear: both; width: 396px; }

          form#1388408 p#1388741_C {clear: both; width: 400px; }

          form#1388408 p#1388741_C label {clear: both; width: 400px; }

          form#1388408 p#1388741_C input {clear: both; width: 396px; }

          form#1388408 p#1388744_C {clear: both; width: 400px; }

          form#1388408 p#1388744_C label {clear: both; width: 400px; }

          form#1388408 p#1388744_C input {clear: both; width: 396px; }

          form#1388408 p#1388747_C {clear: both; width: 400px; }

          form#1388408 p#1388747_C label {clear: both; width: 400px; }

          form#1388408 p#1388747_C input {clear: both; width: 396px; }

          form#1388408 p#1388750_C {clear: both; width: 400px; }

          form#1388408 p#1388750_C label {clear: both; width: 400px; }

          form#1388408 p#1388750_C input {clear: both; width: 396px; }

          form#1388408 p#1388753_C {clear: both; width: 400px; }

          form#1388408 p#1388753_C label {clear: both; width: 400px; }

          form#1388408 p#1388753_C input {clear: both; width: 396px; }

          form#1388408 p#1388756_C {clear: both; width: 400px; }

          form#1388408 p#1388756_C label {clear: both; width: 400px; }

          form#1388408 p#1388756_C input {clear: both; width: 396px; }

          form#1388408 p#1388759_C {clear: both; width: 400px; }

          form#1388408 p#1388759_C label {clear: both; width: 400px; }

          form#1388408 p#1388759_C input {clear: both; width: 396px; }

          form#1388408 p#1388762_C {clear: both; width: 400px; }

          form#1388408 p#1388762_C label {clear: both; width: 400px; }

          form#1388408 p#1388762_C input {clear: both; width: 396px; }

          form#1388408 p#1388765_C {clear: both; width: 400px; }

          form#1388408 p#1388765_C label {clear: both; width: 400px; }

          form#1388408 p#1388765_C input {clear: both; width: 396px; }

          form#1388408 p#1388768_C {clear: both; width: 400px; }

          form#1388408 p#1388768_C label {clear: both; width: 400px; }

          form#1388408 p#1388768_C input {clear: both; width: 396px; }

          form#1388408 p#1388771_C {clear: both; width: 400px; }

          form#1388408 p#1388771_C label {clear: both; width: 400px; }

          form#1388408 p#1388771_C input {clear: both; width: 396px; }

          form#1388408 p#1388774_C {clear: both; width: 400px; }

          form#1388408 p#1388774_C label {clear: both; width: 400px; }

          form#1388408 p#1388774_C input {clear: both; width: 396px; }

          form#1388408 p#1388781_C {clear: both; width: 400px; }

          form#1388408 p#1388781_C label {clear: both; width: 400px; }

          form#1388408 p#1388781_C input {clear: both; width: 396px; }

          form#1388408 p#1435712_C {clear: both; width: 400px; }

          form#1388408 p#1435712_C label {clear: both; width: 400px; }

          form#1388408 p#1435712_C input {clear: both; width: 396px; }

          form#1388408 p#1435715_C {clear: both; width: 400px; }

          form#1388408 p#1435715_C label {clear: both; width: 400px; }

          form#1388408 p#1435715_C input {clear: both; width: 396px; }

          form#1388408 p#1435718_C {clear: both; width: 400px; }

          form#1388408 p#1435718_C label {clear: both; width: 400px; }

          form#1388408 p#1435718_C input {clear: both; width: 396px; }

          form#1388408 p#1448223_C {clear: both; width: 400px; }

          form#1388408 p#1448223_C label {clear: both; width: 400px; }

          form#1388408 p#1448223_C input {clear: both; width: 396px; }



        </style>

    </head>

    <body>     
            <div id="menu">
                <ul id="nav">

                    <li><html:link action="/A_Pre_GestionarPPG.do"><bean:message key="V_AgregarPPG.label1"/><%-- Regresar --%></html:link></li>
                </ul>
                <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesión --%></html:link>
            </div>
            <div id="header">
            </div>

        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            ${empty msg ? "" : msg}
                            <br>
                            <br>
                            <br>
                            <br>
                <div class="box1388408"><html:form styleId="F1388408"

                  action="/A_AgregarPPG.do" method="post">

                    <table border="0" width="450px" align ="center">

                  <tr><th><p id="1388410_C"><label for="1388410"><bean:message key="F_AgregarPPG.label0"/><%-- Nombre del Plan de Proyecto de Grado: --%></label></th><td><html:text styleId="1388410" property="nombrePPG" size="30"/></p></td></tr>                 

                  <tr><th><p id="1388707_C"><label for="1388707"><bean:message key="F_AgregarPPG.label1"/><%-- Codigo de Area --%></label></th><td> 

                        <select name="codigoAreaPPG">

				<logic:iterate id="area" collection="${empty L_Area ? _vacio : L_Area}">

                           		 <option value=${area.codigo_Area}><html:link action="/APre_area.do" paramId="idArea" paramName="area" paramProperty="idArea">${empty area.nombreArea ? "Editar" : area.nombreArea}</html:link></option>

	                        </logic:iterate>

			</select>   	

                  

                  <tr><th><p id="1388711_C"><label for="1388711"><bean:message key="F_AgregarPPG.label2"/><%-- Fecha --%></label></th><td><html:text styleId="1388711" property="fechaPPG" size="30" readonly="true" onclick="NewCal('1388711','ddmmyyyy');"/></p></td></tr>

                  <tr><th><p id="1388714_C"><label for="1388714"><bean:message key="F_AgregarPPG.label3"/><%-- Propuesto por --%></label></th><td><html:text styleId="1388714" property="propuestop" size="30"/></p></td></tr>

                  <tr><th><p id="1388717_C"><label for="1388717"><bean:message key="F_AgregarPPG.label4"/><%-- Actividades que involucra el proyecto --%></label></th><td><html:textarea styleId="1388717" property="actvPPG" cols="38" rows="10"></html:textarea></p></td></tr>

                  <tr><th><p id="1388720_C"><label for="1388720"><bean:message key="F_AgregarPPG.label5"/><%-- Puntos de Interes que han de ser tratados durante la ejecuci&oacute;n del proyecto de grado --%></th><td></label><html:textarea styleId="1388720" property="ptosInte" cols="38" rows="10"></html:textarea></p></td></tr>

                  <tr><th><p id="1388723_C"><label for="1388723"><bean:message key="F_AgregarPPG.label6"/><%-- Areas o campos de la t&eacute;cnica que se aborda en el desarrollo del proyecto --%></label></th><td><html:textarea styleId="1388723" property="areas" cols="38" rows="10"></html:textarea></p></td></tr>

                  <tr><th><p id="1388726_C"><label for="1388726"><bean:message key="F_AgregarPPG.label7"/><%-- Estimaci&oacute;n de la duraci&oacute;n del proyecto y recursos requeridos --%></label></th><td><html:textarea styleId="1388726" property="duraYrec" cols="38" rows="10"></html:textarea></p></td></tr>

                  <tr><th><p id="1388729_C"><label for="1388729"><bean:message key="F_AgregarPPG.label8"/><%-- Nombre de la Primera Etapa (EP-1308) --%></label></th><td><html:text styleId="1388729" property="primeraE" size="30"/></p></td></tr>

                  <tr><th><p id="1388732_C"><label for="1388732"><bean:message key="F_AgregarPPG.label9"/><%-- Trimestre --%></label></th><td>
                       <select name="trimestreUno">
                     
                      <option value="Septiembre-Diciembre">Septiembre-Diciembre</option>
                      <option value="Enero-Marzo">Enero-Marzo</option>
                      <option value="Abril-Julio">Abril-Julio</option>
                  </select>
                          </p></td></tr>
                  <tr><th><p id="1693070_C"><label for="1693070"><bean:message key="F_AgregarPPG.label27"/><%-- A&ntilde;o: --%></label></th><td>
                        <select name="anoUno">
                                <option value="0">--Seleccione--</option>
                                <option value="2010">2010</option>

                                <option value="2011">2011</option>
                                <option value="2012">2012</option>
                                <option value="2013">2013</option>
                                <option value="2014">2015</option>
                        </select>
      
                   </p></td></tr>

                  <tr><th><p id="1388735_C"><label for="1388735"><bean:message key="F_AgregarPPG.label10"/><%-- Resultados espec&iacute;ficos m&iacute;nimos a alcanzar en esta etapa --%></label></th><td><html:text styleId="1388735" property="resultMinUno" size="30"/></p></td></tr>

                  <tr><th><p id="1388738_C"><label for="1388738"><bean:message key="F_AgregarPPG.label11"/><%-- Actividades que se propone realizar para lograr estos resultados --%></label></th><td><html:text styleId="1388738" property="actResulUno" size="30"/></p></td></tr>

                  <tr><th><p id="1388741_C"><label for="1388741"><bean:message key="F_AgregarPPG.label12"/><%-- Descripci&oacute;n de t&oacute;picos en Ingenier&iacute;a de Computaci&oacute;n I (CI-5855) --%></label></th><td><html:text styleId="1388741" property="descTopicosICI" size="30"/></p></td></tr>

                  <tr><th><p id="1388744_C"><label for="1388744"><bean:message key="F_AgregarPPG.label13"/><%-- Nombre de la segunda etapa (EP-2308) --%></label></th><td><html:text styleId="1388744" property="segundaE" size="30"/></p></td></tr>

                  <tr><th><p id="1388747_C"><label for="1388747"><bean:message key="F_AgregarPPG.label14"/><%-- Trimestre --%></label></th><td>
                          <select name="trimestreDos">
                     
                      <option value="Septiembre-Diciembre">Septiembre-Diciembre</option>
                      <option value="Enero-Marzo">Enero-Marzo</option>
                      <option value="Abril-Julio">Abril-Julio</option>
                  </select>
                          </p></td></tr>
                  <tr><th><p id="1693073_C"><label for="1693073"><bean:message key="F_AgregarPPG.label28"/><%-- A&ntilde;o: --%></label></th><td>
                         <select name="anoDos">
                                <option value="0">--Seleccione--</option>
                                <option value="2010">2010</option>

                                <option value="2011">2011</option>
                                <option value="2012">2012</option>
                                <option value="2013">2013</option>
                                <option value="2014">2015</option>
                        </select>       
                  </p></td></tr>

                  <tr><th><p id="1388750_C"><label for="1388750"><bean:message key="F_AgregarPPG.label15"/><%-- Cursar&aacute; (EP-2308) y (EP-3308) Juntas --%></label></th><td><html:checkbox styleId="1388750" property="juntas"/></p></td></tr>

                  <tr><th><p id="1388753_C"><label for="1388753"><bean:message key="F_AgregarPPG.label16"/><%-- Resultados espec&iacute;ficos m&iacute;nimos a alcanzar en esta etapa --%></label></th><td><html:text styleId="1388753" property="resultMinDos" size="30"/></p></td></tr>

                  <tr><th><p id="1388756_C"><label for="1388756"><bean:message key="F_AgregarPPG.label17"/><%-- Actividades que se propone realizar para lograr estos resultados --%></label></th><td><html:text styleId="1388756" property="actResulDos" size="30"/></p></td></tr>

                  <tr><th><p id="1388759_C"><label for="1388759"><bean:message key="F_AgregarPPG.label18"/><%-- Descripci&oacute;n de t&oacute;picos en Ingenier&iacute;a De Computaci&oacute;n II (CI-5856) --%></label></th><td><html:text styleId="1388759" property="descTopicosICII" size="30"/></p></td></tr>

                  <tr><th><p id="1388762_C"><label for="1388762"><bean:message key="F_AgregarPPG.label19"/><%-- Nombre de la Tercera etapa (EP-3308) --%></label></th><td><html:text styleId="1388762" property="terceraE" size="30"/></p></td></tr>

                  <tr><th><p id="1388765_C"><label for="1388765"><bean:message key="F_AgregarPPG.label20"/><%-- Trimestre --%></label></th><td>
                          <select name="trimestreTres">
                     
                      <option value="Septiembre-Diciembre">Septiembre-Diciembre</option>
                      <option value="Enero-Marzo">Enero-Marzo</option>
                      <option value="Abril-Julio">Abril-Julio</option>
                  </select>
                          </p></td></tr>
                  <tr><th><p id="1693076_C"><label for="1693076"><bean:message key="F_AgregarPPG.label29"/><%-- A&ntilde;o: --%></label></th><td>
                         <select name="anoTres">
                                <option value="0">--Seleccione--</option>
                                <option value="2010">2010</option>

                                <option value="2011">2011</option>
                                <option value="2012">2012</option>
                                <option value="2013">2013</option>
                                <option value="2014">2015</option>
                        </select>       
                  </p></td></tr>

                  <tr><th><p id="1388768_C"><label for="1388768"><bean:message key="F_AgregarPPG.label21"/><%-- Resultados espec&iacute;ficos m&iacute;nimos a alcanzar en esta etapa --%></label></th><td><html:text styleId="1388768" property="resultMinTres" size="30"/></p></td></tr>

                  <tr><th><p id="1388771_C"><label for="1388771"><bean:message key="F_AgregarPPG.label22"/><%-- Actividades que se propone realizar para lograr estos resultados --%></label></th><td><html:text styleId="1388771" property="actResulTres" size="30"/></p></td></tr>

                  <tr><th><p id="1388774_C"><label for="1388774"><bean:message key="F_AgregarPPG.label23"/><%-- Si las actividades de estas etapas dependen de recursos materiales, indique que previsiones se han tomado para lograr la disponibilidad  --%></label></th><td><html:textarea styleId="1388774" property="recurMate" cols="38" rows="10"></html:textarea></p></td></tr>

                  <tr><th><p id="1435712_C"><label for="1435712"><bean:message key="F_AgregarPPG.label24"/><%-- Carnet Integrante 1: --%></label></th><td><html:text styleId="1435712" property="integrante1" size="30"/></p></td></tr>

                  <tr><th><p id="1435715_C"><label for="1435715"><bean:message key="F_AgregarPPG.label25"/><%-- Carnet Integrante 2: --%></label></th><td><html:text styleId="1435715" property="integrante2" size="30"/></p></td></tr>

                  <tr><th><p id="1435718_C"><label for="1435718"><bean:message key="F_AgregarPPG.label26"/><%-- Carnet Integrante 3: --%></label></th><td><html:text styleId="1435718" property="integrante3" size="30"/></p></td></tr>

                  </table>
                <table border="0" width="450px" align ="center">
                  <th><html:submit styleClass="button" ><bean:message key="V_AgregarPPG.label0"/><%-- Agregar Plan --%></html:submit></th>
                </table>

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