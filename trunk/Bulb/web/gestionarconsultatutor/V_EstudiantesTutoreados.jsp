<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"

%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"

%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"

%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"

%><%@ page contentType="text/html;charset=ISO-8859-1"

%><html:html>

    <head>

        <title>Estudiantes Tutoreados</title>

        <html:base/>

        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>

        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>

        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>



    </head>

    <body>



            <div id="menu">

                <ul id="nav">

                    <li><html:link action="/A_GestionarConsultaTutor.do"><bean:message key="V_ConsultarPreinscripcion.label2"/><%-- Regresar --%></html:link></li>

                </ul>

            </div>

        <div id="header">



	</div>

	<!-- end #header -->

        <div id="body_wrapper">

            <div id="body">

                <div id="split">

                    <div class="top"></div>

                    <div id="left">

                        <div class="content">
                            <br>
                            <table border="1" align="center" width="400px">

                                <tr>
                                    <th>Estudiantes PG</th>
                                </tr>
                                <logic:empty name="EstPG">
                                    <span style="font-weight: bold;">El usuario no tiene Estudiantes realizando Proyecto de Grado.</span>
                                </logic:empty>
                                <logic:notEmpty name="EstPG">
                                    <logic:iterate id="e" name="EstPG">
                                        <tr>
                                            <td><html:link action="/A_Pre_ConsultarPPGTutor"><bean:write name="e"/></html:link></td>
                                        </tr>
                                    </logic:iterate>
                                </logic:notEmpty>

                            </table>
                            <br>
                            <br>
                            <table border="1" align="center" width="400px">

                                <tr>
                                    <th>Estudiantes Pasantia</th>
                                </tr>
                                <logic:empty name="EstPasantia">
                                    <span style="font-weight: bold;">El usuario no tiene Estudiantes realizando Pasantias.</span>
                                </logic:empty>
                                <logic:notEmpty name="EstPasantia">
                                    <logic:iterate id="e" name="EstPasantia">
                                        <tr>
                                            <td><html:link action="/A_Pre_ConsultarPPGTutor"><bean:write name="e"/></html:link></td>
                                        </tr>
                                    </logic:iterate>
                                </logic:notEmpty>

                            </table>
                            <br>


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

        <div id="footer"> <bean:message key="bottom.label"/> </div>



    </body>

</html:html>