<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_mostrar_preinscripcion.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title">Preinscripcion ${ p.tipo==1 ? "Corta" : ""}${ p.tipo==2 ? "Intermedia" : ""}${ p.tipo==3 ? "Larga" : ""} #${p.idPreinscripcion}</div>
            <div id="menu">
                <ul id="nav">
                </ul>
            </div>
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            ${empty msg ? "" : msg}

                            <div class="pgInfo">
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
                                        <td id="titulo">Fecha preinscripcion:</td>
                                        <td>${p.created_at}</td>
                                    </tr>
                                    <tr>
                                        <td id="titulo">Planilla Preinscripcion:</td>
                                        <td><a href="#" >Descargar<img style="padding-left: 3px" src="_css/images/download.png"></a></td>
                                    </tr>
                                </table>
                                    <div id="aprobarBtm">
                                        <cohesion:actor actors="1"><html:link action="/A_cambiar_estatus.do?preId=${p.idPreinscripcion}">Aprobar</html:link></cohesion:actor>
                                    </div>

                            </div>
                                    

                         </div>
                    </div>
                    <div id="right"></div>
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