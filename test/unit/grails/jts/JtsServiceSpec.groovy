package grails.jts

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(JtsService)
class JtsServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test create point with no lat"() {
    	given:
    		Double lat = null
    		Double lng = -56.199747
		when:
			def point = service.createPoint(lat, lng)
		then:
			point == null
    }

    void "test create point with no lng"() {
    	given:
    		Double lat = -34.906485
    		Double lng = null
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