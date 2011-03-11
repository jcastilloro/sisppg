package ve.usb.sistema;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import ve.usb.cohesion.runtime.CohesionAction;

/**
 *
 */
public class AccionesVistaCoordinadorCCTDS extends CohesionAction {

/**
     * Called by Struts for the execution of action A_VistaAdmin.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @return The Struts name of the following step.
     * @throws java.lang.Exception For untreated exceptions.
     * These exceptions will normally be treated with
     * the default exception action.
     */
    public ActionForward A_Pre_VistaCoordinadorCCTDS(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Salidas
        final String[] SALIDAS = {"V_VistaCoordinadorCCTDS", };
        int salida = 0;

        return mapping.findForward(SALIDAS[salida]);
    }

}