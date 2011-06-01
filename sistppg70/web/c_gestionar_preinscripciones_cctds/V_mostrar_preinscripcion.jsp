<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_sesion_cctds.title"/></title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
    </head>
    <body>
        <div id="wrapper">
            <div id="menu">
                <ul id="nav">
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
                                    ${empty msg ? "" : msg}

                                        <table id="pgInfo">
                                            <tr>
                                                <td id="titulo">Tipo:</td>
                                                <td>${ p.tipo==1 ? "Corta" : ""}${ p.tipo==2 ? "Intermedia" : ""}${ p.tipo==3 ? "Larga" : ""}</td>
                                            </tr>
                                            <tr>
                                                <td id="titulo">Estudiante:</td>
                                                <td>${p.estudiante.nombre}</td>
                                            </tr>
                                            <tr>
                                                <td id="titulo">Carnet:</td>
                                                <td>${p.estudiante.usbid}</td>
                                            </tr>
                                            <tr>
                                                <td id="titulo">Fecha Preinscripcion:</td>
                                                <td>${p.created_at}</td>
                                            </tr>
                                            <tr>
                                                <td id="titulo">Planilla Preinscripcion:</td>
                                                <td><html:link action="/A_GenerarSolicitudPasantia.do?preId=${p.idPreinscripcion}">Descargar<img style="padding-left: 3px" src="_css/images/download.png"></html:link></td>
                                            </tr>
                                        </table>
                                        <div id="aprobarBtm">
                                            <cohesion:actor actors="1"><h3><html:link action="/A_cambiar_estatus.do?preId=${p.idPreinscripcion}" onclick="return confirm('Se enviará un email con datos del estudiante a empresas que hayan solicitado pasantes de la misma carrera, período y tipo que el \n\r¿Está de acuerdo? ')">Aprobar</html:link></h3></cohesion:actor>
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