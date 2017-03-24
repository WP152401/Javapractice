/**
 * 
 */
package org.dimigo.opp;

/**
 * <pre>
 * org.dimigo.opp
 *   |_ car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author		: smkan
 * @version		: 1.0
 */
public class Car {
	private String company = "현대자동차";
	private String model= "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price= 50000000;
	
	public  String getCompany(){
		return company;
	}
	public  String getModel(){
		return model;
	}
	public  String getColor(){
		return color;
	}
	public  int getmaxSpeed(){
		return maxSpeed;
	}
	public  int getPrice(){
		return price;
	}
	
	public void setCompany(String newCompany){
		company = newCompany;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	public void setColor(String newColor){
		color = newColor;
	}
	public void setSpeed(int newMaxSpeed){
		maxSpeed= newMaxSpeed;
	}
	public void setPrice(int newPrice){
		price= newPrice;
	}
}
