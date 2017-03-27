/**
 * 
 */
package org.dimigo.opp;

/**
 * <pre>
 * org.dimigo.opp
 *   |_ carTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author		: smkan
 * @version		: 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void allPrint(Car3 car){

		System.out.printf("제조사명 : %s\n",car.getCompany());
		System.out.printf("모델명 : %s\n",car.getModel());
		System.out.printf("색상 : %s\n",car.getColor());
		System.out.printf("최대속도 : %dkm\n",car.getmaxSpeed());
		System.out.printf("가격 : "+String.format("%,d원\n",car.getPrice()));
		System.out.println();
	}
	public static void main(String[] args) {
		
		Car3 car = new Car3("현대자동차","제네시스","검정색",225,50000000);
		System.out.println("<<자동차 목록>>");
		allPrint(car);
		
		Car3 car2 = new Car3("기아자동차","K7","흰색",246,0);
		allPrint(car2);
		
		Car3 car3 = new Car3("삼성자동차","SM7","회색",0,0);
		allPrint(car3);
	}

}
