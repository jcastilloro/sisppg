<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_Sesion_Empresa.title"/></title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
    </head>
    <body>
        <div id="wrapper">
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="11"><html:link action="/A_consultar_PG.do"><bean:message key="V_consulta_proyectos.label0"/><%-- Consultar PG --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="11"><html:link action="/A_consultar_pasantias.do"><bean:message key="V_consulta_proyectos.label1"/><%-- Consultar Pasantias --%></html:link></cohesion:actor></li>


                </ul>
            </div>

            <div id="header">
                <%-- NO ESTOY SEGURO DE QUE VA AQUI PERO SE VE FEO Y QUEDA SOBRE LA IMAGEN --%>
            </div>
            <div id="page">

                <div id="content">

                    <div id="body">

                        <div id="split">
                            <div class="top"> </div>
                            <div id="left">
                                <div class="content">

                            ${empty msg ? "" : msg}
                            <logic:empty name="EstudianteRealizaProyecto">
                                <h1>¡No hay estudiantes realizando proyectos!</h1>
                            </logic:empty>
                            <logic:notEmpty name="EstudianteRealizaProyecto">
                                <h1>Proyectos: </h1>
                                <logic:empty name="Pasantias">
                                </logic:empty>
                                <logic:notEmpty name="Pasantias">
                                    <h2><html:link action="/A_consultar_pasantias.do">Pasantias:</html:link></h2>
                                    <table border="1">
                                        <tr><th>Título</th></tr>
                                        <logic:iterate id="pas" collection="${empty Pasantias ? _vacio : Pasantias}">
                                            <tr><td>${pas.titulo}</td>
                                            </tr>
                                        </logic:iterate>
                                    </table>
                                </logic:notEmpty>
                                <logic:empty name="ProyectoDeGrado">
                                </logic:empty>
                                <logic:notEmpty name="ProyectoDeGrado">
                                    <br><br><h2><html:link action="/A_consultar_PG.do">Proyectos De Grado:</html:link></h2>
                                    <table border="1">
                                        <tr><th>Nombre</th></tr>
                                        <logic:iterate id="pg" collection="${empty ProyectoDeGrado ? _vacio : ProyectoDeGrado}">
                                            <tr><td>${pg.nombre}</td>
                                            </tr>
                                        </logic:iterate>
                                    </table>
                                </logic:notEmpty>
                            </logic:notEmpty>

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
            </div>
            <div style="clear: both;">&nbsp;</div>
        </div>
        <div id="footer"> <bean:message key="bottom.label"/> </div>

    </body>
</html:html>