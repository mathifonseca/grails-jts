Grails Plugin for JTS integration
==========

This plugin provides topology operations support for Grails application provided by JTS, an API of 2D spatial predicates and functions developed by Vivid Solutions, Inc.

With this plugin you can create Points, Triangles, Polygons and almost any Geometry you need for your application.

Also, you can perform spacial analysis operations like union, intersection or difference.

The most common use case is defining a Polygon representing an area of the map and then checking if some Point is within or without that area by providing its coordinates.

Please check the JTS JavaDoc [here](http://www.vividsolutions.com/jts/javadoc/index.html)

As a start, I've created a `Service` with a single method for creating Points from a pair of coordinates. You should use it like this:

```groovy
class YourService {

	def jtsService

	def yourMethod() {

		// code before getting the Point

		Double latitude = -34.906485
    	Double longitude = -56.199747

    	Point p = jtsService.createPoint(latitude, longitude)

		// code after getting the Point

	}

}
```

I will be adding more functionality as soon as possible.

In case you have any suggestions or doubts, please contact me: <mathifonseca@gmail.com>