// Author: Claire S. Peterson
// Date: 08/08/2019
	// Successfully runs in QuPath v0.2.0-m2
	
	/* Description: This script creates a new button in the toolbar and prints specified string in log.
	 * Note: Users do not need to modify script.
	*/

guiscript=true

//import javafx.application.Platform
import javafx.scene.control.Button
import javafx.scene.control.Tooltip
import qupath.lib.gui.QuPathGUI
def qupath = QuPathGUI.getInstance()

def button = new Button('CT')
button.setPrefSize(40, QuPathGUI.iconSize)
button.setTooltip(new Tooltip("Cursor Tracker"));
button.setOnAction {
   print("Test Print # 2: Button Clicked")
}

qupath.addToolbarButton(button);
print("Test Print # 1")