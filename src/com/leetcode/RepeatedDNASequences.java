package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findRepeatedDnaSequences("AAAAAAAAAAA"));
	}

	public static List<String> findRepeatedDnaSequences(String s) {
        List<String> retList = new ArrayList<String>();
        for(int i=0; i<s.length()-10; i++){
            String subStrCur = s.substring(i,i+10);
            for(int j=i+10; j<s.length()-10; j=j+10){
                String subStr = s.substring(j,j+10);
                if(subStr.equals(subStrCur)){
                    retList.add(subStr);
                    break;
                }
            }
            
        }
        return retList;
    }
}
