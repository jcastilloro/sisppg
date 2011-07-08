<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=UTF-8"
           %><html:html>
    <head>
        <title>Solicitar Pasantes</title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <style type="text/css">

            div#box1465928 {width: 400px; margin: 40px auto; }

            form#1465928 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }

            form#1465928 p {float: left; margin: 0; padding: 0; display: inline; }

            form#1465928 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }

            form#1465928 input {float: left; margin: 0; padding: 0; display: inline; }

            form#1465928 p#1465930_C {clear: both; width: 400px; }

            form#1465928 p#1465930_C label {clear: both; width: 400px; }

            form#1465928 p#1465930_C input {clear: both; width: 396px; }

            form#1465928 p#1465933_C {clear: both; width: 400px; }

            form#1465928 p#1465933_C label {clear: both; width: 400px; }

            form#1465928 p#1465933_C input {clear: both; width: 396px; }



        </style>
    </head>
    <body>
        <div id="wrapper">
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_prep_agregar_tutor_I.do">Agregar Tutor Industrial</html:link></li>
                    <li><html:link action="/A_Prep_gestionar_solicitud_pasantes.do"><bean:message key="V_Sesion_Empresa.label1"/><%-- Solicitud de pasantes --%></html:link></li>
                </ul>
                <p align="right"><html:link action="/A_Prep_Inicio_Sesion.do">Cerrar Sesión</html:link>
            </div>

            <div id="header">
            </div>
            <div id="page">

                <div id="content">
                    <div id="status-bar" style="margin-left: -40px; margin-top: -30px;">

                    </div>
                    <div id="body">

                        <div id="split">
                            <div class="top"> </div>
                            <div id="left">
                                <div class="content">
                                    <hr>
                                    <center><h2>${empty msg ? "" : msg}</h2></center>
                                    <div class="box1465928" align="center">


                                        <table class="sortable">
                                            <tr>
                                                <th>Carrera</th>
                                            </tr>
                                            <logic:notEmpty name="L_esp">
                                                <logic:iterate name="L_esp" id="esp">
                                                    <tr>
                                                        <td>${esp.carrera.nombre} <a href="../A_eliminar_solicitud.do?solId=${esp.idEmpresaSolicitaPasante}" style="font-size: 9px; color: #444;">[eliminar]</a></td>
                                                    </tr>
                                                </logic:iterate>
                                            </logic:notEmpty>
                                        </table>


                                        <hr>
                                        <div class="box1843916">
                                            <html:form action="/A_solicitar_pasante.do" method="post">
                                                <p id="1843918_C"><label for="1843918"><bean:message key="F_Solicitud_Pasante.label0"/><%-- Carrera: --%></label>
                                                    <html:select property="carrera" value="0">
                                                        <logic:empty name="L_carreras">
                                                            <html:option value="0">--------</html:option>
                                                        </logic:empty>
                                                        <logic:notEmpty name="L_carreras">
                                                            <html:option value="0">--------</html:option>
                                                            <logic:iterate name="L_carreras" id="c">
                                                                <html:option value="${c.idCarrera}">${c.nombre}</html:option>
                                                            </logic:iterate>
                                                        </logic:notEmpty>
                                                    </html:select></p>

                                                <html:submit styleClass="button"><bean:message key="V_gestionar_solicitud_pasantes.label0"/><%-- A_solicitar_pasante --%></html:submit>
                                            </html:form>

                                        </div>
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
        <div id="footer"><center> <bean:message key="bottom.label"/> </center></div>

    </body>
</html:html>