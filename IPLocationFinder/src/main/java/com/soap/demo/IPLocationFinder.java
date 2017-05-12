package com.soap.demo;

import java.util.Scanner;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		System.out.println("Enter the IP Address : ");
		Scanner scanner = new Scanner(System.in);
		String ipAddress = scanner.next();
		try {
			System.out.println("Ip address : "+ ipAddress);
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIp.getCountryName());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			//System.out.println("Invalid IP Address!!");
		}

	}

}
