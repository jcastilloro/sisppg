<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_Sesion_Empresa.title"/></title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
    </head>
    <body>
        <div id="wrapper">
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="1"><html:link action="/A_procesar_aprobados.do"><bean:message key="V_gestionar_preinscripciones_cctds.label0"/><%-- Procesar Aprobados --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="1"><html:link action="/A_prep_consultar_no_aprobados.do">Consultar PENDIENTES</html:link></cohesion:actor></li>



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


                            ${empty msg ? "" : msg}
                            <br><br>
                            <h1>Preinscripciones registradas</h1>
                            <div class="preinscripcionesTabla">
                                <table border="1" cellspacing="1" cellpadding="5">
                                    <tr>
                                        <th><cohesion:actor actors="1"><html:link action="/A_prep_gestionar_preinscripcion_cctds.do?orderby=1">Tipo</html:link></cohesion:actor></th>
                                        <th><cohesion:actor actors="1"><html:link action="/A_prep_gestionar_preinscripcion_cctds.do?orderby=2">Carnet</html:link></cohesion:actor></th>
                                        <th><cohesion:actor actors="1"><html:link action="/A_prep_gestionar_preinscripcion_cctds.do?orderby=4">Fecha Solicitud</html:link></cohesion:actor></th>
                                        <th><cohesion:actor actors="1"><html:link action="/A_prep_gestionar_preinscripcion_cctds.do?orderby=3">Estatus</html:link></cohesion:actor></th>

                                    </tr>
                                    <logic:notEmpty name="L_preinscripciones">
                                        <logic:iterate id="p" name="L_preinscripciones">
                                            <tr>
                                                <td>${ p.tipo==1 ? "Corta" : ""}${ p.tipo==2 ? "Intermedia" : ""}${ p.tipo==3 ? "Larga" : ""}</td>
                                                <td>${p.estudiante.usbid}</td>
                                                <td>${p.created_at}</td>
                                                <td id="pre${p.por_graduar ? "Proc" : "Pend"}">${p.por_graduar ? "Procesado" : "Pendiente"}</td>

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