package com.example.AirlineManagement;

import java.text.SimpleDateFormat;
import java.util.Date;

enum AirLineName
{
    airIndia, airAsiaIndia, indigo, spiceJet, airIndiaExpress,goFirst,Vistara;
}
public class Airline {
	AirLineName airLineName;
	 int flightNo ;
	 String src;
	 String dest;
	 float price;
	 int numberOfSeat;
	
	public AirLineName getAirLineName() {
		return airLineName;
	}
	public void setAirLineName(AirLineName airLineName) {
		this.airLineName = airLineName;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNumberOfSeat() {
		return numberOfSeat;
	}
	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}
	
	

}
