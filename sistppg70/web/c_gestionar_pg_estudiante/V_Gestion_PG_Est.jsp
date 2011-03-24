<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=ISO-8859-1"
           %><html:html>
    <head>
        <title><bean:message key="V_Gestion_PG_Est.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_Gestion_PG_Est.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_Consultar_PG.do"><bean:message key="V_Gestion_PG_Est.label0"/><%-- Mostrar PG --%></html:link></cohesion:actor></li>

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

                            <logic:empty name="L_PGS">
                                <h1>¡Usted no está realizando ningun proyecto de grado!</h1>
                            </logic:empty>
                            <logic:notEmpty name="L_PGS">
                                <h1>Mis Proyectos de Grado: </h1>
                                <logic:iterate id="proy" collection="${empty L_PGS ? _vacio : L_PGS}">
                                    <table>
                                        <tr><th>Nombre</th><td>${proy.nombre}</td></tr>
                                        <tr><th>Código</th><td>${proy.codigo}</td></tr>
                                        <tr><th>
                                                <html:link action="/A_prep_Consultar_PG.do" paramName="proy" paramProperty="idProyectoDeGrado"
                                                           paramId="idProyectoDeGrado">Consultar</html:link>
                                            </th>
                                        </tr>
                                    </table<p><p>
                                    </logic:iterate>
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