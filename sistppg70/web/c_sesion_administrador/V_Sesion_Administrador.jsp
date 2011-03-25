<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=ISO-8859-1"
           %><html:html>
    <head>
        <title><bean:message key="V_Inicio_Sesion.title"/></title>


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

                                        <center><h1>Selecciona una Categoría</h1></center>
                                        <p><hr>
                                        <center>
                                            <table borde="0"">
                                                <tr>
                                                    <th width="250">
                                                        <html:link action="/A_Prep_Gestionar_Carreras.do">Carreras</html:link>
                                                    </th>
                                                    <th width="250">
                                                        <html:link action="/A_Prep_Gestionar_Areas.do">Areas</html:link>
                                                    </th>
                                                    <th width="250">
                                                        Departamentos
                                                    </th>
                                                </tr>
                                            </table>
                                                    <hr>
                                            <table borde="0" width="700">
                                                <tr><p></p></tr>
                                                <tr>
                                                    <th width="250">
                                                        <html:link action="/A_Prep_Gestionar_Estatus_Pasantias.do">Estatus de Pasantías</html:link>
                                                    </th>
                                                    <th width="250">
                                                        <html:link action="/A_Prep_Gestionar_Periodo_Pasantia_Intermedias.do">Periodos de Pasantia Intermedia</html:link>
                                                    </th">
                                                    <th width="250">
                                                        <html:link action="/A_Prep_Gestionar_Periodo_Pasantia_Largas.do">Periodos de Pasantia Larga</html:link>
                                                    </th>
                                                </tr>
                                            </table>
                                                    <hr>
                                            <table borde="0" width="700">
                                                <tr><p></p></tr>
                                                <tr>
                                                    <th width="250">
                                                        <html:link action="/A_Prep_Gestionar_Trimestres.do">Trimestres</html:link>
                                                    </th>
                                                    <th width="250">
                                                        Ciudad
                                                    </th>
                                                    <th width="250">
                                                        <html:link action="/A_Prep_Gestionar_Paises.do">Paises</html:link>
                                                    </th>
                                                </tr width="250">
                                                <tr><p></p></tr>
                                                <tr>
                                                    <th>
                                                        <html:link action="/A_Prep_Gestionar_Estatus_Prorrogas.do">Estatus de Prorrogas</html:link>
                                                    </th>
                                                    <th>

                                                    </th>
                                                    <th>

                                                    </th>
                                                </tr>
                                            </table>
                                        </center>


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