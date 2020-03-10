// creates variable to represent child objects 
def topLevel = getObjects{return it.getLevel()==2 && it.isAnnotation()}
// selects all child objects - does not select parent objects (LC polygon)
getCurrentHierarchy().getSelectionModel().setSelectedObjects(topLevel, null)