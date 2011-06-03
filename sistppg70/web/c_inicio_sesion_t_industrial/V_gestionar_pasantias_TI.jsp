<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title>Sesión Tutor Industrial</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <script type="text/javascript" src="sorttable.js"></script>
    </head>
    <body>
        <div id="wrapper">
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="16"><html:link action="/A_modificar_perfil.do"><bean:message key="V_sesion_tutor_i.label0"/><%-- Modificar Perfil --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="16"><html:link action="/A_prep_gestionar_pasatias_TI.do"><bean:message key="V_sesion_tutor_i.label1"/><%-- Gestionar Pasantias --%></html:link></cohesion:actor></li>
                </ul>
                <p align="right"><html:link action="/A_Prep_Inicio_Sesion.do">Cerrar Sesión</html:link>
            </div>

            <div id="header">
            </div>
            <div id="page">

                <div id="content">

                    <div id="body">

                        <div id="split">
                            <div class="top"> </div>
                            <div id="left">
                                <div class="content">

                            ${empty msg ? "" : msg}


                            <logic:empty name="Pasantias">
                                <center><h3>Usted no tiene pasantes asociados</h3></center>
                            </logic:empty>

                            <logic:notEmpty name="Pasantias">
                                <center><h3>Pasantías Asociadas</h3></center>
                                <div class="administrador">
                                    <table class="sortable" width="500">
                                        <thead>
                                            <tr><th><center>Título</center></th><th><center>Resumen</center></th></tr>
                                        </thead>
                                        <tbody>
                                            <logic:iterate id="pas" collection="${empty Pasantias ? _vacio : Pasantias}">
                                                <tr>
                                                    <td><center>${pas.titulo}</center></td>
                                                    <td><center>${pas.resumen}</center></td>
                                                    <td><html:link action="/A_evaluar_pasatias_TI.do?idPasantia=${pas.idPasantia}">Evaluar</html:link></td>
                                                </tr>
                                            </logic:iterate>
                                        </tbody>
                                    </table>
                                </div>                                

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