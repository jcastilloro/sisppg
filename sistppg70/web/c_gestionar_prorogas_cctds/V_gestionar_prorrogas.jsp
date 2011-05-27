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
                    <li><cohesion:actor actors="1"><html:link action="/A_consultar_prorrogas_e.do">Prorrogas Evaluacion</html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="1"><html:link action="/A_consultar_prorrogas_i.do">Prorrogas Inscripcion</html:link></cohesion:actor></li>

                </ul>
                <p align="right"><html:link action="/A_Prep_Inicio_Sesion.do">Cerrar Sesi�n</html:link>
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

<br>
                                        <div>
                                            <h1>Numero de Prorrogas de Inscripcion por Status</h1>
                                            <br>
                                            <p>
                                            <strong style="font-size: 12px; color: #5986BD;">Por Revisar: </strong>${pi_porrevisar}<br>
                                            <strong style="font-size: 12px; color: #5986BD;">"Pasar por CCTDS": </strong>${pi_pasarporcctds}<br>
                                            <br>
                                            <strong style="font-size: 12px; color: #5986BD;">Aprobadas: </strong>${pi_aprobada}<br>
                                            <strong style="font-size: 12px; color: #5986BD;">Rechazada: </strong>${pi_rechazada}<br>
                                            </p>
                                        </div>
                                        <br>
                                        <br>
                                        <div>
                                            <h1>Numero de Prorrogas de Evaluacion por Status</h1>
                                            <br>
                                            <p>
                                            <strong style="font-size: 12px; color: #5986BD;">Por Revisar: </strong>${pe_porrevisar}<br>
                                            <strong style="font-size: 12px; color: #5986BD;">"Pasar por CCTDS": </strong>${pe_pasarporcctds}<br>
                                            <br>
                                            <strong style="font-size: 12px; color: #5986BD;">Aprobadas: </strong>${pe_aprobada}<br>
                                            <strong style="font-size: 12px; color: #5986BD;">Rechazada: </strong>${pe_rechazada}<br>
                                            </p>
                                        </div>


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