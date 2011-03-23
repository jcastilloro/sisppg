<%@page import="java.util.HashMap"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_Gestion_Pasantias_Est.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_Gestion_Pasantias_Est.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_Consultar_Pasantia.do"><bean:message key="V_Gestion_Pasantias_Est.label0"/><%-- Consultar Pasantia --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_gestionar_preinscripcion.do"><bean:message key="V_Gestion_Pasantias_Est.label1"/><%-- Gestionar Preinscripcion --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_generar_inscripcion.do"><bean:message key="V_Gestion_Pasantias_Est.label2"/><%-- Generar Inscripcion --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_solicitar_prorroga_inscripcion.do"><bean:message key="V_Gestion_Pasantias_Est.label3"/><%-- Solicitud Prorrogra Inscripcion --%></html:link></cohesion:actor></li>

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
                            <logic:empty name="Pasantias">
                                <h1>¡Usted no tiene ninguna pasantía asociada!</h1>
                            </logic:empty>
                            <logic:notEmpty name="Pasantias">
                                <h1>Usted tiene las siguientes pasantías asociadas: </h1>
                                <table border="1">
                                    <tr><th>Título</th><th>Resumen</th></tr>
                                <logic:iterate id="pas" collection="${empty Pasantias ? _vacio : Pasantias}">                                       
                                       <tr><td><html:link action="/A_prep_Consultar_Pasantia.do" paramName="pas">${pas.titulo}</html:link></td>
                                        <td> ${pas.resumen} </td>
                                    </tr>
                                </logic:iterate>
                                </table>
                            </logic:notEmpty>
                                
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