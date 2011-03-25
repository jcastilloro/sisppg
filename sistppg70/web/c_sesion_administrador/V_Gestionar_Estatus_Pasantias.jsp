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
                                        Estatus_Pasantias
                                    </h2>

                                    <table border="0">

                                        <tr>
                                            <th width="250px">
                                                Estatus
                                            </th>
                                        </tr>
                                        <logic:iterate id="dato" collection="${empty Datos ? _vacio : Datos}">
                                            <tr>
                                                <td>
                                                    <html:link action="/A_Prep_Gestionar_Estatus_Pasantias.do" paramName="dato" paramProperty="idEstatusPasantia"
                                                               paramId="idEstatus_Pasantia">${dato.estatus}</html:link>
                                                </td>
                                            </tr>
                                        </logic:iterate>
                                    </table>
                                </center>
                            </logic:notEmpty>

                            <p><p><p>

                                <logic:notEmpty name="Singular">
                                    <html:form
                                        action="/A_insertar_estatus_pasantia.do" method="post">
                                    <table border="0">
                                        <tr><td>estatus</td><td><html:text styleId="1840413" property="estatus" size="30" value="${Singular.estatus}"/></td></tr></p>
                                        <html:hidden property="idEstatusPasantia" value="${Singular.idEstatusPasantia}"/>


                                        <tr><td><html:link action="/A_eliminar_estatus_pasantia.do" onclick="return confirm('¿Esta seguro de que desea borrar el registro?')" >Eliminar</html:link></td><td><html:submit styleClass="button">Modificar<%-- Crear --%></html:submit><p>
                                            </td></tr>
                                    </table>
                                    <p><bean:message key="V_Obligatorios.msg0"/>
                                    </html:form>









                                </logic:notEmpty>


                                <logic:empty name="Agregar">
                                <bean:define id="Agregare" value="Agregare"/>
                                <table><th>
                                <html:link action="/A_Prep_Gestionar_Estatus_Pasantias.do" paramName="Agregare"
                                                               paramId="Agregar">Agregar Estatus_Pasantia</html:link>
                                    </th></table>

                                </logic:empty>

                                <logic:notEmpty name="Agregar">

                                    <html:form
                                        action="/A_insertar_estatus_pasantia.do" method="post">
                                    <table border="0">
                                        <tr><td>estatus</td><td><html:text styleId="1840413" property="estatus" size="30" value=""/></td></tr></p>
                                        <html:hidden property="idEstatusPasantia" value=""/>


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