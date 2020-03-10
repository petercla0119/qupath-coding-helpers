////// SELECTS TOP LEVEL OBJECT
import qupath.lib.roi.*
import qupath.lib.objects.*

parent = selectObjects {
   //Some criteria here
   return it.getLevel()==1 && it.isAnnotation()
}

/////// 
///////
///////
//THIS DOES NOT RUN WITH LINES ABOVE. 
//SELECTS CHILDOBJECTS IF PARENT OBJECT IS CLICKED ON
hierarchy = getCurrentHierarchy()
// It is simply a matter of calling 'getChildObjects() from the currently selected one
annotations = getSelectedObject().getChildObjects()
// The line below makes the selection become active in the QuPath GUI
hierarchy.getSelectionModel().selectObjects(annotations)