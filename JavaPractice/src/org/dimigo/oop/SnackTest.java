/**
 * 
 */
package org.dimigo.opp;

/**
 * <pre>
 * org.dimigo.opp
 *   |_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author		: smkan
 * @version		: 1.0
 */
public class SnackTest {

	
	public static void main(String[] args) {
		int a,b,c;
		String[] Snack = {"새우깡","콘칲","허니버터칩"};
		Snack snack1 = new Snack();
		snack1.toString(Snack[0],snack1.getCompany(),snack1.getPrice(),snack1.getNumber());
		
		Snack snack2 = new Snack();
		snack2.setCompany("크라운");
		snack2.setPrice(1200);
		snack2.setNumber(1);
		snack2.toString(Snack[1],snack2.getCompany(),snack2.getPrice(),snack2.getNumber());

		Snack snack3 = new Snack();
		snack3.setCompany("해태");
		snack3.setPrice(1500);
		snack3.setNumber(4);
		snack3.toString(Snack[2],snack3.getCompany(),snack3.getPrice(),snack3.getNumber());
		a = snack1.getPrice()*snack1.getNumber();
		b = snack2.getPrice()*snack2.getNumber();
		c = snack3.getPrice()*snack3.getNumber();
		
		snack1.calcprice(a,b,c);
	}

}
