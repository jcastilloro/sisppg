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


                            ${empty msg ? "" : msg}


                            <br><br>

                            <div class="preinscripcionesTabla">
                                <table border="1" cellspacing="1" cellpadding="5">
                                    <tr>
                                        <th><cohesion:actor actors="1"><html:link action="/A_prep_consultar_no_aprobados.do?orderby=1">Tipo</html:link></cohesion:actor></th>
                                        <th><cohesion:actor actors="1"><html:link action="/A_prep_consultar_no_aprobados.do?orderby=2">Carnet</html:link></cohesion:actor></th>
                                        <th><cohesion:actor actors="1"><html:link action="/A_prep_consultar_no_aprobados.do?orderby=4">Fecha Solicitud</html:link></cohesion:actor></th>
                                        <th><cohesion:actor actors="1"><html:link action="/A_prep_consultar_no_aprobados.do?orderby=3">Estatus</html:link></cohesion:actor></th>

                                    </tr>
                                    <logic:notEmpty name="L_preinscripciones">
                                        <logic:iterate id="p" name="L_preinscripciones">
                                            <tr>
                                                <td><html:link action="/A_mostrar_preinscripcion.do?preId=${p.idPreinscripcion}">${ p.tipo==1 ? "Corta" : ""}${ p.tipo==2 ? "Intermedia" : ""}${ p.tipo==3 ? "Larga" : ""}</html:link></td>
                                                <td><html:link action="/A_mostrar_preinscripcion.do?preId=${p.idPreinscripcion}">${p.estudiante.usbid}</html:link></td>
                                                <td><html:link action="/A_mostrar_preinscripcion.do?preId=${p.idPreinscripcion}">${p.created_at}</html:link></td>
                                                    <td id="pre${p.estatus ? "Proc" : "Pend"}"><html:link action="/A_mostrar_preinscripcion.do?preId=${p.idPreinscripcion}">${p.estatus ? "Procesado" : "Pendiente"}</html:link></td>

                                            </tr>
                                        </logic:iterate>
                                    </logic:notEmpty>
                                </table>
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