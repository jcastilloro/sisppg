package ve.usb.sistema;

import org.apache.struts.upload.FormFile;


public class F_Delete extends org.apache.struts.action.ActionForm {

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