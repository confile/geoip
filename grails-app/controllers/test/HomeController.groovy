package test

import org.grails.geoip.service.GeoIpService

class HomeController {

	GeoIpService geoIpService
	
    def index() { 
		def location = geoIpService.getLocation("85.176.52.75")
		
	}
	
}
