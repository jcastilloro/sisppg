<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=ISO-8859-1"
           %><html:html>
    <head>
        <title><bean:message key="V_Inicio_Sesion.title"/></title>

        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <link rel="stylesheet" href="../_css/validationEngine.jquery.css" type="text/css"/>
        <link type="text/css" href="../_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <script type="text/javascript" src="../_js/jquery-1.4.4.min.js"></script>
        <script type="text/javascript" src="../_js/jquery-ui-1.8.10.custom.min.js"></script>
        <script type="text/javascript" src="../_js/jquery.ui.datepicker-es.js"></script>
        <script src="../_js/jquery.validationEngine.js" type="text/javascript"></script>
        <script src="../_js/jquery.validationEngine-es.js" type="text/javascript"></script>
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

        <%--   <link rel="stylesheet" type="text/css" href="_css/style.css"/>
           <style type="text/css">
           div#box1840387 {width: 400px; margin: 40px auto; }
           form#1840387 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
           form#1840387 p {float: left; margin: 0; padding: 0; display: inline; }
           form#1840387 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
           form#1840387 input {float: left; margin: 0; padding: 0; display: inline; }
             form#1840387 p#1840389_C {clear: both; width: 400px; }
             form#1840387 p#1840389_C label {clear: both; width: 400px; }
             form#1840387 p#1840389_C input {clear: both; width: 396px; }
             form#1840387 p#1840392_C {clear: both; width: 400px; }
             form#1840387 p#1840392_C label {clear: both; width: 400px; }
             form#1840387 p#1840392_C input {clear: both; width: 396px; }

        </style> --%>

    </head>
    <body>
        <script type="text/javascript">
            jQuery(function($){
                $("#1840509").datepicker();
            });
        </script>
        <div id="wrapper">
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_retirar_pasantia.do"><bean:message key="V_Consultar_Pasantia_Est.label0"/><%-- Retirar Pasantia --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_solicitar_prorroga_evaluacion.do">Solicitar Prorroga Evaluación</html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_mencion.do">Constancia de Mención</html:link></cohesion:actor></li>
                </ul>
                <p align="right"><html:link action="/A_Prep_Inicio_Sesion.do">Cerrar Sesión</html:link>
            </div>
            <div id="header">              
            </div>
            <div id="page">

                <div id="content">
                    <div id="status-bar" style="margin-left: -40px; margin-top: -30px;">
                        <p><strong>USBID: </strong>${usuario.usbid}</p>
                    </div>
                    <div id="body">

                        <div id="split">
                            <div class="top"> </div>
                            <div id="left">
                                <div class="content">
                                    <center>${empty msg ? "" : msg}</center>
                                    <div class="box1465928" align="center">


                                        <logic:empty name="Pasantia">
                                            <h1>¡Usted no tiene ninguna pasantía asociada!</h1>
                                        </logic:empty>
                                        <logic:notEmpty name="Pasantia">
                                            <h1>${Pasantia.titulo}</h1>
                                            <table width="450">
                                                <tr><th>Resumen:</th><td> ${Pasantia.resumen} </td></tr>
                                                <tr><th>Objetivos Generales:</th><td> ${Pasantia.objetivos_generales} </td></tr>
                                            </logic:notEmpty>
                                            <logic:empty name="Estatus">
                                                <tr><th>Estatus:</th><td> Indefinido </td></tr>
                                            </logic:empty>
                                            <logic:notEmpty name="Estatus">
                                                <tr><th>Estatus:</th><td> ${Estatus.estatus} </td></tr>
                                            </logic:notEmpty>
                                            <logic:empty name="Profesor">
                                                <tr><th>Tutor Académico:</th><td> Indefinido </td></tr>
                                            </logic:empty>
                                            <logic:notEmpty name="Profesor">
                                                <tr><th>Tutor Académico:</th><td> ${Profesor.nombre} ${Profesor.apellido} </td></tr>
                                            </logic:notEmpty>
                                            <logic:empty name="TutorIndustrial">
                                                <tr><th>Tutor Industrial:</th><td> Indefinido </td></tr>
                                            </logic:empty>
                                            <logic:notEmpty name="TutorIndustrial">
                                                <tr><th>Tutor Industrial:</th><td> ${TutorIndustrial.nombre} </td></tr>
                                            </logic:notEmpty>

                                            <%-- Perído y Tipo de la Pasantía --%>
                                            <logic:empty name="PasantiaLarga">
                                                <logic:empty name="PasantiaCorta">
                                                    <logic:empty name="PasantiaIntermedia">
                                                        <tr><th>Tipo:</th><td> No definido </td></tr>
                                                    </logic:empty>
                                                    <logic:notEmpty name="PasantiaIntermedia">
                                                        <tr><th>Tipo:</th><td> Pasantía Intermedia </td></tr>
                                                        <logic:empty name="Periodo">
                                                        </logic:empty>
                                                        <logic:notEmpty name="Periodo">
                                                            <tr><th>Período:</th><td>${Periodo.nombre} </td></tr>
                                                        </logic:notEmpty>
                                                    </logic:notEmpty>
                                                </logic:empty>
                                                <logic:notEmpty name="PasantiaCorta">
                                                    <tr><th>Tipo:</th><td> Pasantía Corta </td></tr>
                                                    <tr><th>Período:</th><td> Julio-Septiembre </td></tr>
                                                </logic:notEmpty>
                                            </logic:empty>
                                            <logic:notEmpty name="PasantiaLarga">
                                                <tr><th>Tipo:</th><td> Pasantía Larga </td></tr>
                                                <logic:empty name="Periodo">
                                                </logic:empty>
                                                <logic:notEmpty name="Periodo">
                                                    <tr><th>Período:</th><td>${Periodo.nombre} </td></tr>
                                                </logic:notEmpty>
                                            </logic:notEmpty>
                                            <%-- FIN: Perído y Tipo de la Pasantía --%>

                                            <logic:empty name="Ano">
                                                <tr><th>Año:</th><td> Indefinido </td></tr>
                                            </logic:empty>
                                            <logic:notEmpty name="Ano">
                                                <tr><th>Año:</th><td> ${Ano} </td></tr>
                                            </logic:notEmpty>

                                            <logic:empty name="Defensa">
                                                <tr><th>Fecha de Defensa:</th><td> Indefinida </td></tr>

                                            </logic:empty>
                                            <logic:notEmpty name="Defensa">
                                                <tr><th>Fecha de Defensa:</th><td> ${Pasantia.fecha_defensa} </td></tr>

                                            </logic:notEmpty>


                                        </table>




                                        <html:form styleId="DefensaForm"
                                                   action="/A_definir_defensa.do?idPasantia=${Pasantia.idPasantia}" method="post" acceptCharset="utf-8">
                                            <table>
                                                <tr><td>

                                                        <html:submit styleClass="button">Definir Fecha!</html:submit></td><td>
                                                        <p id="1843588_C"><label for="1843588"></label></td><td><html:text styleId="1840509" property="fecha_defensa" size="30" styleClass="validate[required],past[NOW]"/></td></tr>
                                            </table>
                                        </html:form>

                                        <script>
                                            $(document).ready(function(){
                                                $("#DefensaForm").validationEngine('attach');
                                            });
                                        </script>





                                        <%-- FASES --%>

                                        <logic:empty name="Fases">
                                            *No tiene ninguna fase o etapa asociada a su pasantía
                                        </logic:empty>
                                        <logic:notEmpty name="Fases">
                                            <logic:iterate id="fase" indexId="i" collection="${empty Fases ? _vacio : Fases}">
                                                <br><br>
                                                <center><h3>Fase ${i+1} </h3>
                                                    <b>Objetivos Específicos:</b> ${fase.objetivos_especificos}
                                                </center><br>
                                                <table width="450">
                                                    <tr><th>Actividades</th><th>Tiempo Estimado</th></tr>
                                                    <logic:iterate id="act" indexId="j" collection="${empty fase.actividades ? _vacio : fase.actividades}">
                                                        <tr><td>${act.descripcion}</td><td> ${act.tiempo_estimado} </td></tr>
                                                    </logic:iterate>
                                                </table>
                                            </logic:iterate>
                                        </logic:notEmpty>


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
