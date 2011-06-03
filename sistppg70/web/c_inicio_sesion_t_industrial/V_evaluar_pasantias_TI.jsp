<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=ISO-8859-1"
           %><html:html>
    <head>
        <title>Gestionar Preincripciones CCTDS</title>

        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <script type="text/javascript" src="../sorttable.js"></script>
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
        <div id="wrapper">
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="16"><html:link action="/A_modificar_perfil.do"><bean:message key="V_sesion_tutor_i.label0"/><%-- Modificar Perfil --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="16"><html:link action="/A_prep_gestionar_pasatias_TI.do"><bean:message key="V_sesion_tutor_i.label1"/><%-- Gestionar Pasantias --%></html:link></cohesion:actor></li>
                </ul>
                <p align="right"><html:link action="/A_Prep_Inicio_Sesion.do">Cerrar Sesi�n</html:link>
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
                                    <center>${empty msg ? "" : msg}</center>
                                    <div class="box1465928" align="center">
                            <logic:empty name="Ya_Evaluo">
                            <h2>EVALUACI�N DEL TUTOR INDUSTRIAL</h2>
                            <h3>T�tulo de la pasant�a a evaluar: ${Pasantia.titulo}</h3>
                            <h4>(Antes de proceder a llenar esta evaluaci�n favor leer las instrucciones)</h4>
                            <p>Instrucciones:<br>

                                1. Responda, en la escala de 1 a 5, los �tems que corresponda. La hoja de evaluaci�n debe ser llenada sin enmiendas ni tachaduras.
                                <br>
                                2. Informe al pasante de los resultados de la evaluaci�n
                            </p>
                            <html:form action="/A_evaluar_pasatias_TI.do" method="post">
                            <table border="1">
                                <tr>
                                    <td>1. Adquiri� conocimiento de la estructura y organizaci�n de la empresa, as� como de los procedimientos de trabajo y de seguridad industrial.</td>
                                    <td width="180">
                                        <html:radio property="uno" value="1">1</html:radio>
                                        <html:radio property="uno" value="2">2</html:radio>
                                        <html:radio property="uno" value="3">3</html:radio>
                                        <html:radio property="uno" value="4">4</html:radio>
                                        <html:radio property="uno" value="5">5</html:radio>
                                    </td>
                                </tr>
                                <tr>
                                    <td>2. Cumpli� las normas y procedimientos de la empresa tales como: Horario de trabajo, normas de seguridad, tramitaci�n de servicios, etc.</td>
                                    <td width="180">
                                        <html:radio property="dos" value="1">1</html:radio>
                                        <html:radio property="dos" value="2">2</html:radio>
                                        <html:radio property="dos" value="3">3</html:radio>
                                        <html:radio property="dos" value="4">4</html:radio>
                                        <html:radio property="dos" value="5">5</html:radio>
                                    </td>
                                </tr>
                                <tr>
                                    <td>3. Comprendi� las limitaciones y exigencias con que deben realizarse los trabajos profesionales dentro de la Empresa, mostrando una clara disposici�n para el aprendizaje.</td>
                                    <td width="180">
                                        <html:radio property="tres" value="1">1</html:radio>
                                        <html:radio property="tres" value="2">2</html:radio>
                                        <html:radio property="tres" value="3">3</html:radio>
                                        <html:radio property="tres" value="4">4</html:radio>
                                        <html:radio property="tres" value="5">5</html:radio>
                                    </td>
                                </tr>
                                <tr>
                                    <td>4. Desarroll� el sentido de trabajar en grupo.</td>
                                    <td width="180">
                                        <html:radio property="cuatro" value="1">1</html:radio>
                                        <html:radio property="cuatro" value="2">2</html:radio>
                                        <html:radio property="cuatro" value="3">3</html:radio>
                                        <html:radio property="cuatro" value="4">4</html:radio>
                                        <html:radio property="cuatro" value="5">5</html:radio>
                                    </td>
                                </tr>
                                <tr>
                                    <td>5. Demostr� tener iniciativa para enfrentar los problemas que se le presentaron.</td>
                                    <td width="180">
                                        <html:radio property="cinco" value="1">1</html:radio>
                                        <html:radio property="cinco" value="2">2</html:radio>
                                        <html:radio property="cinco" value="3">3</html:radio>
                                        <html:radio property="cinco" value="4">4</html:radio>
                                        <html:radio property="cinco" value="5">5</html:radio>
                                    </td>
                                </tr>
                                <tr>
                                    <td>6. Se documentaba antes de proponer cualquier soluci�n.</td>
                                    <td width="180">
                                        <html:radio property="seis" value="1">1</html:radio>
                                        <html:radio property="seis" value="2">2</html:radio>
                                        <html:radio property="seis" value="3">3</html:radio>
                                        <html:radio property="seis" value="4">4</html:radio>
                                        <html:radio property="seis" value="5">5</html:radio>
                                    </td>
                                </tr>
                                <tr>
                                    <td>7. Argument� adecuadamente las soluciones t�cnicas que propuso.</td>
                                    <td width="180">
                                        <html:radio property="siete" value="1">1</html:radio>
                                        <html:radio property="siete" value="2">2</html:radio>
                                        <html:radio property="siete" value="3">3</html:radio>
                                        <html:radio property="siete" value="4">4</html:radio>
                                        <html:radio property="siete" value="5">5</html:radio>
                                    </td>
                                </tr>
                                <tr>
                                    <td>8. Present� varias alternativas de posibles soluciones a cada problema propuesto.</td>
                                    <td width="180">
                                        <html:radio property="ocho" value="1">1</html:radio>
                                        <html:radio property="ocho" value="2">2</html:radio>
                                        <html:radio property="ocho" value="3">3</html:radio>
                                        <html:radio property="ocho" value="4">4</html:radio>
                                        <html:radio property="ocho" value="5">5</html:radio>
                                    </td>
                                </tr>
                                <tr>
                                    <td>9. Demostr� receptividad a planteamientos diferentes a los presentados por �l.</td>
                                    <td width="180">
                                        <html:radio property="nueve" value="1">1</html:radio>
                                        <html:radio property="nueve" value="2">2</html:radio>
                                        <html:radio property="nueve" value="3">3</html:radio>
                                        <html:radio property="nueve" value="4">4</html:radio>
                                        <html:radio property="nueve" value="5">5</html:radio>
                                    </td>
                                </tr>
                                <tr>
                                    <td>10. Present� explicaciones escritas de su trabajo en forma clara y precisa.</td>
                                    <td width="180">
                                        <html:radio property="diez" value="1">1</html:radio>
                                        <html:radio property="diez" value="2">2</html:radio>
                                        <html:radio property="diez" value="3">3</html:radio>
                                        <html:radio property="diez" value="4">4</html:radio>
                                        <html:radio property="diez" value="5">5</html:radio>
                                    </td>
                                </tr>
                            </table>
                            <html:submit styleClass="button">Enviar Evaluaci�n</html:submit>
                            </html:form>
                            </logic:empty>
                            <logic:notEmpty name="Ya_Evaluo">
                                <center><h3>Usted ya evalu� esta pasant�a con nota: ${Ya_Evaluo} / 5.0</h3></center>
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