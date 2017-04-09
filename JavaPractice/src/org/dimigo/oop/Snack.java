/**
 * 
 */
package org.dimigo.opp;

/**
 * <pre>
 * org.dimigo.opp
 *   |_ Snack
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author		: smkan
 * @version		: 1.0
 */
public class Snack {
	private String model = "새우깡";
	private String company = "농심";
	private int price = 1100;
	private int number = 2;
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	public int calcprice(int a,int b,int c){
		System.out.println("총 구매 금액 : "+String.format("%,d",a+b+c)+"원");
		return  0;
	}
	public String toString(String snack, String company, int price, int number){
		System.out.println("이름 : "+snack);
		System.out.println("제조사 : "+company);
		System.out.println("가격 : "+String.format("%,d",price)+"원");
		System.out.println("개수 : "+number+"개");
		System.out.println();
		return null ;
		
	}

}
