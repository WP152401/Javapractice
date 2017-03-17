/**
 * 
 */
package org.dimigo.basic;

import java.util.*;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author		: smkang
 * @version		: 1.0
 */
public class Loop {
	public static void main(String[] args) {
		int atk = 100;
		int choice;
		String character[]  = {"마법사", "영주", "기사", "농민"};
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("-------------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1.공격력 증가");
			System.out.println("2.공격력 감소");
			System.out.println("3.캐릭터 설정");
			System.out.println("9.종료");
			System.out.println("-------------");
			System.out.print("메뉴 입력 =>");
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1 : 
				atk += 10;
				System.out.printf("공격력이증가되었습니다.현재 공격력:%d\n", atk);	break;
			case 2 : 
				atk -= 10;
				System.out.printf("공격력이 감소되었습니다.현재 공격력:%d\n", atk); break;
			case 3 : 
				int num = new Random().nextInt(4);
				System.out.printf("%s(으)로 설정되었습니다.", character[num]);	 break;
			case 9 : 
				System.out.println("이제 공부하세요!");  break;
			default : 
				System.out.println("없는 메뉴입니다!!");
			}
		}
		while(choice != 9);
		scanner.close();
	}
}
