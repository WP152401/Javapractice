/**
 * 
 */
package org.dimigo.opp;

/**
 * <pre>
 * org.dimigo.opp
 *   |_ PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author		: smkan
 * @version		: 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember[] member ={
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생")
		};
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney( member[0], 10000);
		PiggyBank.putMoney( member[1], 5000);
		PiggyBank.putMoney( member[2], 2000);
		PiggyBank.putMoney( member[3], 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney( member[2], 1000);
		PiggyBank.printBalance();
	}

}
