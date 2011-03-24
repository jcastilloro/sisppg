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
                                        Carreras
                                    </h2>

                                    <table border="0">

                                        <tr>
                                            <th width="250px">
                                                Nombre
                                            </th>
                                            <th width="250px">
                                                Email
                                            </th>
                                        </tr>
                                        <logic:iterate id="dato" collection="${empty Datos ? _vacio : Datos}">
                                            <tr>
                                                <td>
                                                    <html:link action="/A_Prep_Gestionar_Carreras.do" paramName="dato" paramProperty="idCarrera"
                                                               paramId="idCarrera">${dato.nombre}</html:link>
                                                </td>
                                                <td>
                                                    <html:link action="/A_Prep_Gestionar_Carreras.do" paramName="dato" paramProperty="idCarrera"
                                                               paramId="idCarrera">${dato.email}</html:link>
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
                                        <tr><td><p id="1840413_C">Nombre</td><td><html:text styleId="1840413" property="nombre" size="30" value="${Singular.nombre}"/></td></tr></p>
                                        <tr><td><p id="1840416_C">Email</td><td><html:text styleId="1840416" property="email" size="30" value="${Singular.email}"/></td></tr>
                                        <html:hidden property="idCarrera" value="${Singular.idCarrera}"/>


                                        <tr><td><html:link action="/A_eliminar_area.do" >Eliminar</html:link></td><td><html:submit styleClass="button">Modificar<%-- Crear --%></html:submit><p>
                                            </td></tr>
                                    </table>
                                    <p><bean:message key="V_Obligatorios.msg0"/>
                                    </html:form>









                                </logic:notEmpty>


                                <logic:empty name="Agregar">
                                <bean:define id="Agregare" value="Agregare"/>
                                <table><th>
                                <html:link action="/A_Prep_Gestionar_Carreras.do" paramName="Agregare"
                                                               paramId="Agregar">Agregar Carrera</html:link>
                                    </th></table>

                                </logic:empty>

                                <logic:notEmpty name="Agregar">

                                    <html:form
                                        action="/A_insertar_area.do" method="post">
                                    <table border="0">
                                        <tr><td><p id="1840413_C">Nombre</td><td><html:text styleId="1840413" property="nombre" size="30" value=""/></td></tr></p>
                                        <tr><td><p id="1840416_C">Email</td><td><html:text styleId="1840416" property="email" size="30" value=""/></td></tr>
                                        <html:hidden property="idCarrera" value=""/>


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