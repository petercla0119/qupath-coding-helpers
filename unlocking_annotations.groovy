// This script unlocks all annotations in the image
getAnnotationObjects().each {
   it.setLocked(false)
}
fireHierarchyUpdate()

// Uncomment to unlock selected annotations & comment lines above. This script unlocks selected annotations in the image. 
//getSelectedObjects().each {
//   it.setLocked(false)
//}
//fireHierarchyUpdate()
