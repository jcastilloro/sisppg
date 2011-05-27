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
        <script type="text/javascript" src="../sorttable.js"></script>
        <script type="text/javascript" src="../sorttable.js"></script>
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

       <bean:message key="V_consultar_prorrogas_e.title"/>
                            ${empty msg ? "" : msg}
                            <table border="1" class="sortable">
                                <thead>
                                    <tr>
                                        <th>usbid</th>
                                        <th>Nombre</th>
                                        <th>Fecha solicitud</th>
                                        <th>Status</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <logic:notEmpty name="L_prorrogas">
                                        <logic:iterate name="L_prorrogas" id="p">
                                            <tr>
                                                <td><html:link action="/A_mostrar_prorroga.do?id=${p.idProrrogaEvaluacion}&tipo=e">${p.prorroga.estudiante.usbid}</html:link></td>
                                                <td><html:link action="/A_mostrar_prorroga.do?id=${p.idProrrogaEvaluacion}&tipo=e">${p.prorroga.estudiante.apellido}, ${p.prorroga.estudiante.apellido}</html:link></td>
                                                <td><html:link action="/A_mostrar_prorroga.do?id=${p.idProrrogaEvaluacion}&tipo=e"> ${p.prorroga.created_at}</html:link></td>
                                                <td><html:link action="/A_mostrar_prorroga.do?id=${p.idProrrogaEvaluacion}&tipo=e"> ${p.prorroga.estatus.estatus}</html:link></td>
                                            </tr>
                                        </logic:iterate>
                                    </logic:notEmpty>
                                </tbody>
                            </table>

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