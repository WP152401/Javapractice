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
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car();
		System.out.printf("제조사명 : %s\n",car.getCompany());
		System.out.printf("모델명 : %s\n",car.getModel());
		System.out.printf("색상 : %s\n",car.getColor());
		System.out.printf("최대속도 : %dkm\n",car.getmaxSpeed());
		System.out.printf("가격 : "+String.format("%,d원\n",car.getPrice()));
		
		Car car2 = new Car();
		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setSpeed(246);
		car2.setPrice(40000000);
		
		System.out.printf("\n제조사명 : %s\n",car2.getCompany());
		System.out.printf("모델명 : %s\n",car2.getModel());
		System.out.printf("색상 : %s\n",car2.getColor());
		System.out.printf("최대속도 : %dkm\n",car2.getmaxSpeed());
		System.out.printf("가격 : "+String.format("%,d원\n",car2.getPrice()));
	
		Car car3 = new Car();
		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setSpeed(200);
		car3.setPrice(38000000);
	
		System.out.printf("\n제조사명 : %s\n",car3.getCompany());
		System.out.printf("모델명 : %s\n",car3.getModel());
		System.out.printf("색상 : %s\n",car3.getColor());
		System.out.printf("최대속도 : %dkm\n",car3.getmaxSpeed());
		System.out.printf("가격 : "+String.format("%,d원\n",car3.getPrice()));
	}

}
