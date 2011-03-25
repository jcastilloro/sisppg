<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_gestionar_preinscripcion.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_gestionar_preinscripcion.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="4"><html:link action="/A_generar_preinscripcion_corta.do"><bean:message key="V_gestionar_preinscripcion.label0"/><%-- Pasantia Corta --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_generar_preinscripcion_intermedia.do"><bean:message key="V_gestionar_preinscripcion.label1"/><%-- Pasantia Intermedia --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_generar_preinscripcion_larga.do"><bean:message key="V_gestionar_preinscripcion.label2"/><%-- Pasantia Larga --%></html:link></cohesion:actor></li>

                </ul>
            </div>
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            ${empty msg ? "" : msg}<br><br>

                            <logic:empty name="L_preins">
                                <h1>Usted no tiene preinscripciones registradas</h1>
                            </logic:empty>
                            <logic:notEmpty name="L_preins">
                                <ul id="preinscripciones">
                                <logic:iterate id="p" name="L_preins">
                                    <li id="${p.por_graduar ? "preinsNo" : "preinsSi"}"><p>Preinscripcion de pasantia ${p.tipo==1 ? "Corta" : ""} ${p.tipo==2 ? "Intermedia" : ""} ${p.tipo==3 ? "Larga" : ""}  <small>${p.created_at}</small> <html:link href="#">carta postulacion</html:link></p></li>
                                </logic:iterate>
                                </ul>
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