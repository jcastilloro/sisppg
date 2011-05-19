<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=ISO-8859-1"
           %><html:html>
    <head>
        <title>Consultar Jurados</title>
        <html:base/>

        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>
        <script type="text/javascript" src="../sorttable.js"></script>
        <script language="javascript" src="list.js"></script> 

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
                    <li><cohesion:actor actors="2"><html:link action="/A_consultar_jurado.do"><bean:message key="V_consultar_jurados.label0"/><%-- A_consultar_jurado --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="2"><html:link action="/A_mostrar_jurado.do"><bean:message key="V_consultar_jurados.label1"/><%-- V_mostrar_jurado --%></html:link></cohesion:actor></li>

                </ul>
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
                                            action="/A_consultar_jurado.do" method="post">
                                            <table border="0">

                                                <tr>
                                                    <td>
                                                        Tipo de Proyecto
                                                    </td>
                                                    <td>
                                                        Periodo
                                                    </td>
                                                    <td>
                                                        Departamento
                                                    </td>
                                                    <td>
                                                        �rea
                                                    </td>
                                                </tr>

                                                <tr>
                                                    <td>
                                                        <html:select styleId="tipo" property="tipo" value="">

                                                    <option value="">Todos</option>
                                                    <option value="Pasantias">Pasant�as</option>
                                                    <option value="ProyectosDeGrado">Proyectos de Grado</option>

                                                </html:select>
                                                </td>
                                                <td>
                                                    <html:select styleId="1843493" property="periodo" value="">
                                                    <option value="">Todos</option>
                                                    <logic:iterate id="arrea" collection="${empty L_Trimestres ? _vacio : L_Trimestres}">
                                                        <option value="${arrea.idTrimestre}">${arrea.nombre}</option>
                                                    </logic:iterate>
                                                    <logic:iterate id="arrea" collection="${empty L_PeriodosPasantiaIntermedia ? _vacio : L_PeriodosPasantiaIntermedia}">
                                                        <option value="${arrea.idPeriodoPasantiaIntermedia}">${arrea.nombre}</option>
                                                    </logic:iterate>
                                                    <logic:iterate id="arrea" collection="${empty L_PeriodosPasantiaLarga ? _vacio : L_PeriodosPasantiaLarga}">
                                                        <option value="${arrea.idPeriodoPasantiaLarga}">${arrea.nombre}</option>
                                                    </logic:iterate>
                                                </html:select>
                                                </td>
                                                <td>
                                                    <html:select styleId="1843493" property="departamento" value="">
                                                    <option value="">Todos</option>
                                                    <logic:iterate id="arrea" collection="${empty L_Departamentos ? _vacio : L_Departamentos}">
                                                        <option value="${arrea.idDepartamento}">${arrea.nombre}</option>
                                                    </logic:iterate>
                                                </html:select>
                                                </td>
                                                <td>
                                                    <html:select styleId="1843493" property="area" value="">
                                                    <option value="">Todos</option>
                                                    <logic:iterate id="arrea" collection="${empty L_Areas ? _vacio : L_Areas}">
                                                        <option value="${arrea.idArea}">${arrea.nombre}</option>
                                                    </logic:iterate>
                                                </html:select>
                                                </td>
                                                </tr>

                                                <tr>
                                                    <td>
                                                        Nombre
                                                    </td>
                                                    <td>
                                                        Apellido
                                                    </td>
                                                    <td>
                                                        C�dula
                                                    </td>
                                                </tr>

                                                <tr>
                                                    <td>
                                                        <html:text styleId="1840413" property="nombre" size="30" value=""/>
                                                    </td>
                                                    <td>
                                                        <html:text styleId="1840413" property="apellido" size="30" value=""/>
                                                    </td>
                                                    <td>
                                                        <html:text styleId="1840413" property="cedula" size="30" value=""/>
                                                    </td>
                                                    <td>
                                                        <center>
                                                            <html:submit styleClass="button">Refinar<%-- Crear --%></html:submit>
                                                        </center>
                                                    </td>
                                                </tr>
                                            </table>
                                            <p>*Haga Click sobre una entrada para ver los detalles
                                            </html:form>
                                            <logic:notEmpty name="Datos">
                                            <div class="administrador">
                                                <table class="sortable">
                                                    <thead>
                                                        <tr>
                                                            <th width="200px"><center>Nombre</center></th>
                                                            <th width="200px"><center>Apellido</center></th>
                                                            <th width="200px"><center>Departamento</center></th>
                                                            <th width="150px"><center># Proyectos en Periodo</center></th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>


                                                        <logic:iterate id="dato" collection="${empty Datos ? _vacio : Datos}">

                                                            <bean:write name="dato" filter="false"/>


                                                        </logic:iterate>


                                                    </tbody>
                                                </table>
                                            </div>
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