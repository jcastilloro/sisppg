<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 

%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 

%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 

%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"

%><%@ page contentType="text/html;charset=ISO-8859-1"

%><html:html>

    <head>

        <title><bean:message key="V_ConsultarPreinscripcion.title"/></title>

        <html:base/>

        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>

        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>

        <script type="text/javascript" src="../_tooltips/js/HelpBalloon.js"></script>



    </head>

    <body>

                 

            <div id="menu">

                <ul id="nav">
                    <li><html:link action="/A_Pre_ModificarPreinscripcion.do"><bean:message key="V_ConsultarPreinscripcion.label0"/><%-- Modificar Preinscripci&oacute;n --%></html:link></li>
                    <li><html:link action="/A_GenerarCartaPostulacion.do"><bean:message key="V_ConsultarPreinscripcion.label1"/><%-- Generar Planilla de Preinscripci&oacute;n --%></html:link></li>
                    <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_ConsultarPreinscripcion.label3"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>
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
                            
                            <h3 align="center">${empty msg ? "" : msg}</h3>
                            <br>
                           
                           <table border="0" align="center" width="400px">

                                <tr><th>EP</th><td><bean:write name="ep"/><br></td></tr>

                                <tr><th>Per&iacute;odo Pasant&iacute;a</th><td><bean:write name="periodopasantia"/><br></td></tr>

                                <tr><th>A&ntilde;o</th><td><bean:write name="ano"/><br></td></tr>

                                <tr><th>Carrera</th><td><bean:write name="carrera"/><br></td></tr>

                                <tr><th>C&eacute;dula</th><td><bean:write name="cedula"/><br></td></tr>

                                <tr><th>Correo</th><td><bean:write name="correo"/><br></td></tr>

                                 <tr><th>Indice </th><td><bean:write name="indice"/><br></td></tr>

                                 <tr><th>Direcci&oacute;n</th><td><bean:write name="direccion"/><br></td></tr>

                                <tr><th>Estado Civil</th><td><bean:write name="estadocivil"/><br></td></tr>

                                <tr><th>Sexo </th><td><bean:write name="sexo"/><br></td></tr>

                                <tr><th>Tel&eacute;fono Habitaci&oacute;n</th><td><bean:write name="telefhab"/><br></td></tr>

                                <tr><th>Otro Tel&eacute;fono</th><td><bean:write name="otrotelef"/><br></td></tr>

                                <tr><th>Fecha de Nacimiento </th><td><bean:write name="fechanacimiento"/><br></td></tr>

                                <tr><th>Nacionalidad</th><td><bean:write name="nacionalidad"/><br></td></tr>

                                <tr><th>Tr&aacute;mite CCTDS</th><td><bean:write name="tramite"/><br></td></tr>

                                <tr><th>Estado</th><td><bean:write name="estado"/><br></td></tr>

                                <tr><th>Regi&oacute;n</th><td><bean:write name="region"/><br></td></tr>

                                <tr><th>Ciudad</th><td><bean:write name="ciudad"/><br></td></tr>

                                <tr><th>Graduando</th><td><bean:write name="graduando"/><br></td></tr>                                

                            </table>

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