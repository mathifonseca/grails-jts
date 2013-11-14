package grails.jts

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(JtsService)
class JtsServiceSpec extends Specification {

    void "test create point with no lat"() {
    	given:
    		Double lat
    		Double lng = -56.199747
		when:
			def point = service.createPoint(lat, lng)
		then:
			point == null
    }

    void "test create point with no lng"() {
    	given:
    		Double lat = -34.906485
    		Double lng
		when:
			def point = service.createPoint(lat, lng)
		then:
			point == null
    }

    void "test create point with lat and lng"() {
    	given:
    		Double lat = -34.906485
    		Double lng = -56.199747
		when:
			def point = service.createPoint(lat, lng)
		then:
			point != null
    }

}
