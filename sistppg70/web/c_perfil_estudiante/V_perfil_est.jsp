<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=ISO-8859-1"
           %><html:html>
    <head>
        <title><bean:message key="V_perfil_est.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <script type="text/javascript" src="_js/jquery.ui.datepicker-es.js"></script>
        <style type="text/css">
            div#box1840396 {width: 400px; margin: 40px auto; }
            form#1840396 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
            form#1840396 p {float: left; margin: 0; padding: 0; display: inline; }
            form#1840396 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
            form#1840396 input {float: left; margin: 0; padding: 0; display: inline; }
            form#1840396 p#1840398_C {clear: both; width: 400px; }
            form#1840396 p#1840398_C label {clear: both; width: 400px; }
            form#1840396 p#1840398_C input {clear: both; width: 396px; }
            form#1840396 p#1840402_C {clear: both; width: 400px; }
            form#1840396 p#1840402_C label {clear: both; width: 400px; }
            form#1840396 p#1840402_C input {clear: both; width: 396px; }
            form#1840396 p#1840405_C {clear: both; width: 400px; }
            form#1840396 p#1840405_C label {clear: both; width: 400px; }
            form#1840396 p#1840405_C input {clear: both; width: 396px; }
            form#1840396 p#1840408_C {clear: both; width: 400px; }
            form#1840396 p#1840408_C label {clear: both; width: 400px; }
            form#1840396 p#1840408_C input {clear: both; width: 396px; }
            form#1840396 p#1840459_C {clear: both; width: 400px; }
            form#1840396 p#1840459_C label {clear: both; width: 400px; }
            form#1840396 p#1840459_C input {clear: both; width: 396px; }
            form#1840396 p#1843493_C {clear: both; width: 400px; }
            form#1840396 p#1843493_C label {clear: both; width: 400px; }
            form#1840396 p#1843493_C input {clear: both; width: 396px; }
            form#1840396 p#1843588_C {clear: both; width: 400px; }
            form#1840396 p#1843588_C label {clear: both; width: 400px; }
            form#1840396 p#1843588_C input {clear: both; width: 396px; }
            form#1840396 p#1843591_C {clear: both; width: 400px; }
            form#1840396 p#1843591_C label {clear: both; width: 400px; }
            form#1840396 p#1843591_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <script type="text/javascript">
            jQuery(function($) {
                $( "#1843588" ).datepicker();

            });</script>        <div id="header">
            <div id="title"><bean:message key="V_perfil_est.title"/></div>
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
                            <div class="box1840396"><html:form
                                    action="/A_guardar_perfil.do" method="post">
                                    <table border="0">
                                        <tr><td><p id="1840398_C"><label for="1840398"><bean:message key="F_Perfil_Estudiante.label0"/><%-- Nombre: --%></label></td><td><html:text styleId="1840398" property="nombre" size="30"/></td></tr>
                                        <tr><td><p id="1840402_C"><label for="1840402"><bean:message key="F_Perfil_Estudiante.label1"/><%-- Apellido: --%></label></td><td><html:text styleId="1840402" property="apellido" size="30"/></td></tr>
                                        <tr><td><p id="1840405_C"><label for="1840405"><bean:message key="F_Perfil_Estudiante.label2"/><%-- Cedula: --%></label></td><td><html:text styleId="1840405" property="cedula" size="30"/></td></tr>
                                        <tr><td><p id="1840408_C"><label for="1840408"><bean:message key="F_Perfil_Estudiante.label3"/><%-- Email: --%></label></td><td><html:text styleId="1840408" property="email" size="30"/></td></tr>
                                        <tr><td><p id="1840459_C"><label for="1840459"><bean:message key="F_Perfil_Estudiante.label4"/><%-- Telefono: --%></label></td><td><html:text styleId="1840459" property="telefono" size="30"/></td></tr>
                                        <tr><td><p id="1843493_C"><label for="1843493"><bean:message key="F_Perfil_Estudiante.label5"/><%-- Carrera: --%></label></td><td>
                                                <html:select styleId="1843493" property="carrera">
                                                    <logic:iterate id="carrera" collection="${empty L_Carreras ? _vacio : L_Carreras}">
                                                <option value="${carrera.idCarrera}">${carrera.nombre}</option>
                                            </logic:iterate>
                                        </html:select></td></tr></td></tr>
                                        <tr><td><p id="1843588_C"><label for="1843588"><bean:message key="F_Perfil_Estudiante.label6"/><%-- Fecha Nacimiento: --%></label></td><td><html:text styleId="1843588" property="fecha_nacimiento" size="30"/></td></tr>
                                        <tr><td><p id="1843591_C"><label for="1843591"><bean:message key="F_Perfil_Estudiante.label7"/><%-- Estado Civil --%></label></td><td>
                                                 <html:select styleId="1843591" property="carrera">
                                                      <option value="Soltero"> Soltero </option>
                                                      <option value="Casado"> Casado </option>
                                                      <option value="Divorciado"> Divorciado </option>
                                                      <option value="Viudo"> Viudo </option>
                                        </html:select>
                                            </td></tr>
                                    </table>
                                    <center><html:submit styleClass="button"><bean:message key="V_perfil_est.label0"/><%-- CrearPerfilEst --%></html:submit></center>
                                </html:form></div>
                            <p><bean:message key="V_Obligatorios.msg0"/>
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