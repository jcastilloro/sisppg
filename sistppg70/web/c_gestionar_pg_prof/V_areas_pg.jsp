<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=UTF-8"
           %><html:html>
    <head>
        <title>Areas</title>


        <html:base/>

        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>

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


                    <li><cohesion:actor actors="8"><html:link action="/A_prep_etapas_ppg.do"><bean:message key="V_areas_pg.label1"/><%-- Finalizar Areas --%></html:link></cohesion:actor></li>



                </ul>
            </div>



            <div id="header">
                <%-- NO ESTOY SEGURO DE QUE VA AQUI PERO SE VE FEO Y QUEDA SOBRE LA IMAGEN --%>
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

                            <div class="pgInfo">
                                <table id="pgInfo">
                                    <tr>
                                        <td id="titulo">Nombre PG:</td>
                                        <td>${pg.nombre}</td>
                                    </tr>
                                    <tr>
                                        <td id="titulo">Recursos:</td>
                                        <td>${pg.recursos}</td>
                                    </tr>
                                    <tr>
                                        <td id="titulo">Duracion de recursos:</td>
                                        <td>${pg.duracion_recursos}</td>
                                    </tr>
                                    <tr>
                                        <td id="titulo">Puntos de interes:</td>
                                        <td>${pg.puntos_de_interes}</td>
                                    </tr>
                                    <tr>
                                        <td id="titulo">Areas:</td>
                                        <logic:notEmpty name="L_Areas_PG">
                                            <td></td>
                                            </tr>
                                            <logic:iterate id="apg" name="L_Areas_PG">
                                            <tr><td></td><td>${apg.nombre}</td></tr>
                                            </logic:iterate>
                                        </logic:notEmpty>
                                        <logic:empty name="L_Areas_PG">
                                            <td>No ha seleccionado areas</td>
                                        </tr>
                                        </logic:empty>

                                </table>
                            </div>                            </div>
                                    <br>

                <center> ${empty msg ? "" : msg} </center>
                <div class="box1840605">

                    <center><html:form
                  action="/A_agregar_area_PG.do" method="post">
                        <table border="0">
                            <tr><th>

                  <p id="1840607_C"><label for="1840607">
                          <html:select styleId="18405891" property="area">
                            <logic:iterate id="area" collection="${empty L_Areas ? _vacio : L_Areas}">
                                <option value="${area.idArea}">${area.nombre}</option>
                            </logic:iterate>
                          </html:select></p>

                  <html:submit styleClass="button"><bean:message key="V_areas_pg.label0"/><%-- Agregar Area --%></html:submit>
                  </th></tr></table>
                    </html:form></center>


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
