<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_areas_pg.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840605 {width: 400px; margin: 40px auto; }
        form#1840605 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840605 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840605 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840605 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840605 p#1840607_C {clear: both; width: 400px; }
          form#1840605 p#1840607_C label {clear: both; width: 400px; }
          form#1840605 p#1840607_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_areas_pg.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="8"><html:link action="/A_prep_etapas_ppg.do"><bean:message key="V_areas_pg.label1"/><%-- Finalizar Areas --%></html:link></cohesion:actor></li>

                </ul>
            </div>
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                           <div id="infopg">
                                <table>
                                    <tr>
                                        <td>Nombre PG:</td>
                                        <td>${pg.nombre}</td>
                                    </tr>
                                    <tr>
                                        <td>Recursos:</td>
                                        <td>${pg.recursos}</td>
                                    </tr>
                                    <tr>
                                        <td>Duracion de recursos:</td>
                                        <td>${pg.duracion_recursos}</td>
                                    </tr>
                                    <tr>
                                        <td>Puntos de interes:</td>
                                        <td>${pg.puntos_de_interes}</td>
                                    </tr>
                                    <tr>
                                        <td>Areas:</td>
                                        <logic:notEmpty name="L_Areas_PG">
                                            <td></td>
                                            </tr>
                                            <logic:iterate id="apg" name="L_Areas_PG">
                                            <tr><td></td><td>${apg.nombre}</td></tr>
                                            </logic:iterate>
                                        </logic:notEmpty>
                                        <logic:empty name="L_Areas_PG">
                                            <td>No ha seleccionado areas</td>
                                        </tr>
                                        </logic:empty>

                                </table>
                            </div>
                                    <br>

                 ${empty msg ? "" : msg}
                <div class="box1840605"><html:form
                  action="/A_agregar_area_PG.do" method="post">
                  <p id="1840607_C"><label for="1840607">
                          <html:select styleId="18405891" property="area">
                            <logic:iterate id="area" collection="${empty L_Areas ? _vacio : L_Areas}">
                                <option value="${area.idArea}">${area.nombre}</option>
                            </logic:iterate>
                          </html:select></p>

                  <html:submit styleClass="button"><bean:message key="V_areas_pg.label0"/><%-- Agregar Area --%></html:submit>
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