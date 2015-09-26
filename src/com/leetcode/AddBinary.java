package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1111";
		String b = "1111";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
		if(a==null || a.trim().equals("") || b==null || b.trim().equals(""))
			return "";
        int idxa = a.length()-1;
        int idxb = b.length()-1;
        int addOne = 0;
        List<Integer> list = new ArrayList<Integer>();        
        while(idxa>=0 && idxb>=0){
        	int vala = Integer.parseInt(a.charAt(idxa)+"");
        	int valb = Integer.parseInt(b.charAt(idxb)+"");
        	int val = vala+valb+addOne;
        	if(val>=2){
        		val = val-2;
        		addOne = 1;
        	}else
        		addOne = 0;
        	list.add(val);
        	idxa--;
        	idxb--;
        }
        if(idxa>=0){
        	while(idxa>=0){
            	int vala = Integer.parseInt(a.charAt(idxa)+"");
            	int val = vala +addOne;
            	if(val>=2){
            		val = val-2;
            		addOne = 1;
            	}else
            		addOne = 0;
            	list.add(val);
            	idxa--;
            }
        	if(addOne==1)
        		list.add(1);
        }else{
        	while(idxb>=0){
            	int valb = Integer.parseInt(b.charAt(idxb)+"");
            	int val = valb +addOne;
            	if(val==2){
            		val = val-2;
            		addOne = 1;
            	}else
            		addOne = 0;
            	list.add(val);
            	idxb--;
            }
        	if(addOne==1)
        		list.add(1);
        }
        
        String ret = "";
        for(int i=list.size()-1; i>=0; i--)
        	ret+=list.get(i);
        
        return ret;
    }

}
