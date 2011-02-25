<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"

%><html:html>

    <head>
        <title><bean:message key="V_ConsultarDocumentos.title"/></title>
        <html:base/>
        <link rel="stylesheet" type="text/css" href="../css/style.css"></link>
        <script type="text/javascript" src="../_tooltips/js/prototype.js"></script>
    </head>

    <body>

            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_Pre_GestionarCulminacion.do"><bean:message key="V_ConsultarDocumentos.label0"/><%-- Regresar --%></html:link></li>
                    <li><html:link action="/A_Pre_CerrarSesion.do"><bean:message key="V_ConsultarDocumentos.label1"/><%-- Cerrar Sesi&oacute;n --%></html:link></li>
                </ul>
            </div>

           <div id="header">
           </div>

        <div id="body_wrapper">

            <div id="body">

                <div id="split">

                    <div class="top"></div>

                    <div id="left">

                        <div class="content">

                            ${empty msg ? "" : msg}

                            <br>

                            <br>

                            <table border="0" align="center" width="500px">

                                 <tr><th>Ultimo Archivo Subido</th><td><bean:write name="archivo"/></td></tr>
                                 <tr><th>Fecha de Subida</th><td><bean:write name="fecha"/></td></tr>
  
                                 <html:form action="/A_ConsultarDocumentos" method="post" enctype="multipart/form-data">
                                            <td align="center" colspan="2">
                                                 <br>
                                                <html:submit>Eliminar Documento</html:submit>
                                            </td>
                                 </html:form>

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