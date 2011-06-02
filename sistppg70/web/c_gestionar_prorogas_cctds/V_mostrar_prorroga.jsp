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
                            <logic:equal name="tipo" value="e">
                                <h1>Prorroga Evaluacion</h1>
                                <table>
                                    <tr>
                                        <th>Estudiante: </th>
                                        <td>${Prorroga.prorroga.estudiante.usbid}</td>
                                    </tr>
                                    <tr>
                                        <th>Justificacion: </th>
                                        <td>${Prorroga.prorroga.justificacion}</td>
                                    </tr>
                                    <tr>
                                        <th>Fecha propuesta: </th>
                                        <td>${Prorroga.fecha_propuesta}</td>
                                    </tr>
                                    <tr>
                                        <th>Fecha Solicitud: </th>
                                        <td>${Prorroga.prorroga.created_at}</td>
                                    </tr>
                                    <tr>
                                        <th>Estatus: </th>
                                        <td>${Prorroga.prorroga.estatus.estatus}</td>
                                    </tr>
                                </table><br>
                                <html:link action="/A_mostrar_prorroga.do?id=${Prorroga.idProrrogaEvaluacion}&tipo=e&nuevo_estatus=1">Aprobar</html:link><br>
                                <html:link action="/A_mostrar_prorroga.do?id=${Prorroga.idProrrogaEvaluacion}&tipo=e&nuevo_estatus=3">Pasar por CCTDS</html:link><br>
                                <html:link action="/A_mostrar_prorroga.do?id=${Prorroga.idProrrogaEvaluacion}&tipo=e&nuevo_estatus=4">Rechazar</html:link><br>
                            </logic:equal>
                            <logic:equal name="tipo" value="i">
                                <h1>Prorroga Evaluacion</h1>
                                <table>
                                    <tr>
                                        <th>Estudiante: </th>
                                        <td>${Prorroga.prorroga.estudiante.usbid}</td>
                                    </tr>
                                    <tr>
                                        <th>Justificacion: </th>
                                        <td>${Prorroga.prorroga.justificacion}</td>
                                    </tr>
                                    <tr>
                                        <th>Fecha Solicitud: </th>
                                        <td>${Prorroga.prorroga.created_at}</td>
                                    </tr>
                                    <tr>
                                        <th>Estatus: </th>
                                        <td>${Prorroga.prorroga.estatus.estatus}</td>
                                    </tr>
                                </table><br>
                                <html:link action="/A_mostrar_prorroga.do?id=${Prorroga.idProrrogaInscripcion}&tipo=i&nuevo_estatus=1">Aprobar</html:link><br>
                                <html:link action="/A_mostrar_prorroga.do?id=${Prorroga.idProrrogaInscripcion}&tipo=i&nuevo_estatus=3">Pasar por CCTDS</html:link><br>
                                <html:link action="/A_mostrar_prorroga.do?id=${Prorroga.idProrrogaInscripcion}&tipo=i&nuevo_estatus=4">Rechazar</html:link><br>
                            </logic:equal>

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