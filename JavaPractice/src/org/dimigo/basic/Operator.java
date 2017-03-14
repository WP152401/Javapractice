/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_TypeCasting
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author				:  Weed
 * @version				:  1.0
 */
public class Operator {
	public static void main(String[] args) {
		 int pay = 17000;
		 int people = 3;
		 int shop = 1500;
		int pay2 = pay * 12 *people * shop;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", pay)+"원");
		System.out.println("점포 내 직원 수 : "+people+"명");
		System.out.println("점포수 : "+ String.format("%,d", shop)+"개\n");
		System.out.printf("\n");
		System.out.println("연간 인건비 : "+String.format("%,d", pay2)+"원");
	}
}
