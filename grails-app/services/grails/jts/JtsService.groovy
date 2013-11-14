package grails.jts

import com.vividsolutions.jts.geom.Coordinate
import com.vividsolutions.jts.geom.GeometryFactory
import com.vividsolutions.jts.geom.Point

class JtsService {

	static transactional = false

	Point createPoint(Double lat, Double lng) {

		if (!lat || !lng) {
			log.error "Cannot create point with data provided -> lat: ${lat} - lng: ${lng}"
			return null
		}

		try {
			def gf = new GeometryFactory()

			def coord = new Coordinate(lat, lng)

			return gf.createPoint(coord)

		} catch (Exception ex) {

			log.error "Could not create a point!", ex

		}
	}
}
