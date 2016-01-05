package com.location.ip;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {
    public static void main(String[] args) {
        if (args.length == 1) {
            String ipAddress = args[0];
            GeoIPService ipService = new GeoIPService();
            GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
            GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
            System.out.println(geoIP.getCountryName() + " " + geoIP.getCountryCode());
        } else {
            System.out.println("err. enter just one ip address");
        }
    }
}
