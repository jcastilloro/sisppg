<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=ISO-8859-1"
           %><html:html>
    <head>
        <title>Pasant�as Propias</title>


        <html:base/>

        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>

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


                    <!--
                                        <li><cohesion:actor actors="8"><html:link action="/A_consultar_pasantias_propias.do"><bean:message key="V_consulta_pasantia_propias.label0"/><%-- ordenar --%></html:link></cohesion:actor></li>
                                        <li><cohesion:actor actors="8"><html:link action="/A_mostrar_pasantia_propia.do"><bean:message key="V_consulta_pasantia_propias.label1"/><%-- A_mostrar_pasantia_propia --%></html:link></cohesion:actor></li>
                    -->



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
                                    <center>${empty msg ? "" : msg}</center>
                                    <div class="box1465928" align="center">


                                        <div class="administrador">
                                            <logic:notEmpty name="Datos">
                                            <h2>
                                                Mis Pasant�as
                                            </h2><hr>
                                            <table class="sortable" >
                                                <thead>
                                                    <tr>
                                                        <th width="500px">
                                                            <center>
                                                                Titulo
                                                            </center>
                                                        </th>
                                                        <th width="100px">
                                                            <center>
                                                                A�o
                                                            </center>
                                                        </th>
                                                        <th width="200px">
                                                            <center>
                                                                Tipo de Pasant�a
                                                            </center>
                                                        </th>
                                                        <th width="100px">
                                                            <center>
                                                                Estatus
                                                            </center>
                                                        </th>
                                                        <th width="100px">
                                                            <center>
                                                                Evaluaci�n
                                                            </center>
                                                        </th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                     
                                                    <logic:iterate id="dato" collection="${empty Datos ? _vacio : Datos}">

                                                        <bean:write name="dato" filter="false"/>


                                                    </logic:iterate>
                                                     
                                                </tbody>
                                            </table>
                                                    </logic:notEmpty>
                                                    <logic:empty name="Datos">
                                                            Usted no posee pasant�as asociadas!!.
                                                    </logic:empty>



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