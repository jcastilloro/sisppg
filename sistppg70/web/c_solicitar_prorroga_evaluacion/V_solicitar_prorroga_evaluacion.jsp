<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%>
<html:html>
    <head>
        <title><bean:message key="V_solicitar_prorroga_evaluacion.title"/></title>

        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <script type="text/javascript" src="../_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="../_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="../_js/jquery-ui-1.8.10.custom.min.js"></script>
        <script type="text/javascript" src="../_js/jquery.ui.datepicker-es.js"></script>

    </head>
    <body>
        <script type="text/javascript">
            jQuery(function($){
                $("#1840509").datepicker();
            });
        </script>
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
                                    <center>${empty msg ? "" : msg}</center>
                                    <div class="box1465928" align="center">

                                        <html:form
                                            action="/A_solicitar_prorroga_evaluacion.do" method="post">
                                            <p id="1840450_C">Justificacion: <br><html:textarea styleId="1840450" property="justificacion" cols="60" rows="10"></html:textarea></p>
                                            <p id="1840450_C">Fecha: <br><html:text styleId="1840509" property="fecha_propuesta"></html:text></p>
                                            <html:submit styleClass="button"><bean:message key="V_solicitar_prorroga_inscripcion.label0"/><%-- Solicitar Prorroga --%></html:submit>
                                        </html:form>

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
