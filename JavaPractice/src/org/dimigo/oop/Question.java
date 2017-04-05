/**
 * 
 */
package org.dimigo.opp;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.opp
 *   |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author		: smkang
 * @version		: 1.0
 */
public class Question {

	public static void main(String[] args) {
		String[] question2 = {"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?","3. 가장 좋아하는 과목은?"};
		String[] answers2 = {"KK","공유","과학"};
		Scanner scanner = new Scanner(System.in);
		for(int i =0 ;i<3;i++){
		System.out.println(question2[i]);
		String answer = scanner.nextLine();
		if (answer.equals(answers2[i])){
			System.out.println("정답입니다!");
		}else{
			System.out.println("틀렸습니다!");
			}
		}
		System.out.println("<< 결과 출력 >>");
		StringBuilder sb1 = new StringBuilder("가장 좋아하는 가수는? KK입니다");
		StringBuilder sb2= new StringBuilder("가장 좋아하는 배우는? 공유입니다");
		StringBuilder sb3= new StringBuilder("가장 좋아하는 과목는? 과학입니다");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);

	}
}
