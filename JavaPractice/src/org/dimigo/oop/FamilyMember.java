/**
 * 
 */
package org.dimigo.opp;

/**
 * <pre>
 * org.dimigo.opp
 *   |_ FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author		: smkan
 * @version		: 1.0
 */
public class FamilyMember {
	private static int memberCnt = 4;
	private String memberName;
	
	public FamilyMember(String memberName){
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}

	public static void printMemberCnt(){
		System.out.println("가족 총 인원 수 : "+memberCnt+"명");
	}
	
}
