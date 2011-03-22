<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_Retirar_Pasantia.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1840512 {width: 400px; margin: 40px auto; }
        form#1840512 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1840512 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1840512 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1840512 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1840512 p#1840514_C {clear: both; width: 400px; }
          form#1840512 p#1840514_C label {clear: both; width: 400px; }
          form#1840512 p#1840514_C input {clear: both; width: 396px; }
          form#1840512 p#1840517_C {clear: both; width: 400px; }
          form#1840512 p#1840517_C label {clear: both; width: 400px; }
          form#1840512 p#1840517_C input {clear: both; width: 396px; }
          form#1840512 p#1840521_C {clear: both; width: 400px; }
          form#1840512 p#1840521_C label {clear: both; width: 400px; }
          form#1840512 p#1840521_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_Retirar_Pasantia.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="4"><html:link action="/A_prep_Consultar_Pasantia.do"><bean:message key="V_Retirar_Pasantia.label1"/><%-- Atras --%></html:link></cohesion:actor></li>

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
                <div class="box1840512"><html:form
                  action="/A_Retirar_Pasantia.do" method="post" enctype="multipart/form-data">
                  <p id="1840514_C"><label for="1840514"><bean:message key="F_Retiro_Pasantia.label0"/><%-- Carta Tutor Academico: --%></label><html:file styleId="1840514" property="carta_retiro_tutor_academico" size="30"/></p>
                  <p id="1840517_C"><label for="1840517"><bean:message key="F_Retiro_Pasantia.label1"/><%-- Carta Tutor Industrial: --%></label><html:file styleId="1840517" property="carta_retiro_tutor_industrial" size="30"/></p>
                  <p id="1840521_C"><label for="1840521"><bean:message key="F_Retiro_Pasantia.label2"/><%-- Carta Retiro Estudiante: --%></label><html:file styleId="1840521" property="carta_retiro_estudiante" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_Retirar_Pasantia.label0"/><%-- RetirarPasantia --%></html:submit>
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