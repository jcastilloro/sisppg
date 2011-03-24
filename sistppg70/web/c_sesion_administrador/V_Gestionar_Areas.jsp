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
                            ${empty msg ? "" : msg}
                            <center><h1><bean:message key="V_Sesion_Administrador.title"/></h1></center>




                            <logic:notEmpty name="Datos">
                                <center>

                                    <h2>
                                        Areas
                                    </h2>

                                    <table border="0">

                                        <tr>
                                            <th width="250px">
                                                Nombre
                                            </th>
                                        </tr>
                                        <logic:iterate id="dato" collection="${empty Datos ? _vacio : Datos}">
                                            <tr>
                                                <td>
                                                    <html:link action="/A_Prep_Gestionar_Areas.do" paramName="dato" paramProperty="idArea"
                                                               paramId="idArea">${dato.nombre}</html:link>
                                                </td>
                                            </tr>
                                        </logic:iterate>
                                    </table>
                                </center>
                            </logic:notEmpty>

                            <p><p><p>

                                <logic:notEmpty name="Singular">
                                    <html:form
                                        action="/A_insertar_area.do" method="post">
                                    <table border="0">
                                        <tr><td><p id="1840413_C">Nombre</td><td><html:text styleId="1840413" property="area" size="30" value="${Singular.nombre}"/></td></tr></p>
                                        <html:hidden property="idArea" value="${Singular.idArea}"/>


                                        <tr><td><html:link action="/A_eliminar_area.do" onclick="return confirm('¿Esta seguro de que desea borrar el registro?')" >Eliminar</html:link></td><td><html:submit styleClass="button">Modificar<%-- Crear --%></html:submit><p>
                                            </td></tr>
                                    </table>
                                    <p><bean:message key="V_Obligatorios.msg0"/>
                                    </html:form>









                                </logic:notEmpty>


                                <logic:empty name="Agregar">
                                <bean:define id="Agregare" value="Agregare"/>
                                <table><th>
                                <html:link action="/A_Prep_Gestionar_Areas.do" paramName="Agregare"
                                                               paramId="Agregar">Agregar Area</html:link>
                                    </th></table>

                                </logic:empty>

                                <logic:notEmpty name="Agregar">

                                    <html:form
                                        action="/A_insertar_area.do" method="post">
                                    <table border="0">
                                        <tr><td><p id="1840413_C">Nombre</td><td><html:text styleId="1840413" property="area" size="30" value=""/></td></tr></p>
                                        <html:hidden property="idArea" value=""/>


                                        <tr><td></td><td><html:submit styleClass="button">Insertar<%-- Crear --%></html:submit><p>
                                            </td></tr>
                                    </table>
                                    <p><bean:message key="V_Obligatorios.msg0"/>
                                    </html:form>
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