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
 * 2. 작성일 : 2017. 3. 27.
 * </pre>
 *
 * @author		: smkan
 * @version		: 1.0
 */
public class Car3 {
	public String company;
	public String model;
	public String color;
	public int maxSpeed;
	public int price;
	
	public Car3(String company,String model, String color, int maxSpeed, int price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed=maxSpeed;
		this.price=price;
	}
	public Car3(String company,String model, String color, int maxSpeed){
		this(company, model, color, maxSpeed, 0);
	}
	public Car3(String company,String model, String color){
		this(company,model,color,0);
	}

	
	public   String getCompany(){
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
