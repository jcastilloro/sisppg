<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_consulta_pasantia.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_consulta_pasantia.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="11"><html:link action="/A_consultar_pasantias.do"><bean:message key="V_consulta_pasantia.label0"/><%-- ordenar --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="11"><html:link action="/A_mostrar_pasantia.do"><bean:message key="V_consulta_pasantia.label1"/><%-- Mostrar --%></html:link></cohesion:actor></li>

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
                                <h1>¡No hay estudiantes haciendo pasantías!</h1>
                            </logic:empty>
                            <logic:notEmpty name="Pasantias">
                                <h1>Pasantías: </h1>
                                <table border="1">
                                    <tr><th>Título</th><th>Resumen</th></tr>
                                <logic:iterate id="pas" collection="${empty Pasantias ? _vacio : Pasantias}">
                                       <tr><td><html:link action="/A_mostrar_pasantia.do" paramName="pas" paramProperty="idPasantia" paramId="idPasantia">${pas.titulo}</html:link></td>
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