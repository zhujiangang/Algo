package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING", 2));
	}

	public static String convert(String s, int nRows) {
		if(s==null || s.equals("") || nRows==1)
			return s;
		int shu = 0;
		int xie = 0;
		int lingtou = 0;
		shu = (s.length()+nRows-2)/(2*nRows-2);
		xie = shu-1;
		lingtou = (s.length()+nRows-2)%(2*nRows-2);
		int col;
		if(lingtou>nRows-2)
			col = shu+xie*(nRows-2)+nRows-1;
		else
			col = shu+xie*(nRows-2)+lingtou;
		System.out.println(col);
		String[][] matrix = new String[nRows][col];
		for(int i=0; i<nRows; i++){
			for(int j=0; j<col; j++)
				matrix[i][j] = "";
		}
		int x=0,y=0;
		int dir = 0;
		for(int i=0; i<s.length(); i++){
			StringBuilder sb = new StringBuilder().append(s.charAt(i));
			String ch = sb.toString();
			if(dir==0){//down
				matrix[x][y] = ch;
				if(x+1<nRows)
					x++;
				else{
					dir=1;
					y++;
					x--;
				}
			}else if(dir==1){
				matrix[x][y] = ch;
				if(x-1>=0){
					x--;
					y++;
				}else{
					dir=0;
					x++;
				}
			}
		}
		String ret = "";
		for(int i=0; i<nRows; i++){
			for(int j=0; j<col; j++){
				if(matrix[i][j].equals(""))
					continue;
				ret+=matrix[i][j];
			}
		}
		return ret;
	}
}
