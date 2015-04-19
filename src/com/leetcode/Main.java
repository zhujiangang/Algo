package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static boolean check(Map<String,Integer> map,List<Integer> list){
		Set<Integer> set = new HashSet<Integer>();
		Integer cr = map.get("R");
		Integer cy = map.get("Y");
		Integer cb = map.get("B");
		boolean bry = false;
		boolean brb = false;
		boolean byb = false;
		if(cr==null || cy==null || cb==null)
			return false;
		int ry = Math.abs(cr-cy);
		int rb = Math.abs(cr-cb);
		int yb = Math.abs(cb-cy);
		for(int i=0; i<list.size(); i++){
			if(list.get(i)==ry && !bry)
				bry = true;
			else if(list.get(i)==rb && !brb)
				brb = true;
			else if(list.get(i)==yb && !byb)
				byb = true;
		}
		if(bry && brb && byb)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		scanner.nextLine();
		List<Integer> list = new ArrayList<Integer>();
		list.add(x);
		list.add(y);
		list.add(z);
		String seq = scanner.nextLine();
		int count = 0;
		int max = 0;
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<seq.length(); i++){
			StringBuilder sb = new StringBuilder();
			String cur = sb.append(seq.charAt(i)).toString();
			if(map.containsKey(cur)){
				map.put(cur, map.get(cur)+1);
			}else{
				map.put(cur, 1);
			}
			count++;
			if(check(map, list)){
				if(count>max)
					max = count;
				count = 0;
			}
		}
		if(count>max)
			max = count;
		System.out.println(max);
	}

}
