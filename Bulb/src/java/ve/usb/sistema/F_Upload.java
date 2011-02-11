/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ve.usb.sistema;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.*;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Gurren Lagann
 */
public class F_Upload extends org.apache.struts.action.ActionForm {

    private FormFile theFile;

  /**
   * @return Returns the theFile.
   */
  public FormFile getTheFile() {
    return theFile;
  }
  /**
   * @param theFile The FormFile to set.
   */
  public void setTheFile(FormFile theFile) {
    this.theFile = theFile;
  }

}
