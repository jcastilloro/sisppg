<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_solicitar_prorroga_inscripcion.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840448 {width: 400px; margin: 40px auto; }
        form#1840448 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840448 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840448 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840448 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840448 p#1840450_C {clear: both; width: 400px; }
          form#1840448 p#1840450_C label {clear: both; width: 400px; }
          form#1840448 p#1840450_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_solicitar_prorroga_inscripcion.title"/></div>
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
                <div class="box1840448"><html:form
                  action="/A_solicitar_prorroga_inscripcion.do" method="post">
                  <p id="1840450_C"><label for="1840450"><bean:message key="F_Prorroga_Inscripcion.label0"/><%-- Justificacion: --%></label><html:textarea styleId="1840450" property="justificacion" cols="60" rows="10"></html:textarea></p>

                  <html:submit styleClass="button"><bean:message key="V_solicitar_prorroga_inscripcion.label0"/><%-- Solicitar Prorroga --%></html:submit>
                </html:form></div>

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