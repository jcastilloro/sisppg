<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"

%><html:html>

    <head>
        <title><bean:message key="V_ConsultarInscripcion.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>       
    </head>

    <body>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_ModificarInscripcion.do"><bean:message key="V_ConsultarInscripcion.label0"/><%-- Modificar Inscripci&oacute;n --%></html:link></li>
                    <li><html:link action="/A_GenerarPlanTrabajo.do"><bean:message key="V_ConsultarInscripcion.label1"/><%-- Generar Planilla de Inscripci&oacute;n --%></html:link></li>
                </ul>
                <p align="right"><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="CerrarSesion.label"/><%-- Cerrar Sesión --%></html:link>
            </div>

           <div id="header">             
           </div>

        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">

                            ${empty msg ? "" : msg}

                            <br>
                            <br>
                            <table border="0" align="center" width="500px">

                                <tr><th>Empresa</th><td><bean:write name="empresa"/></td></tr>

                                <tr><th>Tutor Industrial</th><td><bean:write name="tutorI"/></td></tr>

                                <tr><th>Tutor Acad&eacute;mico</th><td><bean:write name="tutorA"/></td></tr>

                                <tr><th><h1 align="center">Pasant&iacute;a</h1></th></tr>

                                <tr><th>T&iacute;tulo</th><td><bean:write name="titulo"/></td></tr>

                                <tr><th>Area</th><td><bean:write name="area"/></td></tr>

                                <tr><th>Resumen del Proyecto</th><td><bean:write name="resumen"/></td></tr>

                                <tr><th>Objetivos de la Pasantia </th><td><bean:write name="objetivos"/></td></tr>

                                <tr><th>Fase</th><td><bean:write name="fases"/></td></tr>

                                <tr><th><h1 align="center">Fase 1</h1></td></tr>

                                <tr><th>Objetivos Espec&iacute;ficos</th><td><bean:write name="objetivosI"/></td></tr>

                                <tr><th>Actividades</th><td><bean:write name="actividadesI"/></td></tr>

                                <tr><th>Tiempo Estimado</th><td><bean:write name="tiempoI"/></td></tr>

                                <tr><th><br><h1>Fase 2 </h1></td></tr>

                                <tr><th>Objetivos Espec&iacute;ficos</th><td><bean:write name="objetivosII"/></td></tr>

                                <tr><th>Actividades</th><td><bean:write name="actividadesII"/></td></tr>

                                <tr><th>Tiempo Estimado</th><td><bean:write name="tiempoII"/></td></tr>

                                <tr><th><br><h1>Fase 3</h1></th></tr>

                                <tr><th>Objetivos Espec&iacute;ficos</th><td><bean:write name="objetivosIII"/></td></tr>

                                <tr><th>Actividades</th><td><bean:write name="actividadesIII"/></td></tr>

                                <tr><th>Tiempo Estimado</th><td><bean:write name="tiempoIII"/></td></tr>

                                <tr><th><br><h1>Fase 4</h1></td></tr>

                                <tr><th>Objetivos Espec&iacute;ficos</th><td><bean:write name="objetivosIV"/></td></tr>

                                <tr><th>Actividades</th><td><bean:write name="actividadesIV"/><br></td></tr>

                                <tr><th>Tiempo Estimado</th><td><bean:write name="tiempoIV"/></td></tr>

                                <tr><th>Codigo PT</th><td><bean:write name="codigoPt"/></td></tr>                                

                            </table>
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
        <div id="footer"> <bean:message key="bottom.label"/> </div>      

    </body>

</html:html>