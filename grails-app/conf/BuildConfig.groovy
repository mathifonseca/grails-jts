grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
		compile 'com.vividsolutions:jts:1.13'
	}

	plugins {
		build ':release:3.0.1', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}
