package grails.jts

import com.vividsolutions.jts.geom.Point
import com.vividsolutions.jts.geom.Coordinate
import com.vividsolutions.jts.geom.GeometryFactory

class JtsService {

	static transactional = false

    Point createPoint(Double lat, Double lng) {

    	def point

    	try {

    		if (!lat || !lng) {

    			log.error "Cannot create point with data provided -> lat: ${lat} - lng: ${lng}"

    		} else {

		    	def gf = new GeometryFactory()

		        def coord = new Coordinate(lat, lng)

		        point = gf.createPoint(coord)

		    }

	    } catch (Exception ex) {

	    	log.error "Could not create a point!", ex

	    }

    }

}