<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=UTF-8"
           %><html:html>
    <head>
        <title>Modifica Perfil</title>

        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <link rel="stylesheet" href="../_css/validationEngine.jquery.css" type="text/css"/>
        <link type="text/css" href="../_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <script type="text/javascript" src="../_js/jquery-1.4.4.min.js"></script>
        <script type="text/javascript" src="../_js/jquery-ui-1.8.10.custom.min.js"></script>
        <script type="text/javascript" src="../_js/jquery.ui.datepicker-es.js"></script>
        <script src="../_js/jquery.validationEngine.js" type="text/javascript"></script>
        <script src="../_js/jquery.validationEngine-es.js" type="text/javascript"></script>
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
                    <li><cohesion:actor actors="16"><html:link action="/A_modificar_perfil.do"><bean:message key="V_sesion_tutor_i.label0"/><%-- Modificar Perfil --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="16"><html:link action="/A_prep_gestionar_pasatias_TI.do"><bean:message key="V_sesion_tutor_i.label1"/><%-- Gestionar Pasantias --%></html:link></cohesion:actor></li>
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
                                    <center>${empty msg ? "" : msg}</center>
                                    <div class="box1465928" align="center">
                                        <div class="box1840560"><html:form styleId="perfilTIForm"
                                                   action="/A_actualizar_perfil_TI.do" method="post" acceptCharset="utf-8">
                                                <table border="0">
                                                    <tr><td><p id="1840562_C"><label for="1840562"><bean:message key="F_Tutor_Industrial.label0"/><%-- Nombre: --%></label></td><td><html:text styleId="1840562" property="nombre" size="30" value="${Datos.nombre}" styleClass="validate[required,custom[onlyLetterSp]]"/></td></tr></p>
                                                    <tr><td><p id="1840565_C"><label for="1840565"><bean:message key="F_Tutor_Industrial.label1"/><%-- Email: --%></label></td><td><html:text styleId="1840565" property="email" size="30" value="${Datos.email}" styleClass="validate[required,custom[email]]"/></td></tr></p>
                                                    <tr><td><p id="1840569_C"><label for="1840569"><bean:message key="F_Tutor_Industrial.label2"/><%-- Cedula: --%></label></td><td><html:text styleId="1840569" property="cedula" size="30" value="${Datos.cedula}" styleClass="validate[required,custom[cedula]]"/></td></tr></p>
                                                    <tr><td><p id="1840572_C"><label for="1840572"><bean:message key="F_Tutor_Industrial.label3"/><%-- Telefono: --%></label></td><td><html:text styleId="1840572" property="telefono" size="30"value="${Datos.telefono}" styleClass="validate[required,custom[phone]]"/></td></tr></p>
                                                    <tr><td><p id="1844840_C"><label for="1844840"><bean:message key="F_Tutor_Industrial.label4"/><%-- Profesi&oacute;n: --%></label></td><td><html:text styleId="1844840" property="profesion" size="30"value="${Datos.profesion}" styleClass="validate[required,custom[onlyLetterSp]]"/></td></tr></p>
                                                    <tr><td><p id="1840575_C"><label for="1840575"><bean:message key="F_Tutor_Industrial.label6"/><%-- Empresa: --%></label></td><td>${empresa.nombre}</td></tr></p>
                                                    <tr><td><p id="1844837_C"><label for="1844837"><bean:message key="F_Tutor_Industrial.label7"/><%-- Departamento: --%></label></td><td><html:text styleId="1844837" property="departamento" size="30" value="${Datos.departamento}" styleClass="validate[required,custom[onlyLetterSp]]"/></td></tr></p>
                                                    <tr><td><p id="1844848_C"><label for="1844848"><bean:message key="F_Tutor_Industrial.label8"/><%-- Cargo: --%></label></td><td><html:text styleId="1844848" property="cargo" size="30" value="${Datos.cargo}" styleClass="validate[required,custom[onlyLetterSp]]"/></td></tr></p>
                                                    <tr><td><p id="1844834_C"><label for="1844834">Login de sesión:<%-- Login de sesion: --%></label></td><td>${Datos.login}</td></tr></p>
                                                    <tr><td><p id="1844823_C"><label for="1844823"><bean:message key="F_Tutor_Industrial.label10"/><%-- Password de sesion: --%></label></td><td><html:password styleId="1844823" property="password" size="30" value="${Datos.password}" styleClass="validate[required]"/></td></tr></p>
                                                    <tr><td><p id="1844843_C"><label for="1844843"><bean:message key="F_Tutor_Industrial.label5"/><%-- Direccion: --%></label></td><td><html:textarea styleId="1844843" property="direccion" cols="60" rows="10" value="${Datos.direccion}" styleClass="validate[required]"></html:textarea></td></tr></p>

                                                </table>
                                                <center><html:submit styleClass="button"><bean:message key="V_modificar_perfil_TI.label0"/><%-- Actualizar perfil --%></html:submit></center>
                                            </html:form>

                                            <script>
                                                $(document).ready(function(){
                                                    $("#perfilTIForm").validationEngine('attach');
                                                });
                                            </script>
                                        </div>


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