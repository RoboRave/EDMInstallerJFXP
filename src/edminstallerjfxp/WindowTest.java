/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edminstallerjfxp;

import javafx.stage.Window;

/**
 *
 * @author Zach
 */
class WindowTest extends Window {

    public WindowTest() {
        this.setScene(EDMInstallerJFXP.Window);
        this.setWidth(100);
        this.setHeight(200);
        this.setOnCloseRequest(null);
    }
    
}
