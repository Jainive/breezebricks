package org.transport;
import org.air.*;
import org.road.*;
import org.water.Water;

public class Transport {
public void transportform() {
	System.out.println("Transport Form ");	
	System.out.println("Available mode");
	}

public static void main(String[] args) {
	Air air=new Air();
	Road road=new Road();
	Water water=new Water();
	Transport ts=new Transport();
	ts.transportform();
	road.bike();
	road.bus();
	road.car();
	road.cycle();
	air.aeroPlane();
	air.heliCopter();
	water.boat();
	water.ship();
}
}
