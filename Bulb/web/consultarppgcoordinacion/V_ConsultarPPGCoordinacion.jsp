<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_ConsultarPPGCoordinacion.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <style type="text/css">
        div#box1700978 {width: 400px; margin: 40px auto; }
        form#1700978 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1700978 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1700978 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1700978 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1700978 p#1700983_C {clear: both; width: 400px; }
          form#1700978 p#1700983_C label {clear: both; width: 400px; }
          form#1700978 p#1700983_C input {clear: both; width: 396px; }
          form#1700978 p#1700987_C {clear: both; width: 400px; }
          form#1700978 p#1700987_C label {clear: both; width: 400px; }
          form#1700978 p#1700987_C input {clear: both; width: 396px; }
          form#1700978 p#1700990_C {clear: both; width: 400px; }
          form#1700978 p#1700990_C label {clear: both; width: 400px; }
          form#1700978 p#1700990_C input {clear: both; width: 396px; }
          form#1700978 p#1700993_C {clear: both; width: 400px; }
          form#1700978 p#1700993_C label {clear: both; width: 400px; }
          form#1700978 p#1700993_C input {clear: both; width: 396px; }

        </style>
    </head>

    <body>
        <div id="menu">
            <ul id="nav">
                <li><html:link action="/A_Pre_GestionarConsultaCoordinacion.do"><bean:message key="V_ConsultarPPGCoordinacion.label1"/><%-- Regresar --%></html:link></li>
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
                           <h3 align="center">${empty msg ? "" : msg}</h3>
                           <br>
                <div class="box1700978"><html:form styleId="F1700978"
                  action="/A_ConsultarPPGCoordinacion.do" method="post">
                    <table align="center">
                  <tr><th><p id="1700983_C"><label for="1700983"><bean:message key="F_ConsultarPPG.label0"/><%-- Por Area: --%></label>
				       <select name="area">
                                            <option value="">--Seleccione--</option>
                                                <logic:iterate id="area" collection="${empty L_Area ? _vacio : L_Area}">

                                                         <option value=${area.codigo_Area}><html:link action="/APre_area.do" paramId="idArea" paramName="area" paramProperty="idArea">${empty area.nombreArea ? "Editar" : area.nombreArea}</html:link></option>

                                                </logic:iterate>

                                        </select> 

		  </p></th></tr>
                <tr><th><p id="1700987_C"><label for="1700987"><bean:message key="F_ConsultarPPG.label1"/><%-- Por Tutor --%></label>
                                      <select name="tutor">
                                                <option value="">--Seleccione--</option>
 <%--                                                <logic:iterate id="profesor" collection="${empty L_Profesor ? _vacio : L_Profesor}">

                                                         <option value=${profesor.codigoProfesor}><html:link action="/APre_profesor.do" paramId="idProfesor" paramName="profesor" paramProperty="idProfesor">${empty profesor.nombreProfesor ? "Editar" : profesor.nombreProfesor}</html:link></option>

                                                </logic:iterate>
--%>
                                        </select> 

		  </p></th></tr>
                  <tr><th><p id="1700990_C"><label for="1700990"><bean:message key="F_ConsultarPPG.label2"/><%-- Por Trimestre: --%></label>
                                              <select name="periodo">
                                                  <option value="">--Seleccione--</option>
                                                  <option value="Septiembre-Diciembre">Septiembre-Diciembre</option>
                                                  <option value="Enero-Marzo">Enero-Marzo</option>
                                                  <option value="Abril-Julio">Abril-Julio</option>
                                              </select>
		  </p></th></tr>
                 <tr><th><p id="1700993_C"><label for="1700993"><bean:message key="F_ConsultarPPG.label3"/><%-- Por A&ntilde;o: --%></label>
                                              <select name="ano">
                                                        <option value="0">--Seleccione--</option>
                                                        <option value="2010">2010</option>

                                                        <option value="2009">2009</option>
                                                        <option value="2008">2008</option>
                                                        <option value="2007">2007</option>
                                                        <option value="2006">2006</option>
                                                        <option value="2005">2005</option>
                                                        <option value="2004">2004</option>
                                                        <option value="2003">2003</option>
                                                        <option value="2002">2002</option>
                                                        <option value="2001">2001</option>

                                                        <option value="2000">2000</option>
                                                        <option value="1999">1999</option>
                                                        <option value="1998">1998</option>
                                                        <option value="1997">1997</option>
                                                        <option value="1996">1996</option>
                                                        <option value="1995">1995</option>
                                                        <option value="1994">1994</option>
                                                        <option value="1993">1993</option>
                                                        <option value="1992">1992</option>

                                                        <option value="1991">1991</option>
                                                        <option value="1990">1990</option>
                                                        <option value="1989">1989</option>
                                                        <option value="1988">1988</option>
                                                        <option value="1987">1987</option>
                                                        <option value="1986">1986</option>
                                                        <option value="1985">1985</option>
                                                        <option value="1984">1984</option>
                                                        <option value="1983">1983</option>

                                                        <option value="1982">1982</option>
                                                        <option value="1981">1981</option>
                                                        <option value="1980">1980</option>			
                                              </select> 


		  </p></th></tr>
                   </table>
                                              <br>
                 <p align="center"><html:submit styleClass="button"><bean:message key="V_ConsultarPPGCoordinacion.label0"/><%-- Consultar --%></html:submit>
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