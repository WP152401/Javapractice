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
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car2 car = new Car2("현대자동차","제네시스","검정색",225,50000000);
		System.out.println("<<자동차 목록>>");
		System.out.printf("제조사명 : %s\n",car.getCompany());
		System.out.printf("모델명 : %s\n",car.getModel());
		System.out.printf("색상 : %s\n",car.getColor());
		System.out.printf("최대속도 : %dkm\n",car.getmaxSpeed());
		System.out.printf("가격 : "+String.format("%,d원\n",car.getPrice()));
		System.out.println();
		Car2 car2 = new Car2("기아자동차","K7","흰색",246,40000000);
		System.out.printf("제조사명 : %s\n",car2.getCompany());
		System.out.printf("모델명 : %s\n",car2.getModel());
		System.out.printf("색상 : %s\n",car2.getColor());
		System.out.printf("최대속도 : %dkm\n",car2.getmaxSpeed());
		System.out.printf("가격 : "+String.format("%,d원\n",car2.getPrice()));
		System.out.println();
		Car2 car3 = new Car2("삼성자동차","SM7","회색",200,38000000);
		System.out.printf("제조사명 : %s\n",car3.getCompany());
		System.out.printf("모델명 : %s\n",car3.getModel());
		System.out.printf("색상 : %s\n",car3.getColor());
		System.out.printf("최대속도 : %dkm\n",car3.getmaxSpeed());
		System.out.printf("가격 : "+String.format("%,d원\n",car3.getPrice()));
		
	}

}
