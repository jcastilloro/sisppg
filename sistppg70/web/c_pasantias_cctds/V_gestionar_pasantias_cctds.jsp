<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=UTF-8"
           %><html:html>
    <head>
        <title>Gestionar Pasantías</title>

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
                   <%-- <li><html:link action="/A_consultar_resagados.do"><bean:message key="V_gestionar_pasantias_cctds.label0"/><</html:link></li> --%>
                  <%--  <li><cohesion:actor actors="1"><html:link action="/A_consultar_pasantias_cctds.do"><bean:message key="V_gestionar_pasantias_cctds.label1"/></html:link></cohesion:actor></li>  --%>
                    <li><cohesion:actor actors="1"><html:link action="/A_prep_sesion_ccds.do">Home</html:link></cohesion:actor></li>
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
                                    <h1>Pasantias Cortas</h1>
                                    <div class="administrador">
                                    <table border="1" class="sortable" width="500px">
                                        <thead>
                                            <tr>
                                                <th>Estudiante</th>
                                                <th>Titulo</th>
                                                <th>Tutor Academico</th>
                                                <th>Tutor Industrial</th>
                                                <th>Estatus</th>
                                            </tr>
                                        </thead>
                                            <logic:notEmpty name="L_pc">
                                            <tbody>
                                                <logic:iterate id="obj" name="L_pc">
                                                    <tr>
                                                        <td>${obj[0]}</td>
                                                        <td>${obj[1]}</td>
                                                        <td>${obj[2]}</td>
                                                        <td>${obj[3]}</td>
                                                        <td>${obj[4]}</td>
                                                    </tr>
                                                </logic:iterate>
                                            </tbody>
                                            </logic:notEmpty>
                                        
                                    </table>
                                    <br>
                                    <br>

                                    <h1>Pasantias Intermedias</h1>
                                    <table border="1" class="sortable" width="500px">
                                        <thead>
                                            <tr>
                                                <th>Estudiante</th>
                                                <tH>Titulo</tH>
                                                <tH>Tutor Academico</tH>
                                                <tH>Tutor Industrial</tH>
                                                <tH>Estatus</tH>
                                            </tr>
                                        </thead>
                                            <logic:notEmpty name="L_pi">
                                            <tbody>
                                                <logic:iterate id="obj" name="L_pi">
                                                    <tr>
                                                        <td>${obj[0]}</td>
                                                        <td>${obj[1]}</td>
                                                        <td>${obj[2]}</td>
                                                        <td>${obj[3]}</td>
                                                        <td>${obj[4]}</td>
                                                    </tr>
                                                </logic:iterate>
                                            </tbody>
                                            </logic:notEmpty>

                                    </table>

                                    <br>
                                    <br>
                                    <h1>Pasantias Largas</h1>
                                    <table border="1" class="sortable" width="500px">
                                        <thead>
                                            <tr>
                                                <th>Estudiante</th>
                                                <tH>Titulo</tH>
                                                <tH>Tutor Academico</tH>
                                                <tH>Tutor Industrial</tH>
                                                <tH>Estatus</tH>
                                            </tr>
                                        </thead>
                                            <logic:notEmpty name="L_pl">
                                            <tbody>
                                                <logic:iterate id="obj" name="L_pl">
                                                    <tr>
                                                        <td>${obj[0]}</td>
                                                        <td>${obj[1]}</td>
                                                        <td>${obj[2]}</td>
                                                        <td>${obj[3]}</td>
                                                        <td>${obj[4]}</td>
                                                    </tr>
                                                </logic:iterate>
                                            </tbody>
                                            </logic:notEmpty>

                                    </table>
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
