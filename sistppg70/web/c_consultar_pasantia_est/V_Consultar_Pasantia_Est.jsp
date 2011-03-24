<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_Consultar_Pasantia_Est.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_Consultar_Pasantia_Est.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_retirar_pasantia.do"><bean:message key="V_Consultar_Pasantia_Est.label0"/><%-- Retirar Pasantia --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_solicitar_prorroga_evaluacion.do"><bean:message key="V_Consultar_Pasantia_Est.label1"/><%-- SolicitarProrrogaEvaluacion --%></html:link></cohesion:actor></li>

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
                            <logic:empty name="Pasantia">
                                <h1>�Usted no tiene ninguna pasant�a asociada!</h1>
                            </logic:empty>
                            <logic:notEmpty name="Pasantia">
                                <h1>${Pasantia.titulo}</h1>
                                <table>
                                <tr><th>Resumen:</th><td> ${Pasantia.resumen} </td></tr>
                                <tr><th>Objetivos Generales:</th><td> ${Pasantia.objetivos_generales} </td></tr>
                            </logic:notEmpty>
                            <logic:empty name="Estatus">
                                <tr><th>Estatus:</th><td> Indefinido </td></tr>
                            </logic:empty>
                            <logic:notEmpty name="Estatus">
                                <tr><th>Estatus:</th><td> ${Estatus.estatus} </td></tr>
                            </logic:notEmpty>
                            <logic:empty name="Profesor">
                                <tr><th>Tutor Acad�mico:</th><td> Indefinido </td></tr>
                            </logic:empty>
                            <logic:notEmpty name="Profesor">
                                <tr><th>Tutor Acad�mico:</th><td> ${Profesor.nombre} ${Profesor.apellido} </td></tr>
                            </logic:notEmpty>
                            <logic:empty name="TutorIndustrial">
                                <tr><th>Tutor Industrial:</th><td> Indefinido </td></tr>
                            </logic:empty>
                            <logic:notEmpty name="TutorIndustrial">
                                <tr><th>Tutor Industrial:</th><td> ${TutorIndustrial.nombre} </td></tr>
                            </logic:notEmpty>

                            <%-- Per�do y Tipo de la Pasant�a --%>
                            <logic:empty name="PasantiaLarga">
                                <logic:empty name="PasantiaCorta">
                                    <logic:empty name="PasantiaIntermedia">
                                        <tr><th>Tipo:</th><td> No definido </td></tr>
                                    </logic:empty>
                                    <logic:notEmpty name="PasantiaIntermedia">
                                        <tr><th>Tipo:</th><td> Pasant�a Intermedia </td></tr>
                                        <logic:empty name="Periodo">
                                        </logic:empty>
                                        <logic:notEmpty name="Periodo">
                                            <tr><th>Per�odo:</th><td>${Periodo.nombre} </td></tr>
                                        </logic:notEmpty>
                                    </logic:notEmpty>
                                </logic:empty>
                                <logic:notEmpty name="PasantiaCorta">
                                    <tr><th>Tipo:</th><td> Pasant�a Corta </td></tr>
                                    <tr><th>Per�odo:</th><td> Julio-Septiembre </td></tr>
                                </logic:notEmpty>
                            </logic:empty>
                            <logic:notEmpty name="PasantiaLarga">
                                <tr><th>Tipo:</th><td> Pasant�a Larga </td></tr>
                                <logic:empty name="Periodo">
                                </logic:empty>
                                <logic:notEmpty name="Periodo">
                                    <tr><th>Per�odo:</th><td>${Periodo.nombre} </td></tr>
                                </logic:notEmpty>
                            </logic:notEmpty>
                            <%-- Per�do y Tipo de la Pasant�a --%>

                            <logic:empty name="Ano">
                                <tr><th>A�o:</th><td> Indefinido </td></tr>
                            </logic:empty>
                            <logic:notEmpty name="Ano">
                                <tr><th>A�o:</th><td> ${Ano} </td></tr>
                            </logic:notEmpty>

                            <%-- FASES --%>

                            <logic:empty name="Fases">
                                <tr><th>Fase:</th><td> No tiene fases asociadas</td></tr>
                            </logic:empty>
                            <logic:notEmpty name="Fases">
                                <logic:iterate id="fase" indexId="i" collection="${empty Fases ? _vacio : Fases}">
                                <tr><th>Fase:</th><td> ${i+1} </td></tr>
                                <tr><th>Objetivos Espec�ficos:</th><td> ${fase.objetivos_especificos} </td></tr>
                                    <logic:iterate id="act" indexId="j" collection="${empty fase.actividades ? _vacio : fase.actividades}">
                                    <tr><th>Actividad ${j+1}:</th><td> ${act.descripcion} </td></tr>
                                    </logic:iterate> 
                                </logic:iterate> 
                            </logic:notEmpty>
                            
                                </table>
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