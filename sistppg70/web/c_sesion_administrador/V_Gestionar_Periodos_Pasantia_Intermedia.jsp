<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=ISO-8859-1"
           %><html:html>
    <head>
        <title><bean:message key="V_Inicio_Sesion.title"/></title>


        <html:base/>

        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>

        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>

        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>

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

                            ${empty msg ? "" : msg}
                            <center><h1><bean:message key="V_Sesion_Administrador.title"/></h1></center>




                            <logic:notEmpty name="Datos">
                                <center>

                                    <h2>
                                        Periodos de Pasantias Intermedias
                                    </h2><hr>

                                    <table border="0">

                                        <tr>
                                            <th width="250px">
                                                Nombre
                                            </th>
                                        </tr>
                                        </table><hr>
                                        <logic:iterate id="dato" collection="${empty Datos ? _vacio : Datos}">
                                    <table border "0">
                                            <tr>
                                                <td>
                                                    <html:link action="/A_Prep_Gestionar_Periodo_Pasantia_Intermedias.do" paramName="dato" paramProperty="idPeriodoPasantiaIntermedia"
                                                               paramId="idPeriodoPasantiaIntermedia">${dato.nombre}</html:link>
                                                </td>
                                            </tr>
                                            </table><hr>
                                        </logic:iterate>
                                    
                                </center>
                            </logic:notEmpty>

                            <p><p><p>

                                <logic:notEmpty name="Singular">
                                    <html:form
                                        action="/A_insertar_periodo_pasantia_intermedia.do" method="post">
                                    <table border="0">
                                        <tr><td><p id="1840413_C">Nombre</td><td><html:text styleId="1840413" property="periodoPasantiaIntermedia" size="30" value="${Singular.nombre}"/></td></tr></p>
                                        <html:hidden property="idPeriodoPasantiaIntermedia" value="${Singular.idPeriodoPasantiaIntermedia}"/>


                                        <tr><td><html:link action="/A_eliminar_periodo_pasantia_intermedia.do" onclick="return confirm('�Esta seguro de que desea borrar el registro?')" >Eliminar</html:link></td><td><html:submit styleClass="button">Modificar<%-- Crear --%></html:submit><p>
                                            </td></tr>
                                    </table>
                                    <p><bean:message key="V_Obligatorios.msg0"/>
                                    </html:form>









                                </logic:notEmpty>


                                <logic:empty name="Agregar">
                                <bean:define id="Agregare" value="Agregare"/>
                                <table><th>
                                <html:link action="/A_Prep_Gestionar_Periodo_Pasantia_Intermedias.do" paramName="Agregare"
                                                               paramId="Agregar">Agregar PeriodoPasantiaIntermedia</html:link>
                                    </th></table>

                                </logic:empty>

                                <logic:notEmpty name="Agregar">

                                    <html:form
                                        action="/A_insertar_periodo_pasantia_intermedia.do" method="post">
                                    <table border="0">
                                        <tr><td><p id="1840413_C">Nombre</td><td><html:text styleId="1840413" property="periodoPasantiaIntermedia" size="30" value=""/></td></tr></p>
                                        <html:hidden property="idPeriodoPasantiaIntermedia" value=""/>


                                        <tr><td></td><td><html:submit styleClass="button">Insertar<%-- Crear --%></html:submit><p>
                                            </td></tr>
                                    </table>
                                    <p><bean:message key="V_Obligatorios.msg0"/>
                                    </html:form>
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