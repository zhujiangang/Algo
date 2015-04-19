package com.leetcode;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String asciiIntStr = "65"; // 某个字符的ascii 整数 值
		int iValue = Integer.parseInt(asciiIntStr, 10);
		char tempC = (char) iValue;// 转换为一个字符
		System.out.println("ASCII码为：" + asciiIntStr + "的字符为：" + tempC);

		// 将一个字符转换为整数的ascii码
		char tmpChar = 'A';
		String ascIIintValue = Integer.toString(tmpChar);// 把一个字符转换为整数的ascii码
		System.out.println("字符：" + tmpChar + "的ASCII码为：" + ascIIintValue);
		System.out.println(convertToTitle(27));
	}

	public static char num2Char(int n) {
		Integer a = Integer.parseInt(Integer.toString('Z'));
		Integer ret = a-(26-n)%26;
		char ch = (char) ret.intValue();// 转换为一个字符
		return ch;
		
	}

	public static String convertToTitle(int n) {
		if(n<=0)
			return "";
		Integer.parseInt("");
		int shang = n/26;
		int yushu = n-shang*26;
		if(yushu!=0)
			return convertToTitle(shang)+num2Char(yushu);
		else
			return convertToTitle(shang-1)+"Z";
		
	}
}
