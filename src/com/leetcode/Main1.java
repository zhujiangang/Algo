package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		while (T-- > 0) {
			Map<Integer, Integer> modualTimes = new HashMap<Integer, Integer>();
			Map<Integer, Integer> sigTimes = new HashMap<Integer, Integer>();
			Map<Integer, Set<Integer>> sigModual = new HashMap<Integer, Set<Integer>>();
			List<Integer> inital = new ArrayList<Integer>();
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			scanner.nextLine();
			while (M-- > 0) {
				Integer sig = scanner.nextInt();
				inital.add(sig);
			}
			scanner.nextLine();
			// if(sigTimes.containsKey(sig)){
			// sigTimes.put(sig, sigTimes.get(sig)+1);
			// }else
			// sigTimes.put(sig, 1);
			Map<Integer, List<Integer>> modualGen = new HashMap<Integer, List<Integer>>();
			for (int i = 1; i <= N; i++) {
				int sigStart = scanner.nextInt();
				if(sigModual.get(sigStart)!=null){
					Set<Integer> modualSet = sigModual.get(sigStart);
					modualSet.add(i);
					sigModual.put(sigStart, modualSet);
				}else{
					Set<Integer> modualSet = new HashSet<Integer>();
					modualSet.add(i);
					sigModual.put(sigStart, modualSet);
				}
				int K = scanner.nextInt();
				List<Integer> gen = new ArrayList<Integer>();
				while (K-- > 0) {
					int sigGen = scanner.nextInt();
					gen.add(sigGen);
				}
				modualGen.put(i, gen);
				scanner.nextLine();
			}
			Stack<Integer> stack = new Stack<Integer>();
			stack.addAll(inital);
			while(!stack.empty()){
				Integer sig = stack.pop();
				Set<Integer> modualSet = sigModual.get(sig);
				if(modualSet==null)
					continue;
				
				for(Integer modual : modualSet){
					if(modualTimes.containsKey(modual)){
						modualTimes.put(modual, modualTimes.get(modual)+1);
					}else{
						modualTimes.put(modual, 1);
					}
					if(modualGen.get(modual)!=null)
						stack.addAll(modualGen.get(modual));
				}
			}
			for(int i=1; i<=N; i++){
				if(modualTimes.get(i)==null)
					System.out.print(0 + " ");
				else
					System.out.print(modualTimes.get(i)+" ");
			}
			System.out.println();
		}
	}

}
