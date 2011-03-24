<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_etapas_pg.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_etapas_pg.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <logic:equal value="0" name="netapa"> <li><cohesion:actor actors="8"><html:link action="/A_prep_agregar_primera_etapa.do"><bean:message key="V_etapas_pg.label0"/><%-- Primera Etapa --%></html:link></cohesion:actor></li> </logic:equal>
                    <logic:equal value="1" name="netapa"> <li><cohesion:actor actors="8"><html:link action="/A_prep_agregar_segunda_etapa.do"><bean:message key="V_etapas_pg.label1"/><%-- Segunda Etapa --%></html:link></cohesion:actor></li> </logic:equal>
                    <logic:equal value="2" name="netapa"> <li><cohesion:actor actors="8"><html:link action="/A_prep_agregar_tercera_etapa.do"><bean:message key="V_etapas_pg.label2"/><%-- Tercera Etapa --%></html:link></cohesion:actor></li> </logic:equal>
                    <logic:equal value="3" name="netapa"> <li><cohesion:actor actors="8"><html:link action="/A_finalizar_generar_PG.do"><bean:message key="V_etapas_pg.label3"/><%-- Finalizar Proceso --%></html:link></cohesion:actor></li> </logic:equal>

                </ul>
            </div>
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            <div id="etapasimg">
                                <logic:lessEqual value="2" name="netapa"><img src="_css/images/pg-e${netapa+1}.png"></logic:lessEqual>
                            </div>
                            <%--${empty msg ? "" : msg}<br><br>--%>
                            <br><br><br>
                            <div class="pgInfo">
                                <table id="pgInfo">
                                    <tr>
                                        <td id="titulo">Nombre PG:</td>
                                        <td>${pg.nombre}</td>
                                    </tr>
                                    <tr>
                                        <td id="titulo">Recursos:</td>
                                        <td>${pg.recursos}</td>
                                    </tr>
                                    <tr>
                                        <td id="titulo">Duracion de recursos:</td>
                                        <td>${pg.duracion_recursos}</td>
                                    </tr>
                                    <tr>
                                        <td id="titulo">Puntos de interes:</td>
                                        <td>${pg.puntos_de_interes}</td>
                                    </tr>
                                    <tr>
                                        <td id="titulo">Areas:</td>
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
                                <div class="tablaEtapas">
                                    <div class="etapasPG" id="etapa1">
                                        <h1>Etapa1</h1>
                                        <table id="etapa1" border="0">
                                            <tr>
                                                <td id="titulo">Nombre:</td>
                                                <td id="contenido">Nombre</td>
                                            </tr>
                                            <tr>
                                                <td id="titulo">Recursos:</td>
                                                <td id="contenido">recursos</td>
                                            </tr>
                                            <tr>
                                                <td id="titulo">Actividad:</td>
                                                <td id="contenido">actividad</td>
                                            </tr>
                                        </table>
                                    </div>
                                    <div class="etapasPG" id="etapa2">
                                        <h1>Etapa2</h1>
                                        <table id="etapa1" border="0">
                                            <tr>
                                                <td id="titulo">Nombre:</td>
                                                <td id="contenido">Nombre</td>
                                            </tr>
                                            <tr>
                                                <td id="titulo">Recursos:</td>
                                                <td id="contenido">recursos</td>
                                            </tr>
                                            <tr>
                                                <td id="titulo">Actividad:</td>
                                                <td id="contenido">actividad</td>
                                            </tr>
                                        </table>
                                    </div>
                                    <div class="etapasPG" id="etapa3">
                                        <h1>Etapa3</h1>
                                        <table id="etapa1" border="0">
                                            <tr>
                                                <td id="titulo">Nombre:</td>
                                                <td id="contenido">Nombre</td>
                                            </tr>
                                            <tr>
                                                <td id="titulo">Recursos:</td>
                                                <td id="contenido">recursos</td>
                                            </tr>
                                            <tr>
                                                <td id="titulo">Actividad:</td>
                                                <td id="contenido">actividad</td>
                                            </tr>
                                        </table>
                                    </div>
                                 </div>
                                    
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
        <div id="end_body"></div>
        <div id="footer"> <bean:message key="bottom.label"/> </div>
        
    </body>
</html:html>