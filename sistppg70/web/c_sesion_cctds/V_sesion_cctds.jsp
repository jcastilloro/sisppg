<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title>Sesión CCTDS</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
    </head>
    <body>
        <div id="wrapper">
            <div id="menu">
                <ul id="nav">
                    
                    <li><cohesion:actor actors="1"><html:link action="/A_prep_gestionar_preinscripcion_cctds.do">Gestionar Preinscripciones</html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="1"><html:link action="/A_prep_gestionar_pasantias_cctds.do">Gestionar Pasantias </html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="1"><html:link action="/A_prep_gestionar_prorrogas.do"><bean:message key="V_sesion_cctds.label3"/><%-- Gestionar Prorrogas --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="11"><html:link action="/A_prep_consultar_proyectos.do"><bean:message key="V_sesion_cctds.label0"/><%-- Consultas especiales --%></html:link></cohesion:actor></li>
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

                                        <br>
                                        <div style="float: left; border-right: 1px solid #666; padding-right: 45px;">
                                            <h1>Numero de Pasantias por Status</h1>
                                            <br>
                                            <p>
                                            <strong style="font-size: 12px; color: #5986BD;">Aprobadas: </strong>${p_aprobado}<br>
                                            <strong style="font-size: 12px; color: #5986BD;">Reprobadas: </strong>${p_reprobado}<br>
                                            <strong style="font-size: 12px; color: #5986BD;">Rezagadas: </strong>${p_rezagadado}<br>
                                            <strong style="font-size: 12px; color: #5986BD;">Retiradas: </strong>${p_retirado}<br>
                                            <br>
                                            <strong style="font-size: 12px; color: #5986BD;">Revisadas: </strong>${p_revisado}<br>
                                            <strong style="font-size: 12px; color: #5986BD;">Por revisar: </strong>${p_porrevisar}<br>
                                            <strong style="font-size: 12px; color: #5986BD;">"Pasar por CCTDS": </strong>${p_pasarporcctds}<br>
                                            </p>
                                        </div>
                                        <br>
                                        <br>
                                        <div style="float:right; margin-top: -30px;">
                                            <h1>Numero de Preinscripciones por Status</h1>
                                            <br>
                                            <p><strong style="font-size: 12px; color: #5986BD;">Pendientes: </strong>${preins_noa}<br>
                                            <strong style="font-size: 12px; color: #5986BD;">Aprobadas: </strong>${preins_a}</p>
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