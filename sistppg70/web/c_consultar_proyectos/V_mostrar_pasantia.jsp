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
                            <logic:empty name="Pasantia">
                                <h1>�Usted no tiene ninguna pasant�a asociada!</h1>
                            </logic:empty>
                            <logic:notEmpty name="Pasantia">
                                <table width="450">
                                    <tr><th><h1>${Pasantia.titulo}</h1></th></tr>
                                </table>
                                <table width="450">
                                    <tr><th>Resumen:</th><td> ${Pasantia.resumen} </td></tr>
                                    <tr><th>Objetivos Generales:</th><td> ${Pasantia.objetivos_generales} </td></tr>
                                </logic:notEmpty>
                                <logic:empty name="Estatus">
                                    <tr><th>Estatus:</th><td> Indefinido </td></tr>
                                </logic:empty>
                                <logic:notEmpty name="Estatus">
                                    <tr><th>Estatus:</th><td> ${Estatus.estatus} </td></tr>
                                </logic:notEmpty>
                                <logic:empty name="Profesor">
                                    <tr><th>Tutor Acad�mico:</th><td> Indefinido </td></tr>
                                </logic:empty>
                                <logic:notEmpty name="Profesor">
                                    <tr><th>Tutor Acad�mico:</th><td> ${Profesor.nombre} ${Profesor.apellido} </td></tr>
                                </logic:notEmpty>
                                <logic:empty name="TutorIndustrial">
                                    <tr><th>Tutor Industrial:</th><td> Indefinido </td></tr>
                                </logic:empty>
                                <logic:notEmpty name="TutorIndustrial">
                                    <tr><th>Tutor Industrial:</th><td> ${TutorIndustrial.nombre} </td></tr>
                                </logic:notEmpty>

                                <%-- Per�do y Tipo de la Pasant�a --%>
                                <logic:empty name="PasantiaLarga">
                                    <logic:empty name="PasantiaCorta">
                                        <logic:empty name="PasantiaIntermedia">
                                            <tr><th>Tipo:</th><td> No definido </td></tr>
                                        </logic:empty>
                                        <logic:notEmpty name="PasantiaIntermedia">
                                            <tr><th>Tipo:</th><td> Pasant�a Intermedia </td></tr>
                                            <logic:empty name="Periodo">
                                            </logic:empty>
                                            <logic:notEmpty name="Periodo">
                                                <tr><th>Per�odo:</th><td>${Periodo.nombre} </td></tr>
                                            </logic:notEmpty>
                                        </logic:notEmpty>
                                    </logic:empty>
                                    <logic:notEmpty name="PasantiaCorta">
                                        <tr><th>Tipo:</th><td> Pasant�a Corta </td></tr>
                                        <tr><th>Per�odo:</th><td> Julio-Septiembre </td></tr>
                                    </logic:notEmpty>
                                </logic:empty>
                                <logic:notEmpty name="PasantiaLarga">
                                    <tr><th>Tipo:</th><td> Pasant�a Larga </td></tr>
                                    <logic:empty name="Periodo">
                                    </logic:empty>
                                    <logic:notEmpty name="Periodo">
                                        <tr><th>Per�odo:</th><td>${Periodo.nombre} </td></tr>
                                    </logic:notEmpty>
                                </logic:notEmpty>
                                <%-- FIN: Per�do y Tipo de la Pasant�a --%>

                                <logic:empty name="Ano">
                                    <tr><th>A�o:</th><td> Indefinido </td></tr>
                                </logic:empty>
                                <logic:notEmpty name="Ano">
                                    <tr><th>A�o:</th><td> ${Ano} </td></tr>
                                </logic:notEmpty>
                                </table>

                                <%-- FASES --%>

                                <logic:empty name="Fases">
                                    *No tiene ninguna fase o etapa asociada a su pasant�a
                                </logic:empty>
                                <logic:notEmpty name="Fases">
                                    <logic:iterate id="fase" indexId="i" collection="${empty Fases ? _vacio : Fases}">
                                        <br><br>
                                        <table width="450">
                                        <tr><th><h3>Fase ${i+1} </h3></th></tr>
                                        <tr><th>Objetivos Espec�ficos: ${fase.objetivos_especificos}</th></tr>
                                        </table>
                                        <table width="450">
                                        <tr><th>Actividades</th><th>Tiempo Estimado</th></tr>
                                        <logic:iterate id="act" indexId="j" collection="${empty fase.actividades ? _vacio : fase.actividades}">
                                            <tr><td>${act.descripcion}</td><td> ${act.tiempo_estimado} </td></tr>
                                        </logic:iterate>
                                        </table>
                                    </logic:iterate>
                                </logic:notEmpty>
                                <br>
                                        <logic:notEmpty name="idJurado">
                                                <a href="www.google.com">Remover Jurado</a>
                                            </logic:notEmpty>

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