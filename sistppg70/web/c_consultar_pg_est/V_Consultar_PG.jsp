<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
           %><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"
           %><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"
           %><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
           %><%@ page contentType="text/html;charset=ISO-8859-1"
           %><html:html>
    <head>
        <title><bean:message key="V_Consultar_PG.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_Consultar_PG.title"/></div>
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

                            <table border="0" width="500px">
                                <tr>
                                    <th width="200px">Nombre</th>
                                    <td>${Proyecto.nombre}</td>
                                </tr>
                                <tr>
                                    <th>Código</th>
                                    <td>${Proyecto.codigo}</td>
                                </tr>
                                <tr>
                                    <th>Recursos</th>
                                    <td>${Proyecto.recursos}</td>
                                </tr>
                                <tr>
                                    <th>Duración Recursos</th>
                                    <td>${Proyecto.duracion_recursos}</td>
                                </tr>
                                <tr>
                                    <th>Puntos de Interés</th>
                                    <td>${Proyecto.puntos_de_interes}</td>
                                </tr>
                                <tr>
                                    <th>Área</th>
                                    <td>${Area}</td>
                                </tr>
                            </table>
                            <p>
                            </p>
                            <table width="500px">
                                <tr><th>Tutor Académico</th></tr>
                            </table>
                            <table border="0" width="500px">
                                <tr>
                                    <th width="200px">Nombre</th>
                                    <td>${Tutor.nombre}</td>
                                </tr>
                                <tr>
                                    <th>Apellido</th>
                                    <td>${Tutor.apellido}</td>
                                </tr>
                                <tr>
                                    <th>Email</th>
                                    <td>${Tutor.email}</td>
                                </tr>
                            </table>
                            <p>
                            </p>
                            <logic:notEmpty name="Etapa1">
                                <table width="500px">
                                    <tr><th>Etapa1</th></tr>
                                </table>
                                <p>
                                </p>
                                </table>
                                <table border="0" width="500px">
                                    <tr>
                                        <th width="200px">Nombre</th>
                                        <td>${Etapa1.nombre}</td>
                                    </tr>
                                    <tr>
                                        <th>Resultados_Minimos</th>
                                        <td>${Etapa1.resultados_minimos}</td>
                                    </tr>
                                    <tr>
                                        <th>Trimestre</th>
                                        <td>${Trimestre1}</td>
                                    </tr>
                                    <tr>
                                        <th>Año</th>
                                        <td>${Etapa1.ano}</td>
                                    </tr>
                                    <tr>
                                        <th>Descripcion</th>
                                        <td>${Descripcion1}</td>
                                    </tr>
                                </table>
                            </logic:notEmpty>
                            <p>
                            </p>
                            <logic:notEmpty name="Etapa2">
                                <table width="500px">
                                    <tr><th>Etapa2</th></tr>
                                </table>
                                <p>
                                </p>
                                </table>
                                <table border="0" width="500px">
                                    <tr>
                                        <th width="200px">Nombre</th>
                                        <td>${Etapa2.nombre}</td>
                                    </tr>
                                    <tr>
                                        <th>Resultados_Minimos</th>
                                        <td>${Etapa2.resultados_minimos}</td>
                                    </tr>
                                    <tr>
                                        <th>Trimestre</th>
                                        <td>${Trimestre2}</td>
                                    </tr>
                                    <tr>
                                        <th>Año</th>
                                        <td>${Etapa2.ano}</td>
                                    </tr>
                                    <tr>
                                        <th>Descripcion</th>
                                        <td>${Descripcion2}</td>
                                    </tr>
                                </table>
                            </logic:notEmpty>
                            <p>
                            </p>

                            <logic:notEmpty name="Etapa3">
                                <table width="500px">
                                    <tr><th>Etapa3</th></tr>
                                </table>
                                <p>
                                </p>
                                </table>
                                <table border="0" width="500px">
                                    <tr>
                                        <th width="200px">Nombre</th>
                                        <td>${Etapa3.nombre}</td>
                                    </tr>
                                    <tr>
                                        <th>Resultados_Minimos</th>
                                        <td>${Etapa3.resultados_minimos}</td>
                                    </tr>
                                    <tr>
                                        <th>Trimestre</th>
                                        <td>${Trimestre3}</td>
                                    </tr>
                                    <tr>
                                        <th>Año</th>
                                        <td>${Etapa3.ano}</td>
                                    </tr>

                                </table>
                            </logic:notEmpty>
                            <p></p>
                            <logic:notEmpty name="JuradoProyecto">
                                <table width="500px">
                                    <tr><th>Jurados</th></tr>
                                </table>
                                <p>
                                </p>
                                </table>
                                <table border="0" width="500px">
                                    <logic:iterate id="jur" collection="${empty JuradoProyecto ? _vacio : JuradoProyecto}">
                                        <tr>
                                            <th width="200px">Nombre</th>
                                            <td>${jur.profesor.nombre}</td>
                                        </tr>
                                        <tr>
                                            <th>Apellido</th>
                                            <td>${jur.profesor.apellido}</td>
                                        </tr>
                                        <tr>
                                            <th>Email</th>
                                            <td>${jur.profesor.email}</td>
                                        </tr>
                                    </logic:iterate>>
                                </table>
                                <p></p>
                            </logic:notEmpty>

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