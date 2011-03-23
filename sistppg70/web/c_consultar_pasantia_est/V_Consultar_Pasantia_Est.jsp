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
                            <%-- Al descabliarlo hay que quitar el Iterate! Y usar el valor Id que es! --%>
                            <logic:iterate id="pas" collection="${empty Pasantias ? _vacio : Pasantias}">
                                <h1>${pas.titulo}</h1>
                                <table>
                                    <tr><th>Resumen:</th><td> ${pas.resumen} </td></tr>
                                    <tr><th>Objetivos Generales:</th><td> ${pas.objetivos_generales} </td></tr>
                            </logic:iterate>
                     <%--       <logic:iterate id="status" collection="${empty EstatusPasantia ? _vacio : EstatusPasantia}">
                                    <tr><th>Estatus:</th><td> ${status.estatus} </td></tr>
                                </table>
                            </logic:iterate> --%>
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