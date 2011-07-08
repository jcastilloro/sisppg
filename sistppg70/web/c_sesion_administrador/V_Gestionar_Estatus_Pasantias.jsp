<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=UTF-8"
           %><html:html>
    <head>
        <title>Gestionar Estatus de Pasantías</title>


        <html:base/>

        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <link rel="stylesheet" href="../_css/validationEngine.jquery.css" type="text/css"/>
        <link type="text/css" href="../_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <script type="text/javascript" src="../_js/jquery-1.4.4.min.js"></script>
        <script type="text/javascript" src="../_js/jquery-ui-1.8.10.custom.min.js"></script>
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
                                    <center>${empty msg ? "" : msg}</center>
                                    <div class="box1465928" align="center">



                                        <logic:notEmpty name="Datos">
                                            <div class="administrador">
                                                <center>

                                                    <h2>
                                                        Estatus de Pasantias
                                                    </h2><hr>

                                                    <table class="sortable" width="400px">
                                                        <thead>
                                                            <tr>
                                                                <th width="250px">
                                                                    <center>
                                                                        Estatus
                                                                    </center>
                                                                </th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            <logic:iterate id="dato" collection="${empty Datos ? _vacio : Datos}">
                                                                <tr onclick="location.href='/sistppg70/A_Prep_Gestionar_Estatus_Pasantias.do?idEstatus_Pasantia=${dato.idEstatusPasantia}'" onmouseover="this.style.cursor='pointer'">
                                                                    <td>
                                                                        <center>
                                                                            ${dato.estatus}
                                                                        </center>
                                                                    </td>
                                                                </tr>
                                                            </logic:iterate>
                                                        </tbody>
                                                    </table>
                                                </center>
                                            </div>
                                        </logic:notEmpty>

                                        <p><p><p>

                                            <logic:notEmpty name="Singular">
                                                <hr>
                                                <html:form styleId="AdmForm"
                                                    action="/A_insertar_estatus_pasantia.do" method="post" acceptCharset="utf-8">
                                                <table border="0">
                                                    <tr><td>estatus</td><td><html:text styleId="1840413" property="estatus" size="30" value="${Singular.estatus}" styleClass="validate[required,custom[onlyLetterSp]]"/></td></tr></p>
                                                    <html:hidden property="idEstatusPasantia" value="${Singular.idEstatusPasantia}"/>


                                                    <tr><td><html:link action="/A_eliminar_estatus_pasantia.do" onclick="return confirm('¿Esta seguro de que desea borrar el registro?')" >Eliminar</html:link></td><td><html:submit styleClass="button">Modificar<%-- Crear --%></html:submit><p>
                                                        </td></tr>
                                                </table>
                                                <p><bean:message key="V_Obligatorios.msg0"/>
                                                </html:form>
                                                    <script>
                                                    $(document).ready(function(){
                                                        $("#AdmForm").validationEngine('attach');
                                                    });
                                                </script>









                                            </logic:notEmpty>


                                            <logic:empty name="Agregar">
                                                <bean:define id="Agregare" value="Agregare"/>
                                            <table><th>
                                                    <html:link action="/A_Prep_Gestionar_Estatus_Pasantias.do" paramName="Agregare"
                                                               paramId="Agregar">Agregar Estatus_Pasantia</html:link>
                                                </th></table>

                                        </logic:empty>

                                        <logic:notEmpty name="Agregar">
                                        <hr>
                                            <html:form styleId="AdmForm"
                                                action="/A_insertar_estatus_pasantia.do" method="post" acceptCharset="utf-8">
                                                <table border="0">
                                                    <tr><td>estatus</td><td><html:text styleId="1840413" property="estatus" size="30" value="" styleClass="validate[required,custom[onlyLetterSp]]"/></td></tr></p>
                                                    <html:hidden property="idEstatusPasantia" value=""/>


                                                    <tr><td></td><td><html:submit styleClass="button">Insertar<%-- Crear --%></html:submit><p>
                                                        </td></tr>
                                                </table>
                                                <p><bean:message key="V_Obligatorios.msg0"/>
                                                </html:form>
                                                    <script>
                                                    $(document).ready(function(){
                                                        $("#AdmForm").validationEngine('attach');
                                                    });
                                                </script>
                                            </logic:notEmpty>



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
