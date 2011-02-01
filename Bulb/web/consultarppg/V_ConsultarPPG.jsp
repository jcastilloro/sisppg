<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 

%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 

%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 

%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"

%><%@ page contentType="text/html;charset=ISO-8859-1"

%><html:html>

    <head>

        <title><bean:message key="V_ConsultarPPG.title"/></title>

        <html:base/>

        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>

        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>

        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>



    </head>

    <body>

        

           

            <div id="menu">

                <ul id="nav">

                </ul>

            </div>

            <div id="header">

            

            </div>

        </div>

        <div id="body_wrapper">

            <div id="body">

                <div id="split">

                    <div class="top"></div>

                    <div id="left">

                        <div class="content">
                            <br>
                            <br>
                            <br>
                            <br>
                            <table border="0" align="center" width="400px">
                            <th>
                            <br>

                            PROYECTO DE GRADO:

                            <br>

                            <hr>

                            

                                <table>

                                <tr><th>Numero del Proyecto</th><td><bean:write name="numeroppg"/></td></tr>

                                <tr><th>Nombre del Proyecto</th><td><bean:write name="nombreppg"/></td></tr>

                                <tr><th>Fecha</th><td><bean:write name="fechappg"/></td></tr>

                                <tr><th>Propuesto Por</th><td><bean:write name="propuestopor"/></td></tr>

                                <tr><th>Actividades que involucra</th><td><bean:write name="actvppg"/></td></tr>

                                <tr><th>Puntos de Interes </th><td><bean:write name="ptosinte"/></td></tr>

                                <tr><th>Areas que aborda </th><td><bean:write name="areas"/></td></tr>

                                <tr><th>Duracion y Recursos </th><td><bean:write name="durayrec"/></td></tr>

                                <tr><th>Primera Etapa </th><td><bean:write name="primerae"/></td></tr>

                                <tr><th>Trimestre/AÃ±o</th><td><bean:write name="trimestreuno"/></td></tr>

                                <tr><th>Resultados mÃ­nimos </th><td><bean:write name="resultminuno"/></td></tr>

                                <tr><th>Actividades</th><td><bean:write name="actresuluno"/></td></tr>

                                <tr><th>DescripciÃ³n (CI-5855)</th><td><bean:write name="desctopicosici"/></td></tr>

                                <tr><th>Segunda Etapa</th><td><bean:write name="segundae"/></td></tr>

                                <tr><th>Trimestre/AÃ±o</th><td><bean:write name="trimestredos"/></td></tr>

                                <tr><th>Juntas</th><td><bean:write name="juntas"/></td></tr>

                                <tr><th>Resultados mÃ­nimos</th><td><bean:write name="resultmindos"/></td></tr>

                                <tr><th>Actividades</th><td><bean:write name="actresuldos"/></td></tr>

                                <tr><th>DescripciÃ³n (CI-5856)</th><td><bean:write name="desctopicosicii"/></td></tr>

                                <tr><th>Tercera Etapa</th><td><bean:write name="tercerae"/></td></tr>

                                <tr><th>Trimestre/AÃ±o</th><td><bean:write name="trimestretres"/></td></tr>

                                <tr><th>Resultados mÃ­nimos</th><td><bean:write name="resultmintres"/></td></tr>

                                <tr><th>Actividades</th><td><bean:write name="actresultres"/></td></tr>

                                <tr><th>Recursos y Materiales </th><td><bean:write name="recurmate"/></td></tr>                                

                                </table>

                            

                                <hr>

                                <br>

                                AREA:

                                <br>

                                <hr>

				<table>

                                    <tr><th>Nombre Area </th><td><bean:write name="nombrearea"/></td></tr>                                

                                </table>

                                <hr>

                                <br>

                                TUTOR:

                                <br>

                                <hr>



                                <table>

                                    <tr><th>Nombre Tutor </th><td><bean:write name="nombreprofesor"/></td></tr>                                

                                </table>
                                </th>

			 </table>

                        </div>

                    </div>

                    <div id="right"><ul id="nav"><li><script type="text/javascript">var hb = new HelpBalloon({ dataURL: '//tooltip.do?V=V_ConsultarPPG'});</script></li></ul></div>

                    <div class="clearer"></div>

                    <div class="bottom"></div>

                </div>

                <div class="clearer"></div>

            </div>

            <div class="clearer"></div>

        </div>

        <div id="end_body"></div>

        <div id="footer"> <bean:message key="bottom.label"/> </div>

        

    </body>

</html:html>