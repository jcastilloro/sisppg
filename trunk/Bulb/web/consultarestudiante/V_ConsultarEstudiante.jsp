<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_ConsultarEstudiante.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <style type="text/css">
        div#box1689880 {width: 400px; margin: 40px auto; }
        form#1689880 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1689880 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1689880 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1689880 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1689880 p#1689882_C {clear: both; width: 400px; }
          form#1689880 p#1689882_C label {clear: both; width: 400px; }
          form#1689880 p#1689882_C input {clear: both; width: 396px; }
          form#1689880 p#1689885_C {clear: both; width: 400px; }
          form#1689880 p#1689885_C label {clear: both; width: 400px; }
          form#1689880 p#1689885_C input {clear: both; width: 396px; }
          form#1689880 p#1689889_C {clear: both; width: 400px; }
          form#1689880 p#1689889_C label {clear: both; width: 400px; }
          form#1689880 p#1689889_C input {clear: both; width: 396px; }
          form#1689880 p#1689892_C {clear: both; width: 400px; }
          form#1689880 p#1689892_C label {clear: both; width: 400px; }
          form#1689880 p#1689892_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>

            
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_GestionarConsultaCoordinacion.do"><bean:message key="V_ConsultarEstudiante.label1"/><%-- Regresar --%></html:link></li>
                    <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_ConsultarEstudiante.label2"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>

                </ul>
            </div>
        <div id="header">
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            <br>
                         <h3 align="center">  ${empty msg ? "" : msg}</h3>
                        <br>
                                <div class="box1689880"><html:form styleId="F1689880"
                                  action="/A_BusquedaEstudiante.do" method="post">
                                   <table align="center">
                                       <tr><th><p id="1689882_C"><label for="1689882"><bean:message key="F_ConsultarEstudiante.label0"/><%-- Por Area: --%></label></th><td>
                                        <select name="areaPPG">
                                            <option value="">--Seleccione--</option>
                                                <logic:iterate id="area" collection="${empty L_Area ? _vacio : L_Area}">

                                                         <option value=${area.codigo_Area}><html:link action="/APre_area.do" paramId="idArea" paramName="area" paramProperty="idArea">${empty area.nombreArea ? "Editar" : area.nombreArea}</html:link></option>

                                                </logic:iterate>

                                        </select>    	
                                        </p></td></tr>
                                       <tr<th><p id="1689885_C"><label for="1689885"><bean:message key="F_ConsultarEstudiante.label1"/><%-- Por tutor: --%></label></th><td>
                                        <select name="tutorPPG">
                                                <option value="">--Seleccione--</option>
                                                <logic:iterate id="profesor" collection="${empty L_Profesor ? _vacio : L_Profesor}">

                                                         <option value=${profesor.codigoProfesor}><html:link action="/APre_profesor.do" paramId="idProfesor" paramName="profesor" paramProperty="idProfesor">${empty profesor.nombreProfesor ? "Editar" : profesor.nombreProfesor}</html:link></option>

                                                </logic:iterate>

                                        </select> 
                                        </p></td></tr>
                                       <tr><th><p id="1689889_C"><label for="1689889"><bean:message key="F_ConsultarEstudiante.label2"/><%-- Por per&iacute;odo: --%></label></th><td>
                                              <select name="periodoPPG">
                                                  <option value="">--Seleccione--</option>
                                                  <option value="Septiembre-Diciembre">Septiembre-Diciembre</option>
                                                  <option value="Enero-Marzo">Enero-Marzo</option>
                                                  <option value="Abril-Julio">Abril-Julio</option>
                                              </select>
                                        </p></td></tr>
                                       <tr><th><p id="1689892_C"><label for="1689892"><bean:message key="F_ConsultarEstudiante.label3"/><%-- Por a&ntilde;o: --%></label></th><td>
                                              <select name="anoPPG">
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
                                              </p></td></tr>
                </table>                         
                                              <br>
                                              <p align="center"><html:submit styleClass="button"><bean:message key="V_ConsultarEstudiante.label0"/><%-- A_BusquedaEstudiante --%></html:submit> </html:form></div></p>
 
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