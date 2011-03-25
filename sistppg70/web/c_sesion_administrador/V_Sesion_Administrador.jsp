<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=ISO-8859-1"
           %><html:html>
    <head>
        <title><bean:message key="V_Sesion_Administrador.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_Sesion_Administrador.title"/></div>
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
                           <%-- ${empty msg ? "" : msg}   --%>
                            <center><h1>Selecciona una Categoría</h1></center>
                            <center>
                                <table borde="0">
                                    <tr>
                                        <th>
                                            <html:link action="/A_Prep_Gestionar_Carreras.do">Carreras</html:link>
                                        </th>
                                        <th>
                                            <html:link action="/A_Prep_Gestionar_Areas.do">Areas</html:link>
                                        </th>
                                        <th>
                                            Departamentos
                                        </th>
                                    </tr>
                                    <tr><p></p></tr>
                                    <tr>
                                        <th>
                                            <html:link action="/A_Prep_Gestionar_Estatus_Pasantias.do">Estatus de Pasantías</html:link>
                                        </th>
                                        <th>
                                            <html:link action="/A_Prep_Gestionar_Periodo_Pasantia_Intermedias.do">Periodos de Pasantia Intermedia</html:link>
                                        </th>
                                        <th>
                                            <html:link action="/A_Prep_Gestionar_Periodo_Pasantia_Largas.do">Periodos de Pasantia Larga</html:link>
                                        </th>
                                    </tr>
                                    <tr><p></p></tr>
                                    <tr>
                                        <th>
                                            <html:link action="/A_Prep_Gestionar_Trimestres.do">Trimestres</html:link>
                                        </th>
                                        <th>
                                            Ciudad
                                        </th>
                                        <th>
                                            País
                                        </th>
                                    </tr>
                                    <tr><p></p></tr>
                                    <tr>
                                        <th>
                                            <html:link action="/A_Prep_Gestionar_Estatus_Prorrogas.do">Estatus de Prorrogas</html:link>
                                        </th>
                                        <th>

                                        </th>
                                        <th>
                                            
                                        </th>
                                    </tr>
                                </table>
                            </center>
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