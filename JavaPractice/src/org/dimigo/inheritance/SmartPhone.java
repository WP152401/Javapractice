/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 *
 * @author		: smkan
 * @version		: 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	public SmartPhone(){
		
	}
	/**
	 * @param model
	 * @param company
	 * @param price
	 */
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnon(){
		System.out.println(model+"의 전원을 켭니다.");
	}
	public void turnoff(){
		System.out.println(model+"의 전원을 끕니다.");
	}
	public void pay(){
		System.out.println(company+" 페이로 결제합니다.");
	}
	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof IPhone){
			IPhone a=(IPhone) phone;
			((IPhone) phone).useAirDrop();
		} else if (phone instanceof Galaxy){
			Galaxy b = (Galaxy) phone;
			((Galaxy) phone).useWirelessCharging();
		}
	}
	
	public String toString() {
		return "모델명 : "+model+", 제조사 : "+company+"가격 : "+String.format("%,d", price);
	}
	
	
}
