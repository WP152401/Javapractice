/**
 * 
 */
package irg.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * irg.dimigo.collection
 *   |_ MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 *
 * @author		: smkan
 * @version		: 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>( );
		List<Music> list = new ArrayList<Music>(); //발라드
		List<Music> list2 = new ArrayList<Music>(); // 댄스
		System.out.println("--<< 멜론 장르별 챠트 >> --");
		list.add(new Music("팔레트","아이유"));
		map.put("발라드", list);
		list2.add(new Music("I LUV IT","PSY"));
		list2.add(new Music("맞지?","언니쓰)"));
		map.put("댄스", list2);
		printMap(map);
		System.out.println();
		System.out.println("--<< 댄스 2위 곡 변경>>--");
		map.get("댄스").set(1,new Music("SIGNAL","트와이스"));
		printMap(map);
		System.out.println();
		System.out.println("--<<댄스 1위 곡 삭제>>--");
		map.get("댄스").remove(0);
		printMap(map);
		System.out.println();
		System.out.println("--<<전체 리스트 삭제>>--");
		map.clear();
		printMap(map);
	}
	public static void printMap(Map<String, List<Music>> map ){
		for(String key : map.keySet()){
			int i =1;
			System.out.printf("[%s]%n", key);
			for(Music a : map.get(key) ){
				System.out.printf(i+". ");
				System.out.println(a);
				i ++;
			}
		}
	}
}
