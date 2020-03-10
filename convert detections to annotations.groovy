//this script converts the (cell) detections to annotations which allows you to modify/edit the individual cells
import qupath.lib.objects.PathAnnotationObject

// Create new annotations with the same ROIs and classifications as the detections
def detections = getDetectionObjects()
def newAnnotations = detections.collect {detection -> new PathAnnotationObject(detection.getROI(), detection.getPathClass())}

// Remove the detections, add the annotations
removeObjects(detections, false)
addObjects(newAnnotations)
