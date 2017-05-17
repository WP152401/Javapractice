/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 *
 * @author		: smkan
 * @version		: 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone [] a = {
				new IPhone("iPhone 7","애플",900000 ),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		for (SmartPhone b : a){
			System.out.println(b);
			b.turnOn();
			b.pay();
			b.useSpecialFunction();
			b.turnOff();
			System.out.println();
		}
		
	}
}
